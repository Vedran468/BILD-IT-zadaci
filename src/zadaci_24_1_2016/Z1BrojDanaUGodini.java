/*1. Napisati metodu koja vraca broj dana u godini. Metoda koristi sljedeci header: 
	public static int numberOfDayInAYear(int year). 
Napisati program koji pita korisnika da unese pocetnu godinu, 
krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.*/
package zadaci_24_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z1BrojDanaUGodini {
	public static int numberOfDayInAYear(int year) {
		int dayInYear = 0;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			dayInYear = 366;
		} else {
			dayInYear = 365;
		}
		return dayInYear;
	}

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// provera za dva unosa tj pocetne i krajnje godine
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// pocetna godina
		int startingYear = 0;
		// krajnja godina
		int endYear = 0;

		// radi dok unos ne bude tacan za pocetnu godinu
		while (checkingEntry1) {
			System.out.println("Enter the starting year: ");
			try {
				startingYear = input.nextInt();
				// provera je li korisnik uneo broj veci od 0
				if (startingYear > 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("Year must be greater than 0!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// radi dok unos ne bude tacan za krajnju godinu
		while (checkingEntry2) {
			System.out.println("Enter the end year: ");
			try {
				endYear = input.nextInt();
				// provera je li korisnik uneo broj veci od 0
				if (endYear > 0) {
					checkingEntry2 = false;
				} else {
					System.out.println("Year must be greater than 0!!!");
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
		// ispisujemo rezultat
		for (int i = startingYear; i <= endYear; i++) {
			System.out.println("Year " + i + " has " + numberOfDayInAYear(i) + " days");
		}
	}

}
