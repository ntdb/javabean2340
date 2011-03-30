package emr;
/**
 * Login class for Hospital System
 * Team Java Bean
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * LoginClass. Used to verify that the user logs in correctly.
 * @author David
 * @version 1.00
 */
public class LoginClass {
	/**
	 * Counter used to determine how many login attempts are left
	 */
	private int maxattempts; 
	
	/**
	 * userId of the user trying to login
	 */
	private int userId;
	
	/**
	 * boolean comparison with validpass if true
	 */
	private final boolean passed;
	
	/**
	 * boolean comparison with validpass if false
	 */
	private final boolean failed;
	
	/**
	 * Boolean value used to determine if entered password is correct
	 */
	private boolean validpass;
	
	/**
	 * User class trying to login
	 */
	private User logger;
	
	/**
	 * Max times a user can try to login
	 */
	public final int max;
	
	/**
	 * LoginClass constructor. 
	 * Initialize counting values to 0, boolean values to false
	 * @param userID user id of the user trying to login
	 */
	public LoginClass(int userID){
		maxattempts = 0;
		this.userId = userID;
		validpass = false;
		failed = false;
		passed = true;
		max = 3;
	}
	
	/**
	 * Returns the max attempts
	 * @return Max attempts
	 */
	public int getMaxattempts(){
		return maxattempts;
	}
	
	/**
	 * Resets the max attempts. Method to be used by administrator
	 * @param max = new value for max attempts
	 */
	public void setMaxattempts(int max){
		maxattempts = max;
	}
	
	public void setUserID(int userID) {
		this.userId = userID;
	}
	
	/**
	 * Returns LoginClass as a String. Fulfilling audit requirements.
	 * @return String value of class
	 */
	public String toString(){
		return "LoginClass";
	}
	
	/**
	 * Verifies that the user is in the user controller and that 
	 * the user is using the correct password.
	 * Allows the user to try and validate their id up to three times.
	 */
	public int validate(String pw) {
		//first verify that User is in the user controller object
		if (UserController.getUserIndex(userId) == -1) {
			return -2;
		}
		
		logger = UserController.getUser(userId);
		
		//retrieve user information and verify password matches usercontroller's
/*		do{
			//Have the user input their password
			System.out.print("Enter your password: ");
			//defaults to blank due to try catch code
			String pw = "";
			final BufferedReader in =
				new BufferedReader(new InputStreamReader(System.in));
			try {
				pw = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//			finally {
	//			try{
	//				in.close();
	//			} catch (IOException e) {
	//				e.printStackTrace();
	//			}
	//		}
    */		if(maxattempts == 3)
    			return 3;
   			else if(!pw.isEmpty() && logger.getPassword().equals(pw)) {
				validpass = true;
				maxattempts = 0;
				return -1;
			}
			else{
				validpass = false;
				if(maxattempts < 3)
					maxattempts++;
				return maxattempts;
			}
//		while(maxattempts < 3 && !validpass); //!= passed);
/*		if (maxattempts == 3 && validpass == failed){
			System.out.print("Max Attempts reached. Contact an administrator to reset");
			Hospital.LOGGER.warning("User " + userId + " reached maximum attempts on login.");
			return maxattempts;
		}
		return -2;
*/	}
	
	
	
}
