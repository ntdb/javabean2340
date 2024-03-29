package emr;
/* Nurse class for Hospital System
 * Team Java Bean
 */

import java.io.IOException;
import java.util.Random;


/**
 * This class represents a User in the Hospital system and is the basic
 * construct for the different users with essential information
 *
 * @author Team Java Bean
 * @version 1.1 3/14/11
 */
public class User {
	
	/**
	 * The multiple of how limit of Users in the system
	 */
	private static final int USERLIMITMULTIPLE = 1000;
	
	/**
	 * The name of the User
	 */
	protected String name;
	
	/**
	 * The User's password
	 */
	protected String password;
	
	/**
	 * The User's ID
	 */
	protected int userID;
	
	/**
	 * The User's LoginClass object
	 */
	protected LoginClass login;
	
	/**
	 * Default constructor sets name and password to null and userID to 0
	 */
	protected User(){
		name = null;
		password = null;
	}
	
	/**
	 * Overloaded constructor creates a User with a name and password
	 * 
	 * @param nameIn The name of the User to be created
	 * @param passwordIn The password of the User to be created
	 */
	protected User(String nameIn, String passwordIn){
		name = nameIn;
		password = passwordIn;
	}
	
	/**
	 * Generates a User ID of the length as the USERLIMITMULTIPLE based on
	 * the input permission level
	 * 
	 * @param permissions The permission level of the User
	 * @return The ID of the User
	 */
	public static int generateUserID(int permissions){
		final Random genID = new Random();
		int id = permissions * USERLIMITMULTIPLE + genID.nextInt(USERLIMITMULTIPLE);
		
		//check to see if User ID already exists and generates one until it is unique
		while(UserController.getUser(id) != null){
			id = permissions * USERLIMITMULTIPLE + genID.nextInt(USERLIMITMULTIPLE);
		}//end while
		return id;
	}
	
	/**
	 * Generates a password of the randomized characters of "passwordxxxx' where 
	 * the x's are the digits of the User's ID
	 * 
	 * @param userID The User's ID
	 * @return The password of the User
	 */
	public static String generatePassword(int userID){
		String passwordID = "password" + userID;
		String password = "";
		Random r = new Random();
		boolean add;
		int[] chose = new int[passwordID.length()];
		for (int i=0; i < passwordID.length(); i++)
		{
			add = true;
			int pick = r.nextInt(passwordID.length());
			for (int j = 0; j == i; j++)
			{
				if (chose[j] == pick)
					add = false;
			}
			if (add = true)
			{
				char letter = passwordID.charAt(pick);
				password +=letter;
				chose[i] = pick;
			}
			else
			{
				i--;
			}
		}
	  return password;
	}//end generatePassword

	/**
	 * Gets the ID of the User
	 * 
	 * @return The User's ID
	 */
	public int getUserID(){
		return userID;
	}

	/**
	 * Will check the xml file for a record of the User's name and corresponding password.
	 * If the password does not match the expected password, a counter for max log
	 * attempts will increment, and the user will have to try to login again. If the
	 * counter reaches three, the user will not be able to login and will require an
	 * administrator to reset the counter.
	 * 
	 * @param password Password required for the user to login.
	 */
	public int loginMe(String password){
		//retrieve information from the UserController class
		return login.validate(password);
	}

	/**
	 * Returns the name of the User
	 * 
	 * @return The name of the User
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the User's name
	 * 
	 * @param name The name of the User
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the User's password
	 * 
	 * @return The User's password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the User's password
	 * 
	 * @param password The user's password
	 * @throws IOException 
	 */
	public void setPassword(String password) throws IOException {
		this.password = password;
		UserController.save();
	}

	/**
	 * Sets the user ID of the User
	 * 
	 * @param userID The User's ID
	 */
	public void setUserID(int userID) {
		this.userID = userID;
		login.setUserID(userID);
	}
	
	/**
	 * Returns a String representation of the User
	 * 
	 * @return A String representation of the User
	 */
	public String toString() {
		return null;
	}
}//end class User
