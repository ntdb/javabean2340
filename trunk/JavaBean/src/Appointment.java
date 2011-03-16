import java.util.Date;

/**
 * This class represents the appointment
 * @author William
 *
 */
public class Appointment
{
	private Date appTime;
	private int appointmentID;
	private String patientName, patientSSN, doctorName;

	public Appointment() {
	}

	/**
	 * This is the standard constructor of the appointment class
	 * @param appTime The object to indicate the time of the appointment
	 * @param appointmentID The ID number for this appointment
	 * @param patientName The name of the patient
	 * @param patientSSN The SSN od the patient
	 * @param doctorName The name of the doctor required by patient
	 */
	public Appointment(Date appTime, int appointmentID, String patientName, String patientSSN, String doctorName)
	{
		this.appTime = appTime;
		this.appointmentID = appointmentID;
		this.patientName = patientName;
		this.patientSSN = patientSSN;
		this.doctorName = doctorName;
	}

	/**
	 * This method is used to get the ID number of the appointment
	 * @return The ID number of the appointment
	 */
	public int getAppointmentID(){
		return appointmentID;
	}
	
	/**
	 * This method is used to get the time of the appointment
	 * @return The Date object containing the time of the appointment
	 */
	public Date getAppTime(){
		return appTime;
	}
	
	/**
	 * Returns the Name of the patient involved in the appointment.
	 * @return Name of the Patient.
	 */
	public String getpatientName(){
		return patientName;
	}
	
	/**
	 * Returns the Name of the doctor involved in the appointment
	 * @return Name of the Doctor.
	 */
	public String getdoctorName(){
		return doctorName;
	}

	/**
	 * This method will export the appointment as a string.
	 * It will start a new line and end with a new line.
	 * @return A string contains all the information of the appointment.
	 */
	public String toString()
	{
		String fullInfo = "\nAppointment ID: " + appointmentID +
						  "\nAppointment Time: " + appTime.toString() +
						  "\nPatient Name: " + patientName +
						  "\nDoctor's Name: " + doctorName + "\n";
		return fullInfo;
	}
}
