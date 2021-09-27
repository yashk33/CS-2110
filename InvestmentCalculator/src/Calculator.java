import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.SpringLayout;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * This Calculator class represents the JFrame on containing the Roth IRA
 * calculator.
 * 
 * @author Your Friendly CS Professors
 *
 */
public class Calculator extends JFrame {

	/**
	 * Instance variables for State of Calculator Don't change the variable names
	 * they are used by test case
	 */
	protected int monthlySavings;
	protected int numYears;
	protected int currentAge;
	protected double rateOfReturn;
	protected double investmentValue;
	protected int futureAge;

	/**
	 * This represents the elements that are displayed on screen. Don't change the
	 * name of these variables they ar used by the test cases.
	 */
	protected JLabel ageLabel;
	protected JSpinner ageSpinner;
	protected JLabel monthSaveLabel;
	protected JSlider monthlySaveSlider;
	protected JLabel monthlySaveDisplayAmount;
	protected JLabel numYearsDisplay;
	protected JSlider numYearsSlider;
	protected JLabel numberOfYearsLabel;
	protected JLabel futureAgeLabel;
	protected JLabel rateOfReturnDisplay;
	protected JLabel investmentDisplayValue;
	protected JLabel numYearsSaveLabel;
	
	public int getNumYears() {
		return numYears;
	}

	public void setNumYears(int numYears) {
		this.numYears = numYears;
	}

	public int getCurrentAge() {
		return currentAge;
	}

