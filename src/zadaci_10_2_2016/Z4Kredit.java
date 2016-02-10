/*(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method.*/
package zadaci_10_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z4Kredit {

	// data fields za godisnju kamatnu stopu, broj godina, iznos kredita i datum
	// dizanja
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	// no- arg konstruktor
	public Z4Kredit() {

	}

	// konstrktor sa data fields poljima
	public Z4Kredit(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	// metoda vraca godisnju kamatnu stopu
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// metoda menja godisnjeu kamatnu stopu
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// vraca broj godina
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// postavlja broj godina
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	// vracanje iznosa kredita
	public double getLoanAmount() {
		return loanAmount;
	}

	// promena iznosa kredita
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	// vraca mesecnu ratu
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	// vrcanje ukupnog iznosa kredita
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	// vraca datum
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	// metoda za stampanje
	@Override
	public String toString() {
		return "The loan was created on \n" + getLoanDate().toString() + "\nThe monthly payment is "
				+ getMonthlyPayment() + "\nThe total payment is \n" + getTotalPayment() + ".";
	}
}
