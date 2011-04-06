package gui;

import java.util.Date;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;


public class PatientWeightChartPanel extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public PatientWeightChartPanel() {
		
		TimeSeries series = new TimeSeries("", Day.class);
		series.add(new Day(new Date("2011/03/04")), 150);
		series.add(new Day(new Date("2011/03/05")), 145);
		series.add(new Day(new Date("2011/03/06")), 160);
		
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(series);
		
		JFreeChart chart = ChartFactory.createTimeSeriesChart
		("Patient weight chart",		//Could be modified to show name
		 "Date",
		 "Weight",
		 dataset,
		 true,
		 true,
		 false
		);
		
		add(new ChartPanel(chart));

	}

}
