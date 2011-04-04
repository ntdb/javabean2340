package gui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;

public class PatientInvoiceMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public PatientInvoiceMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton btnLatestInvoice = new JButton("Latest Invoice");
		btnLatestInvoice.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnLatestInvoice.setMaximumSize(new Dimension(1000,25));
		add(btnLatestInvoice);
		
		JButton btnAllInvoices = new JButton("All Invoices");
		btnAllInvoices.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAllInvoices.setMaximumSize(new Dimension(1000,25));
		add(btnAllInvoices);

	}

}
