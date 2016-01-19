/*1. Pretpostavimo da uplatimo $100 svaki mjesec na stedni 
racun koji ima godisnju interesnu stopu od 5%. Mjesecna 
interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog 
mjeseca vrijednost na racunu postaje 
100 * (1 + 0.00417) = 100.417. 
Nakon drugog mjeseca, vrijednost na racunu postaje 
(100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treceg 
mjeseca, vrijednost na racunu postaje 
(100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
Napisati program koji pita korisnika da unese mjesecni 
iznos stednje te broj mjeseci nakon kojeg bi želio znati 
stanje racuna.*/
package zadaci_19_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1StedniRacun {

	public static void main(String[] args) {

		// skener
		Scanner input = new Scanner(System.in);
		// varijabla za godisnju interesnu stopu
		double annualInternalRate = 0.05;
		// varijabla za mesecnu interesnu stopu
		double monthlyInternalRate = annualInternalRate / 12;
		// varijable za proveru unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// varijabla za racun, mesece svotu mesecnu koja se stedi
		double monthlyPayment = 0;
		int numberMonths = 2;
		double accountBalance = 0;
		// provera unosa za svotu stedenje
		while (checkingEntry1) {
			System.out.println("Enters month the amount of savings: ");
			try {
				monthlyPayment = input.nextDouble();
				// posto je stednja mora biti veca od 0
				if (monthlyPayment > 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("Savings is not loan!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter the number: ");
				input.nextLine();
			}
		}
		// provera unosa meseca
		while (checkingEntry2) {
			System.out.println("Enter the number of months of savings: ");
			try {
				numberMonths = input.nextInt();
				// uslov da je mese izmdju 1 i 12
				if (numberMonths > 0 && numberMonths < 13) {
					checkingEntry2 = false;
				} else {
					System.out.println("Months are from 1 to 12!!!");
					checkingEntry2 = true;
				}
				// u greske
			} catch (InputMismatchException e) {
				System.out.println("Enter an integer: ");
				input.nextLine();
			}
		}
		// racunamo do meseca
		for (int i = 0; i < numberMonths; i++) {

			// pomocne varijable za proracun stanja na racunu nakon nekoliko meseci
			double x = accountBalance + monthlyPayment;
			double y = 1 + monthlyInternalRate;
			// stanje racuna
			accountBalance = x * y;
		}
		// stampamo rezultat
		System.out.printf("Your savings account after %2d months with an annual interest rate of", numberMonths);
		System.out.print(" 5 [%]  is:\n");
		System.out.printf("%119.3f", accountBalance);
		System.out.print("[$].");
		// zatvaramo unos
		input.close();
	}

}
