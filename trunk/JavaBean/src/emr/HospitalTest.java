package emr;
import junit.framework.TestCase;
import java.io.IOException;
import java.util.Date;

/**
 * Runs multiple test to ensure that EMR classes are working together
 * @author Team Java Bean
 * @version 1.00
 */
public class HospitalTest extends TestCase {

	
	public void testLogin() throws IOException {
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setPassword("password");
		nurse.getPatient(userID).loginMe("");
	}

	/**
	 * Test to verify that the User Class can be created, read,
	 * updated, and deleted
	 * @throws IOException
	 */
	public void testUserCRUD() throws IOException {
//		UserController.load();
		final Nurse nurse = new Nurse();
		final int numUsers = nurse.getUserCount();
		final int userID = nurse.createPatient();
		assertTrue(nurse.getUserCount() > numUsers);				//Create

		nurse.getPatient(userID).setName("Blob");
		nurse.getPatient(userID).setPassword("bobspassword");
		nurse.getPatient(userID).setSsn("123456789");
		assertTrue(nurse.getPatient(userID).toString().equals("Patient: Blob"));	//Read+Update
		UserController.save();

	//	nurse.deletePatient(userID);			
		assertTrue(nurse.getUserCount() == numUsers);				//Delete
	}

	public void testPatientLookup() {
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setName("Bob");
		assertEquals(nurse.getPatient(userID), nurse.patientLookupByName("Bob"));	//Lookup by name
	}

	public void testAppointmentCRUD() throws IOException {
		final Nurse nurse = new Nurse();
		final int numAppointments = nurse.getAppointmentCount();
		nurse.createAppointment(new Date(), 1337, "Bob", "123456789", "Dr. Waters");
		assertTrue(nurse.getAppointmentCount() > numAppointments);		//Create
		Schedule.save();

		final Date newerDate = new Date();
		nurse.updateAppointment(1337, newerDate, "Dr. Rambo");
		assertTrue(nurse.getAppointment(1337).toString().equals("Appointment ID: 1337\nAppointment Time: "
				       	+ newerDate.toString() + "\nPatient Name: Bob\nDoctor's Name: Dr. Rambo\n"));	//Read+Update

		nurse.deleteAppointment(1337);			
		assertTrue(nurse.getAppointmentCount() == numAppointments);		//Delete
	}

	public void testTreatmentRecordCRUD() {
		final Nurse nurse = new Nurse();
		final int patientID = nurse.createPatient();
		nurse.createTreatment(patientID, 1338, 1339, "Treatment for testing");
		assertTrue(nurse.getTreatmentCount(patientID) > 0);			//Create

		nurse.updateTreatment(patientID, 1339, "Updated treatment for testing");
		assertTrue(nurse.viewTreatment(patientID, 1339).equals("\nPatient ID: " + patientID + 	//Read + Update
				"\nDoctor ID: 1338\nAppointment ID: 1339\nDetails:\nTreatment for testing\nUpdated treatment for testing\n"));
		nurse.deleteTreatment(patientID, 1339);
		assertTrue(nurse.getTreatmentCount(patientID) == 0);			//Delete
	}

	public void testDoctorsOrdersCRUD() {
		final Doctor doctor = new Doctor();
		final int patientID = doctor.createPatient();
		doctor.createDoctorsOrders(patientID, "Insulin", "HBA1C", "Three months", "The patient has a big chin");
		assertTrue(doctor.getDoctorsOrdersCount(patientID) > 0);		//Create

		doctor.updateDoctorsOrders(patientID, "Exercise", "Cholesterol", "None", "Still a big chin");
		assertTrue(doctor.viewDoctorsOrders(patientID).equals(			//Read+Update
					"\nPrescription: Exercise\nLab Work: Cholesterol\nFollow Up: None\nOther: Still a big chin\n"));

		doctor.deleteDoctorsOrders(patientID);
		assertTrue(doctor.getDoctorsOrdersCount(patientID) == 0);		//Delete
	}

	public void testLoadSave() throws IOException {
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		nurse.getPatient(userID).setName("Blob");
		UserController.save();						//Save
		
		nurse.deletePatient(userID);					//Modify, don't save

		UserController.load();						//Load
		assertNotNull(nurse.getPatient(userID));				//Test that user still exists
	}

	public void testInvoiceCreation() {
		final Nurse nurse = new Nurse();
		final int userID = nurse.createPatient();
		Date date = new Date();
		nurse.createAppointment(date, 1337, "Bob", "123456789", "Dr. Waters");
		assertTrue(nurse.generateInvoice(1337).equals("Patient name: Bob\tDate of Visit: " + date + "\tDoctor: Dr. Waters\nAmount due: $XXX.XX"));
	}

	public void testLogging() throws IOException {
		Hospital.main(null);
		Hospital.LOGGER.info("Logging works");
		assertTrue(true);
	}
}
