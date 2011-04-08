/**
 * GUI Package of the EMR Project
 */
package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Displays all buttons Doctors should see on Treatment page.
 * Covers functionality of clicking those buttons as well.
 * @author Team Java Bean
 * @version 1.00
 */
public class Doctor_Treatment_Buttons extends JPanel {

	/**
	 * Fills in a requirement for class declaration
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Width of the buttons used
	 * Declaration Lowers Numeric Literal Audit Calls
	 */
	private final int bwidth;
	
	/**
	 * Height of the buttons used
	 * Declaration lowers Numeric Literal Audit Calls
	 */
	private final int bheight;

	/**
	 * Create the panel.
	 */
	public Doctor_Treatment_Buttons() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		bwidth = 1000;
		
		bheight = 25;
		
		final JButton button = new JButton("Create Doctor's Orders");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new Doctors_Orders());
			}
		});
		button.setMaximumSize(new Dimension(bwidth, bheight));
		add(button);
		
		final JButton button1 = new JButton("View Doctor's Orders");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new View_Doctors_Orders());
			}
		});
		button1.setMaximumSize(new Dimension(bwidth, bheight));
		add(button1);
		
		final JButton button2 = new JButton("Update Doctor's Orders");
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new Doctors_Orders());
			}
		});
		button2.setMaximumSize(new Dimension(bwidth, bheight));
		add(button2);
		
		final JButton button3 = new JButton("Delete Doctor's Orders");
		button3.setMaximumSize(new Dimension(bwidth, bheight));
		add(button3);
		
		final JButton button4 = new JButton("Create Invoice");
		button4.setMaximumSize(new Dimension(bwidth, bheight));
		add(button4);
		
		final JButton button5 = new JButton("View Invoice");
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(new Invoice_Buttons(), new Invoice_Panel(), "Invoice");
			}
		});
		button5.setMaximumSize(new Dimension(bwidth, bheight));
		add(button5);
		
		final JButton button6 = new JButton("Update Invoice");
		button6.setMaximumSize(new Dimension(bwidth, bheight));
		add(button6);
		
		final JButton button7 = new JButton("Delete Invoice");
		button7.setMaximumSize(new Dimension(bwidth, bheight));
		add(button7);
		
		final JButton button8 = new JButton("Create Treatment");
		button8.setMaximumSize(new Dimension(bwidth, bheight));
		button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new Create_Treatment_Panel());
			}
		});
		add(button8);
		
		final JButton button9 = new JButton("Update Treatment");
		button9.setMaximumSize(new Dimension(bwidth, bheight));
		button9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new Create_Treatment_Panel());
			}
		});
		add(button9);
		
		final JButton button10 = new JButton("Delete Treatment");
		button10.setMaximumSize(new Dimension(bwidth, bheight));
		add(button10);
		
		final JButton button11 = new JButton("Exit Treatment");
		button11.setMaximumSize(new Dimension(bwidth, bheight));
		button11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.back();
			}
		});
		add(button11);

	}

}
