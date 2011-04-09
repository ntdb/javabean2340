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
	

	public void blankStringtest() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(userID);
		assertTrue(log.validate("") == 3);
		
	}
	
	public void fakeUser() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(9876);
		assertTrue(log.validate("password") == -2);
	} 
	
	public void wrongPass() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(userID);
		assertTrue(log.validate("3") == 3);
	}
	
	public void rightPass() throws IOException
	{
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		LoginClass log = new LoginClass(userID);
		assertTrue(log.validate("password") == -1);
	}
	
}