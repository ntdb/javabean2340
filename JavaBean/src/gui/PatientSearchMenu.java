package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import emr.Nurse;
import emr.Patient;
import emr.UserController;
import javax.swing.JLabel;
import java.awt.Font;

public class PatientSearchMenu extends JPanel {

	private String name;
	private String[] patientNames = {"Doe, Jane", "Jones, John", "Waters, Bob"};
	private JComboBox comboBox;
	private JTextField txtFirstLast;
	
	/**
	 * Create the panel.
	 */
	public PatientSearchMenu() {
		setLayout(new FormLayout(new ColumnSpec[] {
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
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblPatientSearch = new JLabel("Patient Search");
		lblPatientSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(lblPatientSearch, "16, 6, center, default");
		
		txtFirstLast = new JTextField();
		txtFirstLast.setText("First Last");
		add(txtFirstLast, "16, 8, fill, default");
		txtFirstLast.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Nurse nurse = (Nurse) Portal.getUser();
				Patient patient = (Patient)(nurse.patientLookupByName(txtFirstLast.getText()));
				Portal.update(new PatientAdminMenu(patient), new PatientProfilePanel(patient), "View Patient");
			}
		});
		add(btnSubmit, "16, 10");
		
		
/*
  
		//patientNames = UserController.getPatientNames();
		//patientNames = {"Doe, Jane", "Jones, John", "Waters, Bob"};
		//String name = "";	
		comboBox = new JComboBox(patientNames);
		add(comboBox, "2, 2, fill, default");
		
		JButton btnViewPatient = new JButton("View Patient");
		btnViewPatient.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				name = patientNames[comboBox.getSelectedIndex()];
				ViewPatientContent vpc = new ViewPatientContent();
				vpc.getLblName().setText(name);
				Portal.update(new PatientAdminMenu(), vpc, "View Patient");
			}
		});
		add(btnViewPatient, "2, 4");



  		
 */
		
		
		
	}

	
	
}
