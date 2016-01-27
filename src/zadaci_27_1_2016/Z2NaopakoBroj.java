/*2. Napisite metodu sa sljedecim headerom koja vraca naopako 
ispisan broj koji joj je proslijeden kao argument: 
	public static void reverse(int number). 
Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji 
pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.*/
package zadaci_27_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z2NaopakoBroj {
	public static void reverse(int number) {
		// definisemo varijablu za broj naopako
		int reverse = 0;
		// varijabla koja pamti dobijeni broj
		int num = number;
		
		do {
			// varijabla za  cifre 
			int decimals = number % 10;
			// cifru dodajemo unazad broju
			reverse = reverse*10+ decimals;
			// otpisujemo decimalu
			number = number / 10;
		} while (number != 0);
		System.out.println("Number " + num + " reverse is " + reverse + ".");
	}

	public static void main(String[] args) {

		// skener za unos
				Scanner input = new Scanner(System.in);
				// korisnikov unos za broj
				int number = 0;
				// provera unosa
				boolean checkingEntry = true;
				// radi dok unos1 ne bude broj
				while (checkingEntry) {
					System.out.println("Enter an integer: ");
					try {
						number = input.nextInt();
							checkingEntry = false;
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the integer: ");
						input.nextLine();
					}
				}
				// zatvaramo unos
				input.close();
				// broj prosledjujemo metodi
				reverse(number);
	}

}
