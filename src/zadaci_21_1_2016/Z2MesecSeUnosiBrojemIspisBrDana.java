/*2. Napisati program koji pita korisnika da unese mjesec i godinu te mu 
ispise broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese 
kao godinu 2012 a kao mjesec 2, program treba ispisati da je 
Februar 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 
2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. */

package zadaci_21_1_2016;
/**
 * @author Vedran Vidakovic
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Z2MesecSeUnosiBrojemIspisBrDana {

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
		// varijabla za mesec
		int month = 0;
		// provera za unos meseca da li ispravan
		while (continueInput2) {
			System.out.print("Enter month as a number between 1 and 12: ");
			try {
				month = input.nextInt();
				// dozvoljeno uneti samo brojeve od 1 do 12
				if (month < 0 || month > 12) {
					// zaustavi petlju
					continueInput2 = true;

				} else {
					// inace nastavi raditi petlja
					continueInput2 = false;
				}
				// u slucaju greske
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}

		// naziv meseca u slucaju da je 1 Januaar, 2...
		String monthName = "";
		switch (month) {
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

		// broj dana  u zavisnosti dobijenog meseca
		int numberDays = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			numberDays = 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			numberDays = 30;
		if (month == 2) {
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
