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
	
	/**
	 * Name value
	 */
	private final JTextField name;
	
	/**
	 * Doctor Value
	 */
	private final JTextField doctor;
	
	/**
	 * Bill Value
	 */
	private final JTextField bill;
	
	/**
	 * Date Value
	 */
	private final JTextField date;
	
	/**
	 * Column value
	 */
	private final int colsize;

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
		
		colsize = 10;
		
		final JLabel lblName = new JLabel("Name: ");
		add(lblName, "2, 2, right, default");
		
		name = new JTextField();
		name.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(name.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(name.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(name.getText());
			}
			});
		add(name, "4, 2, fill, default");
		name.setColumns(colsize);
		
		JLabel label = new JLabel("Date: ");
		add(label, "8, 2, right, default");
		
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
		add(date, "10, 2, fill, top");
		date.setColumns(colsize);
		
		final JLabel lblDoctor = new JLabel("Doctor: ");
		add(lblDoctor, "2, 6, right, default");
		
		doctor = new JTextField();
		doctor.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(doctor.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(doctor.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(doctor.getText());
			}
			});
		add(doctor, "4, 6, fill, default");
		doctor.setColumns(colsize);
		
		final JLabel lblBill = new JLabel("Bill: ");
		add(lblBill, "2, 10, right, default");
		
		bill = new JTextField();
		bill.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			// text was changed, implement a way to save this
				System.out.println(bill.getText());
			}
			public void removeUpdate(DocumentEvent e) {
			// text was deleted
				System.out.println(bill.getText());
			}
			public void insertUpdate(DocumentEvent e) {
			// text was inserted
				System.out.println(bill.getText());
			}
			});
		add(bill, "4, 10, fill, default");
		bill.setColumns(colsize);

	}

}
