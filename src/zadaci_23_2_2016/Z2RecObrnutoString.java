/*(Print the characters in a string reversely) Write a recursive method that displays
a string reversely on the console using the following header:
public static void reverseDisplay(String value)
For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.*/
package zadaci_23_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.Scanner;

public class Z2RecObrnutoString {
	// static data field za indeks karaktera
	static int i;

	public static void reverseDisplay(String value) {
		// ako je indeks karaktera veci od 0 izvrsi stampanje karaktera na tom
		// indeksu
		if (i > 0) {
			i--;
			System.out.print(value.charAt(i));
			reverseDisplay(value);
		}
	}

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string and displays its reversal: ");
		// korisnikov unos
		String value = input.nextLine();

		// vrednost indeksa karaktera je duzina stringa
		i = value.length();
		// zatvaramo unos
		input.close();

		// saljemo u metodu
		reverseDisplay(value);
	}
}
