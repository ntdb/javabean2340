package gui;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import emr.Nurse;
import emr.Patient;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PatientAdminMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientAdminMenu(Patient patient) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton button_1 = new JButton("Edit Info");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Nurse nurse = (Nurse) Portal.getUser();
				Portal.update(new PatientAdminMenu(), new PatientProfilePanel(patient), "View Patient");
			}
		});
		button_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button_1.setMaximumSize(new Dimension(1000,25));
		add(button_1);
		
		JButton btnDeletePatient = new JButton("Delete Patient");
		if(Portal.getPermissions() == 1) {
			btnDeletePatient.setText("Delete User");
		}
		btnDeletePatient.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDeletePatient.setMaximumSize(new Dimension(1000,25));
		add(btnDeletePatient);
		
		JButton btnTreatmentRecord = new JButton("Treatment Record");
		btnTreatmentRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Portal.update(new Doctor_Treatment_Buttons(), new Treatment_Panel(), "Treatment Record");
			}
		});
		btnTreatmentRecord.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnTreatmentRecord.setMaximumSize(new Dimension(1000,25));
		add(btnTreatmentRecord);

		JButton btnAddDoctorsOrders = new JButton("Add Doctors Orders");
		btnAddDoctorsOrders.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAddDoctorsOrders.setMaximumSize(new Dimension(1000,25));
		if(Portal.getPermissions() == 2) {
			add(btnAddDoctorsOrders);
		}
	}

}
