package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import emr.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import javax.swing.JPasswordField;

public class Login extends JDialog {

	private User user = null;
	private int attempts;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel labelError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UserController.load();					//Load records!
			Schedule.load();
/*			
			UserController.addUser(new Patient());
			UserController.addUser(new Nurse());
			UserController.addUser(new Doctor());
			UserController.save();
*/			
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("JavaBean EMR Login");
		setBounds(100, 100, 305, 168);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
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
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
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
		{
			JLabel lblUsername = new JLabel("User ID");
			contentPanel.add(lblUsername, "2, 2, right, default");
		}
		{
			txtUsername = new JTextField();
			txtUsername.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent arg0) {
					try {
						user = UserController.getUser(Integer.parseInt(txtUsername.getText()));
					} catch(NumberFormatException e) {
						user = null;
					}
				}
			});
			txtUsername.setToolTipText("Enter User ID Here");
			contentPanel.add(txtUsername, "4, 2, 13, 1, fill, default");
			txtUsername.setColumns(10);
		}
		{
			JLabel lblPassword = new JLabel("Password");
			contentPanel.add(lblPassword, "2, 4, right, default");
		}
		{
			txtPassword = new JPasswordField();
			txtPassword.setToolTipText("Enter user password here");
			contentPanel.add(txtPassword, "4, 4, 13, 1, fill, default");
			txtPassword.setColumns(10);
		}
		{
			labelError = new JLabel("");
			labelError.setForeground(Color.RED);
			labelError.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
			contentPanel.add(labelError, "2, 6, 15, 1");
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				{
					final JButton okButton = new JButton("Log In");
					okButton.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							try {
								if(user == null) {
									labelError.setText("You must enter a valid user ID");
								}
								else {
									if(txtPassword.getText().length() == 0) {
										labelError.setText("You must enter a password.");
									}
									else {
										attempts = user.loginMe(txtPassword.getText());
										System.out.println(attempts);
										switch(attempts) {
											case -1:
												Portal.main(user);
												dispose();
												break;
											case 0:
											case 1:
											case 2:
												labelError.setText("Incorrect password: " + (3-attempts) + " attempts remaining.");
												break;
											case 3:
												UserController.save();
												labelError.setText("You are locked out. Contact an admin.");
												okButton.setEnabled(false);
												break;
											default:
												labelError.setText("");
										}
									}
								}
							} catch (NumberFormatException e) {
								Hospital.LOGGER.severe(e.toString() + " thrown.");
								labelError.setText("You must enter a valid username");
							}
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
			}
			{
				JButton btnExit = new JButton("Exit");
				btnExit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						System.exit(0);
					}
				});
				buttonPane.add(btnExit);
			}
		}
	}
}
