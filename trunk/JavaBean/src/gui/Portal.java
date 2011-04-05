package gui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import emr.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.UIManager;

public class Portal {

	private static JFrame frame;
	
	private static User user;
	private static int perms;
	private static ArrayList<Breadcrumb> breadcrumbArray = new ArrayList<Breadcrumb>();
	private static JPanel menu = new JPanel();
	private static JPanel content = new JPanel();
	private static JPanel breadcrumbs = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(User userIn) {
		user = userIn;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portal window = new Portal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Portal() {
		int permissions = user.getUserID();
		while(permissions > 9) {
			permissions = (int) Math.floor(permissions / 10);
		}
		perms = permissions;
		System.out.println(permissions);
		switch(permissions) {
			case 1:	initAdmin(); break;
			case 2:	initDoctor(); break;
			case 3:	initNurse(); break;
			case 4:	initPatient(); break;
		}
		initialize();
	}

	private void initAdmin() {
		menu = new AdminMenu();
		content = new DailyAppointmentsPanel();
	}
	
	private void initDoctor() {
		menu = new DoctorMenu();
		content = new DailyAppointmentsPanel();
	}
	
	private void initNurse() {
		menu = new NurseMenu();
		content = new DailyAppointmentsPanel();
	}
	
	private void initPatient() {
		menu = new PatientMainMenu();
		content = new PatientWelcomePanel();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("EMR: " + user.toString());
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Menu");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoadSystem = new JMenuItem("Load System");
		mntmLoadSystem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					UserController.load();
					Schedule.load();
					SysLog.LOGGER.info("System loaded");
				} catch(IOException e) {
					Hospital.LOGGER.severe(e.toString() + " thrown.");
				}
			}
		});
		mnFile.add(mntmLoadSystem);
		
		JMenuItem mntmSaveSystem = new JMenuItem("Save System");
		mntmSaveSystem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					UserController.save();
					Schedule.save();
					SysLog.LOGGER.info("System saved");
				} catch(IOException e) {
					Hospital.LOGGER.severe(e.toString() + " thrown.");
				}
			}
		});
		mnFile.add(mntmSaveSystem);
		
		JMenuItem mntmCloseJavabeanEmr = new JMenuItem("Close JavaBean EMR");
		mntmCloseJavabeanEmr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmLogOutOf = new JMenuItem("Log Out of System");
		mntmLogOutOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				breadcrumbs.removeAll();
				breadcrumbArray.clear();
				user = null;
				menu = null;
				content = null;
				Login.main(null);
				frame.dispose();
			}
		});
		mnFile.add(mntmLogOutOf);
		mnFile.add(mntmCloseJavabeanEmr);
		breadcrumbs.setBackground(UIManager.getColor("Panel.background"));
		breadcrumbs.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		menuBar.add(breadcrumbs);
		
		breadcrumbArray.add(new Breadcrumb(menu,content, "   Home"));
		breadcrumbs.add(breadcrumbArray.get(breadcrumbArray.size() - 1).getLabel());
		
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		frame.getContentPane().add(menu, BorderLayout.WEST);
		
		frame.getContentPane().add(content, BorderLayout.CENTER);
	}
	
	public static void update(JPanel menuIn, JPanel contentIn, String title) {
		if(menuIn == menu && contentIn == content)
			return;
		frame.getContentPane().remove(menu);
		frame.getContentPane().add(menuIn, BorderLayout.WEST);
		menu = menuIn;
		frame.getContentPane().remove(content);
		frame.getContentPane().add(contentIn, BorderLayout.CENTER);
		content = contentIn;
		setContent(contentIn);
		Breadcrumb tempCrumb = new Breadcrumb(menuIn, contentIn, title);
		for(int i=0; i<breadcrumbArray.size(); i++) {
			if(breadcrumbArray.get(i).getMenu() == menuIn) {
				breadcrumbArray = new ArrayList<Breadcrumb>(breadcrumbArray.subList(0, i+1));
				breadcrumbs.removeAll();
				for(int j=0; j<breadcrumbArray.size(); j++) {
					if(j > 0) {
						breadcrumbs.add(new JLabel(" > "));
					}
					breadcrumbs.add(breadcrumbArray.get(j).getLabel());
				}
				frame.validate();
				frame.repaint();
				return;
			}
		}
		breadcrumbArray.add(tempCrumb);
		breadcrumbs.add(new JLabel(" > "));
		breadcrumbs.add(tempCrumb.getLabel());
		frame.validate();
		frame.repaint();
	}
	
/*	private static void setMenu(JPanel menuIn) {
		frame.getContentPane().remove(menu);
		frame.getContentPane().add(menuIn, BorderLayout.WEST);
		menu = menuIn;
	}
*/	
	public static void setContent(JPanel contentIn) {
		frame.getContentPane().remove(content);
		frame.getContentPane().add(contentIn, BorderLayout.CENTER);
		content = contentIn;
		frame.validate();
		frame.repaint();
	}
	
	public static void back() {
		frame.getContentPane().remove(content);
		frame.getContentPane().remove(menu);
		content = breadcrumbArray.get(breadcrumbArray.size() - 2).getContent();
		menu = breadcrumbArray.get(breadcrumbArray.size() - 2).getMenu();
		breadcrumbArray.remove(breadcrumbArray.size()-1);
		breadcrumbs.removeAll();
		for(int j=0; j<breadcrumbArray.size(); j++) {
			if(j > 0) {
				breadcrumbs.add(new JLabel(" > "));
			}
			breadcrumbs.add(breadcrumbArray.get(j).getLabel());
		}
		frame.getContentPane().add(content);
		frame.getContentPane().add(menu, BorderLayout.WEST);
		frame.validate();
		frame.repaint();
	}
	
	public static User getUser() {
		return user;
	}
	
	public static int getPermissions() {
		return perms;
	}

}
