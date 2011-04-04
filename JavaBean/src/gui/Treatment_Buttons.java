package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Treatment_Buttons extends JPanel {

	/**
	 * Create the panel.
	 */
	public Treatment_Buttons() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("View Doctor's Orders");
		button.setMaximumSize(new Dimension(1000, 25));
		add(button);
		
		JButton button1 = new JButton("View Invoice");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Portal.update(new Invoice_Buttons(), new Invoice_Panel(), "Invoice");
			}
		});
		button1.setMaximumSize(new Dimension(1000, 25));
		add(button1);
		
		JButton button2 = new JButton("Exit Treatment");
		button2.setMaximumSize(new Dimension(1000, 25));
		add(button2);

	}

}
