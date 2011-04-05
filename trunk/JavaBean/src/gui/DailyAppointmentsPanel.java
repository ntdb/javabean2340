package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class DailyAppointmentsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DailyAppointmentsPanel() {
		
		JLabel lblThisPageShows = new JLabel("This page shows the appointments for the day");
		add(lblThisPageShows);

	}

}
