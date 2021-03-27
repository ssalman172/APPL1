package CurrencyConverter;

//******************************************************************  
// RatePanel.java  
//
//Panel for a program that converts different currencies to  
//U.S. Dollars  
//******************************************************************  

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class RatePanel extends JPanel  {
	private double[] rate; 
	// exchange rates   
	private String[] currencyName;  
	private JLabel result;  
	private JComboBox<String> currencyList;
	private JTextField userInput;
	// ------------------------------------------------------------   
	// Sets up a panel to convert cost from one of 6 currencies   
	// into U.S. Dollars. The panel contains a heading, a text   
	// field for the cost of the item, a combo box for selecting   
	// the currency, and a label to display the result.   
	// ------------------------------------------------------------   
	public RatePanel ()  {  
		this.setLayout(new GridLayout(7, 1));
		JLabel title = new JLabel ("How much is that in dollars?");   
		JLabel userInputTxt = new JLabel ("Jumlah Uang : ");
		JLabel currencyListTxt = new JLabel ("Pilih Mata uang : ");
		JLabel resultTxt = new JLabel ("Hasil : ");
		title.setAlignmentX (Component.CENTER_ALIGNMENT);   
		title.setFont (new Font ("Helvetica", Font.BOLD, 20));  
		// Set up the arrays for the currency conversions   
		currencyName = new String[] {"Select the currency..", "European Euro (EUR)", "Canadian Dollar (CAD)", "Japanese Yen (YEN)", "Australian Dollar (AUD)", "Indian Rupee (INR)", "Mexican Peso (MXN)"};   
		currencyList = new JComboBox<>(currencyName);
		currencyList.addActionListener(new ComboListener());
		rate = new double [] {0.0, 1.2103, 0.7351, 0.0091, 0.6969, 0.0222, 0.0880};  
		
		result = new JLabel (" ------------ ");  
		userInput = new JTextField ();
		add (title);  
		add (userInputTxt);
		add (userInput);
		add (currencyListTxt);
		add (currencyList);
		add (resultTxt);
		add (result);  
	}  
	// ******************************************************   
	// Represents an action listener for the combo box.   
	// ******************************************************   
	private class ComboListener implements ActionListener   {  
		// --------------------------------------------------   
		// Determines which currency has been selected and   
		// the value in that currency then computes and   
		// displays the value in U.S. Dollars.  
		// --------------------------------------------------   
		public void actionPerformed (ActionEvent event)   {  
			int index = currencyList.getSelectedIndex();  
			int userInputTmp = Integer.parseInt(userInput.getText());
			result.setText (userInputTmp + " " + currencyName[index] + " = " + userInputTmp*rate[index] + " U.S. Dollars");   
		}  
	}  
}