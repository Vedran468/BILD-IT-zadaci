/*(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array. Here is a sample run:*/
package zadaci_4_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z5TestLokacijeNajvecegBrojaMatrice {

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		// varijable za broj kolona i redova
		int rows = 0;
		int columns = 0;

		// provera da li je ispravno unesenn broj za redove
		while (checkingEntry1) {
			System.out.println("Enter the number of rows in the array:: ");
			try {
				rows = input.nextInt();
				if (rows > 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("Number of rows must be a positive number!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// provera da li je ispravno unesenn broj za kolone
		while (checkingEntry2) {
			System.out.println("Enter the number of colums in the array:: ");
			try {
				columns = input.nextInt();
				if (columns > 0) {
					checkingEntry2 = false;
				} else {
					System.out.println("Number of rows must be a positive number!!!");
					checkingEntry2 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// definisemo matricu
		double[][] a = new double[rows][columns];
		
		System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row: ");
		// smestamo korisnikov unos u matricu2
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				while (checkingEntry3) {
					try {
						a[i][j] = input.nextDouble();
						checkingEntry3 = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the number: ");
						input.nextLine();
					}
				}
				// ponistavamo varijablu za proveru da bi ponovo usli u petlju
				checkingEntry3 = true;
			}
		}
		// zastavljamo unos
		input.close();
		// posto je statik metoda na ovaj nacin prosledjujemo matricu
		Z5LokacijaNajvecegBrojaUMatrici.locateLargest(a);
	}
}
