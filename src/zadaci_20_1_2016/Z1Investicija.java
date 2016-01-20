/*1. Napisati program koji ucitava iznos investicije,  
godisnju interesnu stopu i broj godina te vraca buducu 
vrijednost investicije koristeci se sljedecom formulom: 
	buducaVrijednostInvesticije = iznosInvesticije * (1 + 
			mjesecnaInteresnaStopa)^brojGodina*12. 
Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 
kao godisnju interesnu stopu i 1 kao broj godina program 
vam vraca 1032.98 kao buducu vrijednost investicije.*/
package zadaci_20_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Z1Investicija {

	public static void main(String[] args) {
		// skener
		Scanner input = new Scanner(System.in);
		// investicija
		double investment = 0;
		// varijabla za godisnju interesnu stopu
		double annualInternalRate = 0;

		// varijable za proveru unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		// broj godina
		int numberYears = 0;
		// buduca vrednost incvesticije
		double futureValue = 0;
		// provera unosa za investiciju
		while (checkingEntry1) {
			System.out.println("Enter the amount of investment: ");
			try {
				investment = input.nextDouble();
				// investicija ne bi trebala biti u minusu
				if (investment > 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("The investment can not be negative!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter the number: ");
				input.nextLine();
			}
		}
		// provera unosa godisnju interesnu stopu
		while (checkingEntry2) {
			System.out.println("Enter the annual interest rates in [%] (for example 3,25): ");
			try {
				annualInternalRate = input.nextDouble();
				// godisnja interesna stopa bi trebala biti veca od 0
				if (annualInternalRate > 0) {
					checkingEntry2 = false;
				} else {
					System.out.println("It should be positive!!!");
					checkingEntry2 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter the number: ");
				input.nextLine();
			}
		}
		// provera unosa broj godina
		while (checkingEntry3) {
			System.out.println("Enter the number of years: ");
			try {
				numberYears = input.nextInt();
				// uslov da je mese izmdju 1 i 12
				if (numberYears > 0) {
					checkingEntry3 = false;
				} else {
					System.out.println("It can not be negative!!!");
					checkingEntry3 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter an integer: ");
				input.nextLine();
			}
		}

		// pomocna varijabla koja postotak pretvara broj za racun
		double z = annualInternalRate / 100;
		// varijabla za mesecnu interesnu stopu
		double monthlyInternalRate = z / 12;

		// proracun 
		futureValue = investment * (Math.pow((1 + monthlyInternalRate), (numberYears * 12)));
		// stampamo rezultat
		System.out.printf("Your future value of the investment is:\n%-30.3f", futureValue);

		// zatvaramo unos
		input.close();
	}

}
