import junit.framework.TestCase;
import java.io.IOException;

public class HospitalTest extends TestCase {

	private Hospital hospital;

	protected void setUp() {
		hospital = new Hospital();
	}

	public void testUserCRUD() {
		Nurse nurse = Hospital.newNurse();
		int numUsers = nurse.getUserCount();
		nurse.createPatient(4001,4);
		assertTrue(nurse.getUserCount() > numUsers);			//Create

		nurse.getPatient(4001).setName("Bob");
		nurse.getPatient(4001).setPassword("bobspassword");
		nurse.getPatient(4001).setSsn("123456789");
		assertTrue(nurse.getPatient(4001).toString() == "Patient: Bob");	//Read+Update

		nurse.deletePatient(4001);			
		assertTrue(nurse.getUserCount() == numUsers);			//Delete
	}
/*
	public void testSave() throws IOException {
		Patient bob = new Patient();
		hospital.uc.addUser(bob);
		hospital.writeRecords();					//Write (Sufficient?)

		Hospital hospital2 = new Hospital();				
		assertEquals(hospital,hospital2);				//Read
	}
*/
}
