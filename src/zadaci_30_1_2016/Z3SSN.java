/*3. Napisati program koji pita korisnika da unese Social Security Number (SSN)
u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava 
da li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika 
da pokusa ponovo. Ukoliko jeste unesen u pravom formatu, program zavrsava sa radom.*/
package zadaci_30_1_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3SSN {

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// korisnikov unos
		String ssn = " ";
		// nastavi unos varijabla za proveru unosa
		boolean continueInput = true;
		// provera je li korisnik uneo ispravan ssn
		while (continueInput) {
			System.out.println("Enters a Social Security Number (SSN),\nin the format "
					+ "DDD-DD-DDDD where D represents the number: ");

			ssn = input.nextLine();
			// unos pretvaramo u karaktere
			char[] characters = ssn.toCharArray();
			// provera duzine unosa je li korektna
			if (ssn.length() != 11) {
				continueInput = true;
			} else {
				// ako jeste provera je li korisnik uneo brojeve na mesto d a i
				// gde treba - preko ascii koda
				if (characters[3] == '-' && characters[6] == '-' && (int) (characters[0]) > 48
						&& (int) (characters[0]) <= 57 && (int) (characters[1]) >= 48 && (int) (characters[1]) <= 57
						&& (int) (characters[2]) >= 48 && (int) (characters[2]) <= 57 && (int) (characters[4]) >= 48
						&& (int) (characters[4]) <= 57

						&& (int) (characters[5]) >= 48 && (int) (characters[5]) <= 57 && (int) (characters[7]) >= 48
						&& (int) (characters[7]) <= 57 && (int) (characters[8]) >= 48 && (int) (characters[8]) <= 57

						&& (int) (characters[9]) >= 48 && (int) (characters[9]) <= 57 && (int) (characters[10]) >= 48
						&& (int) (characters[10]) <= 57) {

					continueInput = false;

				} else {
					continueInput = true;
				}
			}

			// u slucaju da je tacan unos
			if (!continueInput) {
				System.out.println("Entering the correct!!!");
				// i u slucaju da nije
			} else {
				System.out.println("The input is not correct!!! Again!!!");
			}

		}
		// zaustavljamo unos
		input.close();
	}

}
