package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Breadcrumb {
	
	private JPanel menu;
	private JPanel content;
	private JLabel label;
	
	public Breadcrumb(JPanel menuIn, JPanel contentIn, String title) {
		menu = menuIn;
		content = contentIn;
		label = new JLabel(title);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Portal.update(menu, content, "");
			}
		});
	}
	
	public JLabel getLabel() {
		return label;
	}
	
	public JPanel getMenu() {
		return menu;
	}
	
	public JPanel getContent() {
		return content;
	}
}
