import junit.framework.TestCase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

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
		Nurse nurse = new Nurse();
		int userID = nurse.createPatient();
		nurse.getPatient(userID).setName("Bob");
		assertEquals(nurse.getPatient(userID),nurse.patientLookupByName("Bob"));	//Lookup by name
	}

	public void testAppointmentCRUD() throws IOException {
		Nurse nurse = new Nurse();
		int numAppointments = nurse.getAppointmentCount();
		nurse.createAppointment(new Date(), 1337, "Bob", "123456789", "Dr. Waters");
		assertTrue(nurse.getAppointmentCount() > numAppointments);		//Create
		Schedule.save();

		Date newerDate = new Date();
		nurse.updateAppointment(1337, newerDate, "Dr. Rambo");
		assertTrue(nurse.getAppointment(1337).toString().equals("Appointment ID: 1337\nAppointment Time: "
				       	+ newerDate.toString() + "\nPatient Name: Bob\nDoctor's Name: Dr. Rambo\n"));	//Read+Update

		nurse.deleteAppointment(1337);			
		assertTrue(nurse.getAppointmentCount() == numAppointments);		//Delete
	}

	public void testTreatmentRecordCRUD() {
		Nurse nurse = new Nurse();
		int patientID = nurse.createPatient();
		nurse.createTreatment(patientID, 1338, 1339, "Treatment for testing");
		assertTrue(nurse.getTreatmentCount(patientID) > 0);			//Create

		nurse.updateTreatment(patientID, 1339, "Updated treatment for testing");
		assertTrue(nurse.viewTreatment(patientID, 1339).equals("\nPatient ID: " + patientID + 	//Read + Update
				"\nDoctor ID: 1338\nAppointment ID: 1339\nDetails:\nTreatment for testing\nUpdated treatment for testing\n"));
		nurse.deleteTreatment(patientID, 1339);
		assertTrue(nurse.getTreatmentCount(patientID) == 0);			//Delete
	}

	public void testDoctorsOrdersCRUD() {
		Doctor doctor = new Doctor();
		int patientID = doctor.createPatient();
		doctor.createDoctorsOrders(patientID, "Insulin", "HBA1C", "Three months", "The patient has a big chin");
		assertTrue(doctor.getDoctorsOrdersCount(patientID) > 0);		//Create

		doctor.updateDoctorsOrders(patientID, "Exercise", "Cholesterol", "None", "Still a big chin");
		assertTrue(doctor.viewDoctorsOrders(patientID).equals(			//Read+Update
					"\nPrescription: Exercise\nLab Work: Cholesterol\nFollow Up: None\nOther: Still a big chin\n"));

		doctor.deleteDoctorsOrders(patientID);
		assertTrue(doctor.getDoctorsOrdersCount(patientID) == 0);		//Delete
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
		Nurse nurse = new Nurse();
		int userID = nurse.createPatient();
		Date date = new Date();
		nurse.createAppointment(date, 1337, "Bob", "123456789", "Dr. Waters");
		assertTrue(nurse.generateInvoice(1337).equals("Patient name: Bob\tDate of Visit: " + date + "\tDoctor: Dr. Waters\nAmount due: $XXX.XX"));
	}

	public void testLogging() {

	}
}
