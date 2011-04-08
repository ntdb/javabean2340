package emr;
/* Nurse class for Hospital System
 * Team Java Bean
 */

import java.util.Date;

/**
 * This class represents a patient in the Hospital system that extends from User
 *
 * @author Team Java Bean
 * @version 1.1 3/14/11
 */
public class Patient extends User {
	
	/**
	 * The permission level of all Patients, used to generate user ID
	 */
	private static final int PERMISSIONS = 4;
	
	/**
	 * The social security number of the Patient
	 */
	private String ssn;
	
	/**
	 * The birthday of the Patient
	 */
	private Date birthday;
	
	/**
	 * The address of the patient.
	 */
	private String address;
	
	/**
	 * The phone number of the patient.
	 */
	private String phone;
	
	/**
	 * The email address of the email.
	 */
	private String email;
	
	/**
	 * the gender represented by either 'M' or 'F'
	 */
	private char gender;
	
	/**
	 * The pharmacy information of the patient.
	 */
	private String pharmacy;
	
	/**
	 * The insurance carrier information of the patient.
	 */
	private String insuranceCarrier;
	
	/**
	 * The allergies of the patient.
	 */
	private String allergies;
	
	/**
	 * The Patient's medical history
	 */
	private MedicalHistory medicalHistory;
	
	/**
	 * Default constructor sets all attributes to null
	 * 
	 */
	public Patient(){
		ssn = null;
		birthday = null;
		userID = generateUserID(PERMISSIONS);
		login = new LoginClass(userID);
		password = "password";
		medicalHistory = new MedicalHistory();
	}//end default Patient constructor
	
	/**
	 * Overloaded constructor creates a patient with a name
	 * 
	 * @param name The name of the patient
	 */
	public Patient(String name){
		this.name = name;
		userID = generateUserID(PERMISSIONS);
		login = new LoginClass(userID);
		password = "password";
		medicalHistory = new MedicalHistory();
	}//end Patient constructor		
	
	/**
	 * This changes the patient's name
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Sets the patient's social security number
	 * 
	 * @param ssn The social security number of the patient
	 */
	public void setSsn(String ssn) {			//Limit permissions!
		this.ssn = ssn;
	}

	/**
	 * Returns the patient's social security number
	 * 
	 * @return The patient's social security number
	 */
	public String getSsn() {				//Limit permissions!
		return ssn;
	}

	/**
	 * Sets the patient's birthday
	 * 
	 * @param birthday The patient's birthday
	 */
	public void setBirthday(Date birthday) {		//Limit permissions!
		this.birthday = birthday;
	}

	/**
	 * Returns the patient's birthday
	 * 
	 * @return The Date of the patient's birthday
	 */
	public Date getBirthday() {				//Limit permissions!
		return birthday;
	}
	
	/**
	 * Return the patient's address
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Set the new address
	 * @param newAddress The new address of the patient
	 */
	public void setAddress( String newAddress ) {
		address = newAddress;
	}
	
	/**
	 * Returns the phone number of the patient
	 * @return The phone number of the patient
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Set the new phone number
	 * @param newPhone The new phone number of the patient
	 */
	public void setPhone( String newPhone ) {
		phone = newPhone;
	}
	
	/**
	 * Returns the email of the patient
	 * @return The email of the patient
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Set the new email for patient
	 * @param newEmail The new email address of the patient
	 */
	public void setEmail( String newEmail ) {
		email = newEmail;
	}
	
	/**
	 * Return the gender of the patient
	 * @return The gender of the patient
	 */
	public char getGender() {
		return gender;
	}
	
	/**
	 * Return the pharmacy information
	 * @return The pharmacy information
	 */
	public String getPharmacy() {
		return pharmacy;
	}
	
	/**
	 * Return insurance carrier information
	 * @return The insurance carrier information
	 */
	public String getInsuranceCarrier() {
		return insuranceCarrier;
	}
	
	/**
	 * Return allergies information of the patient
	 * @return The allergies information
	 */
	public String getAllergies() {
		return allergies;
	}
	
	/**
	 * this is to use the birthday to calculate the age of the patient
	 * @return the age of the patient
	 */
	public int getAge() {
		return 0;//need implementation
	}
	
	/**
	 * Returns the patient's medical history
	 * 
	 * @return The patient's medical history
	 */
	public MedicalHistory getMedicalHistory() {
		return medicalHistory;
	}

	/**
	 * Sets the patient's medical history
	 * 
	 * @param medicalHistory The patient's medical history
	 */
	public void setMedicalHistory(MedicalHistory medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	
	/**
	 * Requests an appointment made by the Patient
	 * 
	 * @param myTime The requested appointment time
	 * @param myDoctor The Doctor requested for the appointment
	 * @return The completed appointment
	 */
	public Appointment requestAppointment(Date myTime, String myDoctor){
		//int myNewAppointmentID = medicalHistory.appointment.lastID+1
		//Appointment myNewAppointment = new Appointment(myTime, myNewAppointmentID, name, ssn, myDoctor);
		return null;
	}
	
	/**
	 * Returns a String representation of Patient
	 *  
	 * @return A String representation of Patient
	 */
	public String toString(){
		return new String("Patient: " + name);			//Expand this
	}
}
