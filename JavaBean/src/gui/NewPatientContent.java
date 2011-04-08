package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import emr.Admin;
import emr.Doctor;
import emr.Nurse;
import emr.Patient;
import emr.User;

import javax.swing.JLabel;
import java.awt.Font;

public class NewPatientContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public NewPatientContent(User user) {
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		
		JLabel lblNewUser = new JLabel("New User");
		lblNewUser.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		add(lblNewUser, "18, 8, center, default");
		
		JLabel lblTemporaryId = new JLabel("User ID");
		lblTemporaryId.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		add(lblTemporaryId, "18, 16, center, default");
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(lblId, "18, 18, center, default");
		
		JLabel lblTemporaryPassword = new JLabel("Temporary Password");
		lblTemporaryPassword.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		add(lblTemporaryPassword, "18, 24, center, default");
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(lblPassword, "18, 26, center, default");

		if(Portal.getUser() instanceof Admin){
			Admin admin = (Admin)(Portal.getUser());
		
			if(user instanceof Patient){
				lblNewUser.setText("New Patient");
				lblId.setText("" + user.getUserID());
				lblPassword.setText(user.generatePassword(user.getUserID()));
			}//end if
			else if(user instanceof Admin){
				lblNewUser.setText("New Admin");
				lblId.setText("" + user.getUserID());
				lblPassword.setText(user.generatePassword(user.getUserID()));
			}//end else if
		
			else if(user instanceof Doctor){
				lblNewUser.setText("New Doctor");
				lblId.setText("" + user.getUserID());
				lblPassword.setText(user.generatePassword(user.getUserID()));
			}//end else if
			else if(user instanceof Nurse){
				lblNewUser.setText("New Nurse");
				lblId.setText("" + user.getUserID());
				lblPassword.setText(user.generatePassword(user.getUserID()));
			}//end else if
		}//end if
		else{
			Nurse nurse = (Nurse)(Portal.getUser());
			lblNewUser.setText("New Patient");
			lblId.setText("" + user.getUserID());
			lblPassword.setText(user.generatePassword(user.getUserID()));
		}//end else
		
	}

}
