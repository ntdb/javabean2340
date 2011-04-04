package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;

public class AdminMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public AdminMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnUsers = new JButton("Users");
		btnUsers.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnUsers.setMaximumSize(new Dimension(1000,25));
		add(btnUsers);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewUser.setMaximumSize(new Dimension(1000,25));
		add(btnNewUser);

	}

}
