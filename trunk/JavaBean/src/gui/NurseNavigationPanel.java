package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;

public class NurseNavigationPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public NurseNavigationPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		NavigationButton patients = new NavigationButton("Patients");
		add(patients);
		
		NavigationButton appointments = new NavigationButton("Appointments");
		add(appointments);
		
		NavigationButton newPatient = new NavigationButton("New Patient");
		add(newPatient);
		
		JButton button = new JButton("New button");
		add(button);
		

	}

}
