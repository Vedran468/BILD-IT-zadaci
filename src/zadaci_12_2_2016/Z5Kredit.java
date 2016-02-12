/*(IllegalArgumentException) Modify the Loan class in Listing 10.2 to
throw IllegalArgumentException if the loan amount, interest rate, or
number of years is less than or equal to zero.*/
package zadaci_12_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z5Kredit {

	// data fields za godisnju kamatnu stopu, broj godina, iznos kredita i datum
	// dizanja
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	// no- arg konstruktor
	public Z5Kredit() {

	}

	// konstrktor sa data fields poljima
	public Z5Kredit(double annualInterestRate, int numberOfYears, double loanAmount) {
		if (annualInterestRate > 0 && numberOfYears > 0 && loanAmount > 0) {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
		} else {

			throw new IllegalArgumentException("The numbers must be greater than 0! ");
		}
		loanDate = new java.util.Date();
	}

	// metoda vraca godisnju kamatnu stopu
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// metoda menja godisnjeu kamatnu stopu
	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate > 0) {
			this.annualInterestRate = annualInterestRate;
		} else {

			throw new IllegalArgumentException("The number must be greater than 0! ");
		}
	}

	// vraca broj godina
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// postavlja broj godina
	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears > 0) {
			this.numberOfYears = numberOfYears;
		} else {

			throw new IllegalArgumentException("The numbers must be greater than 0! ");
		}
	}

	// vracanje iznosa kredita
	public double getLoanAmount() {
		return loanAmount;
	}

	// promena iznosa kredita
	public void setLoanAmount(double loanAmount) {
		if (loanAmount > 0) {
			this.loanAmount = loanAmount;
		} else {

			throw new IllegalArgumentException("The numbers must be greater than 0! ");
		}
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
