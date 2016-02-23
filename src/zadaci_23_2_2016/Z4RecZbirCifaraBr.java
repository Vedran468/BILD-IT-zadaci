/*(Sum the digits in an integer using recursion) Write a recursive method that
computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum.*/
package zadaci_23_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4RecZbirCifaraBr {
	// static data field za zbir
	static int sum = 0;

	public static int sumDigits(long n) {
		// uslov da se zaustavi rekurzija metoda poziva sama sebe
		if (n != 0) {
			sum += n % 10;
			sumDigits(n / 10);
		}
		return sum;
	}

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		// korisnikov unos
		long value = 0;

		// varijabla za proveru unosa
		boolean check = true;

		// provera unosa
		while (check) {
			try {
				System.out.println("Enter an integer and displays its sum: ");
				value = input.nextLong();
				check = false;

				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
			}
		}

		// zatvaramo unos
		input.close();

		// saljemo u metodu i stampamo rezulat
		System.out.println("The sum of the " + sumDigits(value) + ".");

	}
}
