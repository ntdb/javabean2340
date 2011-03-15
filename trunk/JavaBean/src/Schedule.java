import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

//import JavaBean.src.Appointment;

public class Schedule 
{
	private static ArrayList<Appointment> appointments;

	public Schedule()
	{
		appointments = new ArrayList<Appointment>();
	}

	private static int getAppointmentIndex(int appointmentID)		//Limit permissions!
	{
		for(int i=0; i<appointments.size(); i++)
		{
			Appointment appointment = (Appointment)appointments.get(i);
			if(appointment.getAppointmentID() == appointmentID)
				return i;
		}
		return -1;
	}


	public static void addAppointment(Appointment appointmentIn)				//Limit permissions!
	{
		appointments.add(appointmentIn);
	}
	
	public static Appointment findAppointment(int appointmentID)
	{
		int appointmentIndex = getAppointmentIndex(appointmentID);
		return appointments.get(appointmentIndex);
	}
	
	public static void deleteAppointment(int appointmentID)			//Limit permissions!
	{
		int index = getAppointmentIndex(appointmentID);
		if(index == -1)
		{
		}
		else
		{
		appointments.remove(index);
		}
	}

	public static void displayOneDaySchedule(Date appTime)
	{
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
	}
	
	/**
	 * Prints invoice which contains the patient name, date of visit, and doctor.
	 * Also returns a bill for the service provided.
	 * @param appointmentID Appointment to generate invoice for.
	 * @return invoice information
	 */
	public static String generateInvoice(int appointmentID){
		Appointment app = appointments.get(appointmentID);
		String report = "Patient name: " + app.getpatientName();
		report = report + "\tDate of Visit: " + app.getAppTime();
		report = report + "\tDoctor: " + app.getdoctorName();
		report = report + "\nAmount due: $XXX.XX";		//Placeholder for bill
		return report;
	}

	public static void save() throws IOException {
		IOController.writeToXML(appointments);
	}

	public static void load() throws IOException {
		appointments = IOController.getFromXML(new Appointment());
	}

}
