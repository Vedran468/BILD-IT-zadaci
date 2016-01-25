/*5. Napisati program koji ucitava neodreden broj cijelih brojeva, 
odreduje koliko je pozitivnih brojeva korisnik unijeo, koliko negativnih 
te izracunava ukupnu sumu i prosjek svih unesenih brojeva. 
(Korisnik prekida unos tako sto unese nulu). 
Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispise da je 
broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek 
svih brojeva je 1.25.*/
package zadaci_25_1_2016;

import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z5PozitivniNegativniProsek {

	public static void main(String[] args) {
// skener za unos
		Scanner input = new Scanner(System.in);
		// brojac pozitivnih brojeva
		int positiveNumber = 0;
		// brojac negativnih brojeva
		int negativeNumber = 0;
		// zbir
		double sum = 0;
		// korisnikov unos
		int userInput = 1;
		// prosek
		double average = 0;
		System.out.println("Enter the numbers spaced single space (input interrupt 0):\n");
		while (userInput != 0) {
			try {
				userInput = input.nextInt();
				// ako je broj veci od 0 
				if (userInput > 0) {
					// saberiga u zbir
					sum += userInput;
					// povecaj brojac pozitivnih brojeva
					positiveNumber++;
					// ako je broj manji od 0 
				} else if (userInput < 0) {
					// dodaj ga zbiru
					sum += userInput;
					// povecaj brojac negativnih brojeva
					negativeNumber++;
				}
				// u slucaju greske
			} catch (Exception e) {
				System.out.println("Enter integer!!!");
				input.nextLine();
			}
		}
		// zatvarao unos
		input.close();
		// racunamo prosek
		average = sum / (positiveNumber + negativeNumber);
		// ispisujemo rezultat
		System.out.println("You entered " + positiveNumber + " positive numbers.");
		System.out.println("You entered " + negativeNumber + " negative numbers.");
		System.out.println("The sum of all the entered numbers is: " + sum + ".");
		System.out.println("The average of all the entered numbers is " + average + ".");
	}

}
