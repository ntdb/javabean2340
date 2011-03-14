import java.util.Date;

/**
 * This class represents a Nurse in the Hospital system and is a subclass 
 * of User that provides the basic functions necessary in a Hospital setting
 *
 */
public class Nurse extends User {

	private UserController uc;
	private Schedule sc;

	/**
	 * Default constructor
	 *
	 * @param uc The UserController the nurse is able to modify
	 * @param sc The Schedule the nurse is able to modify
	 */
	public Nurse(UserController uc, Schedule sc) {
		super();
		this.uc = uc;
		this.sc = sc;
	}//end default Nurse constructor
	
	/**
	 * Overloaded constructor sets all Nurse attributes
	 * 
	 * @param name The name of the Nurse
	 * @param password The Nurse's password
	 * @param permissions The Nurse's permissions
	 * @param userID The Nurse's user ID
	 * @param uc The UserController the nurse is able to modify
	 * @param sc The Schedule the nurse is able to modify
	 */
	public Nurse(String name, String password, int permissions, int userID, 
			UserController uc, Schedule sc){

		super(name, password, permissions, userID);
		this.uc = uc;
		this.sc = sc;
	}//end Nurse constructor
	
	/**
	 * Creates a new patient in the Hospital system
	 * 
	 * @param UserID The user ID of the patient
	 * @param permissions The permissions of the patient
	 */
	public void createPatient(int UserID, int permissions){
		Patient newPatient = new Patient(UserID, permissions);
		uc.addUser(newPatient);
	}//end createPatient
	
	/**
	 * Deletes a patient from the Hospital system
	 *
	 * @param UserID The user ID of the patient to be deleted
	 */
	public void deletePatient(int UserID){
		uc.deleteUser(UserID);		
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
	 * @param users The array of Users in the Hospital system
	 * @param name The name of the Patient to lookup
	 * @return The UserID of the patient
	 */
	public int PatientLookupByName(User[] users, String name){
		int userID = 0;
		for(int i = 0;i < users.length; i++){
			if(users[i].getName().equalsIgnoreCase(name)){
				userID = users[i].getUserID();
				i = users.length;
			}//end if statement
		}//end for loop
		return userID;
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

	/**
	 * Allows Nurse to view number of users in the system
	 *
	 * @return The number of users in the system
	 */
	public int getUserCount() {
		return uc.getUserCount();
	}//end getUserCount

	/**
	 * Allows Nurse to fetch a particular User
	 *
	 * @param userID The userID of the patient
	 * @return The patient object
	 */
	public Patient getPatient(int userID) {
		return (Patient)uc.getUser(userID);
	}//end getPatient
	
}//end class Nurse
