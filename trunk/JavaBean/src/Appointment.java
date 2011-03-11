import java.util.Date;

public class Appointment
{
	private Date appTime;
	private int appointmentID;
	private String patientName, patientSSN, doctorName;

	private Appointment(Date appTime, int appointmentID, String patientName, String patientSSN, String doctorName)
	{
		this.appTime = appTime;
		this.appointmentID = appointmentID;
		this.patientName = patientName;
		this.patientSSN = patientSSN;
		this.doctorName = doctorName;
	}

	public int getAppointmentID(){
		return appointmentID;
	}
	
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

	public String toString()
	{
		String fullInfo = "\nAppointment ID: " + appointmentID +
						  "\nAppointment Time: " + appTime.toString() +
						  "\nPatient Name: " + patientName +
						  "\nDoctor's Name: " + doctorName + "\n";
		return fullInfo;
	}
}
