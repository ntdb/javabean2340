import java.util.ArrayList;

public class MedicalHistory 
{
	private ArrayList<Integer> appointmentIDs;
	private ArrayList<Treatment> treatments;
	private ArrayList<DoctorsOrders> doctorsOrders;
	
	public void getWeightChart()
	{
		//return null;
	}// need implementation
	
	public void addAppointment(Appointment newAppointment)
	{
		appointmentIDs.add( newAppointment.getAppointmentID() );
	}
	
	public void addTreatment( Treatment newTreatment )
	{
		treatments.add(newTreatment);
	}
	
	public void addDoctorsOrders( DoctorsOrders newDoctorsOrders)
	{
		doctorsOrders.add(newDoctorsOrders);
	}
	
	public String toString(Schedule appSchedule)
	{
		String appointmentString = new String();
		for(int i = 0; i<appointmentIDs.size();i++)
		{
			Appointment newApp = appSchedule.findAppointment(appointmentIDs.get(i));
			appointmentString = appointmentString + newApp.toString();
		}
		
		String treatmentString = new String();
		for(int i = 0; i<treatments.size() ; i++ )
		{
			treatmentString = treatmentString + treatments.get(i).toString();
		}
		
		String doctorsOrdersString = new String();
		for(int i = 0; i<doctorsOrders.size(); i++)
		{
			doctorsOrdersString = doctorsOrdersString + doctorsOrders.get(i).toString();
		}
		
		String fullInfo = "Medical History\n\n\nAppointments:\n" + appointmentString +
						  "\nTreatments:\n" + treatmentString +
						  "\nDoctor's Orders:\n" + doctorsOrdersString;
		return fullInfo;
	}

}
