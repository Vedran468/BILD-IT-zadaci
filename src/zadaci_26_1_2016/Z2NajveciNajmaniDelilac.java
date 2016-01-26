/*2. Napisati program koji pita korisnika da unese dva cijela, pozitivna  
broja te ispisuje najveci i najmanji zajednicki djelilac za ta dva broja.*/
package zadaci_26_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2NajveciNajmaniDelilac {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// korisnikov unos za dva broja
		int number1 = 0;
		int number2 = 0;
		// varijabla za veci broj od 2 korisnikova
		int max = 0;
		// varijable za najmanji i najveci zajednicki delilac
		int least = 0;
		int biggest = 0;
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// radi dok unos1 ne bude celi broj
		while (checkingEntry1) {
			System.out.println("Enter first integer: ");
			try {
				number1 = input.nextInt();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// radi dok unos2 ne bude celi broj
		while (checkingEntry2) {
			System.out.println("Enter the second integer: ");
			try {
				number2 = input.nextInt();
				checkingEntry2 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// smestamo korisnikov unos da se ne promeni
		int finalNumber1 = number1;
		int finalNumber2 = number2;
		// ako je broj u minusu pretvoriga u plus radi provere delilaca
		if (number1 < 0) {
			number1 = number1 * (-1);
		} else if (number2 < 0) {
			number2 = number2 * (-1);
		}
		// proveri koji je veci broj i njega postavi kao maksimalni
		if (number1 >= number2) {
			max = number1;
		} else {
			max = number2;
		}
		// for ide od 2 jer je svaki broj deljiv sa 1, do maksimalnog broja
		for (int i = 2; i <= max; i++) {
			// ako je i deljivo bez ostatka sa prvim i drugim brojem
			if (number1 % i == 0 && number2 % i == 0) {
				// definisi najmanji zajednicki delilac i zaustavi petlju
				least = i;
				break;
			}
		}
		// for ide od 2 jer je svaki broj deljiv sa 1, do maksimalnog broja
		for (int i = 2; i <= max; i++) {
			// ako je i deljivo bez ostatka sa prvim i drugim brojem
			if (number1 % i == 0 && number2 % i == 0) {
				// postavi ga kao najveci zajednicki delilac i nastavi petlju
				biggest = i;
			}
		}
		// ako su obadva unos pozitivna ili negativna ispisi rezultat
		if ((finalNumber1 >= 0 && finalNumber2 >= 0) || (finalNumber1 < 0 && finalNumber2 < 0)) {
			System.out.println("For numbers " + finalNumber1 + " and " + finalNumber2 + ", the minimum divisor is "
					+ least + ", and the highest divisor shall be " + biggest + ".");
		} else {
			// inace ispisi ovaj rezultat
			System.out.println("For numbers " + finalNumber1 + " and " + finalNumber2 + ", the minimum divisor is -"
					+ least + ", and the highest divisor shall be -" + biggest + ".");
		}
	}
}