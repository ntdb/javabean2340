package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Doctor_Treatment_Buttons extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Doctor_Treatment_Buttons() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("Create Doctor's Orders");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.setContent(new Doctors_Orders());
			}
		});
		button.setMaximumSize(new Dimension(1000, 25));
		add(button);
		
		JButton button1 = new JButton("View Doctor's Orders");
		button1.setMaximumSize(new Dimension(1000, 25));
		add(button1);
		
		JButton button2 = new JButton("Update Doctor's Orders");
		button2.setMaximumSize(new Dimension(1000, 25));
		add(button2);
		
		JButton button3 = new JButton("Delete Doctor's Orders");
		button3.setMaximumSize(new Dimension(1000, 25));
		add(button3);
		
		JButton button4 = new JButton("Create Invoice");
		button4.setMaximumSize(new Dimension(1000, 25));
		add(button4);
		
		JButton button5 = new JButton("View Invoice");
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(new Invoice_Buttons(), new Invoice_Panel(), "Invoice");
			}
		});
		button5.setMaximumSize(new Dimension(1000, 25));
		add(button5);
		
		JButton button6 = new JButton("Exit Treatment");
		button6.setMaximumSize(new Dimension(1000, 25));
		button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.back();
			}
		});
		add(button6);

	}

}
