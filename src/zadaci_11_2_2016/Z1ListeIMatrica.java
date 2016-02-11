/*(Largest rows and columns) Write a program that randomly fills in 0s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.)*/
package zadaci_11_2_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1ListeIMatrica {

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		int n = 0;
		// provera unosa
		boolean check = true;
		// provera za velicinu matrice
		while (check) {
			System.out.println("Enter the array size n: ");
			try {
				n = input.nextInt();
				// provera je li broj koji je trazen
				if (n > 0) {
					check = false;
				} else {
					System.out.println("Size array can not be a negative number!!!");
				}
				// u slucaju greske unosa
			} catch (InputMismatchException e1) {
				input.nextLine();
				System.out.println("Enter the integer!!!");
			}
		}
		// zatvaramo unos
		input.close();
		// liste gde smestamo red i kolonu indeks odnosno zbirove po koloni i
		// redu
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>();
		System.out.println("The random array is: ");
		// Definisemo matricu velicine nxn
		int[][] m = new int[n][n];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// dodeljujemo matrici brojeve 0 i 1
				m[i][j] = (int) (Math.random() * 2);
				// Stampamo matricu
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		// variojabla za sumu
		int sum = 0;
		// sabiranje elemenata po redu
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sum += m[i][j];
			}
			// dodavanje zbira po redu u listu
			row.add(sum);
			// ponistavanje sume
			sum = 0;
		}
		// stampamo rezultat od redove
		System.out.println("The largest row index: " + row.indexOf(Collections.max(row)) + ".");
		sum = 0;
		// sabiranje elemenata po koloni
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m.length; i++) {
				sum += m[i][j];
			}
			// dodavanje zbira po koloni u listu
			column.add(sum);
			// ponistavanje sume
			sum = 0;
		}
		// stampamo rezultat od kolona
		System.out.println("The largest column index: " + column.indexOf(Collections.max(column)) + ".");
	}

}