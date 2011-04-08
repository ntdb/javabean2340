/**
 * Invoice Creation Panel
 * @author Team Java Bean
 */
package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Panel allows user to create an Invoice.
 * @author Team Java Bean
 * @version 1.00
 *
 */
public class Create_Invoice_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField Name;
	private final JTextField Doctor;
	private final JTextField Bill;
	private final JTextField Date;

	/**
	 * Create the panel.
	 */
	public Create_Invoice_Panel() {
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
				FormFactory.DEFAULT_ROWSPEC,}));
		
		final JLabel lblName = new JLabel("Name: ");
		add(lblName, "2, 2, right, default");
		
		Name = new JTextField();
		Name.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(Name.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(Name.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(Name.getText());
			}
			});
		add(Name, "4, 2, fill, default");
		Name.setColumns(10);
		
		JLabel label = new JLabel("Date: ");
		add(label, "8, 2, right, default");
		
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
		add(Date, "10, 2, fill, top");
		Date.setColumns(10);
		
		final JLabel lblDoctor = new JLabel("Doctor: ");
		add(lblDoctor, "2, 6, right, default");
		
		Doctor = new JTextField();
		Doctor.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(Doctor.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(Doctor.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(Doctor.getText());
			}
			});
		add(Doctor, "4, 6, fill, default");
		Doctor.setColumns(10);
		
		final JLabel lblBill = new JLabel("Bill: ");
		add(lblBill, "2, 10, right, default");
		
		Bill = new JTextField();
		Bill.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(Bill.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(Bill.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(Bill.getText());
			}
			});
		add(Bill, "4, 10, fill, default");
		Bill.setColumns(10);

	}

}
