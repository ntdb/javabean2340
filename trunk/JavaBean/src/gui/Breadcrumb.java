/**
 * Breadcrumb Class
 * @author Team java Bean
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Updates the Portal Display with new menus and content.
 * @author Team Java Bean
 * @version 1.00
 */
public class Breadcrumb {
	
	/**
	 * Menu
	 */
	private final JPanel menu;
	
	/**
	 * Content
	 */
	private final JPanel content;
	
	/**
	 * Label
	 */
	private final JLabel label;
	
	/**
	 * Background color
	 */
	private final Color BG = new Color(212, 212, 232);
	
	/**
	 * Breadcrumb constructor
	 * @param menuIn Menu of the breadcrumb
	 * @param contentIn content Panel of the breadcrumb
	 * @param title name of the breadcrumb panel
	 */
	public Breadcrumb(JPanel menuIn, JPanel contentIn, String title) {
		menu = menuIn;
		menu.setBackground(BG);
		content = contentIn;
		label = new JLabel(title);
		label.setForeground(Color.BLUE);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Portal.update(menu, content, "");
			}
			public void mouseEntered(MouseEvent arg1) {
				label.setForeground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg2) {
				label.setForeground(Color.BLUE);
			}
		});
	}
	
	/**
	 * Returns the label of the breadcrumb
	 * @return breadcrumb label
	 */
	public JLabel getLabel() {
		return label;
	}
	
	/**
	 * Returns the menu of the breadcrumb
	 * @return breadcrumb menu
	 */
	public JPanel getMenu() {
		return menu;
	}
	
	/**
	 * Returns the Content of the breadcrumb
	 * @return breadcrumb content
	 */
	public JPanel getContent() {
		return content;
	}
	
	/**
	 * Returns a string representation of the breadcrumb
	 * @return String of breadcrumb
	 */
	public String toString(){
		return "";
	}
}
