package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import emr.Admin;
import emr.Doctor;
import emr.Nurse;
import emr.Patient;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateUserMenu extends JPanel {

	private static final String[] USERS = {"Patient", "Nurse", "Doctor", "Admin"};
	
	
	/**
	 * Create the panel.
	 */
	public CreateUserMenu() {
		setLayout(new FormLayout(new ColumnSpec[] {
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
		
		final JComboBox comboBox = new JComboBox(USERS);
		add(comboBox, "2, 6, fill, default");
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Admin admin = (Admin)(Portal.getUser());
				
				if(USERS[comboBox.getSelectedIndex()].equals("Patient")){
					Patient newPatient = admin.getPatient(admin.createPatient());
					Portal.setContent(new NewPatientContent(newPatient));
				}//end if
				else if(USERS[comboBox.getSelectedIndex()].equals("Nurse")){
					Nurse newNurse = (Nurse)(admin.getUser(admin.createNurse()));
					Portal.setContent(new NewPatientContent(newNurse));
				}//end else if
				else if(USERS[comboBox.getSelectedIndex()].equals("Doctor")){
					Doctor newDoctor = (Doctor)(admin.getUser(admin.createDoctor()));
					Portal.setContent(new NewPatientContent(newDoctor));
				}//end else if
				else if(USERS[comboBox.getSelectedIndex()].equals("Admin")){
					Admin newAdmin = (Admin)(admin.getUser(admin.createAdmin()));
					Portal.setContent(new NewPatientContent(newAdmin));
				}//end else if
			}
		});
		add(btnCreate, "2, 10");

		
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
