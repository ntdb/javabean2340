import java.util.ArrayList;

/**
 * This class represents the medical history of the patient
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
	 * This is method is used to find the treatment
	 * @param appointmentID The ID number of the appointment related to the treatment
	 * @return If found, return index, not found, return -1
	 */
	private int getTreatmentIndex(int appointmentID)
	{
		for(int i = 0;i<treatments.size();i++)
		{
			Treatment theTreatment = treatments.get(i);
			if(theTreatment.getAppointmentID() == appointmentID)
				return i;
		}
		return -1;
	}
	
	/**
	 * This method is used to read the treatment as a string
	 * @param appointmentID The ID number of the appointment relating to the treatment
	 * @return The String containing all the information of the treatment
	 */
	public String viewTreatment(int appointmentID)
	{
		int index = getTreatmentIndex(appointmentID);
		return (treatments.get(index)).toString();
	}
	
	/**
	 * This method is used to update the details in the treatment
	 * @param appointmentID The ID number of the appointment to find the treatment
	 * @param newDetails The details needed to add to the treatment
	 */
	public void updateTreatment(int appointmentID, String newDetails)
	{
		int index = getTreatmentIndex(appointmentID);
		(treatments.get(index)).updateDetails(newDetails);
	}
	
	/**
	 * This method is used to delete the treatment
	 * @param appointmentID The ID number of the appointment to find the treatment
	 */
	public void deleteTreatment(int appointmentID)
	{
		int index = getTreatmentIndex(appointmentID);
		treatments.remove(index);
	}

	public int getTreatmentCount() {
		return treatments.size();
	}
	
	/**
	 * This method will add the new Doctors' Orders into the medical history of the patient
	 * @param newDoctorsOrders The Doctors' Orders needed to be added into the medical history
	 */
	public void addDoctorsOrders( DoctorsOrders newDoctorsOrders)
	{
		doctorsOrders.add(newDoctorsOrders);
	}
	
	public String viewDoctorsOrders()
	{
		int latestOne = doctorsOrders.size()-1;
		return (doctorsOrders.get(latestOne)).toString();
	}
	public void updateDoctorsOrders(String prescription, String labWork, String followUp, String other)
	{
		int latestOne = doctorsOrders.size()-1;
		(doctorsOrders.get(latestOne)).updateContent(prescription, labWork, followUp, other);
	}
	public void deleteDoctorsOrders()
	{
		int latestOne = doctorsOrders.size()-1;
		doctorsOrders.remove(latestOne);
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
			Appointment newApp = appSchedule.getAppointment(appointmentIDs.get(i));
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
