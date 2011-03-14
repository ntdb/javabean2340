/**
 * This class represents a treatment record of patients, on a per appointment basis.
 * @author William
 */

public class Treatment 
{
	private int patientID;
	private int doctorID;
	private int appointmentID;
	private String details;
	
	/**
	 * The standard constructor of the treatment class, parameters can be set to null.
	 * @param patientID The user ID of the patient
	 * @param doctorID The user ID of the doctor who conduct the service
	 * @param appointmentID The ID number of the related appointment. Best way to trace the treatment.
	 * @param details The detailed instruction of the treatment.
	 */
	private Treatment(int patientID, int doctorID, int  appointmentID, String details)
	{
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.appointmentID = appointmentID;
		this.details = details;
	}
	
	/**
	 * This method is used to fill in the details. 
	 * If the detail is not empty, it will strat a new line and attach the new details.
	 * @param newDetails The detailed instructions.
	 */
	public void createDetails(String newDetails)
	{
		if(details==null)
		{
			details = newDetails;
		}
		else
		{
			details = details + "\n" +newDetails;
		}
	}
	
	/**
	 * This method will export the treatment as a string.
	 * It will start a new line and end with a new line.
	 * @return A string contains all the infomation of the treatment.
	 */
	public String toString()
	{
		String fullInfo = "\nPatient ID: " + patientID +
						  "\nDoctor ID: " + doctorID +
						  "\nAppointment ID: " + appointmentID +
						  "\nDetails:\n" + details +"\n";
		return fullInfo;
	}
}
