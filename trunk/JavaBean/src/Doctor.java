
public class Doctor extends Nurse{

	private int[] appointmentIDs;
	
	public Doctor(){
		super();
		appointmentIDs = null;
	}//end default Doctor constructor
	
	public Doctor(String name, String password, int permissions, int userID,
			int[] appointmentIDs){
		super(name, password, permissions, userID);
		this.appointmentIDs = appointmentIDs;
	}//end Doctor constructor
	
	public void addDoctorsOrders(Patient patient){
		
	}//end addDoctorsOrders
	
	public boolean verifyAppointment(){
		
		return false;
	}//end verifyAppointment
	
	
	
	
}//end class Doctor
