//Nathan Bailey

package emr;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * Tests the WriteToXML function in IOController
 * @author Nathan
 * @version 1.0
 */
public class WriteToXMLTest extends TestCase {
	
	public void testEmptyUserList() {
		deleteXML();
		File fileIn = new File("users.xml");
		List<User> userList = new ArrayList<User>();
		IOController.writeToXML(userList);
		assertTrue(!fileIn.exists());
	}
	
	public void testPopulatedUserList() {
		deleteXML();
		File fileIn = new File("users.xml");
		List<User> userList = new ArrayList<User>();
		userList.add(new Patient());
		userList.add(new Nurse());
		userList.add(new Doctor());
		userList.add(new Admin());
		IOController.writeToXML(userList);
		assertTrue(fileIn.exists());
	}
	
	public void testBadInput() {
		deleteXML();
		File fileIn = new File("users.xml");
		List<String> badList = new ArrayList<String>();
		badList.add("Bad!");
		IOController.writeToXML(badList);
		assertTrue(!fileIn.exists());
	}
	
	private void deleteXML() {
		File fileIn = new File("users.xml");
		fileIn.delete();
	}
	
}
