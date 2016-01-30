/*2. Napisati program koji pita korisnika da unese neki string te mu 
ispisuje duzinu tog stringa kao i prvo slovo stringa. */
package zadaci_30_1_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2DuzinaStringa {

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or sentence");
		// korisnikov unos smestamo u varijablu
		String s = input.nextLine();
		// zatvaramo unos
		input.close();
		// stampamo rezultat
		System.out.println(
				"Sentence length is " + s.length() + " characters and the first character is \"" + s.charAt(0) + "\".");
	}

}
