/*2. Napisati metodu koja nalazi najmanji element u nizu 
decimalnih vrijednosti koristeci se sljedecim headerom:

public static double min(double[ ] array)

Napisite potom test program koji pita korisnika da unese 
deset brojeva te poziva ovu metodu da vrati najmanji 
element u nizu.*/
package zadaci_17_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2NajmanjiElemenatNiza {

	public static double min(double[] array) {
		// sortiramo dobijeni niz
		java.util.Arrays.sort(array);
		// vrati prvi clan
		return array[0];
	}

	public static void main(String[] args) {
		// pravimo skener
		Scanner input = new Scanner(System.in);
		// kreiramo niz od 10 elemenata
		double[] array = new double[10];
		System.out.println("Enter 10 numbers: ");
		// preko for petlje unosimo od korisnika 10 elemenat
		for (int i = 0; i < 10; i++) {
			// nastavi unos varijabla za proveru da li je korisniik uneo broj
			boolean continueInput = true;
			// provera je li korisnik uneo broj1
			while (continueInput) {
				try {
					array[i] = input.nextDouble();
					// zaustavljamo petlju
					continueInput = false;
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: enter the number!)");
					input.nextLine(); // Discard input, odbaci predhodni unos
				}
			}
		}
		// zatvorimo unos
		input.close();
		// prikaz rezultata
		System.out.println("The minimum number of array is: " + min(array));
	}
}
