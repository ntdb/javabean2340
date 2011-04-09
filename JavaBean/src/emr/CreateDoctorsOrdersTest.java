package emr;
import junit.framework.TestCase;
import java.io.IOException;

/**
 * Runs multiple tests to ensure that createDoctorsOrders method in Doctor class works correctly
 * @author Team Java Bean
 * @version 1.00
 */
public class CreateDoctorsOrdersTest extends TestCase{
	
	public void testValid(){
		final Doctor doctor = new Doctor();
		final int patientID = doctor.createPatient();
		doctor.createDoctorsOrders(patientID, "valid discription", "valid lab work", "valid follow up", "valid other");
		assertTrue(doctor.viewDoctorsOrders(patientID).equals(
				"\nPrescription: valid discription\nLab Work: valid lab work\nFollow Up: valid follow up\nOther: valid other\n"));
	}
	
	public void testNoOther(){
		final Doctor doctor = new Doctor();
		final int patientID = doctor.createPatient();
		doctor.createDoctorsOrders(patientID, "valid discription", "valid lab work", "valid follow up", "");
		assertTrue(doctor.viewDoctorsOrders(patientID).equals(
				"\nPrescription: valid discription\nLab Work: valid lab work\nFollow Up: valid follow up\nOther: \n"));
	}
	
	public void testNotFound(){
		final Doctor doctor = new Doctor();
		doctor.createDoctorsOrders(1234, "valid discription", "valid lab work", "valid follow up", "");
		assertTrue(Hospital.getTestMsg().contentEquals("No patient with this patient ID.\n"));
	}
	
	public void testNotPatient(){
		final Admin admin = new Admin();
		final Doctor doctor = new Doctor();
		final int nurseID = admin.createNurse();
		doctor.createDoctorsOrders(nurseID, "valid discription", "valid lab work", "valid follow up", "");
		assertTrue(Hospital.getTestMsg().contentEquals("This ID belongs to a non-patient user.\n"));
	}

	public void testNoPre(){
		final Doctor doctor = new Doctor();
		final int patientID = doctor.createPatient();
		doctor.createDoctorsOrders(patientID, null , "valid lab work", "valid follow up", "");
		assertTrue(Hospital.getTestMsg().contentEquals("Empty prescription.\n"));
	}
	
	public void testNoLab(){
		final Doctor doctor = new Doctor();
		final int patientID = doctor.createPatient();
		doctor.createDoctorsOrders(patientID, "valid discription" , null , "valid follow up", "");
		assertTrue(Hospital.getTestMsg().contentEquals("Empty lab work.\n"));
	}
	
	public void testNoFL(){
		final Doctor doctor = new Doctor();
		final int patientID = doctor.createPatient();
		doctor.createDoctorsOrders(patientID, "valid discription" , "valid lab work" , null , "");
		assertTrue(Hospital.getTestMsg().contentEquals("Empty follow up.\n"));
	}
}
