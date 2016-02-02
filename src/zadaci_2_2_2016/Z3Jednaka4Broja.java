/*(Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays
if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series. Here are sample runs:*/
package zadaci_2_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3Jednaka4Broja {

	public static boolean isConsecutiveFour(int[] values) {
		// brojac
		int counter = 1;
		// prolazimo kroz niz
		for (int i = 0; i < values.length - 1; i++) {
			// uporedjujemo sa narednim elementom niza da li je jednak
			if (values[i] == values[i + 1]) {
				// ako jeste povecaj brojac
				counter++;
				// ako je brojac na 4 zaustavi petlju
				if (counter == 4) {
					break;
				}
			}
		}
		// u zavisnosti da li je brojac na 4 metoda vraca true ili false
		if (counter == 4) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// korisnikov broj za broj vrednosti u nizu
		int length = 0;
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// radi dok unos ne bude ceo broj
		while (checkingEntry1) {
			System.out.println("Enter the number of values: ");
			try {
				length = input.nextInt();
				// provera broja da li je pozitivan
				if (length >= 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("No value should be positive!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// definisemo niz velicine koju je korisnik definisao
		int[] values = new int[length];
		// brojac koji broji broj unosa
		int counter = 0;

		System.out.println("Enter " + length + " values spaced single space: ");
		// petlja radi dok korisnik ne unese sve brojeve
		while (counter != length) {
			// radi dok unos ne bude broj
			while (checkingEntry2) {
				try {
					values[counter] = input.nextInt();
					checkingEntry2 = false;
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the integer: ");
					input.nextLine();
				}
			}
			// ponistavamo za proveru unosa i povecava se brojac
			checkingEntry2 = true;
			counter++;

		}
		// zatvaramo unos
		input.close();
		// niz saljemo u metodu i stampamo rezultat
		if (isConsecutiveFour(values)) {
			System.out.println("The list has consecutive fours.");
		} else {
			System.out.println("The list has no consecutive fours.");
		}
	}

}
