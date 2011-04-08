/**
 * Treatment Creation Panel
 * @author Team Java Bean
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Allows the user to create treatment records.
 * @author Team Java Bean
 * @version 1.00
 *
 */
public class Create_Treatment_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Doctor Name Value
	 */
	private final JTextField docName;
	
	/**
	 * Nurse Name Value
	 */
	private final JTextField nurseName;
	
	/**
	 * Symptom Value
	 */
	private final JTextField symptoms;
	
	/**
	 * Vitals Value
	 */
	private final JTextField vitals;
	
	/**
	 * Diagnosis Value
	 */
	private final JTextField diagnosis;
	
	/**
	 * Date Value
	 */
	private final JTextField date;
	
	/**
	 * Column Size Value
	 */
	private final int colsize;

	/**
	 * Create the panel.
	 */
	public Create_Treatment_Panel() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
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
				FormFactory.DEFAULT_ROWSPEC,}));
		
		colsize = 10;
		
		final JLabel lblTreatingDocotr = new JLabel("Treating Doctor:");
		add(lblTreatingDocotr, "2, 2, right, default");
		
		docName = new JTextField();
		docName.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(docName.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(docName.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(docName.getText());
			}
			});
		add(docName, "4, 2, fill, default");
		docName.setColumns(colsize);
		
		final JLabel label = new JLabel("Date:");
		add(label, "10, 2, right, default");
		
		date = new JTextField();
		date.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(date.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(date.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(date.getText());
			}
			});
		add(date, "12, 2");
		date.setColumns(colsize);
		
		final JLabel lblAttendingNurse = new JLabel("Attending Nurse: ");
		add(lblAttendingNurse, "2, 6, right, default");
		
		nurseName = new JTextField();
		nurseName.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(nurseName.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(nurseName.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(nurseName.getText());
			}
			});
		add(nurseName, "4, 6, fill, default");
		nurseName.setColumns(colsize);
		
		final JLabel lblSymptoms = new JLabel("Symptoms:");
		add(lblSymptoms, "2, 10, right, default");
		
		symptoms = new JTextField();
		symptoms.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(symptoms.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(symptoms.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(symptoms.getText());
			}
			});
		add(symptoms, "4, 10, fill, center");
		symptoms.setColumns(colsize);
		
		final JLabel lblVitalSigns = new JLabel("Vital Signs:");
		add(lblVitalSigns, "2, 14, right, default");
		
		vitals = new JTextField();
		vitals.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(vitals.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(vitals.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(vitals.getText());
			}
			});
		add(vitals, "4, 14, fill, default");
		vitals.setColumns(colsize);
		
		final JLabel lblDiagnosis = new JLabel("Diagnosis: ");
		add(lblDiagnosis, "2, 18, right, default");
		
		diagnosis = new JTextField();
		diagnosis.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(diagnosis.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(diagnosis.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(diagnosis.getText());
			}
			});
		add(diagnosis, "4, 18, fill, default");
		diagnosis.setColumns(colsize);

	}

}
