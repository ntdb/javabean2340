import junit.framework.TestCase;
import java.io.IOException;
import java.util.ArrayList;

public class HospitalTest extends TestCase {


	public void testLogin() {
	}

	public void testUserCRUD() {
		Nurse nurse = new Nurse();
		int numUsers = nurse.getUserCount();
		int userID = nurse.createPatient();
		assertTrue(nurse.getUserCount() > numUsers);				//Create

		nurse.getPatient(userID).setName("Bob");
		nurse.getPatient(userID).setPassword("bobspassword");
		nurse.getPatient(userID).setSsn("123456789");
		assertTrue(nurse.getPatient(userID).toString().equals("Patient: Bob"));	//Read+Update

		nurse.deletePatient(userID);			
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
		Nurse nurse = new Nurse();
		int userID = nurse.createPatient();
		nurse.getPatient(userID).setName("Bob");
		UserController.save();						//Save
		
		nurse.deletePatient(userID);					//Modify, don't save

		UserController.load();						//Load
		assertNotNull(nurse.getPatient(userID));				//Test that user still exists
	}

	public void testInvoiceCreation() {
	}

	public void testLogging() {
	}
}