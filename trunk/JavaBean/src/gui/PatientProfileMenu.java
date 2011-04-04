package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;

public class PatientProfileMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientProfileMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnChange = new JButton("Change Profile");
		btnChange.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnChange.setMaximumSize(new Dimension(1000,25));
		add(btnChange);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnRefresh.setMaximumSize(new Dimension(1000,25));
		add(btnRefresh);

	}

}
