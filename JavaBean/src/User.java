
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
	 * @param userName user name that allows the user to login.
	 * @param password Password required for the user to login.
	 */
	public void login(String userName, String password)
	{
		//retrieve information from the UserController class
		
		
	}
}
