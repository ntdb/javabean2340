/* Doctor class for Hospital System
 * Team Java Bean
 */
package emr;


/**
 * This class represents an Admin in the Hospital System that extends from
 * Nurse with added Admin responsibilities and abilities.
 *
 * @author Team Java Bean
 * @version 1.0 4/4/11
 */
public class Admin extends Nurse{
	
	/**
	 * The permission level of all Nurses, used to generate user ID
	 */
	private static final int PERMISSIONS = 1;
	
	/**
	 * Default constructor sets all attributes to null
	 * 
	 */
	public Admin(){
		userID = generateUserID(PERMISSIONS);
		login = new LoginClass(userID);
		password = "password";
	}//end default Admin constructor
	
	/**
	 * Overloaded constructor sets all Doctor attributes
	 * 
	 * @param name The name of the Doctor
	 * @param password The Doctor's password
	 */
	public Admin(String name, String password){
		super(name, password);
		userID = generateUserID(PERMISSIONS);
		login = new LoginClass(userID);
	}//end Admin constructor
	
	/**
	 * Creates a new Nurse in the Hospital system
	 * 
	 * @return The new Nurse's userID
	 */
	public int createNurse(){
		final Nurse newNurse = new Nurse();
		UserController.addUser(newNurse);
		return newNurse.getUserID();
	}//end createNurse
	
	/**
	 * Creates a new Doctor in the Hospital system
	 * 
	 * @return The new Doctor's userID
	 */
	public int createDoctor(){
		final Doctor newDoctor = new Doctor();
		UserController.addUser(newDoctor);
		return newDoctor.getUserID();
	}//end createDoctor
	
	/**
	 * Creates a new Admin in the Hospital system
	 * 
	 * @return The new Admin's userID
	 */
	public int createAdmin(){
		final Admin newAdmin = new Admin();
		UserController.addUser(newAdmin);
		return newAdmin.getUserID();
	}//end createAdmin
	
	/**
	 * Deletes a User from the Hospital system
	 * 
	 * @param userID The user ID of the User to be deleted
	 */
	public void deletePatient(int userID){
		UserController.deleteUser(userID);
	}//end deleteUser
	
	/**
	 * Gets a User using the User's ID
	 * 
	 * @param userID The ID of the User to get
	 * @return The User
	 */
	public User getUser(int userID){
		return UserController.getUser(userID);
	}//end getUser
	
	/**
	 * Returns String Representation of the admin
	 * 
	 * @return Admin Name
	 */
	public String toString(){
		return new String("Admin: " + name);
	}//end toString
	
}//end class Admin
