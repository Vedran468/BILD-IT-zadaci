/*1. Napisati metodu koja prima 2 argumenta: pocetni broj i krajnji 
broj te printa sve proste brojeve u zadanom rangu.
BONUS: metoda moze primati i treci argument, broj brojeva 
za isprintati po liniji.*/
package zadaci_17_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1ProstBroj {

	public static void primeNumber(int start, int end, int line) {
		// brojac prostih brojeva
		int count = 0;

		// definisemo od kojeg do kojeg broja da se proveri ima li prostih
		for (int i = start; i <= end; i++) {
			// prvo i definisemo da je prost broj
			boolean isPrime = true;
			// proveravamo da li je prost broj
			for (int divisor = 2; divisor <= i / 2; divisor++) {
				/*
				 * Ako je broj deljiv sa deliocem bez ostatka broj nije prost
				 * zaustavi petlju for
				 */
				if (i % divisor == 0) {
					isPrime = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			// Ako je broj prost
			if (isPrime) {
				// Povecaj brojac
				count++;
				// Definisanje stampanja u jednom redu
				if (count % line == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);
		// nastavi unos varijable za proveru da li je korisniik uneo broj
		boolean continueInput = true;
		boolean continueInput2 = true;
		boolean continueInput3 = true;
		// definisemo varijable za tri trazena broja
		int start = 0;
		int end = 0;
		int line = 0;

		// provera je li korisnik uneo broj1
		while (continueInput) {
			System.out.println("Enter your starting number: ");
			try {
				start = input.nextInt();
				// zaustavljamo petlju
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// provera je li korisnik uneo broj2
		while (continueInput2) {
			System.out.println("Enter the the final number: ");
			try {
				end = input.nextInt();
				// zaustavljamo petlju
				continueInput2 = false;

			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni
									// unos
			}
		}

		// provera je li korisnik uneo broj1
		while (continueInput3) {
			System.out.println("Enter the number for printing in a row: ");
			try {
				line = input.nextInt();
				// zaustavljamo petlju
				continueInput3 = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci
									// predhodni unos
			}
		}
		// brojeve saljemo u metodu
		primeNumber(start, end, line);
		// zaustavljamo unos
		input.close();
	}
}
