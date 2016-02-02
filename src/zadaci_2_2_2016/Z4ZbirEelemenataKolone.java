/*(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each
column.*/
package zadaci_2_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z4ZbirEelemenataKolone {
	public static double sumColumn(double[][] m, int columnIndex) {
		// definisemo zbir po kolonama
		double sumColumn = 0;
		// prolazimo po redovima i sabiramo
		for (int i = 0; i < m.length; i++) {
			sumColumn += m[i][columnIndex];
		}
		// metoda vraca taj zbir
		return sumColumn;
	}

	public static void main(String[] args) {
		// kreiramoskener za unos
		Scanner input = new Scanner(System.in);
		// definisemo matricu 3x4
		double[][] m = new double[3][4];
		// provera unosa
		boolean checkingEntry = true;
		System.out.println("Enter a 3-by-4 matrix row by row: ");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				while (checkingEntry) {
					try {
						// ako je korisnik uneo broj zastavi petlju za proveru
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
		// saljemo indeks za kolonu i stampamo rezultate
		for (int j = 0; j < m[0].length; j++) {
			System.out.println("Sum of the elements at column " + j + " is " + sumColumn(m, j) + " .");
		}

	}

}
