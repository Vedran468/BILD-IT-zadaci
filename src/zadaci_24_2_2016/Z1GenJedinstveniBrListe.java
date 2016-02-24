/*(Distinct elements in ArrayList) Write the following method that returns a new
ArrayList. The new list contains the non-duplicate elements from the original list.
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)*/
package zadaci_24_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Z1GenJedinstveniBrListe {

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// kreiramo listu koju metoda vraca
		ArrayList<E> result = new ArrayList<>();
		// definisemo brojac
		int counter = 0;
		// uporedjujemo da li se nalaze dupli brojevi
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < result.size(); j++) {
				if (list.get(i).equals(result.get(j))) {
					// ako da povecaj brojac
					counter++;
				}
			}
			// ako je brojac 0 znaci nije dupli broj dodaj ga u listu
			if (counter == 0) {
				result.add(list.get(i));
			}
			// ponisti brojac
			counter = 0;
		}
		return result;
	}

	public static void main(String[] args) {
		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// lista za korisnikov unos
		ArrayList<Double> list = new ArrayList<>();
		// brojac
		int counter = 0;
		// provera unosa
		boolean checkingEntry = true;

		System.out.println("Enter 10 numbers spaced single space: ");
		// petlja radi dok korisnik ne unese 10 brojeva
		while (counter != 10) {
			// radi dok unos ne bude broj
			while (checkingEntry) {
				try {
					list.add(input.nextDouble());
					checkingEntry = false;
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the number: ");
					input.nextLine();
				}
			}
			// ponistavamo za proveru unosa i povecava se brojac
			checkingEntry = true;
			counter++;

		}
		// zatvaramo unos
		input.close();

		// saljemo u metodu
		ArrayList<Double> result = removeDuplicates(list);
		// stampamo rezultat
		System.out.println("List without duplicates:");
		System.out.println(result);
	}
}
