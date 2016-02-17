/*(Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
public static void sort(ArrayList<Number> list)*/
package zadaci_17_2_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5SortiranjeListeBrojeva {
	// METODA PRIMA I INT I DOUBLE TIP PODATKA
	public static void sort(ArrayList<Number> list) {
		// sortiramo listu
		Collections.shuffle(list);
		// stampamo rezultat
		System.out.println("\nSorted list is:");
		System.out.println(list);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// lista za korisnikov unos
		ArrayList<Number> list = new ArrayList<>();
		// korisnikov unos
		double u = 1;
		// provera unosa
		boolean checkingEntry = true;

		// petlja radi dok korisnik ne unese 10 brojeva
		while (u != 0) {
			System.out.println("Enter numbers, interrupt input 0 : ");
			// radi dok unos ne bude broj
			while (checkingEntry) {
				try {
					// IAKO METODA PRIMA I INT TIP PODTAKA STAVIO SAM DOUBLE
					u = input.nextDouble();
					checkingEntry = false;
					if (u != 0) {
						list.add(u);
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the number: ");
					input.nextLine();
				}
			}
			// ponistavamo za proveru unosa i povecava se brojac
			checkingEntry = true;

		}
		// zatvaramo unos
		input.close();
		// saljemo u metodu listu
		sort(list);
	}

}
