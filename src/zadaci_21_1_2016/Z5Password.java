/*5. Neke web stranice forsiraju odredena pravila za passworde. 
Napisati metodu koja provjerava da li je unijeti string validan password. 
Pravila da bi password bio validan su sljedeca: 
	1. Password mora biti sacinjen od najmanje 8 karaktera. 
	2. Password smije da se sastoji samo od slova i brojeva. 
	3. Password mora sadrzati najmanje 2 broja. 
Napisati program koji pita korisnika da unese password te mu ispisuje 
"password je validan" ukoliko su sva pravila ispostovana ili 
"password nije validan" ukoliko pravila nisu ispostovana.*/
package zadaci_21_1_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5Password {
	public static boolean password(String password) {
		// pretvaramo password u mala zlova radi lakse provere
		String lowercase = password.toLowerCase();
		// pretvaramo mla slova u karaktere
		char[] characters = lowercase.toCharArray();
		// brojaci brojeva i slova
		int counter1 = 0;
		int counter2 = 0;
		// prolazimo kroz sve karaktere
		for (int i = 0; i < characters.length; i++) {

			// provera je li najmanje 8 karaktera u passwordu
			if (characters.length > 7) {
				// provera da li sadrzi brojeve i koliko
				if (((int) (characters[i]) >= 48 && (int) (characters[i]) <= 57)) {
					counter1++;
					// provera da li sadrzi slova i koloko
				} else if (((int) (characters[i]) >= 97 && (int) (characters[i]) <= 122)) {
					counter2++;
				}
				// u slucaju da je password ispod 8 karaktera zaustavi petlju
			} else {
				break;
			}
		}
		/*
		 * preko brojaca provera da li je password sacinjen od slova i brojeva
		 * kao i da li je najmanje sadrzano 2 broja nije receno zadatkom nista
		 * za najmanji broj slova tako da je moguce da password bude samo od
		 * brojeva
		 */
		if ((counter1 + counter2) == characters.length && counter1 > 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		// kreiramo skene
		Scanner input = new Scanner(System.in);
		// provera unosa
		boolean continueInput = true;

		// varijabla za password
		String password = "";
		// provera za unos password da li ispravan
		while (continueInput) {
			System.out.print("Enter password:\n");
			password = input.next();
			// prosledjujemo u metodi jesu li ispunjeni svi trazeni uslovi i na
			// osnovu toga ispisi
			if (password(password)) {
				System.out.println("Password is valid!!!");
				// u slucaju da je validan zaustavi petlju inace nastavi
				continueInput = false;
			} else {
				System.out.println("Password is not valid!!!");
				continueInput = true;
			}
		}
		// zaustavi unos
		input.close();
	}

}
