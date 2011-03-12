
public abstract class User {
	protected String name;
	protected String password;
	protected int permissions;
	protected int userID;
	
	protected User()
	{
		name = null;
		password = null;
		permissions = 0;
		userID = 0;
	}
	
	protected User(String nameIn, String passwordIn, int permissionsIn, int userIDIn)
	{
		name = nameIn;
		password = passwordIn;
		permissions = permissionsIn;
		userID = userIDIn;
	}

	public int getUserID()
	{
		return userID;
	}

	public int getPermissions()
	{
		return permissions;
	}
	
	/**
	 * Will check the xml file for a record of the User's name and corresponding password.
	 * If the password does not match the expected password, a counter for max log attempts will
	 * increment, and the user will have to try to login again. If the counter reaches three, the 
	 * user will not be able to login and will require an administrator to reset the counter.
	 * @param password Password required for the user to login.
	 */
	public void login(String password)
	{
		//retrieve information from the UserController class
		LoginClass login = new LoginClass(userID);
		login.validate(password);
		
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
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Sets the permissions of the User
	 * 
	 * @param permissions The User's permissions
	 */
	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}

	/**
	 * Sets the user ID of the User
	 * 
	 * @param userID The User's ID
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
}
