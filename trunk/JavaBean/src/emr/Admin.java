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
	 * Returns String Representation of the admin
	 * 
	 * @return Admin Name
	 */
	public String toString(){
		return new String("Admin: " + name);
	}//end toString
	
}//end class Admin
