import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

//import JavaBean.src.Appointment;

public class Schedule 
{
	private static ArrayList<Appointment> appointments = new ArrayList<Appointment>();

	/**
	 * For system use, returns the index of the appointment in the appointments ArrayList
	 *
	 * @param appointmentID The ID of the appointment to be found
	 */
	private static int getAppointmentIndex(int appointmentID) {
		for(int i=0; i<appointments.size(); i++)
		{
			Appointment appointment = (Appointment)appointments.get(i);
			if(appointment.getAppointmentID() == appointmentID)
				return i;
		}
		return -1;
	}//end getAppointmentIndex

	/**
	 * Adds an appointment to the system
	 *
	 * @param appointmentIn The appointment to be added to the schedule
	 */
	public static void addAppointment(Appointment appointmentIn) {
		appointments.add(appointmentIn);
	}//end addAppointment
	
	/**
	 * Finds an appointment by its ID
	 *
	 * @param appointmentID The ID of the appointment to be returned
	 * @return The desired appointment
	 */
	public static Appointment getAppointment(int appointmentID) {
		int appointmentIndex = getAppointmentIndex(appointmentID);
		return appointments.get(appointmentIndex);
	}//end getAppointment
	
	/**
	 * Updates an appointment in the system
	 * 
	 * @param appointmentID The ID of the appointment to be updated
	 * @param newTime The updated time of the appointment
	 * @param newDoctorName The updated name of the appointment's doctor
	 */
	public static void updateAppointment(int appointmentID, Date newTime, String newDoctorName) {
		Appointment theAppointment = getAppointment(appointmentID);
		theAppointment.updateAppointment(newTime, newDoctorName);
	}//end updateAppointment
	
	/**
	 * Deletes an appointment from the system
	 *
	 * @param appointmentID The ID of the appointment to be deleted
	 */
	public static void deleteAppointment(int appointmentID) {
		int index = getAppointmentIndex(appointmentID);
		if(index == -1)
		{
		}
		else
		{
		appointments.remove(index);
		}
	}//end deleteAppointment

	/**
	 * Displays the appointment schedule for a given day
	 *
	 * @param appTime The day of appointments to show
	 */
	public static void displayOneDaySchedule(Date appTime) {
		ArrayList<Appointment> oneDaySchedule = new ArrayList<Appointment>();
		
		for(int i=0; i<appointments.size(); i++)
		{
			Appointment appointment = (Appointment)appointments.get(i);
			if(appointment.getAppTime() == appTime)
				oneDaySchedule.add(appointment);
		}
		
		if(oneDaySchedule.size() == 0)
		{
			System.out.println("No appointment at" + appTime.toString() + "\n");
		}
		else
		{
			for(int j=0; j<oneDaySchedule.size();j++)
			{
				Appointment newEntry = (Appointment)oneDaySchedule.get(j);
				System.out.println( newEntry.toString() );
			}
		}
	}//end displayOneDaySchedule
	
	/**
	 * Prints invoice which contains the patient name, date of visit, and doctor.
	 * Also returns a bill for the service provided.
	 *
	 * @param appointmentID Appointment to generate invoice for.
	 * @return invoice information
	 */
	public static String generateInvoice(int appointmentID) {
		Appointment app = appointments.get(getAppointmentIndex(appointmentID));
		String report = "Patient name: " + app.getpatientName();
		report = report + "\tDate of Visit: " + app.getAppTime();
		report = report + "\tDoctor: " + app.getdoctorName();
		report = report + "\nAmount due: $XXX.XX";		//Placeholder for bill
		return report;
	}//end generateInvoice

	/**
	 * Returns the number of appointments in the Hospital system
	 *
	 * @return The number of appointments in the Hospital system
	 */
	public static int getAppointmentCount() {
		return appointments.size();
	}//end getAppointmentCount

	/**
	 * Writes the schedule to XML
	 */
	public static void save() throws IOException {
		IOController.writeToXML(appointments);
	}//end save

	/**
	 * Retreives the schedule from XML
	 */
	public static void load() throws IOException {
		appointments = IOController.getFromXML(new Appointment());
	}//end load

}
