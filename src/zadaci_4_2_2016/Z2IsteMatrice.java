/*(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of
integers and displays whether the two are strictly identical.*/
package zadaci_4_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2IsteMatrice {
	public static boolean equals(int[][] m1, int[][] m2) {
		// provera dali su jednake matrice ako nisu odmah vratii false
		if (m1.length == m2.length && m1[0].length == m2[0].length) {
			// provera da li su svi elementi dveju matrica jednaki
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					if (m1[i][j] != m2[i][j]) {
						// u slucaju da nisu vrati false
						return false;
					}
				}
			}
		} else {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// matrice dve 3x3
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		System.out.println("Enter a 3-by-3 matrix1 row by row: ");
		// smestamo korisnikov unos u matricu1
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				while (checkingEntry1) {
					try {
						m1[i][j] = input.nextInt();
						checkingEntry1 = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the integer: ");
						input.nextLine();
					}
				}
				// ponistavamo varijablu za proveru da bi ponovo usli u petlju
				checkingEntry1 = true;
			}
		}

		System.out.println("Enter a 3-by-3 matrix2 row by row: ");
		// smestamo korisnikov unos u matricu2
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				while (checkingEntry2) {
					try {
						m2[i][j] = input.nextInt();
						checkingEntry2 = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the integer: ");
						input.nextLine();
					}
				}
				// ponistavamo varijablu za proveru da bi ponovo usli u petlju
				checkingEntry2 = true;
			}
		}
		// zastavljamo unos
		input.close();
		// ako metoda vrati true izpisi
		if (equals(m1, m2)) {
			System.out.println("The two arrays are strictly identical!!!");
		} else {
			// inace ispisi
			System.out.println("The two arrays are not strictly identical!!!");
		}
	}
}
