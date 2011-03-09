public class DoctorsOrders 
{
	private String prescription;
	private String labWork;
	private String followUp;
	private String other;
	
	public DoctorsOrders(String prescription, String labWork, String followUp, String other)
	{
		this.prescription = prescription;
		this.labWork = labWork;
		this.followUp = followUp;
		this.other = other;
	}
	
	public String toString()
	{
		String fullInfo = "Prescription: " + prescription +"\nLab Work: " + 
							labWork +"\nFollow Up: " + followUp + "\nOther: " + other + "\n";
		return fullInfo;
	}
}
