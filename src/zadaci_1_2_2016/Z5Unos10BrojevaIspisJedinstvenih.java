/*5. Napisati program koji ucitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva 
unijeto te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
Ukoliko se neki broj pojavljuje vise puta, broj treba ispisati samo jednom.*/
package zadaci_1_2_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5Unos10BrojevaIspisJedinstvenih {

	public static void main(String[] args) {

		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// niz za korisnikov unos
		double[] array = new double[10];
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
					array[counter] = input.nextDouble();
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
		// ponistavamo brojac
		counter = 0;
		// definisemo listu jednistvenih brojeva
		ArrayList<Double> result = new ArrayList<>();

		// uporedjujemo da li se nalaze dupli brojevi
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < result.size(); j++) {
				if (array[i] == result.get(j)) {
					// ako da povecaj brojac
					counter++;
				}
			}
			// ako je brojac 0 znaci nije dupli broj dodaj ga u listu
			if (counter == 0) {
				result.add(array[i]);
			}
			// ponisti brojac
			counter = 0;
		}
		// stampamo rezultat
		System.out.println("Unique numbers are:");
		System.out.println(result);
	}

}
