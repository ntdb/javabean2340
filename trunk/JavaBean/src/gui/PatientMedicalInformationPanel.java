package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import emr.Patient;

import javax.swing.JLabel;

public class PatientMedicalInformationPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientMedicalInformationPanel() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Pharmacy: " + ((Patient)Portal.getUser()).getPharmacy() );
		add(lblNewLabel, "4, 6");
		
		JLabel lblNewLabel_1 = new JLabel("Insurance Carrier: " + ((Patient)Portal.getUser()).getInsuranceCarrier());
		add(lblNewLabel_1, "4, 10");
		
		JLabel lblNewLabel_2 = new JLabel("Allergies: " + ((Patient)Portal.getUser()).getAllergies());
		add(lblNewLabel_2, "4, 14");

	}

}
