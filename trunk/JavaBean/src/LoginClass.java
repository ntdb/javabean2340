import java.util.ArrayList;
/**
 * LoginClass. Used to verify that the user logs in correctly
 * @author David
 * @version 1.00
 */
public class LoginClass {
	private int maxattempts;
//	private int usercount; //implement at a later time
	private int userId;
	private boolean validpass;
	private UserController uc;
	private User logger;
	
	/**
	 * LoginClass constructor. 
	 * Initialize counting values to 0, boolean values to false
	 * @param userIDs user id of the user trying to login
	 */
	public LoginClass(int userIDs){
		maxattempts = 0;
		userId = userIDs;
		validpass = false;
		uc.getUserIndex(userIDs);
	}
	
/*	public int getUsercount(){
		return usercount;
	} */
	
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
	
	public void validate(String password){
		//first verify that User is in the user controller object
		if (uc.getUserIndex(userId) == -1)
			return;
		
		logger = uc.getUser(userId);
		//retrieve user information and verify password matches usercontroller's
		do
		{
			if(logger.getPassword() == password)
				validpass = true;
			else
				maxattempts++;
		}while(maxattempts<3 || validpass != false);
		if (maxattempts == 3 && validpass == false)
			System.out.print("Max Attempts reached. Contact an administrator to reset");
	}
	
	
	
}
