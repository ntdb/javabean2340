import java.util.Date;

/**
 * This class represents a patient in the Hospital system that extends from User
 *
 */
public class Patient extends User {
	private String ssn;
	private Date birthday;
//	private MedicalHistory medicalHistory;
	
	/**
	 * Default constructor sets all attributes to null
	 * 
	 */
	public Patient()
	{
		super();
		ssn = null;
		birthday = null;
	}
	
	/**
	 * Overloaded constructor sets the UserID and permissions of the Patient
	 * 
	 * @param UserID The UserID of the Patient
	 * @param permissions The permissions of the Patient
	 */
	public Patient(int UserID, int permissions){
		this.userID = UserID;
		this.permissions = permissions;
	}
	
	
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
	 * Requests an appointment made by the Patient
	 * 
	 * @param myTime The requested appointment time
	 * @param myDoctor The Doctor requested for the appointment
	 * @return The completed appointment
	 */
	public Appointment requestAppointment(Date myTime, String myDoctor)
	{
		//int myNewAppointmentID = medicalHistory.appointment.lastID+1
		//Appointment myNewAppointment = new Appointment(myTime, myNewAppointmentID, name, ssn, myDoctor);
		return null;
	}

	public String toString()
	{
		return new String("Patient: " + name);			//Expand this
	}
}
