package gui;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class UserSearchMenu extends JPanel {
	private JTextField txtFirstLast_1;
	private JTextField txtFirstLast;
	private JLabel lblPatients;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnSubmit;
	private JButton btnSubmit_1;

	/**
	 * Create the panel.
	 */
	public UserSearchMenu() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblUsers = new JLabel("Users");
		lblUsers.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(lblUsers, "8, 6, center, default");
		
		lblPatients = new JLabel("Patients");
		lblPatients.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(lblPatients, "20, 6, center, default");
		
		txtFirstLast = new JTextField();
		txtFirstLast.setText("First Last");
		add(txtFirstLast, "8, 8, fill, default");
		txtFirstLast.setColumns(10);
		
		txtFirstLast_1 = new JTextField();
		txtFirstLast_1.setText("First Last");
		add(txtFirstLast_1, "20, 8, fill, default");
		txtFirstLast_1.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		add(btnSubmit, "8, 10");
		
		btnSubmit_1 = new JButton("Submit");
		add(btnSubmit_1, "20, 10");
		
		comboBox = new JComboBox();
		add(comboBox, "8, 14, fill, default");
		
		comboBox_1 = new JComboBox();
		add(comboBox_1, "20, 14, fill, default");
		
	}

}
