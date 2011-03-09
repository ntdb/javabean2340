import java.util.ArrayList;

public class Schedule 
{
	private ArrayList appointments;

	public Schedule()
	{
		appointments = new ArrayList();
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

	public String toString()
	{
		return "Schedule";
	}
}
