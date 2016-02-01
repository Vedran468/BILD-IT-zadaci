/*2. Napisati program koji prima karakter te vraca njegov Unicode. 
Primjer: ukoliko korisnik unese karakter E program mu vraca 69 
kao unicode za taj karakter.*/
package zadaci_1_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z2Unicode {

	public static void main(String[] args) {

		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// korisnikov karakter
		String character = "";
		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude karakter
		while (checkingEntry) {
			System.out.println("Enter character: ");
			try {
				character = input.next();
				// provera je li korisnik uneo karakter
				if (character.length()==1) {
					checkingEntry = false;
				} else {
					checkingEntry = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the character: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// stampamo rezultat
		System.out.println(
				"For the character \""+character+"\", its unicode is \""+(int)(character.charAt(0))+"\"!!!");
	}

}
