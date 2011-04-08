/**
 * Doctors Orders GUI class of Hospital System
 * @author Team Java Bean
 */
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

/**
 * Doctors Orders Class Constructor
 * @author Team Java Bean
 *
 */
public class Doctors_Orders extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Text field for follow up instructions
	 */
	private final JTextField followup;
	
	/**
	 * Text field for other instructions
	 */
	private final JTextField other;

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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		final JLabel lblPrescriptions = new JLabel("Prescriptions:");
		add(lblPrescriptions, "2, 2");
		
		final JCheckBox chckbxDrugA = new JCheckBox("Drug A");
		add(chckbxDrugA, "4, 4");
		
		final JCheckBox chckbxDrugB = new JCheckBox("Drug B");
		add(chckbxDrugB, "8, 4");
		
		final JCheckBox chckbxDrugC = new JCheckBox("Drug C");
		add(chckbxDrugC, "12, 4");
		
		final JLabel lblTestPerformed = new JLabel("Lab Work Performed: ");
		add(lblTestPerformed, "2, 8");
		
		final JCheckBox chckbxMri = new JCheckBox("MRI");
		add(chckbxMri, "4, 10");
		
		final JCheckBox chckbxCatScan = new JCheckBox("Cat Scan");
		add(chckbxCatScan, "8, 10");
		
		final JCheckBox chckbxXray = new JCheckBox("X-Ray");
		add(chckbxXray, "12, 10");
		
		final JLabel lblFollowupInstructions = new JLabel("Follow-up Instructions");
		add(lblFollowupInstructions, "2, 12");
		
		followup = new JTextField();
		followup.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(getFollowup());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(getFollowup());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(getFollowup());
			}
			});
		add(followup, "4, 14, 15, 4, fill, default");
		
		final JLabel lblOtherInstructions = new JLabel("Other Instructions: ");
		add(lblOtherInstructions, "2, 18");
		
		other = new JTextField();
		other.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(getOther());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(getOther());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(getOther());
			}
			});
		add(other, "4, 19, 15, 4, fill, default");

	}
	
	/**
	 * Returns the follow up String entered
	 * @return followup String
	 */
	public String getFollowup(){
		return followup.getText();
	}
	
	/**
	 * Returns the other instruction String entered
	 * @return other instructions
	 */
	public String getOther(){
		return other.getText();
	}

}
