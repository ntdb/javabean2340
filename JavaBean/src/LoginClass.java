public class LoginClass 
{
	private int maxattempts;
	private int usercount;
	private int[] userIds;
	public User userlogin;
	
	/**
	 * LoginClass constructor. 
	 * Initialize counting values to 0.
	 */
	public LoginClass()
	{
		maxattempts = 0;
		usercount = 0;
	}
	
	public int getUsercount()
	{
		return usercount;
	}
	
	
	
}
