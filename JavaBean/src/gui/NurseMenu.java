package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;

public class NurseMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public NurseMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("Patients");
		add(button);
		
		JButton button_1 = new JButton("Appointments");
		add(button_1);
		
		JButton button_2 = new JButton("New Patient");
		add(button_2);

	}

}
