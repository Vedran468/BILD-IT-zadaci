/*(The Time class) Design a class named Time. The class contains:
- The data fields hour, minute, and second that represent a time.
- A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
- A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
- A constructor that constructs a Time object with the specified hour, minute,
and second.
- Three getter methods for the data fields hour, minute, and second,
respectively.
- A method named setTime(long elapseTime) that sets a new time
for the object using the elapsed time. For example, if the elapsed time is
555550000 milliseconds, the hour is 10, the minute is 19, and the second is
10.
Draw the UML diagram for the class and then implement the class. Write
a test program that creates two Time objects (using new Time() and new
Time(555550000)) and displays their hour, minute, and second in the format
hour:minute:second.
(Hint: The first two constructors will extract the hour, minute, and second
from the elapsed time. For the no-arg constructor, the current time can be
obtained using System.currentTimeMillis(), as shown in Listing 2.7,
ShowCurrentTime.java.)*/
package zadaci_6_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1TestVremeUnosKorisnikov {

	// da izbegnemo to sto objekti nisu pozvali ni jednu metodu postavljamo
	// potisni upozorenje neiskoristen
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		// za unos sta minuta sekundi i ili milisekundi i prvera sta unosi
		int h = 0;
		int m = 0;
		int s = 0;
		int check = 0;
		long milliseconds = 0;

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		boolean checkingEntry4 = true;

		// provera sta korisnik zeli uneti
		while (checkingEntry1) {
			System.out.println(
					"If you want current time enter 1, 2 input of your time," + " and 3 milliseconds for input:");
			try {
				check = input.nextInt();
				// uzavisnosti od toga sta je korisnik uneo izvrsi
				if (check == 1 || check == 2 || check == 3) {
					checkingEntry1 = false;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// u zavisnosti od tga sta zeli kreiramo konstruktor
		if (check == 1) {
			// pravimo objekat klsae vreme
			Z1Vreme t = new Z1Vreme();
		} else if (check == 2) {
			// provera unosa za sate
			while (checkingEntry2) {
				System.out.println("Enter hours: ");
				try {
					h = input.nextInt();
					if (h >= 0) {
						checkingEntry2 = false;
					} else {
						System.out.println("Should be greater than 0!!!");
						checkingEntry2 = true;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the integer: ");
					input.nextLine();
				}
			}
			// provera unosa za minute
			while (checkingEntry3) {
				System.out.println("Enter minutes: ");
				try {
					m = input.nextInt();
					if (m >= 0) {
						checkingEntry3 = false;
					} else {
						System.out.println("Should be greater than 0!!!");
						checkingEntry3 = true;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the integer: ");
					input.nextLine();
				}
			}
			// provera unosa sekundi
			while (checkingEntry4) {
				System.out.println("Enter the second: ");
				try {
					s = input.nextInt();
					if (s >= 0) {
						checkingEntry4 = false;
					} else {
						System.out.println("Should be greater than 0!!!");
						checkingEntry4 = true;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the integer: ");
					input.nextLine();
				}
			}
			// kreiramo objekat
			Z1Vreme t = new Z1Vreme(h, m, s);
		} else if (check == 3) {
			// provera unosa sekundi
			while (checkingEntry4) {
				System.out.println("Enter the milliseconds: ");
				try {
					milliseconds = input.nextInt();
					if (milliseconds >= 0) {
						checkingEntry4 = false;
					} else {
						System.out.println("Should be greater than 0!!!");
						checkingEntry4 = true;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the integer: ");
					input.nextLine();
				}
				// kreiramo objekat
				Z1Vreme t = new Z1Vreme(milliseconds);
			}
		}
		// zatvaramo unos
		input.close();
	}

}
