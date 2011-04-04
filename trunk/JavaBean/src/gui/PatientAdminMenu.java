package gui;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class PatientAdminMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientAdminMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton button_1 = new JButton("Edit Info");
		button_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button_1.setMaximumSize(new Dimension(1000,25));
		add(button_1);
		
		JButton btnDeletePatient = new JButton("Delete Patient");
		btnDeletePatient.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDeletePatient.setMaximumSize(new Dimension(1000,25));
		add(btnDeletePatient);
		
		JButton btnTreatmentRecord = new JButton("Treatment Record");
		btnTreatmentRecord.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnTreatmentRecord.setMaximumSize(new Dimension(1000,25));
		add(btnTreatmentRecord);

	}

}
