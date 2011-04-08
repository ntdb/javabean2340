/**
 * Admin Menu Buttons for Hospital System
 * @author Team Java Bean
 */
package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Admin Menu Buttons for Hospital System
 * @author Team Java Bean
 * @version 1.00
 */
public class AdminMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * sets width of buttons. Lowers Audit calls of literals
	 */
	private final int bwidth;
	
	/**
	 * sets height of buttons. Lowers Audit calls of literals
	 */
	private final int bheight;

	/**
	 * Create the panel.
	 */
	public AdminMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		bwidth = 1000;
		
		bheight = 25;
		
		final JButton button = new JButton("Users");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new PatientSearchMenu());
			}
		});
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setMaximumSize(new Dimension(bwidth, bheight));
		add(button);
		
		final JButton button_2 = new JButton("New User");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new NewPatientContent(Portal.getUser()));
			}
		});
		button_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button_2.setMaximumSize(new Dimension(bwidth, bheight));
		add(button_2);

	}

}
