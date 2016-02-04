/*(The Account class) Design a class named Account that contains:
- A private int data field named id for the account (default 0).
- A private double data field named balance for the account (default 0).
- A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume all accounts have the same interest rate.
- A private Date data field named dateCreated that stores the date when the
account was created.
- A no-arg constructor that creates a default account.
- A constructor that creates an account with the specified id and initial balance.
- The accessor and mutator methods for id, balance, and annualInterestRate.
- The accessor method for dateCreated.
- A method named getMonthlyInterestRate() that returns the monthly
interest rate.
- A method named getMonthlyInterest() that returns the monthly interest.
- A method named withdraw that withdraws a specified amount from the
account.
-A method named deposit that deposits a specified amount to the account.
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.
*/
package zadaci_4_2_2016;

import java.util.Date;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z4Racun {

	// kreiramo data fields polja podataka. sa default vrednostima
	private int id = 0; // Korisnicki broj.
	private double balance = 0; // Njegovo stannj na racunu
	private double annualInterestRate = 0; // Godisnja kamatna stopa.

	// date feild za datum
	private Date dateCreated;

	// Pravimo konstruktor prazan za default vrijednosti.
	public Z4Racun() {

	}

	// konstruktor sa agumentima korisnickovog broja, stanje pocetno na
	// racunu i kreira datum
	public Z4Racun(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	// get metoda koja vraca broj korisnika
	public int getId() {
		return id;
	}

	// izmena broja korisnika
	public void setId(int id) {
		this.id = id;
	}

	// vraca stanje na racunu
	public double getBalance() {
		return balance;
	}

	// menja stanje na racunu 
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// vraca godisnju kamatnu sstopu
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// menjanje godisnje kamatne stope
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate/100;
	}

	// vraca datum kreiranja
	public Date getDateCreated() {
		return dateCreated;
	}

	// vraca mesecnu kamatnu stopu
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// mesecna rata
	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}

	// Kreiramo koja menja stanje racuna kada korisnik podigne pare
	// pod uslovom da mu je stanje na racunu iznad 0.
	public void withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
		}
	}

	// Kreiramo koja menja stanje racuna kada korisnik uplati pare.
	public void deposit(double amount1) {
		balance = balance + amount1;
	}

}