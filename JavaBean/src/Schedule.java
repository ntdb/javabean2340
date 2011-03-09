import java.util.ArrayList;
import java.util.Date;

public class Schedule 
{
	private ArrayList<Appointment> appointments;

	public Schedule()
	{
		appointments = new ArrayList<Appointment>();
	}

	private int getAppointmentIndex(int appointmentID)		//Limit permissions!
	{
		for(int i=0; i<appointments.size(); i++)
		{
			Appointment appointment = (Appointment)appointments.get(i);
			if(appointment.getAppointmentID() == appointmentID)
				return i;
		}
		return -1;
	}


	public void addAppointment(Appointment appointmentIn)				//Limit permissions!
	{
		appointments.add(appointmentIn);
	}
	
	public void deleteAppointment(int appointmentID)			//Limit permissions!
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

	public void displayOneDaySchedule(Date appTime)
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
	
	public String toString()
	{
		return "Schedule";
	}
}
