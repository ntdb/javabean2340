/**
 * Daily Appointments gui class
 * @author Team Java Bean
 */
package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * Displays the Daily Appointments
 * @author Team Java Bean
 * @version 1.00
 *
 */
public class DailyAppointmentsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public DailyAppointmentsPanel() {
		
		final JLabel lblThisPageShows = new JLabel
		("This page shows the appointments for the day");
		add(lblThisPageShows);

	}

}
