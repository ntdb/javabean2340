package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;

public class PatientMedicalHistoryMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientMedicalHistoryMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnTreatmentsRecord = new JButton("Treatments Record");
		btnTreatmentsRecord.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnTreatmentsRecord.setMaximumSize(new Dimension(1000,25));
		add(btnTreatmentsRecord);
		
		JButton btnDoctorsOrders = new JButton("Doctors Orders");
		btnDoctorsOrders.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDoctorsOrders.setMaximumSize(new Dimension(1000,25));
		add(btnDoctorsOrders);
		
		JButton btnWeightChart = new JButton("Weight Chart");
		btnWeightChart.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnWeightChart.setMaximumSize(new Dimension(1000,25));
		add(btnWeightChart);

	}

}
