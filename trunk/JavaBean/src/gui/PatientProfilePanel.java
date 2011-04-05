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
	public PatientProfilePanel() {
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblName = new JLabel();
		lblName.setText("Name: " + Portal.getUser().getName());
		add(lblName, "4, 4");
		
		JLabel lblUserID = new JLabel();
		lblUserID.setText("User ID: " + Portal.getUser().getUserID());
		add(lblUserID, "4, 8");
		
		JLabel lblSsn = new JLabel();
		lblSsn.setText("SSN: " + ( (Patient)Portal.getUser() ).getSsn());
		add(lblSsn, "4, 12");
		
		JLabel lblBday = new JLabel();
		lblBday.setText("Birthday: (need data input in the test case)");
//		lblBday.setText("Birthday: " + ( (Patient)Portal.getUser() ).getBirthday().toString());
		add(lblBday, "4, 16");


	}

}
