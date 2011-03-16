/* Nurse Class for Hospital System
 * Team Java Bean
 */

import java.util.Date;

/**
 * This class represents a Nurse in the Hospital system and is a subclass 
 * of User that provides the basic functions necessary in a Hospital setting
 *
 * @author Team Java Bean
 * @version 1.1 3/14/11
 */
public class Nurse extends User {

	/**
	 * The permission level of all Nurses, used to generate user ID
	 */
	private static final int PERMISSIONS = 3;
	
	/**
	 * Default constructor sets all attributes to null
	 * 
	 */
	public Nurse(){
	}//end default Nurse constructor
	
	/**
	 * Overloaded constructor sets all Nurse attributes
	 * 
	 * @param name The name of the Nurse
	 * @param password The Nurse's password
	 */
	public Nurse(String name, String password){
		super(name, password);
		userID = generateUserID(PERMISSIONS);
	}//end Nurse constructor
	
	/**
	 * Creates a new patient in the Hospital system
	 * 
	 * @return The new patient's userID
	 */
	public int createPatient(){
		final Patient newPatient = new Patient();
		UserController.addUser(newPatient);
		return newPatient.getUserID();
	}//end createPatient
	
	/**
	 * Deletes a Patient from the Hospital system
	 * 
	 * @param userID The user ID of the Patient to be deleted
	 */
	public void deletePatient(int userID){
		UserController.deleteUser(userID);
	}//end deletePatient
	
	/**
	 * Edits the personal information of a given Patient
	 * 
	 * @param patient The patient to be edited
	 * @param name The name of the Patient
	 * @param ssn The Patient's Social Security Number
	 * @param birthday The Date of the Patient's birthday
	 */
	public void editPatient(Patient patient, String name, String ssn,
			Date birthday){
		
		patient.setName(name);
		patient.setSsn(ssn);
		patient.setBirthday(birthday);
		
	}//end editPatient
	
	/**
	 * Looks up a patient by the Patient's name
	 * 
	 * @param name The name of the Patient to lookup
	 * @return The User looked-up
	 */
	public User patientLookupByName(String name){
		return UserController.getUser(name);
	}//end PatientLookupByName
	
	/**
	 * Allows Nurse to view Patient information
	 * 
	 * @param patient The Patient to look at
	 */
	public void viewPatient(Patient patient){
		//Views Patient information, implement later
		int id = patient.getUserID();
	}//end viewPatient
	
	/**
	 * Allows Nurse to view the current schedule of Appointments
	 * 
	 * @param schedule The schedule of Appointments
	 * @param appTime The Date of the Appointment
	 */
	public void viewAppointments(Schedule schedule, Date appTime){
		schedule.displayOneDaySchedule(appTime);
	}//end viewAppointments

	/**
	 * Returns a count of the Users in the Hospital system
	 * 
	 * @return The number of Users in the system
	 */
	public int getUserCount() {
		return UserController.getUserCount();
	}

	/**
	 * Gets a Patient using the Patient's user ID
	 * 
	 * @param userID The user ID of the patient to get
	 * @return The Patient
	 */
	public Patient getPatient(int userID) {
		return (Patient) UserController.getUser(userID);
	}//end getPatient
	
	/**
	 * Returns a String representation of Nurse
	 *  
	 * @return A String representation of Nurse
	 */
	public String toString(){
		return new String("Nurse: " + name);
	}//end toString
	
}//end class Nurse
