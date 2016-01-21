/*3. Napisati program koji pita korisnika da unese godinu i prva tri slova 
imena mjeseca (prvo slovo uppercase) te mu ispise broj dana u tom 
mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao 
mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.*/
package zadaci_21_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3MesecSeUnosiImenomIspisBrDana {

	public static void main(String[] args) {

		// kreiramo skene
		Scanner input = new Scanner(System.in);
		// nastavi unos varijable za proveru je li korisniik uneo ceo broj
		boolean continueInput1 = true;
		boolean continueInput2 = true;
		// varijabla za godinu
		int year = 0;
		// provera je li korisnik uneo celi broj za godinu broj
		while (continueInput1) {
			System.out.print("Enter full year (e.g., 2012): ");
			try {
				year = input.nextInt();
				// unos dozvoljen od 1
				if (year < 0) {
					System.out.println("Year can not be negative!!!");
					// ako je tacan zustavi petlju
					continueInput1 = true;

				} else {
					// inace petlja nastavalj sa radom
					continueInput1 = false;
				}
				// u slucaju greske
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// mesec ali kao broj npr Jan je 1 ...
		int intMonth = 0;
		// niz imena dozvoljenih za unos
		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		// varijabla za mesec koji korisnik unese
		String month = "";
		// provera za unos meseca da li ispravan
		while (continueInput2) {
			System.out.print("For the month, enter one of these:\n " + "\"Jan\", " + "\"Feb\", " + "\"Mar\", "
					+ "\"Apr\", " + "\"May\", " + "\"Jun\", " + "\"Jul\", " + "\"Aug\", " + "\"Sep\", " + "\"Oct\", "
					+ "\"Nov\", " + "\"Dec\":\n ");
			month = input.next();
			// brojac koji sluzi za proveru da li je bilo unosa kau u nizu
			int counter = 0;
			// provera unosa sa nizom
			for (int i = 0; i < months.length; i++) {
				// ako je jednak unos elementu niza
				if (month.equals(months[i])) {
					// povecaj brojac
					counter++;
					// definisi broj za mesec
					intMonth = (i + 1);
				}
			}
			// ako je brojac 1
			if (counter == 1) {
				// zaustavi petljuinace nastavi sa unosom
				continueInput2 = false;
			} else {
				// nastavi sa petljom
				continueInput2 = true;
			}
		}

		// naziv meseca u slucaju da je 1 za Januar, 2...
		String monthName = "";
		// provera koji je broj dobijen 
		switch (intMonth) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}

		// broj dana u zavisnosti dobijenog meseca u obliku broja
		int numberDays = 0;
		if (intMonth == 1 || intMonth == 3 || intMonth == 5 || intMonth == 7 || intMonth == 8 || intMonth == 10
				|| intMonth == 12)
			numberDays = 31;
		if (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11)
			numberDays = 30;
		if (intMonth == 2) {
			// ako je prestupna godina 2. mesec ima 29 inace 28
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				numberDays = 29;
			} else {
				numberDays = 28;
			}
		}
		// zaustavljamo unos
		input.close();
		// stampamo resenje
		System.out.println(monthName + " " + year + " has/have " + numberDays + " days.");
	}
}
