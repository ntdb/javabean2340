package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

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
		
		final JTextField followup = new JTextField();
		followup.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(followup.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(followup.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(followup.getText());
			}
			});
		add(followup, "4, 14, 9, 2, fill, default");
		followup.setColumns(10);
		
		JLabel lblOtherInstructions = new JLabel("Other Instructions: ");
		add(lblOtherInstructions, "2, 18");
		
		JTextField instruction = new JTextField();
		add(instruction, "4, 19, 9, 2, fill, default");
		instruction.setColumns(10);

	}

}
