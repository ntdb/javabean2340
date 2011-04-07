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
		
		JButton button = new JButton("Create Doctor's Orders");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new Doctors_Orders());
			}
		});
		button.setMaximumSize(new Dimension(bwidth, bheight));
		add(button);
		
		JButton button1 = new JButton("View Doctor's Orders");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new View_Doctors_Orders());
			}
		});
		button1.setMaximumSize(new Dimension(bwidth, bheight));
		add(button1);
		
		JButton button2 = new JButton("Update Doctor's Orders");
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new Doctors_Orders());
			}
		});
		button2.setMaximumSize(new Dimension(bwidth, bheight));
		add(button2);
		
		JButton button3 = new JButton("Delete Doctor's Orders");
		button3.setMaximumSize(new Dimension(bwidth, bheight));
		add(button3);
		
		JButton button4 = new JButton("Create Invoice");
		button4.setMaximumSize(new Dimension(bwidth, bheight));
		add(button4);
		
		JButton button5 = new JButton("View Invoice");
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(new Invoice_Buttons(), new Invoice_Panel(), "Invoice");
			}
		});
		button5.setMaximumSize(new Dimension(bwidth, bheight));
		add(button5);
		
		JButton button6 = new JButton("Update Invoice");
		button6.setMaximumSize(new Dimension(bwidth, bheight));
		add(button6);
		
		JButton button7 = new JButton("Delete Invoice");
		button7.setMaximumSize(new Dimension(bwidth, bheight));
		add(button7);
		
		JButton button8 = new JButton("Exit Treatment");
		button8.setMaximumSize(new Dimension(bwidth, bheight));
		button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.back();
			}
		});
		add(button8);

	}

}
