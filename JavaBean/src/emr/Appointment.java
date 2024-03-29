package emr;
/* Appointment class
 * Team Java Bean
 */

import java.util.Date;

/**
 * This class represents the appointment
 * @version 1.1 3/14/11
 * @author Team Java Bean
 */
public class Appointment {
	
	/**
	 * The date and time (UTC) of the appointment
	 */
	private Date appTime;
	
	/**
	 * The key of the appointment
	 */
	private int appointmentID;
	
	/**
	 * Strings holding the patient's name / social security number, and the doctor's name
	 */
	private String patientName, patientSSN, doctorName;
	
	/**
	 * The reason of the appontment.
	 */
	private String reason;

	/**
	 * Default constructor for an Appointment object
	 */
	public Appointment() {
		this.appTime = null;
		this.appointmentID = -1;
		this.patientName = null;
		this.patientSSN = null;
		this.doctorName = null;
	}

	/**
	 * This is the standard constructor of the appointment class
	 * @param appTime The object to indicate the time of the appointment
	 * @param appointmentID The ID number for this appointment
	 * @param patientName The name of the patient
	 * @param patientSSN The SSN od the patient
	 * @param doctorName The name of the doctor required by patient
	 */
	public Appointment(Date appTime, int appointmentID, String patientName, 
			String patientSSN, String doctorName) {
		this.appTime = appTime;
		this.appointmentID = appointmentID;
		this.patientName = patientName;
		this.patientSSN = patientSSN;
		this.doctorName = doctorName;
	}
	
	/**
	 * This method is used to update appointment with new time or new doctor
	 * @param newTime The new time for the appointment
	 * @param newDoctorName The name of the new doctor
	 */
	public void updateAppointment(Date newTime, String newDoctorName) {
		if(newTime != null) {
			appTime = newTime;
		}
		if(newDoctorName != null) {
			doctorName = newDoctorName;
		}
	}

	/**
	 * This method is used to get the ID number of the appointment
	 * @return The ID number of the appointment
	 */
	public int getAppointmentID(){
		return appointmentID;
	}
	
	/**
	 * This method is used to get the time of the appointment
	 * @return The Date object containing the time of the appointment
	 */
	public Date getAppTime(){
		return appTime;
	}
	
	/**
	 * Returns the Name of the patient involved in the appointment.
	 * @return Name of the Patient.
	 */
	public String getpatientName(){
		return patientName;
	}
	
	/**
	 * Returns the Name of the doctor involved in the appointment
	 * @return Name of the Doctor.
	 */
	public String getdoctorName(){
		return doctorName;
	}

	/**
	 * This method will export the appointment as a string.
	 * It will start a new line and end with a new line.
	 * @return A string contains all the information of the appointment.
	 */
	public String toString() {
		final String fullInfo = "Appointment ID: " + appointmentID +
						  "\nAppointment Time: " + appTime.toString() +
						  "\nPatient Name: " + patientName +
						  "\nDoctor's Name: " + doctorName + "\n";
		return fullInfo;
	}
}
