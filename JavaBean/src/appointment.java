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

	public int getAppointmentID()
	{
		return appointmentID;
	}

	public String toString()
	{
		return null;		//Fill this out!
	}
}
