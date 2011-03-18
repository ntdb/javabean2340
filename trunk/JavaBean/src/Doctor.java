/* Doctor class for Hospital System
 * Team Java Bean
 */

/**
 * This class represents a Doctor in the Hospital System that extends from
 * Nurse with added doctor responsibilities and abilities.
 *
 * @author Team Java Bean
 * @version 1.1 3/14/11
 */
public class Doctor extends Nurse{
	
	/**
	 * The permission level of all Nurses, used to generate user ID
	 */
	private static final int PERMISSIONS = 2;

	/**
	 * An array of IDs for appointments that the doctor has
	 */
	private int[] appointmentIDs;
	
	/**
	 * Default constructor sets all attributes to null
	 * 
	 */
	public Doctor(){
		appointmentIDs = null;
	}//end default Doctor constructor
	
	/**
	 * Overloaded constructor sets all Doctor attributes
	 * 
	 * @param name The name of the Doctor
	 * @param password The Doctor's password
	 */
	public Doctor(String name, String password){
		super(name, password);
		appointmentIDs = null; //removed appointmentID parameter
		userID = generateUserID(PERMISSIONS);
	}//end Doctor constructor
	
//	/**
//	 * Adds the Doctor's orders to the given Patient's file
//	 * 
//	 * @param patient The patient receiving orders
//	 * @param prescription The prescription of the doctors orders to be added
//	 * @param labWork The lab work involved in the service
//	 * @param followUp The procedures needed to be done after the service
//	 * @param other Additional information
//	 */
//	public void addDoctorsOrders(Patient patient, String prescription, String labWork,
//			String followUp, String other){
//		final DoctorsOrders newDoctorsOrders = new DoctorsOrders(prescription, labWork,
//				followUp, other);
//		patient.getMedicalHistory().addDoctorsOrders(newDoctorsOrders); //bad OO?? 
//	}//end addDoctorsOrders
	/**
	 * Creates doctor's orders for a given Patient
	 * 
	 * @param patientID The ID of the Patient receiving orders
	 * @param prescription The prescription of the Patient
	 * @param labWork The lab work of the Patient
	 * @param followUp Follow up for the Patient
	 * @param other Additional information or orders for the Patient
	 */
	public void createDoctorsOrders(int patientID, String prescription, String labWork,
			String followUp, String other) {
		final DoctorsOrders newDoctorsOrders = new DoctorsOrders(prescription, labWork, 
				followUp, other);
		getPatient(patientID).getMedicalHistory().addDoctorsOrders(newDoctorsOrders);
	}
	
	/**
	 * Returns the current doctors' orders of the given patient
	 * 
	 * @param patientID The ID of the Patient
	 * @return The Patient's doctor's orders
	 */
	public String viewDoctorsOrders(int patientID) {
		return getPatient(patientID).getMedicalHistory().viewDoctorsOrders();
	}
	
	/**
	 * Updates the given Patient's doctors' orders
	 * 
	 * @param patientID The ID of the Patient
	 * @param prescription The prescription to be updated
	 * @param labWork The lab work to be updated
	 * @param followUp The folowup to be updated
	 * @param other Other information to be updated
	 */
	public void updateDoctorsOrders(int patientID, String prescription, String labWork,
			String followUp, String other) {
		getPatient(patientID).getMedicalHistory().updateDoctorsOrders(prescription,
				labWork, followUp, other);
	}
	
	/**
	 * Deletes the current doctor's orders of a given Patient
	 * 
	 * @param patientID The ID of the Patient
	 */
	public void deleteDoctorsOrders(int patientID) {
		getPatient(patientID).getMedicalHistory().deleteDoctorsOrders();
	}

	/**
	 * Returns the count of the given Patient's doctor's orders
	 * 
	 * @param patientID The ID of the Patient
	 * @return A count of the Patien'ts doctor's orders
	 */
	public int getDoctorsOrdersCount(int patientID) {
		return getPatient(patientID).getMedicalHistory().getDoctorsOrdersCount();
	}

	/**
	 * Verifies that the patient-requested appointment is available
	 * 
	 * @return The true or false value whether the Appointment is available
	 */
	public boolean canMakeAppointment(){
		//verifies Appointment
		return false;
	}//end verifyAppointment
	
}//end class Doctor
