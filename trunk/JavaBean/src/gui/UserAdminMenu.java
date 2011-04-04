package gui;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class UserAdminMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public UserAdminMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnEdit = new JButton("Edit Info");
		btnEdit.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnEdit.setMaximumSize(new Dimension(1000,25));
		add(btnEdit);
		
		JButton btnDeleteUser = new JButton("Delete User");
		btnDeleteUser.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDeleteUser.setMaximumSize(new Dimension(1000,25));
		add(btnDeleteUser);
		
		JButton btnSuspend = new JButton("Suspend");
		btnSuspend.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSuspend.setMaximumSize(new Dimension(1000,25));
		add(btnSuspend);
		
		JButton btnSetPassword = new JButton("Set Password");
		btnSetPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSetPassword.setMaximumSize(new Dimension(1000,25));
		add(btnSetPassword);

	}

}
