import junit.framework.TestCase;
import java.io.IOException;

public class HospitalTest extends TestCase {

	private Hospital hospital;

	protected void setUp() throws IOException {
		hospital = new Hospital();
		hospital.readRecords();
	}

	public void testUserCRUD() {
		Nurse nurse = hospital.newNurse();
		int numUsers = nurse.getUserCount();
		nurse.createPatient(4001,4);
		assertTrue(nurse.getUserCount() > numUsers);				//Create

		nurse.getPatient(4001).setName("Bob");
		nurse.getPatient(4001).setPassword("bobspassword");
		nurse.getPatient(4001).setSsn("123456789");
		assertTrue(nurse.getPatient(4001).toString().equals("Patient: Bob"));	//Read+Update

		nurse.deletePatient(4001);			
		assertTrue(nurse.getUserCount() == numUsers);				//Delete
	}

	public void testPatientLookup() {
	}

	public void testAppointmentCRUD() {
	}

	public void testTreatmentRecordCRUD() {
	}

	public void testDoctorsOrdersCRUD() {
	}

	public void testLoadSave() throws IOException {
		Hospital hospital2 = new Hospital();				//Make equal
		hospital2 = hospital;

		Nurse nurse = hospital.newNurse();
		nurse.createPatient(4002,4);
		hospital.writeRecords();						//Save (Sufficient?)

		hospital2.readRecords();		
		assertEquals(hospital,hospital2);					//Load
	}

	public void testInvoiceCreation() {
	}

	public void testLogging() {
	}
}
