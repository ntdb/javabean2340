package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import emr.Patient;

import javax.swing.JLabel;

public class PatientProfilePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientProfilePanel(Patient patient) {
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("37px"),
				ColumnSpec.decode("308px"),},
			new RowSpec[] {
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),}));
		
		JLabel lblName = new JLabel();
		lblName.setText("Name: " + patient.getName());
		add(lblName, "2, 2, fill, top");
		
		JLabel lblUserID = new JLabel();
		lblUserID.setText("User ID: " + patient.getUserID());
		add(lblUserID, "2, 4, fill, top");
		
		JLabel lblSsn = new JLabel();
		lblSsn.setText("SSN: " + patient.getSsn());
		add(lblSsn, "2, 6, fill, top");
		
		JLabel lblBday = new JLabel();
		lblBday.setText("Birthday: (need data input in the test case)");
//		lblBday.setText("Birthday: " + ( (Patient)Portal.getUser() ).getBirthday().toString());
		add(lblBday, "2, 8, left, top");
		
		JLabel lblGender = new JLabel();
		lblGender.setText("Gender: " + patient.getGender());
		add(lblGender, "2, 10, fill, top");
		
		JLabel lblAddress = new JLabel();
		lblAddress.setText("Address: " + patient.getAddress());
		add(lblAddress, "2, 12, fill, top");
		
		JLabel lblPhone = new JLabel();
		lblPhone.setText("Phone: " + patient.getPhone());
		add(lblPhone, "2, 14, fill, top");
		
		JLabel lblEmail = new JLabel();
		lblEmail.setText("E-mail: " + patient.getEmail());
		add(lblEmail, "2, 16, fill, top");


	}

}
