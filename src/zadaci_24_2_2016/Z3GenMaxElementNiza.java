/*(Maximum element in an array) Implement the following method that returns the
maximum element in an array.
public static <E extends Comparable<E>> E max(E[] list)*/
package zadaci_24_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z3GenMaxElementNiza {

	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		// pronadji koji je najcveci broj
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(max) == 1) {
				max = list[i];
			}
		}
		return max;
	}

	public static  void main(String[] args) {
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
		// zatvaramo unos
		input.close();

		// saljemo u metodu i stampamo rezultat
		System.out.println("The maximum number you entered is " + max(list) + ".");
	}
}
