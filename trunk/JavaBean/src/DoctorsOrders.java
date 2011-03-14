/**
 * This class represents doctors' orders received by the patient
 * @author William
 *
 */
public class DoctorsOrders 
{
	private String prescription;
	private String labWork;
	private String followUp;
	private String other;
	
	/**
	 * The standard constructor of the class, parameters can be set to null.
	 * @param prescription The prescription of the patient
	 * @param labWork The lab work involved in the service
	 * @param followUp The things need to be done after the service
	 * @param other Additional infomation
	 */
	public DoctorsOrders(String prescription, String labWork, String followUp, String other)
	{
		this.prescription = prescription;
		this.labWork = labWork;
		this.followUp = followUp;
		this.other = other;
	}
	
	/**
	 * This method will export the doctors' orders as a string.
	 * It will start a new line and end with a new line.
	 * @return A string contains all the infomation of the doctors' order.
	 */
	public String toString()
	{
		String fullInfo = "\nPrescription: " + prescription +
						  "\nLab Work: " + labWork +
						  "\nFollow Up: " + followUp + 
						  "\nOther: " + other + "\n";
		return fullInfo;
	}
}
