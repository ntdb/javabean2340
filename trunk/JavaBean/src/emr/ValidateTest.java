/**
 * David Montaque
 * ValidateTest
 */

package emr;

import java.io.IOException;

import junit.framework.TestCase;

/**
 * This class runs tests on the validate method in LoginClass.java
 *
 * @author David Montaque
 * @version 1.00
 */
public class ValidateTest extends TestCase {
	
	/**
	 * Test if the password is blank. Test should fail and return
	 * max attemtps(3)
	 * @throws IOException
	 */
	public void blankStringtest() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(userID);
		assertTrue(log.validate("") == 3);
		
	}
	
	/**
	 * Test if the user is in the user database to even 
	 * have a password. Test should fail and return -2
	 * @throws IOException
	 */
	public void fakeUser() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(9876);
		assertTrue(log.validate("password") == -2);
	} 
	
	/**
	 * Test validate with an incorrect password. 
	 * Should fail and return 3
	 * @throws IOException
	 */
	public void wrongPass() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(userID);
		assertTrue(log.validate("3") == 3);
	}
	
	/**
	 * Test validate with the correct password.
	 * Test should pass and return -1
	 * @throws IOException
	 */
	public void rightPass() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(userID);
		assertTrue(log.validate("password") == -1);
	}
	
}