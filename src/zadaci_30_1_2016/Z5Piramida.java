/*5. Napisati program koji pita korisnika da unese cijeli broj te ispisuje 
piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7 
vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 
3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)*/
package zadaci_30_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z5Piramida {

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// korisnikov unos
		int number = 0;
		// nastavi unos varijabla za proveru je korisniik uneo ceo broj
		boolean continueInput = true;
		// provera je li korisnik uneo celi broj
		while (continueInput) {
			System.out.println("To what number you want pyramid: ");
			try {
				number = input.nextInt();
				// ako je broj veci od 0
				if (number > 0) {
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
		// definisemo varijablu koja pamti koji je broj unesen
		int n = number;
		// brojac koji je potreban za pomeranje trokuta od 1 do 9 kada korisnik
		// unese broj veci od 9
		int counter = 10;
		// broj praznih polja za koje treba pomeriti ttrokut od 1 d0 9 ako je
		// unos preko 9
		int b = 5;
		// povecavamo iz za dva ako je korisnik uneo vise od 10
		if (n > 10) {
			while (counter != n) {
				counter++;
				b = b + 2;
			}
		}
		// brojevi trokuta krecu od 1
		int j = 1;
		// radimo dok broj ne bude 0
		while (number != 0) {
			// u slucaju da je korisnik uneo ispod 10 broj
			if (n < 10) {
				// ispisi trokut praznih polja do broj unosa
				for (int i = 0; i <= number; i++) {
					System.out.print("   ");
				}

				// ispisi levi trokut do 1
				for (int k = j; k > 0; k--) {
					System.out.print(k + " ");
				}
				// ako broj ispisa nije 1 ispisi desni trokut
				if (j != 1) {
					for (int i = 2; i <= j; i++) {
						System.out.print(i + " ");
					}
				}

				// u slucaju unosa veceg od 10
			} else {
				// za brojeve ispod 10
				if (j < 10) {

					// pomeri ih za definisano b
					for (int i = 0; i <= b; i++) {
						System.out.print(" ");
					}
					// plus formiraj trokut praznih polja u zavisnosti od
					// korisnikovog unosa
					for (int i = 0; i <= number; i++) {
						System.out.print("   ");
					}
					// u slucaju da je j vece od 9
				} else {
					// ispisi trokut praznih polja
					for (int i = 0; i <= number; i++) {
						System.out.print("     ");
					}
				}
				// ispisi levi trokut
				for (int k = j; k > 0; k--) {
					System.out.print(k + " ");
				}
				// ispisi ako j nije 1 desni trokut brojeva
				if (j != 1) {
					for (int i = 2; i <= j; i++) {
						System.out.print(i + " ");
					}
				}
			}
			// povecaj
			j++;
			// predji u novi red
			System.out.println();
			// smanji broj za 1
			number--;
		}
	}

}
