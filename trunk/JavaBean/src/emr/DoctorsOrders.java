package emr;
/**
 * This class represents doctors' orders received by the patient
 * @version 1.1 3/14/11
 * @author Team Java Bean
 */
public class DoctorsOrders {
	
	/**
	 * String detailing the prescription to be taken
	 */
	private String prescription;
	
	/**
	 * String detailing the lab work to be done
	 */
	private String labWork;
	
	/**
	 * String detailing the desired followup appointments
	 */
	private String followUp;
	
	/**
	 * String detailing other orders from the doctor
	 */
	private String other;
	
	/**
	 * The standard constructor of the class, parameters can be set to null.
	 * @param prescription The prescription of the patient
	 * @param labWork The lab work involved in the service
	 * @param followUp The things need to be done after the service
	 * @param other Additional information
	 */
	public DoctorsOrders(String prescription, String labWork, String followUp, 
			String other) {
		this.prescription = prescription;
		this.labWork = labWork;
		this.followUp = followUp;
		this.other = other;
	}
	
	/**
	 * Updates the content of the DoctorsOrders object
	 * @param prescription The new prescription detail
	 * @param labWork The new lab work detail
	 * @param followUp The new followup detail
	 * @param other The new other detail
	 */
	public void updateContent(String prescription, String labWork, 
			String followUp, String other) {
		if(prescription != null) {
			this.prescription = prescription;
		}
		if(labWork != null) {
			this.labWork = labWork;
		}
		if(followUp != null) {
			this.followUp = followUp;
		}
		if(other != null) {
			this.other = other;
		}
	}
	
	/**
	 * This method will export the doctors' orders as a string.
	 * It will start a new line and end with a new line.
	 * @return A string contains all the information of the doctors' order.
	 */
	public String toString() {
		final String fullInfo = "\nPrescription: " + prescription +
						  "\nLab Work: " + labWork +
						  "\nFollow Up: " + followUp + 
						  "\nOther: " + other + "\n";
		return fullInfo;
	}
}
