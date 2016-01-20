/*2. Napisati program koji ispisuje sve prijestupne godine, 
10 po liniji, u rasponu godina koje korisnik unese. Program 
pita korisnika da unese pocetnu godinu, krajnju godinu te 
ispisuje sve godine u tom rasponu. Razmak izmedu godina 
treba biti jedan space.*/
package zadaci_20_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2PrestupneGodine {

	public static void main(String[] args) {
		// skener
		Scanner input = new Scanner(System.in);
		// varijabla za pocetnu i krajnju godinu
		int startYear = 0;
		int endYear = 0;
		// varijabla za proveru unosa
		boolean checkingEntry1 = true;
		// provera unosa za godine
		while (checkingEntry1) {
			System.out.println("Enter the start and end year separate space: ");
			try {
				startYear = input.nextInt();
				endYear = input.nextInt();
				// provera je li godina u minusu
				if (startYear > 0 && endYear > 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("Year can not be negative!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Again: ");
				input.nextLine();
			}
		}
		// brojac za ispis u jednom redu
		int counter = 1;
		System.out.println("Leap years are:");
		// ispisi sve godine ako je zadovoljen uslov u ifu
		for (int i = startYear; i <= endYear; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				// provera je li ispisano 10 u jednom redu
				if (counter == 10) {
					System.out.printf("%10d\n", i);
					counter = 1;
				} else {
					System.out.printf("%10d", i);
					counter++;
				}
			}

		}
		// zaustavljamo unos
		input.close();
	}
}
