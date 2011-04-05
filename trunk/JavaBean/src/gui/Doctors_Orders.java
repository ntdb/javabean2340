package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Doctors_Orders extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Doctors_Orders() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblPrescriptions = new JLabel("Prescriptions:");
		add(lblPrescriptions, "2, 2");
		
		JCheckBox chckbxDrugA = new JCheckBox("Drug A");
		add(chckbxDrugA, "4, 4");
		
		JCheckBox chckbxDrugB = new JCheckBox("Drug B");
		add(chckbxDrugB, "8, 4");
		
		JCheckBox chckbxDrugC = new JCheckBox("Drug C");
		add(chckbxDrugC, "12, 4");
		
		JLabel lblTestPerformed = new JLabel("Lab Work Performed: ");
		add(lblTestPerformed, "2, 8");
		
		JCheckBox chckbxMri = new JCheckBox("MRI");
		add(chckbxMri, "4, 10");
		
		JCheckBox chckbxCatScan = new JCheckBox("Cat Scan");
		add(chckbxCatScan, "8, 10");
		
		JCheckBox chckbxXray = new JCheckBox("X-Ray");
		add(chckbxXray, "12, 10");
		
		JLabel lblFollowupInstructions = new JLabel("Follow-up Instructions");
		add(lblFollowupInstructions, "2, 12");
		
		textField = new JTextField();
		add(textField, "4, 14, 9, 2, fill, default");
		textField.setColumns(10);
		
		JLabel lblOtherInstructions = new JLabel("Other Instructions: ");
		add(lblOtherInstructions, "2, 18");
		
		textField_1 = new JTextField();
		add(textField_1, "4, 19, 9, 2, fill, default");
		textField_1.setColumns(10);

	}

}
