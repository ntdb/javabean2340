/**
 * GUI group of EMR Project
 */
package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Panel is used for button inputs with the Invoice_Panels class.
 * @author David
 * @version 1.00
 */
public class Invoice_Buttons extends JPanel {
	
	/**
	 * Because Audit complains.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Width of the Invoice Buttons
	 */
	private final int wth = 1000;
	
	/**
	 * Height of the Invoice Buttons
	 */
	private final int hgt = 25;

	/**
	 * Create the panel.
	 */
	public Invoice_Buttons() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		final JButton button = new JButton("Close Invoice");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Portal.back();
			}
		});
		button.setMaximumSize(new Dimension(wth, hgt));
		add(button);
	}
}