	public void setCurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}

	public double getRateOfReturn() {
		return rateOfReturn;
	}

	public void setRateOfReturn(double rateOfReturn) {
		this.rateOfReturn = rateOfReturn;
	}

	public double getInvestmentValue() {
		return investmentValue;
	}

	public void setInvestmentValue(double investmentValue) {
		this.investmentValue = investmentValue;
	}

	public int getFutureAge() {
		return futureAge;
	}

	public void setFutureAge(int futureAge) {
		this.futureAge = futureAge;
	}

	public void setMonthlySavings(int monthlySavings) {
		this.monthlySavings = monthlySavings;
	}
	
	public double calculateInvestmentValue() {
		double investment = monthlySavings*((Math.pow(1+rateOfReturn/12,12*numYears)-1)/(rateOfReturn/numYears))*(1+rateOfReturn/numYears);
		return Math.round(investment * 100.0) / 100.0;
	}



	/**
	 * A getter for the monthlySaving instance variable
	 * 
	 * @return the monthSavings
	 */
	public int getMonthlySavings() {
		return monthlySavings;
	}
	

	/**
	 * (
	 *
	 * Listener for age change events.
	 */

	protected class AgeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int value = (int) ageSpinner.getValue(); //source.getValue();
			setCurrentAge(value);
			System.out.println(currentAge);			
			// TODO: Implement this class.
			investmentDisplayValue.setText("Investment: $" + calculateInvestmentValue());
			futureAgeLabel.setText("Future Age: " + (currentAge + numYears) );
		}
	}

	/**
	 * 
	 * Listener for month change events.
	 *
	 */
	protected class MonthSavingListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			// JSlider source = (JSlider) e.getSource();
			int value = monthlySaveSlider.getValue(); //source.getValue();
			setMonthlySavings(value);
			System.out.println(monthlySavings);
			monthlySaveDisplayAmount.setText("$" + monthlySavings);
			investmentDisplayValue.setText("Investment: $" + calculateInvestmentValue());
			futureAgeLabel.setText("Future Age: " + (currentAge + numYears) );
			// TODO: Update appropriate values and labels
		}
	}

	/**
	 * Inner classes that implement the handler form listeners These classes
	 * implement the change listeners.
	 */
	protected class NumberYearsListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int value = numYearsSlider.getValue();
			setNumYears(value);
			System.out.println(value);
			numberOfYearsLabel.setText(Integer.toString(numYears)+ " years");
			investmentDisplayValue.setText("Investment: $" + calculateInvestmentValue());
			futureAgeLabel.setText("Future Age: " + (currentAge + numYears) );

		}
	}

	/**
	 * Class represents the frame. That we will create
	 * 
	 * @param monthlySavings
	 * @param numYears
	 * @param currentAge
	 * @param rateOfReturn
	 */
	public Calculator(int monthlySavings, int numYears, int currentAge, double rateOfReturn) {
		super();
		/*
		 * Set up the default values
		 */
		/* this.monthlySavings = 77;
		this.numYears = 1;
		this.currentAge = 0;
		this.rateOfReturn = 0.07;
		*/ 
		
		this.monthlySavings = monthlySavings;
		this.numYears = numYears;
		this.currentAge = currentAge;
		this.rateOfReturn = rateOfReturn;
		
		/*
		 * Setup close window behavior
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 363);
		getContentPane().setLayout(null);

		/*------------------------------------------------------------
		 * Logo Section Value Section.
		 * Doesn't show up in the designer.
		 *  You will need to run the program to see it.
		 * ------------------------------------------------------------
		 */
		ImageIcon iconLogo = new ImageIcon("Images/logo-uvacs.png");
		JLabel logoCS = new JLabel();
		logoCS.setIcon(iconLogo);
		logoCS.setBounds(350, 28, 165, 63);
		getContentPane().add(logoCS);

		/*------------------------------------------------------------
		 * monthly contribution section 
		 * ------------------------------------------------------------
		 */
		// Month Saving Title Label
		monthSaveLabel = new JLabel("Monthly Savings");
		monthSaveLabel.setBounds(31, 131, 118, 26);
		getContentPane().add(monthSaveLabel);
		// Month Saving Display Label
		

		// Slide for selecting Month Savings
		monthlySaveSlider = new JSlider();
		// Sets the maximum value of the slide
		monthlySaveSlider.setMaximum(500);
		// Sets the sliders default value
		monthlySaveSlider.setValue(getMonthlySavings());
		// Set the location (x,y, .., ..) and the
		// width and height (..., ..., width, height)
		monthlySaveSlider.setBounds(169, 122, 266, 45);
		// Show the ruler style lines
		monthlySaveSlider.setPaintTicks(true);
		// Spacing between major Ticks
		monthlySaveSlider.setMajorTickSpacing(150);
		// Spacing between minor Ticks
		monthlySaveSlider.setMinorTickSpacing(10);
		// Show labels on Ticks
		monthlySaveSlider.setPaintLabels(true);
		// Add Change listener.
		monthlySaveSlider.addChangeListener(new MonthSavingListener());
		monthlySaveDisplayAmount = new JLabel("$" + monthlySavings);
		monthlySaveDisplayAmount.setBounds(469, 137, 46, 14);
		getContentPane().add(monthlySaveDisplayAmount);
		getContentPane().add(monthlySaveSlider);

		ageSpinner = new JSpinner();
		ageSpinner.setBounds(169, 65, 51, 26);
		getContentPane().add(ageSpinner);

		JLabel label = new JLabel("Age");
		label.setBounds(63, 71, 34, 20);
		getContentPane().add(label);
		
		numYearsSaveLabel = new JLabel("Number of Years");
		numYearsSaveLabel.setBounds(31, 202, 131, 26);
		getContentPane().add(numYearsSaveLabel);
		
		numYearsSlider = new JSlider();
		numYearsSlider.setValue(0);
		numYearsSlider.setPaintTicks(true);
		numYearsSlider.setPaintLabels(true);
		numYearsSlider.setMinorTickSpacing(5);
		numYearsSlider.setMajorTickSpacing(15);
		numYearsSlider.setBounds(169, 193, 266, 45);
		getContentPane().add(numYearsSlider);
		numYearsSlider.addChangeListener(new NumberYearsListener());

		numberOfYearsLabel = new JLabel("0");
		numberOfYearsLabel.setBounds(469, 202, 77, 14);
		getContentPane().add(numberOfYearsLabel);

		
		futureAgeLabel = new JLabel("Future Age: ");
		futureAgeLabel.setBounds(31, 277, 131, 30);
		getContentPane().add(futureAgeLabel);
		
		rateOfReturnDisplay = new JLabel("Rate: 7%");
		rateOfReturnDisplay.setBounds(252, 286, 70, 13);
		getContentPane().add(rateOfReturnDisplay);
		
		investmentDisplayValue = new JLabel("Investment: ");
		investmentDisplayValue.setBounds(399, 286, 164, 13);
		getContentPane().add(investmentDisplayValue);
		//investmentDisplayValue.setText("$" + calculateInvestmentValue());

		ageSpinner.addChangeListener(new AgeListener());

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator(77, 70, 18, 0.07);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
