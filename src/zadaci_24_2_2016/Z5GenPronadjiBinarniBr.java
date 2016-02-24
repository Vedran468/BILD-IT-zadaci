/*(Generic binary search) Implement the following method using binary search.
public static <E extends Comparable<E>>
int binarySearch(E[] list, E key)*/
package zadaci_24_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z5GenPronadjiBinarniBr {

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
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
		Short[] list = new Short[10];
		// brojac
		int counter = 0;
		// provera unosa
		boolean checkingEntry = true;
		// korisnikov unos
		short n = 0;

		System.out.println("Enter the 5 binary numbers spaced single space: ");
		// petlja radi dok korisnik ne unese 10 brojeva
		while (counter != 5) {
			// radi dok unos ne bude broj
			while (checkingEntry) {
				try {
					n = input.nextShort();
					// prveravamo da li broj koji je unet se sastoji od 4 cifre
					// jer
					// je 16/4=4
					if (n < 10000) {
						list[counter] = n;
						checkingEntry = false;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter binary number: ");
					input.nextLine();
				}
			}
			// ponistavamo za proveru unosa i povecava se brojac
			checkingEntry = true;
			counter++;

		}

		Short key = null;
		// ponistavamo za proveru unosa
		checkingEntry = true;
		// radi dok unos ne bude broj
		while (checkingEntry) {
			System.out.println("Enter the required binary number: ");
			try {
				key = new Short(input.nextShort());
				checkingEntry = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the  binary number: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// saljemo u metodu i stampamo rezultat
		System.out.println("The requested binary number is located on an index " + binarySearch(list, key) + ".");
	}
}
