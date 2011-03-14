import java.util.ArrayList;

/**
 * This class represents the medical history of the patient
 * @author William
 *
 */
public class MedicalHistory 
{
	private ArrayList<Integer> appointmentIDs;
	private ArrayList<Treatment> treatments;
	private ArrayList<DoctorsOrders> doctorsOrders;
	
	/**
	 * This is the default constructor of the MedicalHistory class
	 */
	public MedicalHistory()
	{
		appointmentIDs = new ArrayList<Integer>();
		treatments = new ArrayList<Treatment>();
		doctorsOrders = new ArrayList<DoctorsOrders>();
	}
	
	public void getWeightChart()
	{
		//return null;
	}// need implementation
	
	/**
	 * This method will get the appointmentID of the appointment and add the ID into the records
	 * @param newAppointment The appointment needed to be added into the Medical History
	 */
	public void addAppointment(Appointment newAppointment)
	{
		appointmentIDs.add( newAppointment.getAppointmentID() );
	}
	
	/**
	 * This method will add the new treatment into the medical history
	 * @param newTreatment The treatment needed to be added into the medical history
	 */
	public void addTreatment( Treatment newTreatment )
	{
		treatments.add(newTreatment);
	}
	
	/**
	 * This method will add the new Doctors' Orders into the medical history of the patient
	 * @param newDoctorsOrders The Doctors' Orders needed to be added into the medical history
	 */
	public void addDoctorsOrders( DoctorsOrders newDoctorsOrders)
	{
		doctorsOrders.add(newDoctorsOrders);
	}
	
	/**
	 * This method will export the medical history as a string.
	 * It will start a new line and end with a new line.
	 * @param appSchedule The schedule is required to get the information of appointments
	 * @return A string contains all the information of the medical history
	 */
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
		
		String fullInfo = "\nMedical History\n\n\nAppointments:\n" + appointmentString +
						  "\nTreatments:\n" + treatmentString +
						  "\nDoctor's Orders:\n" + doctorsOrdersString;
		return fullInfo;
	}

}
