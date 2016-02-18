/*(Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
a calendar for a specified month using the Calendar and GregorianCalendar
classes. Your program receives the month and year from the command line.
You also can run the program without the year. In this case, the year is the current
year. If you run the program without specifying a month and a year, the month is
the current month.*/
package zadaci_18_2_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1TestKalendar {

	public static void main(String[] args) {
		// objekat klase kalendar
		Calendar c = new GregorianCalendar();
		// pomocni string za pretvaranje trenutnog datuma u string
		String s = c.getTime() + "";
		// varijabla za godinu
		int year = Integer.parseInt((s.charAt(s.length() - 4) +""+ s.charAt(s.length() - 3) +""+ s.charAt(s.length() - 2)
				+""+ s.charAt(s.length() - 1)) + "");

		// objekat klase kalendar
		Z1Kalendar k = new Z1Kalendar();
		// kreiramo skene
		Scanner input = new Scanner(System.in);

		// varijabla za izbor
		int choice = 0;
		// nastavi unos varijable za proveru je li korisniik uneo tacno podatak
		boolean continueInput = true;

		// provera unosa
		while (continueInput) {
			System.out.print("View calendar. \nEnter 1 to set the year and month,"
					+ "\n2 for only one year (the current month) for only \n3 month (current year), "
					+ "\n4 to display the current month and year: ");
			try {
				choice = input.nextInt();
				// unos dozvoljen od 1 do 10000
				if (choice > 0 && choice < 5) {
					// ako je tacan zustavi petlju
					continueInput = false;
				}
				// u slucaju greske
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}

		// ponistavanje varijable za proveru unosa
		continueInput = true;
		// ako je izbor 1
		if (choice == 1) {

			// provera je li korisnik uneo celi broj za godinu broj
			while (continueInput) {
				System.out.print("Enter full year (e.g., 2012): ");
				try {
					year = input.nextInt();
					// unos dozvoljen od 1 do 10000
					if (year > 0 && year < 10000) {
						// ako je tacan zustavi petlju
						continueInput = false;
					}
					// u slucaju greske
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: an integer is required)");
					input.nextLine(); // Discard input, odbaci predhodni unos
				}
			}
			// ponistavanje varijable za proveru unosa
			continueInput = true;
			// varijabla za mesec
			int month = 0;
			// provera za unos meseca da li ispravab
			while (continueInput) {
				System.out.print("Enter month as a number between 1 and 12: ");
				try {
					month = input.nextInt();
					// dozvoljeno uneti samo brojeve od 1 do 12
					if (month > 0 && month <= 12) {
						// zaustavi petlju
						continueInput = false;
					}
					// u slucaju greske
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: an integer is required)");
					input.nextLine(); // Discard input, odbaci predhodni unos
				}
			}

			System.out.println();
			// preko objekata klse pozivamo metodu za prikaz kalendara
			k.printMonth(year, month);
			// ako je izbor 2
		} else if (choice == 2) {

			// provera je li korisnik uneo celi broj za godinu broj
			while (continueInput) {
				System.out.print("Enter full year (e.g., 2012): ");
				try {
					year = input.nextInt();
					// unos dozvoljen od 1 do 10000
					if (year > 0 && year < 10000) {
						// ako je tacan zustavi petlju
						continueInput = false;
					}
					// u slucaju greske
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: an integer is required)");
					input.nextLine(); // Discard input, odbaci predhodni unos
				}
			}

			System.out.println();
			// preko objekata klse pozivamo metodu za prikaz kalendara
			k.printMonth(year, Calendar.MONTH);

			// ako je izbor 3
		} else if (choice == 3) {

			// varijabla za mesec
			int month = 0;
			// provera za unos meseca da li ispravab
			while (continueInput) {
				System.out.print("Enter month as a number between 1 and 12: ");
				try {
					month = input.nextInt();
					// dozvoljeno uneti samo brojeve od 1 do 12
					if (month > 0 && month <= 12) {
						// zaustavi petlju
						continueInput = false;
					}
					// u slucaju greske
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: an integer is required)");
					input.nextLine(); // Discard input, odbaci predhodni unos
				}
			}
			System.out.println();

			// preko objekata klse pozivamo metodu za prikaz kalendara
			k.printMonth(year, month);

			// ako je izbor 4
		} else {
			System.out.println();
			// preko objekata klse pozivamo metodu za prikaz kalendara
			k.printMonth(year, Calendar.MONTH);

		}
		// zaustavi unos
		input.close();
	}

}
