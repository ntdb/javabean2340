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

public class Create_Treatment_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField docName;
	private JTextField nurseName;
	private JTextField Symptoms;
	private JTextField Vitals;
	private JTextField Diagnosis;
	private JTextField Date;

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
		
		JLabel lblTreatingDocotr = new JLabel("Treating Doctor:");
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
		docName.setColumns(10);
		
		JLabel label = new JLabel("Date:");
		add(label, "10, 2, right, default");
		
		Date = new JTextField();
		Date.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(Date.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(Date.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(Date.getText());
			}
			});
		add(Date, "12, 2");
		Date.setColumns(10);
		
		JLabel lblAttendingNurse = new JLabel("Attending Nurse: ");
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
		nurseName.setColumns(10);
		
		JLabel lblSymptoms = new JLabel("Symptoms:");
		add(lblSymptoms, "2, 10, right, default");
		
		Symptoms = new JTextField();
		Symptoms.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(Symptoms.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(Symptoms.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(Symptoms.getText());
			}
			});
		add(Symptoms, "4, 10, fill, center");
		Symptoms.setColumns(10);
		
		JLabel lblVitalSigns = new JLabel("Vital Signs:");
		add(lblVitalSigns, "2, 14, right, default");
		
		Vitals = new JTextField();
		Vitals.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(Vitals.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(Vitals.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(Vitals.getText());
			}
			});
		add(Vitals, "4, 14, fill, default");
		Vitals.setColumns(10);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis: ");
		add(lblDiagnosis, "2, 18, right, default");
		
		Diagnosis = new JTextField();
		Diagnosis.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(Diagnosis.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(Diagnosis.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(Diagnosis.getText());
			}
			});
		add(Diagnosis, "4, 18, fill, default");
		Diagnosis.setColumns(10);

	}

}
