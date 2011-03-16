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
	 * @param appointmentIDs The Doctor's Appointment IDs
	 */
	public Doctor(String name, String password, int[] appointmentIDs){
		super(name, password);
		this.appointmentIDs = appointmentIDs;
		//deep copy apointmentIDs
		userID = generateUserID(PERMISSIONS);
	}//end Doctor constructor
	
	/**
	 * Adds the Doctor's orders to the given Patient's file
	 * 
	 * @param patient The patient receiving orders
	 * @param prescription The prescription of the doctors orders to be added
	 * @param labWork The lab work involved in the service
	 * @param followUp The procedures needed to be done after the service
	 * @param other Additional information
	 */
	public void addDoctorsOrders(Patient patient, String prescription, String labWork,
			String followUp, String other){
		final DoctorsOrders newDoctorsOrders = new DoctorsOrders(prescription, labWork,
				followUp, other);
		patient.getMedicalHistory().addDoctorsOrders(newDoctorsOrders); //bad OO?? 
	}//end addDoctorsOrders
	
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
