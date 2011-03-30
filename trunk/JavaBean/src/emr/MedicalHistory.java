package emr;
/* MedicalHistory class for Hospital System
 * Team Java Bean
 */

import java.util.ArrayList;

/**
 * This class represents the medical history of the patient
 *
 * @author Team Java Bean
 * @version 1.1 3/14/11
 */
public class MedicalHistory {
	
	
	/**
	 * A List of Appointment IDs
	 */
	private ArrayList<Integer> appointmentIDs;

	/**
	 * A List of Treatments
	 */
	private ArrayList<Treatment> treatments;
	
	/**
	 * A list of DoctorOrders
	 */
	private ArrayList<DoctorsOrders> doctorsOrders;
	
	/**
	 * This is the default constructor of the MedicalHistory class
	 */
	public MedicalHistory() {
		appointmentIDs = new ArrayList<Integer>();
		treatments = new ArrayList<Treatment>();
		doctorsOrders = new ArrayList<DoctorsOrders>();
	}
	
	/**
	 * Returns weight information
	 * 
	 * @return Weight information
	 */
	public String getWeightChart() {
		return null;
	}// need implementation
	
	/**
	 * This method will get the appointmentID of the appointment and add 
	 * the ID into the records
	 * @param newAppointment The appointment needed to be added into the Medical History
	 */
	public void addAppointment(Appointment newAppointment) {
		appointmentIDs.add( newAppointment.getAppointmentID() );
	}
	
	/**
	 * This method will add the new treatment into the medical history
	 * @param newTreatment The treatment needed to be added into the medical history
	 */
	public void addTreatment( Treatment newTreatment ) {
		treatments.add(newTreatment);
	}
	
	/**
	 * This is method is used to find the treatment
	 * @param appointmentID The ID number of the appointment related to the treatment
	 * @return If found, return index, not found, return -1
	 */
	private int getTreatmentIndex(int appointmentID) {
		for(int i = 0;i < treatments.size();i++) {
			Treatment theTreatment = treatments.get(i);
			if(theTreatment.getAppointmentID() == appointmentID){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * This method is used to read the treatment as a string
	 * @param appointmentID The ID number of the appointment relating to the treatment
	 * @return The String containing all the information of the treatment
	 */
	public String viewTreatment(int appointmentID) {
		final int index = getTreatmentIndex(appointmentID);
		return (treatments.get(index)).toString();
	}
	
	/**
	 * This method is used to update the details in the treatment
	 * @param appointmentID The ID number of the appointment to find the treatment
	 * @param newDetails The details needed to add to the treatment
	 */
	public void updateTreatment(int appointmentID, String newDetails) {
		final int index = getTreatmentIndex(appointmentID);
		(treatments.get(index)).updateDetails(newDetails);
	}
	
	/**
	 * This method is used to delete the treatment
	 * @param appointmentID The ID number of the appointment to find the treatment
	 */
	public void deleteTreatment(int appointmentID) {
		final int index = getTreatmentIndex(appointmentID);
		treatments.remove(index);
	}

	/**
	 * Returns the count of the Treatments
	 * 
	 * @return The Treatment count
	 */
	public int getTreatmentCount() {
		return treatments.size();
	}
	
	/**
	 * This method will add the new Doctors' Orders into the medical 
	 * history of the patient
	 * @param newDoctorsOrders The Doctors' Orders needed to be added 
	 *        into the medical history
	 */
	public void addDoctorsOrders( DoctorsOrders newDoctorsOrders) {
		doctorsOrders.add(newDoctorsOrders);
	}
	
	/**
	 * Returns the doctor's orders
	 * 
	 * @return The doctor's orders
	 */
	public String viewDoctorsOrders() {
		final int latestOne = doctorsOrders.size() - 1;
		return (doctorsOrders.get(latestOne)).toString();
	}
	
	/**
	 * Updates the doctor's orders
	 * 
	 * @param prescription The prescription to be updated
	 * @param labWork The lab work to be updated
	 * @param followUp The follow up to be updated
	 * @param other Additional information or orders to be updated
	 */
	public void updateDoctorsOrders(String prescription, String labWork,
			String followUp, String other) {
		final int latestOne = doctorsOrders.size() - 1;
		(doctorsOrders.get(latestOne)).updateContent(prescription, labWork,
				followUp, other);
	}
	
	/**
	 * Deletes the DoctorsOrders
	 */
	public void deleteDoctorsOrders() {
		final int latestOne = doctorsOrders.size() - 1;
		doctorsOrders.remove(latestOne);
	}

	/**
	 * Returns the count of doctor's orders
	 * 
	 * @return Doctor's orders count
	 */
	public int getDoctorsOrdersCount() {
		return doctorsOrders.size();
	}
	
	/**
	 * This method will export the medical history as a string.
	 * It will start a new line and end with a new line.
	 *
	 * @return A string contains all the information of the medical history
	 */
	public String toString() {
		String appointmentString = "";
		for(int i = 0; i < appointmentIDs.size();i++) {
			Appointment newApp = Schedule.getAppointment(appointmentIDs.get(i));
			appointmentString += newApp.toString();
		}
		
		String treatmentString = "";
		for(int i = 0; i < treatments.size() ; i++ ) {
			treatmentString += treatments.get(i).toString();
		}
		
		String doctorsOrdersString = "";
		for(int i = 0; i < doctorsOrders.size(); i++) {
			doctorsOrdersString += doctorsOrders.get(i).toString();
		}
		
		final String fullInfo = "\nMedical History\n\n\nAppointments:\n" + 
						  appointmentString +
						  "\nTreatments:\n" + treatmentString +
						  "\nDoctor's Orders:\n" + doctorsOrdersString;
		return fullInfo;
	}

}
