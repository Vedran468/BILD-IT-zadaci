/*4. Napisati program koji prima 10 cijelih brojeva te 
ih ispisuje u obrnutom redosljedu. */
package zadaci_19_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4Obrnuto10Brojeva {
	/**
	 * @author Vedran Vidakovic
	 *
	 */
	public static void main(String[] args) {
		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// niz za rezultat
		int[] result = new int[10];
		// varijable za proveru unosa
		boolean checkingEntry = true;
		// brojac
		int counter = 0;
		System.out.println("Enter the 10 integers");
		// provera unosa za 10 brojeva
		while (checkingEntry) {
			try {
				result[counter] = input.nextInt();
				counter++;
				System.out.println("You have entered " + counter + " of the 10 numbers;: ");
				// provera je li uneto 10 brojeva
				if (counter == 10) {
					// ako jeste zaustavi petlju inace nastavi
					checkingEntry = false;
				} else {
					checkingEntry = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter an integer: ");
				input.nextLine();
			}
		}
		// zaustavljamo unos
		input.close();
		// stampamo rezultat
		System.out.println("Enter the numbers were reversed:\n");
		for (int i = result.length - 1; i >= 0; i--) {
			System.out.print(result[i] + " ");
		}

	}
}
