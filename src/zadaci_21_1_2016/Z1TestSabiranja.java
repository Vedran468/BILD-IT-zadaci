/*1. Napisati program koji ispisuje tri nasumicna cijela broja  
te pita korisnika da unese njihov zbir. Ukoliko korisnik pogrijesi, 
program ispisuje pitanje ponovo sve sa porukom da pokusa ponovo.  
Ukoliko korisnik unese tacan odgovor, program mu cestita i zavrsava 
sa radom. */
package zadaci_21_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1TestSabiranja {

	public static void main(String[] args) {

		// skener
		Scanner input = new Scanner(System.in);
		// tri nasumicna broja
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		int number3 = (int) (Math.random() * 100);
		// korisnikov unos
		int userInput = 0;
		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude tacan
		while (checkingEntry) {
			System.out.println("How much is it: " + number1 + " + " + number2 + " + " + number3 + " = ");
			try {
				userInput = input.nextInt();

				// provera je li korisnik uneo tacan rezultat
				if (userInput == (number1 + number2 + number3)) {
					System.out.println("That's right, congratulations !!!");
					checkingEntry = false;
				} else {
					System.out.println("Try again!!!");
					checkingEntry = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter the integer: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
	}

}
