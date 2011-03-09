public class Treatment 
{
	private int patientID;
	private int doctorID;
	private int appointmentID;
	private String details;
	
	private Treatment(int patientID, int doctorID, int  appointmentID, String details)
	{
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.appointmentID = appointmentID;
		this.details = details;
	}
	
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
	
	public String toString()
	{
		return null;
	}
}
