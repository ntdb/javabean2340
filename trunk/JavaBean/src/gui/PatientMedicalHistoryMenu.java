package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PatientMedicalHistoryMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientMedicalHistoryMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnTreatmentsRecord = new JButton("Treatments Record");
		btnTreatmentsRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Portal.setContent(new PatientTreatmentRecordsPanel());
			}
		});
		btnTreatmentsRecord.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnTreatmentsRecord.setMaximumSize(new Dimension(1000,25));
		add(btnTreatmentsRecord);
		
		JButton btnDoctorsOrders = new JButton("Doctors Orders");
		btnDoctorsOrders.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Portal.setContent(new PatientDoctorsOrdersPanel());
			}
		});
		btnDoctorsOrders.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDoctorsOrders.setMaximumSize(new Dimension(1000,25));
		add(btnDoctorsOrders);
		
		JButton btnWeightChart = new JButton("Weight Chart");
		btnWeightChart.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Portal.setContent(new PatientWeightChartPanel());
			}
		});
		btnWeightChart.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnWeightChart.setMaximumSize(new Dimension(1000,25));
		add(btnWeightChart);

	}

}
