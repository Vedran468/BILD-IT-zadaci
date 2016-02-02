/*(Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix. Each element
cij is aij + bij.
Write a test program that prompts the user to enter two 3 * 3 matrices and
displays their sum.*/
package zadaci_2_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5Zbir2Matrice {

	public static double[][] addMatrix(double[][] a, double[][] b) {
		// definisemo trecu matricu gde smestamo rezultate
		double[][] c = new double[a.length][b[0].length];
		// prolazimo kroz matrice
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				// sabiramo elemente dviju matrica u trecu
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {

		// kreiramoskener za unos
		Scanner input = new Scanner(System.in);
		// definisemo matrice 3x3
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		System.out.println("Enter a 3-by-3 matrix1 row by row: ");
		// smestamo korisnikov unos u matricu1
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				while (checkingEntry1) {
					try {
						// ako je korisnik uneo broj zastavi petlju za proveru
						a[i][j] = input.nextDouble();
						checkingEntry1 = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the number: ");
						input.nextLine();
					}
				}
				// ponistavamo varijablu za proveru da bi ponovo usli u petlju
				checkingEntry1 = true;
			}
		}
		System.out.println("Enter a 3-by-3 matrix2 row by row: ");
		// smestamo korisnikov unos u matricu2
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				while (checkingEntry2) {
					try {
						// ako je korisnik uneo broj zastavi petlju za proveru
						b[i][j] = input.nextDouble();
						checkingEntry2 = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the number: ");
						input.nextLine();
					}
				}
				// ponistavamo varijablu za proveru da bi ponovo usli u petlju
				checkingEntry2 = true;
			}
		}
		// zastavljamo unos
		input.close();
		// prazan red
		System.out.println();
		// saljemo matrice u metodu a rezultate smestamo u trecu matricu
		double[][] c = addMatrix(a, b);
		// ispisujemo matrice formatiirane
		for (int i = 0; i < a.length; i++) {
			// ispis reda a matrice
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf(" %4.2f ", a[i][j]);
				if (j == 2) {
					if (i == 1) {
						System.out.print(" + ");
					} else {
						System.out.print("     ");

					}
				}
			}
			// ispis reda b matrice
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf(" %4.2f ", b[i][j]);

				if (j == 2) {
					if (i == 1) {
						System.out.print(" =");
					} else {
						System.out.print("   ");
					}
				}
			}
			// ispis reda c matrice
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf(" %6.2f ", c[i][j]);
			}
			// prelazak u novi red
			System.out.println();
		}
	}

}
