package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import emr.Patient;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.IOException;

public class PatientProfileChangePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public PatientProfileChangePanel() {
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("37px"),
				ColumnSpec.decode("133px"),
				ColumnSpec.decode("37px"),
				ColumnSpec.decode("125px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("165px"),},
			new RowSpec[] {
				RowSpec.decode("33px"),
				RowSpec.decode("20px"),
				RowSpec.decode("33px"),
				RowSpec.decode("20px"),
				RowSpec.decode("33px"),
				RowSpec.decode("20px"),
				RowSpec.decode("33px"),
				RowSpec.decode("20px"),
				RowSpec.decode("33px"),
				RowSpec.decode("20px"),
				RowSpec.decode("33px"),
				RowSpec.decode("20px"),
				RowSpec.decode("33px"),
				RowSpec.decode("20px"),
				RowSpec.decode("15px"),
				RowSpec.decode("33px"),
				RowSpec.decode("15px"),
				RowSpec.decode("25px"),}));
		
		JLabel lblNewLabel = new JLabel("Please leave the space to blank if no changes on it.");
		add(lblNewLabel, "2, 2, 5, 1, fill, top");
		
		JLabel lblNewName = new JLabel("New Name:");
		add(lblNewName, "2, 4, fill, center");
		
		textField = new JTextField();
		add(textField, "4, 4, 3, 1, fill, top");
		textField.setColumns(10);
		
		JLabel lblNew = new JLabel("New Password:");
		add(lblNew, "2, 6, fill, center");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		add(textField_1, "4, 6, 3, 1, fill, top");
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		add(lblConfirmPassword, "2, 8, left, center");
		
		textField_2 = new JTextField();
		add(textField_2, "4, 8, 3, 1, fill, top");
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("New Address: ");
		add(lblAddress, "2, 10, fill, center");
		
		textField_3 = new JTextField();
		add(textField_3, "4, 10, 3, 1, fill, default");
		textField_3.setColumns(10);
		
		
		JLabel lblNewPhone = new JLabel("New Phone No.: ");
		add(lblNewPhone, "2, 12, fill, center");
		
		textField_4 = new JTextField();
		add(textField_4, "4, 12, 3, 1, fill, default");
		textField_4.setColumns(10);
		
		
		JLabel lblNewEmail = new JLabel("New E-mail: ");
		add(lblNewEmail, "2, 14, fill, center");
		
		textField_5 = new JTextField();
		add(textField_5, "4, 14, 3, 1, fill, default");
		textField_5.setColumns(10);

		
		
		final JLabel lblChange = new JLabel("");
		lblChange.setForeground(Color.RED);
		lblChange.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		add(lblChange, "2, 16, 5, 1, fill, top");
		
		JButton btnOk = new JButton("Accept");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int msgLabel = 0;
				
				//new name
				String newName = textField.getText();
				if(newName.length() != 0) {
					((Patient)Portal.getUser()).setName(newName);
				}
				
				//new password
				String newPass = textField_1.getText();
				String conPass = textField_2.getText();
				if(!(newPass.contentEquals(conPass))) {
					msgLabel = 1;
				}
				else if(newPass.length() != 0) {
					try {
						((Patient)Portal.getUser()).setPassword(newPass);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				//new address
				String newAdd = textField_3.getText();
				if(newAdd.length() != 0) {
					((Patient)Portal.getUser()).setAddress(newAdd);
				}

				//new phone
				String newPhone = textField_4.getText();
				if(newPhone.length() != 0) {
					((Patient)Portal.getUser()).setPhone(newPhone);
				}
				
				//new email
				String newEmail = textField_5.getText();
				if(newEmail.length() != 0) {
					((Patient)Portal.getUser()).setEmail(newEmail);
				}
				
				//decide message output
				if(msgLabel == 0) {
					lblChange.setText("Your changes are successfully applied!");
				}
				else {
					lblChange.setText("Unmatched password input! Other changes are successfully applied.");
				}
			}
		});
		add(btnOk, "4, 18, right, top");

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new PatientProfilePanel() );
			}
		});
		add(btnCancel, "6, 18, left, top");

	}

}
