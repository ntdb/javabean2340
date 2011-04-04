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

public class Portal {

	private static JFrame frame;
	
	private static User user;
	private static JPanel menu = new JPanel();
	private static JPanel homeMenu;
	private static JPanel content = new JPanel();
	private static JPanel homeContent;
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
		while(permissions > 10) {
			permissions = (int) Math.floor(permissions / 10);
		}
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
		homeMenu = menu;
		homeContent = content;
	}
	
	private void initDoctor() {
		menu = new DoctorMenu();
		content = new DailyAppointmentsPanel();
		homeMenu = menu;
		homeContent = content;
	}
	
	private void initNurse() {
		menu = new NurseMenu();
		content = new DailyAppointmentsPanel();
		homeMenu = menu;
		homeContent = content;
	}
	
	private void initPatient() {
		menu = new PatientMenu();
		content = new PatientPanel();
		homeMenu = menu;
		homeContent = content;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("blang");
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoadSystem = new JMenuItem("Load System");
		mntmLoadSystem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					UserController.load();
					Schedule.load();
				} catch(IOException e) {
					Hospital.LOGGER.severe(e.toString() + " thrown.");
				}
			}
		});
		mnFile.add(mntmLoadSystem);
		
		JMenuItem mntmSaveSystem = new JMenuItem("Save System");
		mntmSaveSystem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					UserController.save();
					Schedule.save();
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
		mnFile.add(mntmCloseJavabeanEmr);
		breadcrumbs.setBackground(Color.WHITE);
		
		menuBar.add(breadcrumbs);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setMenu(homeMenu);
				setContent(homeContent);
			}
		});
		breadcrumbs.add(lblHome);
		
		JLabel label = new JLabel(" > ");
		breadcrumbs.add(label);
		
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		frame.getContentPane().add(menu, BorderLayout.WEST);
		
		frame.getContentPane().add(content, BorderLayout.CENTER);
	}
	
	public static void update(JPanel menuIn, JPanel contentIn) {
		setMenu(menuIn);
		setContent(contentIn);
	}
	
	private static void setMenu(JPanel menuIn) {
		frame.getContentPane().remove(menu);
		frame.getContentPane().add(menuIn, BorderLayout.WEST);
		frame.validate();
		frame.repaint();
		menu = menuIn;
	}
	
	private static void setContent(JPanel contentIn) {
		frame.getContentPane().remove(content);
		frame.getContentPane().add(contentIn, BorderLayout.CENTER);
		frame.validate();
		frame.repaint();
		content = contentIn;
	}

}
