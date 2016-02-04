/*(Stopwatch) Design a class named StopWatch. The class contains:
- Private data fields startTime and endTime with getter methods.
- A no-arg constructor that initializes startTime with the current time.
- A method named start() that resets the startTime to the current time.
- A method named stop() that sets the endTime to the current time.
- A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.*/
package zadaci_4_2_2016;

import java.util.InputMismatchException;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3TestStoperica {

	public static void main(String[] args) {

		// Kreiramo skener
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Kreiram objekat glavne klase time.
		Z3Stoperica time = new Z3Stoperica();
		System.out.println("Type 1 to start the time, and 0 to stop measuring time!!!");

		// Pravimo lokalnu varijablu koja ce imati incijalizaciuju korisnikovog
		// unosa.
		int stop = -1;

		// petlja radi dok korisnik ne unese 0.
		do {
			try {
				stop = input.nextInt();

				// Stoperica se pokrece ako je korisnikov unos 1.
				if (stop == 1) {
					time.start();

					// Stampamo: "Stoperica je pokrenuta, zaustavlajte je 0".
					System.out.println("The stopwatch is running, shut it 0 !!!");
					// Stoperica se zaustavlja ako korisnik unese 0.
				} else if (stop == 0) {
					time.stop();
				} else {
					System.out.println("Againl!!! Enter the 1 or 0: ");
				}
				// u lucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the 1 or 0: ");
				input.nextLine();
			}
			// I petlja prestaje sa radom ako korisnik unese 0.
		} while (stop != 0);
		// zaustavaljamo unos
		input.close();
		// Stampamo: "Vrijeme koje je proteklo iznosi:".
		System.out.println("The time that has elapsed is:\t" + time.getElapsedTime() + " secund/s.");
	}
}
