public class Treatment 
{
	private Patient tPatient;
	private Doctor tDoctor;
	private Appointment tAppointment;
	private String details;
	
	private Treatment(Patient tPatient, Doctor tDoctor, Appointment tAppointment, String details)
	{
		this.tPatient = tPatient;
		this.tDoctor = tDoctor;
		this.tAppointment = tAppointment;
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
}
