package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NurseMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public NurseMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("Patients");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Portal.update(new PatientAdminMenu(), new PatientSearchMenu());
			}
		});
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setMaximumSize(new Dimension(1000,25));
		add(button);
		
		JButton button_1 = new JButton("Appointments");
		button_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button_1.setMaximumSize(new Dimension(1000,25));
		add(button_1);
		
		JButton button_2 = new JButton("New Patient");
		button_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button_2.setMaximumSize(new Dimension(1000,25));
		add(button_2);
	}

}
