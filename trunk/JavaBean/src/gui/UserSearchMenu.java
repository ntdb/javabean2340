package gui;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class UserSearchMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public UserSearchMenu() {

		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		add(comboBox, "2, 2, fill, default");
		
	}

}
