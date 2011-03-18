/* Nurse class for Hospital System
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
	public int createPatient() {
		Patient newPatient = new Patient();
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
	
/*	
	/**
	 * Allows Nurse to view Patient information
	 * 
	 * @param patient The Patient to look at
	 */
/*	public void viewPatient(Patient patient){
		//Views Patient information, implement later
	}//end viewPatient
*/	
	/**
	 * Allows Nurse to view the current schedule of Appointments
	 * 
	 * @param schedule The schedule of Appointments
	 * @param appTime The Date of the Appointment
	 */
	public void viewAppointments(Schedule schedule, Date appTime){
		Schedule.displayOneDaySchedule(appTime);
	}//end viewAppointments

	/**
	 * Returns a count of the Users in the Hospital system
	 * 
	 * @return The number of Users in the system
	 */
	public int getUserCount() {
		return UserController.getUserCount();
	}//end getAppointmentCount

	/**
	 * Returns a count of the Appointments in the Hospital system
	 *
	 * @return The number of Appointments in the system
	 */
	public int getAppointmentCount() {
		return Schedule.getAppointmentCount();
	}//end getAppointmentCount

	/**
	 * Gets a Patient using the Patient's user ID
	 * 
	 * @param userID The user ID of the patient to get
	 * @return The Patient
	 */
	public Patient getPatient(int userID) {
		Patient newPatient = null;
		if(UserController.getUser(userID) instanceof Patient){
			newPatient = (Patient) UserController.getUser(userID);
		}//end if
		else{
			Hospital.LOGGER.warning("Nurse getPatient returned a User that " +
					"is not a patient");
		}//end else
		return (Patient) UserController.getUser(userID);
	}//end getPatient
	
	/**
	 * This method is used to get an appointment from the database via its ID
	 * @param appointmentID The ID number of the appointment wanted
	 * @return The required appointment
	 */
	public Appointment getAppointment(int appointmentID) {
		return Schedule.getAppointment(appointmentID);
	}//end getAppointment

	/**
	 * This method is used to create a new appointment and add it to the schedule
	 * @param appTime The time of the new appointment
	 * @param appointmentID The ID number of the new appointment
	 * @param patientName The name of the patient
	 * @param patientSSN The SSN number of the patient
	 * @param doctorName The name of the doctor
	 */
	public void createAppointment(Date appTime, int appointmentID, String patientName, String patientSSN, String doctorName) {
		Appointment newAppointment = new Appointment(appTime, appointmentID, patientName, patientSSN, doctorName);
		Schedule.addAppointment(newAppointment);
	}
	
	/**
	 * This method is used to update the time and doctor name in the appointment, others should not be changed
	 * @param appointmentID The ID of the appointment need changes
	 * @param newTime The new time for the appointment
	 * @param newDoctorName The new doctor name of the appointment
	 */
	public void updateAppointment(int appointmentID, Date newTime, String newDoctorName) {
		Schedule.updateAppointment(appointmentID, newTime,newDoctorName);
	}
	
	/**
	 * This method is used to read the appointment
	 * @param appointmentID The ID number of the appointment
	 * @return The String containing the information of the appointment
	 */
	public String viewAppointment(int appointmentID) {
		Appointment theAppointment = Schedule.getAppointment(appointmentID);
		String fullinfo = theAppointment.toString();
		return fullinfo;
	}
	
	/**
	 * This method is used to delete a chosen appointment from the schedule
	 * @param appointmentID The ID number of the appointment
	 */
	public void deleteAppointment(int appointmentID) {
		Schedule.deleteAppointment(appointmentID);
	}
	
	/**
	 * Creates a treatment record for a given patient
	 *
	 * @param patientID The patient to assign a treatment record to
	 * @param doctorID The doctor to be noted on the treatment record
	 * @param appointmentID The appointment to be noted on the treatment record
	 * @param details Details on the treatment, specified by doctor or nurse
	 */
	public void createTreatment(int patientID, int doctorID, int  appointmentID, String details) {
		getPatient(patientID).getMedicalHistory().addTreatment(new Treatment(patientID, doctorID, appointmentID, details));
	}//end createTreatment

	/**
	 * This method is used to read a treatment record based on patient ID and appointment ID
	 * @param patientID The ID number of the patient
	 * @param appointmentID The ID number of the appointment
	 * @return A string containg all the information in the treatment
	 */
	public String viewTreatment(int patientID, int appointmentID) {
		return getPatient(patientID).getMedicalHistory().viewTreatment(appointmentID);
	}

	/**
	 * This method is used to update the information in the treatment, it will add the information into it
	 * @param patientID The ID number of the patient
	 * @param appointmentID The ID number of the appointment
	 * @param newDetails The treatment information needed to add in
	 */
	public void updateTreatment(int patientID, int appointmentID, String newDetails) {
		getPatient(patientID).getMedicalHistory().updateTreatment(appointmentID, newDetails);
	}

	/**
	 * This method is used to delete a treatment from the database
	 * @param patientID The ID number of the patient
	 * @param appointmentID The ID number of the appointment
	 */
	public void deleteTreatment(int patientID, int appointmentID) {
		getPatient(patientID).getMedicalHistory().deleteTreatment(appointmentID);
	}

	/**
	 * This method is used to get the total number of treatments for the patient
	 * @param patientID The ID number of the patient
	 * @return The number of patient's treatment records
	 */
	public int getTreatmentCount(int patientID) {
		return getPatient(patientID).getMedicalHistory().getTreatmentCount();
	}

	public String generateInvoice(int appointmentID) {
		return Schedule.generateInvoice(appointmentID);
	}

	/**
	 * Returns a String representation of Nurse
	 *  
	 * @return A String representation of Nurse
	 */
	public String toString(){
		return new String("Nurse: " + name);
	}//end toString
	
}//end class Nurse
