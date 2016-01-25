/*4. Napisati program koji pita korisnika da unese broj minuta 
(npr. 1 milijardu) te ispise korisniku koliko je to u godinama i 
danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  */
package zadaci_25_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4MinuteUGodineIDane {

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// provera za unos minuta
		boolean checkingEntry = true;
		// varijabla za korisnikov unos
		long minute = 0;
		// radi dok unos ne bude tacan za minute
		while (checkingEntry) {
			System.out.println("Enter minute: ");
			try {
				minute = input.nextLong();
				// provera je li korisnik uneo broj veci od 0
				if (minute > 0) {
					checkingEntry = false;
				} else {
					System.out.println("Minute must be greater than 0!!!");
					checkingEntry = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the long integer: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();

		// varijabla za godinu
		int years = 0;
		// varijabla za minute koje ostanu kada se oduzme minute od godina, na
		// pocetku jednako korisnikovom unosu
		long finalMinute = minute;
		// petlja radi dok su minute manje od jedne godine od 365 dana
		while (finalMinute >= 525600) {
			// oduzimaj minute za jednu godinu od 365 dana
			finalMinute = finalMinute - 525600;
			// a povecaj brojac za godine
			years++;
		}
		// ostatak minuta podeli sa minutama jednog dana i tako dobijamo koliko
		// je to u danima ostatak minuta
		double days = (double) finalMinute / 1440;
		// stampamo rezultat
		System.out.print("For " + minute + " minutes, it is " + years + " year and ");
		System.out.printf("%4.2f day.", days);
	}

}
