package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;

public class PatientMedicalInformationMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientMedicalInformationMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnPharmacy = new JButton("Pharmacy");
		btnPharmacy.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPharmacy.setMaximumSize(new Dimension(1000,25));
		add(btnPharmacy);
		
		JButton btnInsuranceCarrier = new JButton("Insurance Carrier");
		btnInsuranceCarrier.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnInsuranceCarrier.setMaximumSize(new Dimension(1000,25));
		add(btnInsuranceCarrier);
		
		JButton btnAllergies = new JButton("Allergies");
		btnAllergies.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAllergies.setMaximumSize(new Dimension(1000,25));
		add(btnAllergies);

	}

}
