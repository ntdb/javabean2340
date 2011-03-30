package gui;

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

public class Portal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	 */
	public Portal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
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
		
		JTextPane textArea = new JTextPane();
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
	}

}
