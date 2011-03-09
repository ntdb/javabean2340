import java.util.Date;

public class Patient extends User {
	private String ssn;
	private Date birthday;
//	private MedicalHistory medicalHistory;

	public Patient()
	{
		super();
		ssn = null;
		birthday = null;
	}
	
	public Patient(String nameIn, String passwordIn, int permissionsIn, 
			int userIDIn, String ssnIn, Date birthdayIn)
	{
		super(nameIn, passwordIn, permissionsIn, userIDIn);
		setSsn(ssnIn);
		setBirthday(birthdayIn);
	}

	public void setSsn(String ssn) {			//Limit permissions!
		this.ssn = ssn;
	}

	public String getSsn() {				//Limit permissions!
		return ssn;
	}

	public void setBirthday(Date birthday) {		//Limit permissions!
		this.birthday = birthday;
	}

	public Date getBirthday() {				//Limit permissions!
		return birthday;
	}
	
	public Appointment requestAppointment(Date myTime, String myDoctor)
	{
		//int myNewAppointmentID = medicalHistory.appointment.lastID+1
		//Appointment myNewAppointment = new Appointment(myTime, myNewAppointmentID, name, ssn, myDoctor);
	}

	public String toString()
	{
		return null;			//Fill this out!
	}
}
