package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.UIManager;

public class NavigationButton extends JButton{
	
	private final Dimension SIZE = new Dimension(1000, 30);
	
	NavigationButton(String text){
		
		try {
		    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		//setOpaque(true);
		
		//setFont(new Font("Helvetica", Font.BOLD, 18));
		
		setText(text);
		setPreferredSize(SIZE);
		
	//	setBackground(Color.CYAN);
		
	}
}
