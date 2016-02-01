/*4. Napisati metodu sa sljedecim headerom: 
	public static String format(int number, int width) 
koja vraca string broja sa prefiksom od jedne ili vise nula. 
Velicina stringa je width argument. Na primjer, ukoliko 
pozovemo metodu format(34, 4) metoda vraca 0034, 
ukoliko pozovemo format(34, 5) metoda vraca 00034. 
Ukoliko je uneseni broj veci nego width argument, 
metoda vraca samo string broja. Npr. ukoliko pozovemo 
format(34, 1) metoda vraca 34.*/
package zadaci_1_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4FormatString {

	public static String format(int number, int width) {
		// string ko0ji se vraca
		String result = "";
		// brojac
		int counter = 0;
		// varijabla oja pamti orginalni broj
		int n = number;
		// provera je li broj pozitivan
		if (number > 0) {
			// prebrojavanje cifri
			do {
				number /= 10;
				counter++;
			} while (number != 0);
			// provera je li dobijena sirina veca od brojaca cifri
			if (width > counter) {
				// ako jeste njihova razlika je broj nula
				int limit = width - counter;
				for (int i = 0; i < limit; i++) {
					result += "0";
				}
			}
			// na kraju dodaj dobijeni broj
			result += n + "";
			// ako je broj negativan
		} else {

			// pretvaramo broj u pozitivan u slucaju da korisnik unese negativan
			// jedan broj za proveru drugi da se pamti
			int n1 = (short) Math.abs(number);
			int n2 = (short) Math.abs(number);
			// prebrojvanje cifri
			do {
				n1 /= 10;
				counter++;
			} while (n1 != 0);

			// provera je li dobijena sirina veca od brojaca cifri
			if (width > counter) {
				// ako jeste njihova razlika je broj nula
				int limit = width - counter;
				for (int i = 0; i < limit; i++) {
					result += "0";
				}
			}
			// na kraju dodaj dobijeni broj
			result += n2 + "";

		}
		// ako je broj negativan dodaj isper -
		if (number < 0) {
			result = "-" + result;
			return result;
		} else {
			return result;

		}
	}

	public static void main(String[] args) {
		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// korisnikov broj
		int number = 0;
		int width = 0;
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;

		// radi dok unos1 ne bude broj
		while (checkingEntry1) {
			System.out.println("Enter the number: ");
			try {
				number = input.nextInt();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// radi dok unos2 ne bude broj
		while (checkingEntry2) {
			System.out.println("Enter the width: ");
			try {
				width = input.nextInt();
				// provera je li broj veci od 0
				if (width > 0) {
					checkingEntry2 = false;
				} else {
					System.out.println("Width should be greater than 0!!!");
					checkingEntry2 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// zatvaramo unos
		input.close();
		// stampamo resenje
		System.out.println("For the number " + number + " and Width of " + width + " formatted number is "
				+ format(number, width) + ".");

	}

}
