package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;

import emr.Patient;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PatientProfileMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientProfileMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnChange = new JButton("Change Profile");
		btnChange.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new PatientProfileChangePanel());
			}
		});
		btnChange.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnChange.setMaximumSize(new Dimension(1000,25));
		add(btnChange);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Portal.setContent(new PatientProfilePanel((Patient)(Portal.getUser())));
			}
		});
		btnRefresh.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnRefresh.setMaximumSize(new Dimension(1000,25));
		add(btnRefresh);

	}

}
