
/**
 * This class represents a Doctor in the Hospital System that extends from
 * Nurse with added doctor responsibilities and abilities.
 *
 */
public class Doctor extends Nurse{

	private int[] appointmentIDs;
	
	/**
	 * Default constructor sets all attributes to null
	 * 
	 */
	public Doctor(){
		super();
		appointmentIDs = null;
	}//end default Doctor constructor
	
	/**
	 * Overloaded constructor sets all Doctor attributes
	 * 
	 * @param name The name of the Doctor
	 * @param password The Doctor's password
	 * @param permissions The Doctor's permissions
	 * @param userID The Doctor's user ID
	 * @param appointmentIDs The Doctor's Appointment IDs
	 */
	public Doctor(String name, String password, int[] appointmentIDs){
		super(name, password);
		this.appointmentIDs = appointmentIDs;
	}//end Doctor constructor
	
	/**
	 * Adds the Doctor's orders to the given Patient's file
	 * 
	 * @param patient The patient receiving orders
	 */
	public void addDoctorsOrders(Patient patient){
		//patient.getMedicalHistory().setDoctorsOrders(); //bad OO?? 
	}//end addDoctorsOrders
	
	/**
	 * Verifies that the patient-requested appointment is available
	 * 
	 * @return The true or false value whether the Appointment is available
	 */
	public boolean verifyAppointment(){
		//verifies Appointment
		return false;
	}//end verifyAppointment
	
	
	
	
}//end class Doctor
