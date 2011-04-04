/**
 * GUI group of EMR Project
 */
package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Dimension;

/**
 * Panel is used for button inputs with the Invoice_Panels class.
 * @author David
 * @version 1.00
 */
public class Invoice_Buttons extends JPanel {
	
	/**
	 * Width of the Invoice Buttons
	 */
	private final int wth;
	
	/**
	 * Height of the Invoice Buttons
	 */
	private final int hgt;

	/**
	 * Create the panel.
	 */
	public Invoice_Buttons() {
		wth = (int)1000;
		hgt = (int)25;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		final JButton button = new JButton("Close Invoice");
		button.setMaximumSize(new Dimension(wth, hgt));
		add(button);

	}

}
