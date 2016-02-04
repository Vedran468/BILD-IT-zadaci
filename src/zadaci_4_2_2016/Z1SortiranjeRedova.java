/*(Row sorting) Implement the following method to sort the rows in a twodimensional
array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix.*/
package zadaci_4_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1SortiranjeRedova {

	public static double[][] sortRows(double[][] m) {
		// prolazimo kroz redove
		for (int i = 0; i < m.length; i++) {
			// da se ponovi onoliko puta koliko ima clanova u redu
			for (int k = 0; k < m[i].length - 1; k++) {
				// uporedi sa svakim narednim ako je on manji, brojevi zamenjuju
				// mesta
				for (int j = 0; j < m[i].length - 1; j++) {
					if (m[i][j] > m[i][j + 1]) {
						double temp = m[i][j];
						m[i][j] = m[i][j + 1];
						m[i][j + 1] = temp;
					}
				}
			}
		}
		// metoda vraca istu matricu
		return m;
	}

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// provera unosa
		boolean checkingEntry = true;
		// matrica 3x3
		double[][] m = new double[3][3];

		System.out.println("Enter a 3-by-3 matrix row by row: ");
		// smestamo korisnikov unos u matricu
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				while (checkingEntry) {
					try {
						m[i][j] = input.nextDouble();
						checkingEntry = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the number: ");
						input.nextLine();
					}
				}
				// ponistavamo varijablu za proveru da bi ponovo usli u petlju
				checkingEntry = true;
			}
		}
		// zastavljamo unos
		input.close();
		// matricu saljemo u metodu a rezultat metode pohranjujemo u barijablu
		double[][] result = sortRows(m);
		// stampamo sortiranu matricu
		System.out.println("\nThe row-sorted array is:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
