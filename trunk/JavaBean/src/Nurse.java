import java.util.Date;

/**
 * This class represents a Nurse in the Hospital system and is a subclass 
 * of User that provides the basic functions necessary in a Hospital setting
 *
 */
public class Nurse extends User {

	/**
	 * Default constructor sets all attributes to null
	 * 
	 */
	public Nurse(){
		super();
	}//end default Nurse constructor
	
	/**
	 * Overloaded constructor sets all Nurse attributes
	 * 
	 * @param name The name of the Nurse
	 * @param password The Nurse's password
	 */
	public Nurse(String name, String password){
		super(name, password);
		userID = generateUserID(3);
	}//end Nurse constructor
	
	/**
	 * Creates a new patient in the Hospital system
	 * 
	 * @param UserID The user ID of the patient
	 * @param permissions The permissions of the patient
	 */
	public void createPatient(){
		Patient newPatient = new Patient();
		UserController.addUser(newPatient);
	}//end createPatient
	
	public void deletePatient(int UserID){
		UserController.deleteUser(UserID);		
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
	public User PatientLookupByName(String name){
		return UserController.getUser(name);
	}//end PatientLookupByName
	
	/**
	 * Allows Nurse to view Patient information
	 * 
	 * @param patient The Patient to look at
	 */
	public void viewPatient(Patient patient){
		//Views Patient information
	}//end viewPatient
	
	/**
	 * Allows Nurse to view the current schedule of Appointments
	 * 
	 * @param schedule The schedule of Appointments
	 * @param appTime The Date of the Appointment
	 */
	public void viewAppointments(Schedule schedule, Date appTime)
	{
		schedule.displayOneDaySchedule(appTime);
	}//end viewAppointments

	public int getUserCount() {
		return UserController.getUserCount();
	}

	public Patient getPatient(int userID) {
		return (Patient)UserController.getUser(userID);
	}
	
}//end class Nurse
