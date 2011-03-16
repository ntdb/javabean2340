//imported files
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * LoginClass. Used to verify that the user logs in correctly.
 * @author David
 * @version 1.00
 */
public class LoginClass {
	private int maxattempts; 
	
	private final int userId;
	
	private boolean validpass;
	
	private UserController uc;
	
	private User logger;
	
	public final int max = 3;
	
	/**
	 * LoginClass constructor. 
	 * Initialize counting values to 0, boolean values to false
	 * @param userID user id of the user trying to login
	 */
	public LoginClass(int userID){
		maxattempts = 0;
		this.userId = userID;
		validpass = false;
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
	public void validate(){
		//first verify that User is in the user controller object
		if (UserController.getUserIndex(userId) == -1){
			return;
		}
		
		//retrieve the user data stored
		logger = UserController.getUser(userId);
		final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//retrieve user information and verify password matches usercontroller's
		do{
			//Have the user input their password
			System.out.print("Enter your password :");
			//defaults to blank due to try catch code
			String pw = "";
			try {
				pw = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(logger.getPassword().equals(pw)){
				validpass = true;
			}
			else{
				System.out.println("Incorrect Password.");
				maxattempts++;
			}
		}while(maxattempts < max || validpass != true);
		if (maxattempts == max && validpass == false){
			System.out.print("Max Attempts reached. Contact an administrator to reset");
		}
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
