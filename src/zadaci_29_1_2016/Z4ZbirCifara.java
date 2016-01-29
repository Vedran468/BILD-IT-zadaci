/*4. Napisati metodu koja izracunava zbir svih brojeva u cijelom broju. 
Koristite sljedeci header: 
	public static int sumDigits(long n). 
Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 
() metoda treba da vrati 9. (2 + 3 + 4 = 9)*/
package zadaci_29_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4ZbirCifara {

	public static int sumDigits(long n) {
		int result = 0;
		do {
			// varijabla za cifre
			long decimals = n % 10;
			// cifru dodajemo resultatu
			result += (int) (decimals);
			// otpisujemo decimalu
			n /= 10;
		} while (n != 0);
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		// provera je li korisnik uneo broj
		while (continueInput) {
			System.out.println("Enter the number of long: ");
			try {
				int n = input.nextInt();
				// ako je broj veci od 0
				if (n > 0) {
					// prolsedujemo u metodu
					System.out.println("Sum of the digits of the number " + n + " is " + sumDigits(n) + ".");
					// zaustavljamo petlju
					continueInput = false;
				} else {
					System.out.println("Enter a number greater than 0!!!");
				}

			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// zaustavljamo unos
		input.close();
	}

}
