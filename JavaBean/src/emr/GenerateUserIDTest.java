// Jonathan Smith
// Team JavaBeam
// 4/8/11
//
// M7
// emr.User.generateUserID() JUnit test cases

package emr;

import junit.framework.TestCase;

/**
 * This class runs tests on the GenerateUserID method in User
 *
 * @author Jonathan Smith
 * @version 1.0 4/8/11
 */
public class GenerateUserIDTest extends TestCase {

	
	/**
	 * Tests to see if the method generates a UserID in the correct format
	 */
	public void testGenerateUserID(){
		User u = new User();
		int id = User.generateUserID(0);
		assertTrue(id < 1000 && id >= 0);
		
		id = User.generateUserID(1);
		assertTrue(id < 2000 && id >= 1000);
		
		id = User.generateUserID(2);
		assertTrue(id < 3000 && id >= 2000);
		
		id = User.generateUserID(3);
		assertTrue(id < 4000 && id >= 3000);
		
		id = User.generateUserID(4);
		assertTrue(id < 5000 && id >= 4000);
		
		id = User.generateUserID(5);
		assertTrue(id < 6000 && id >= 5000);
		
		id = User.generateUserID(6);
		assertTrue(id < 7000 && id >= 6000);
		
		id = User.generateUserID(7);
		assertTrue(id < 8000 && id >= 7000);
		
		id = User.generateUserID(8);
		assertTrue(id < 9000 && id >= 8000);
		
		id = User.generateUserID(9);
		assertTrue(id < 10000 && id >= 9000);
	}
	
	/**
	 * Tests to see if the method generates a valid Patient ID (4xxx)
	 */
	public void testGenerateUserIDPatient(){
		Patient p = new Patient();
		int id = p.getUserID();
		assertTrue(id < 5000 && id >= 4000);
	}
	
	/**
	 * Tests to see if the method generates a valid Nurse ID (3xxx)
	 */
	public void testGenerateUserIDNurse(){
		Nurse n = new Nurse();
		int id = n.getUserID();
		assertTrue(id < 4000 && id >= 3000);
	}
	
	/**
	 * Tests to see if the method generates a valid Doctor ID (2xxx)
	 */
	public void testGenerateUserIDDoctor(){
		Doctor d = new Doctor();
		int id = d.getUserID();
		assertTrue(id < 3000 && id >= 2000);
	}
	
	/**
	 * Tests to see if the method generates a valid Admin ID (1xxx)
	 */
	public void testGenerateUserIDAdmin(){
		Admin a = new Admin();
		int id = a.getUserID();
		assertTrue(id < 2000 && id >= 1000);
	}
	
	/**
	 * Tests to see if the method generates a unique Patient ID
	 */
	public void testGenerateUserIDUniquePatient(){
		//generates Patients with IDs that span the range of valid IDs except for one
		for(int i = 1; i < 1000; i++){
			Patient p = new Patient();
			p.setUserID(4000 + i);
			UserController.addUser(p);
		}//end for loop
		Patient patient = new Patient();
		//tests to see if the method picked the only valid Patient ID left
		assertEquals(patient.getUserID(), 4000);
	}
	
	/**
	 * Tests to see if the method generates a unique Nurse ID
	 */
	public void testGenerateUserIDUniqueNurse(){
		//generates Nurses with IDs that span the range of valid IDs except for one
		for(int i = 0; i < 999; i++){
			Nurse n = new Nurse();
			n.setUserID(3000 + i);
			UserController.addUser(n);
		}//end for loop
		Nurse nurse = new Nurse();
		//tests to see if the method picked the only valid Nurse ID left
		assertEquals(nurse.getUserID(), 3999);
	}
	
	/**
	 * Tests to see if the method generates a unique Doctor ID
	 */
	public void testGenerateUserIDUniqueDoctor(){
		//generates Doctors with IDs that span the range of valid IDs except for one
		for(int i = 0; i < 500; i++){
			Doctor d = new Doctor();
			d.setUserID(2000 + i);
			UserController.addUser(d);
		}//end for loop
		for(int i = 501; i < 1000; i++){
			Doctor d = new Doctor();
			d.setUserID(2000 + i);
			UserController.addUser(d);
		}//end for loop
		Doctor doctor = new Doctor();
		//tests to see if the method picked the only valid Doctor ID left
		assertEquals(doctor.getUserID(), 2500);
	}
	
	/**
	 * Tests to see if the method generates a unique Admin ID
	 */
	public void testGenerateUserIDUniqueAdmin(){
		//generates Admins with IDs that span the range of valid IDs except for one
		for(int i = 0; i < 741; i++){
			Admin a = new Admin();
			a.setUserID(1000 + i);
			UserController.addUser(a);
		}//end for loop
		for(int i = 742; i < 1000; i++){
			Admin a = new Admin();
			a.setUserID(1000 + i);
			UserController.addUser(a);
		}//end for loop
		Admin admin = new Admin();
		//tests to see if the method picked the only valid Patient ID left
		assertEquals(admin.getUserID(), 1741);
	}
}