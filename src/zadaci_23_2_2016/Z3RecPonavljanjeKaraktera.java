/*(Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the following
method header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.*/
package zadaci_23_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.Scanner;

public class Z3RecPonavljanjeKaraktera {

	// static data fields za indeks karaktera i brojac
	static int i = 0;
	static int counter = 0;

	public static int count(String str, char a) {
		// ako je indeks karaktera veci od 0
		if (i > 0) {
			i--;
			// proveri je li karakter na tom indeksu jednak dobijenom karakteru
			if (str.charAt(i) == a) {
				counter++;
			}
			count(str, a);
		}
		return counter;
	}

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		// korisnikov unos za string
		String str = input.nextLine();
		System.out.println("And a character, and displays the number of occurrences for the character in the string: ");
		// korisnikov unos za karakter
		String s = input.next();
		char a = s.charAt(0);
		// zatvaramo unos
		input.close();

		// vrednost indeksa karaktera je duzina stringa
		i = str.length();

		// u sucaju da nema takvog karaktera u stringu
		if (count(str, a) == 0) {
			System.out.println("There is no such character in the string you entered.");
			// inace ispisi
		} else {
			// saljemo u metodu i stampamo rezultat
			System.out.println("The number of repetitions of characters is " + count(str, a) + " times.");
		}
	}
}
