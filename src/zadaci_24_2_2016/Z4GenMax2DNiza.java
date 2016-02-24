/*(Maximum element in a two-dimensional array) Write a generic method that
returns the maximum element in a two-dimensional array.
public static <E extends Comparable<E>> E max(E[][] list)*/
package zadaci_24_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4GenMax2DNiza {

	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];

		// proveravamo koji je broj maksimalan
		for (int row = 0; row < list.length; row++) {
			for (int column = 0; column < list[row].length; column++) {
				if (list[row][column].compareTo(max) == 1) {
					max = list[row][column];
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// Kreiramo skener
		Scanner input = new Scanner(System.in);
		// varijabla za redove
		int rows = 0;
		// za proveru unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude tacan
		while (checkingEntry) {
			try {
				System.out.println("Enter the number of rows: ");
				rows = input.nextInt();
				checkingEntry = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// ponistavamo za proveru unosa
		checkingEntry = true;
		// za broj kolona
		int columns = 0;
		// radi dok unos ne bude tacan
		while (checkingEntry) {
			try {
				System.out.println("Enter the number of columns: ");
				columns = input.nextInt();
				checkingEntry = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// ponistavamo za proveru unosa
		checkingEntry = true;
		// Kreiramo matricu koju je velicinu korisnik definisao,
		Double[][] list = new Double[rows][columns];

		// Unesenje elementa matrice
		System.out.println("Enter " + list.length + " rows and " + list[0].length + " columns: ");
		for (int row = 0; row < list.length; row++) {
			for (int column = 0; column < list[row].length; column++) {
				// radi dok unos ne bude broj
				while (checkingEntry) {
					try {
						list[row][column] = input.nextDouble();
						checkingEntry = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the number: ");
						input.nextLine();
					}
				}
				// ponistavamo za proveru unosa
				checkingEntry = true;
			}
		}
		// zatvamo unos
		input.close();
		// stampamo rezultat
		System.out.printf("Maximum element in a two-dimensional array is " + max(list) + ".");

	}

}
