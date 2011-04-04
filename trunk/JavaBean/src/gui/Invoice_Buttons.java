package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.Dimension;

public class Invoice_Buttons extends JPanel {

	/**
	 * Create the panel.
	 */
	public Invoice_Buttons() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("Close Invoice");
		button.setMaximumSize(new Dimension(1000, 25));
		add(button);

	}

}
