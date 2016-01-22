/*1. Napisati program koji pita korisnika da unese cijeli broj za  
danasnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da 
unese broj dana nakon danasnjeg dana te mu ispise koji je to 
dan u buducnosti. (Primjer: ako korisnik unese 1 kao danasnji 
dan a 3 kao dan u buducnosti program mu ispisuje da je danas 
utorak a dan u buducnosti je petak.) */
package zadaci_22_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1BuduciDan {

	public static void main(String[] args) {

		// skener
		Scanner input = new Scanner(System.in);

		// korisnikov unos trenutni dan i buduci dan
		int currentDay = 0;
		int sinceDay = 0;
		// varijabla za rezultat
		String result = "";
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// lista sa nazivima dana
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		// radi dok unos ne bude tacan za trenutni dan
		while (checkingEntry1) {
			System.out.println("Enter the current date (0 on Sunday, 1 if the Tuesday, ... 6 if Sunday): ");
			try {
				currentDay = input.nextInt();

				// provera je li korisnik uneo broj od 0 do 6
				if (currentDay >= 0 && currentDay < 7) {

					checkingEntry1 = false;
				} else {
					System.out.println("Enter a number between 0 and 6!!!");
					checkingEntry1 = true;

				}

				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// radi dok unos ne bude tacan za buduci dan
		while (checkingEntry2) {
			System.out.println("Enter the code to find out " + "which day will be for as long flown on: ");
			try {
				sinceDay = input.nextInt();

				// provera je li korisnik uneo broj veci od 0
				if (sinceDay >= 0) {

					checkingEntry2 = false;
				} else {
					System.out.println("Day in the future can not be negative!!!");
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
		// provera koji je dan u buducnosti
		switch ((sinceDay + currentDay) % 7) {
		case 0:
			result = days[0];
			break;
		case 1:
			result = days[1];
			break;
		case 2:
			result = days[2];
			break;
		case 3:
			result = days[3];
			break;
		case 4:
			result = days[4];
			break;
		case 5:
			result = days[5];
			break;
		case 6:
			result = days[6];
			break;
		}

		// stampamo rezulta
		System.out.println("Today is " + days[currentDay] + " a day in the future is " + result + ".");
	}

}
