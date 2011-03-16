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
	}//end default Patient constructor
	
	/**
	 * Overloaded constructor creates a patient with a name
	 * 
	 * @param name The name of the patient
	 */
	public Patient(String name){
		this.name = name;
		userID = generateUserID(PERMISSIONS);
	}//end Patient constructor		
/*   *****Opted to only use a partial constructor to create a Patient Object*****
	/**
	 * Overloaded constructor sets all Patient attributes
	 * 
	 * @param nameIn The name of the patient
	 * @param passwordIn The patient's password
	 * @param permissionsIn The permissions of the patient
	 * @param userIDIn The patient's user ID
	 * @param ssnIn The patient's social security number
	 * @param birthdayIn The patient's birthday information
	 */
/*	public Patient(String nameIn, String passwordIn, int permissionsIn, 
			int userIDIn, String ssnIn, Date birthdayIn)
	{
		super(nameIn, passwordIn, permissionsIn, userIDIn);
		setSsn(ssnIn);
		setBirthday(birthdayIn);
	}
*/
	
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
	
	public void createTreatment(int patientID, int doctorID, int  appointmentID, String details)
	{
		Treatment newTreatment = new Treatment(patientID, doctorID, appointmentID, details);
		medicalHistory.addTreatment(newTreatment);
	}
	public String viewTreatment(int appointmentID)
	{
		return medicalHistory.viewTreatment(appointmentID);
	}
	public void updateTreatment(int appointmentID, String newDetails)
	{
		medicalHistory.updateTreatment(appointmentID, newDetails);
	}
	public void deleteTreatment(int appointmentID)
	{
		medicalHistory.deleteTreatment(appointmentID);
	}

	public int getTreatmentCount()
		return medicalHistory.getTreatmentCount();
	}
	
	public void createDoctorsOrders(String prescription, String labWork, String followUp, String other)
	{
		DoctorsOrders newDoctorsOrders = new DoctorsOrders( prescription, labWork, followUp, other);
		medicalHistory.addDoctorsOrders(newDoctorsOrders);
	}
	public String viewDoctorsOrders()
	{
		return medicalHistory.viewDoctorsOrders();
	}
	public void updateDoctorsOrders(String prescription, String labWork, String followUp, String other)
	{
		medicalHistory.updateDoctorsOrders(prescription, labWork, followUp, other);
	}
	public void deleteDoctorsOrders()
	{
		medicalHistory.deleteDoctorsOrders();
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
