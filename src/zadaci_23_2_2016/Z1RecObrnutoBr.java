/*(Print the digits in an integer reversely) Write a recursive method that displays
an int value reversely on the console using the following header:
public static void reverseDisplay(int value)
For example, reverseDisplay(12345) displays 54321. Write a test program
that prompts the user to enter an integer and displays its reversal.*/
package zadaci_23_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z1RecObrnutoBr {

	public static void reverseDisplay(int value) {
		// uslov da se zaustavi rekurzija metoda poziva sama sebe
		if (value != 0) {
			// u slucaju da je broj negativan pretvori ga u pozitivan
			if (value < 0) {
				value = value * (-1);
			}
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
	}

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		// korisnikov unos
		int value = 0;

		// varijabla za proveru unosa
		boolean check = true;

		// provera unosa
		while (check) {
			try {
				System.out.println("Enter a value: ");
				value = input.nextInt();
				check = false;

				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
			}
		}

		// zatvaramo unos
		input.close();

		// saljemo u metodu
		reverseDisplay(value);
	}
}
