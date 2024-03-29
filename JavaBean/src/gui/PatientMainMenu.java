package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import emr.Patient;

public class PatientMainMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientMainMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(new PatientProfileMenu(), new PatientProfilePanel((Patient)(Portal.getUser())), "Profile");
			}
		});
		btnProfile.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnProfile.setMaximumSize(new Dimension(1000,25));
		add(btnProfile);
		
		JButton btnAppointments = new JButton("Appointments");
		btnAppointments.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(new PatientAppointmentsMenu(), new PatientAppointmentsPanel() , "Appointments");
			}
		});
		btnAppointments.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAppointments.setMaximumSize(new Dimension(1000,25));
		add(btnAppointments);
		
		JButton btnMedicalInformation = new JButton("Medical Information");
		btnMedicalInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new PatientMedicalInformationPanel());
			}
		});
		btnMedicalInformation.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnMedicalInformation.setMaximumSize(new Dimension(1000,25));
		add(btnMedicalInformation);
		
		JButton btnMedicalHistory = new JButton("Medical History");
		btnMedicalHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(new PatientMedicalHistoryMenu(), new PatientMedicalHistoryPanel() , "Medical History");
			}
		});
		btnMedicalHistory.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnMedicalHistory.setMaximumSize(new Dimension(1000,25));
		add(btnMedicalHistory);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(new Invoice_Buttons(), new Invoice_Panel(), "Invoice");
			}
		});
		btnInvoice.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnInvoice.setMaximumSize(new Dimension(1000,25));
		add(btnInvoice);

	}

}
