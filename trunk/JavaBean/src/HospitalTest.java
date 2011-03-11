import junit.framework.TestCase;
import java.io.IOException;

public class HospitalTest extends TestCase {

	private Hospital hospital;

	protected void setUp() {
		hospital = new Hospital();
	}

	public void testUserCRUD() {
		Patient bob = new Patient();
		hospital.uc.addUser(bob);
		assertTrue(hospital.uc.getNumberOfUsers() == 1);		//Create

		bob.setName("Bob");
		bob.setPassword("bobspassword");
		bob.setSsn("123456789");
		assertTrue(bob.toString() == "Patient: Bob");			//Read+Update

		hospital.uc.deleteUser(bob.getUserID());			
		assertTrue(hospital.uc.getNumberOfUsers() == 0);		//Delete
	}

	public void testSave() throws IOException {
		Patient bob = new Patient();
		hospital.uc.addUser(bob);
		hospital.writeRecords();					//Write (Sufficient?)

		Hospital hospital2 = new Hospital();				
		assertEquals(hospital,hospital2);				//Read
	}
}
