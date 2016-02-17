/*(Shuffle ArrayList) Write the following method that shuffles an ArrayList of
numbers:
public static void shuffle(ArrayList<Number> list)*/
package zadaci_17_2_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4MesanjeBrojeva {
	
	// METODA PRIMA I INT I DOUBLE TIP PODATKA
	public static void shuffle(ArrayList<Number> list){
		// mesamo brojeve
		Collections.shuffle(list);
		// stampamo rezultat
		System.out.println("\nThe numbers are mixed up:");
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
					if(u!=0){
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
		shuffle(list);
	}

}
