package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PatientAppointmentsMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientAppointmentsMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnRequest = new JButton("Request Appointment");
		btnRequest.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Portal.setContent(new PatientAppointmentsRequestPanel());
			}
		});
		btnRequest.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnRequest.setMaximumSize(new Dimension(1000,25));
		add(btnRequest);
		
		JButton btnView = new JButton("View Appointments");
		btnView.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Portal.setContent(new PatientAppointmentsViewPanel());
			}
		});
		btnView.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnView.setMaximumSize(new Dimension(1000,25));
		add(btnView);

	}

}
