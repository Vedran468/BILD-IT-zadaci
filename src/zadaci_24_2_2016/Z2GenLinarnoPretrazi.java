/*(Generic linear search) Implement the following generic method for linear search.
public static <E extends Comparable<E>>
int linearSearch(E[] list, E key)*/
package zadaci_24_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z2GenLinarnoPretrazi {

	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		int i = 0;
		// pronadji indeks za trazeni element
		for (i = 0; i < list.length; i++) {
			if (list[i].equals(key)) {
				// ako je jednak trazenom elementu zaustavi petlju
				break;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// niz za korisnikov unos
		Double[] list = new Double[10];
		// brojac
		int counter = 0;
		// provera unosa
		boolean checkingEntry = true;

		System.out.println("Enter 10 numbers spaced single space: ");
		// petlja radi dok korisnik ne unese 10 brojeva
		while (counter != 10) {
			// radi dok unos ne bude broj
			while (checkingEntry) {
				try {
					list[counter] = input.nextDouble();
					checkingEntry = false;
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the number: ");
					input.nextLine();
				}
			}
			// ponistavamo za proveru unosa i povecava se brojac
			checkingEntry = true;
			counter++;

		}

		Double key = null;
		// ponistavamo za proveru unosa
		checkingEntry = true;
		// radi dok unos ne bude broj
		while (checkingEntry) {
			System.out.println("Enter the required number: ");
			try {
				key = new Double(input.nextDouble());
				checkingEntry = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// saljemo u metodu i stampamo rezultat
		System.out.println("The requested number is located on an index " + linearSearch(list, key) + ".");
	}
}
