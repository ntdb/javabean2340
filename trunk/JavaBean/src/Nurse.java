
public class Nurse extends User{

	public Nurse(){
		super();
	}//end default Nurse constructor
	
	public Nurse(String name, String password, int permissions, int userID){
		super(name, password, permissions, userID);
	}//end Nurse constructor
	
	public void createPatient(int UserID, int permissions){
		
	}//end createPatient
	
	public User deletePatient(int UserID){
		
		return null;
	}//end deletePatient
	
	public void editPatient(int UserID){

	}//end editPatient
	
	public void viewPatient(int UserID){
		
	}//end viewPatient
	
	public void viewAppointments(Schedule schedule){
		
	}//end viewAppointments
	
}//end class Nurse
