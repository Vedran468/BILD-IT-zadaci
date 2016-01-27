/*5. Pretpostavimo da kupujemo rizu ili neki drugi proizvod u dva razlicita pakovanja. 
Zelimo napisati program koji uporeduje cijene ta dva pakovanja. Program pita 
korisnika da unese teznu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.*/
package zadaci_27_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5CenaPakovanja {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// korisnikov unos za tezine i cene
		double weightProduct1 = 0;
		double weightProduct2 = 0;
		double price1 = 0;
		double price2 = 0;
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		boolean checkingEntry4 = true;
		// radi dok unos1 ne bude broj
		while (checkingEntry1) {
			System.out.println("Enter the weight of the first product in [kg]: ");
			try {
				weightProduct1 = input.nextDouble();
				// provera je li pozitivan
				if (weightProduct1 >= 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("Should be greater than 0!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		// radi dok unos2 ne bude broj
		while (checkingEntry2) {
			System.out.println("Enter the weight of another product in [kg]: ");
			try {
				weightProduct2 = input.nextDouble();
				// provera je li pozitivan
				if (weightProduct2 >= 0) {
					checkingEntry2 = false;
				} else {
					System.out.println("Should be greater than 0!!!");
					checkingEntry2 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		// radi dok unos3 ne bude broj
		while (checkingEntry3) {
			System.out.println("Enter the price of the first product in [KM]: ");
			try {
				price1 = input.nextDouble();
				// provera je li pozitivan
				if (price1 >= 0) {
					checkingEntry3 = false;
				} else {
					System.out.println("Should be greater than 0!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		// provera za unos4 je li broj
		while (checkingEntry4) {
			System.out.println("Enter the price of another product in [KM]: ");
			try {
				price2 = input.nextDouble();
				// provera je li pozitivan
				if (price2 >= 0) {
					checkingEntry4 = false;
				} else {
					System.out.println("Should be greater than 0!!!");
					checkingEntry4 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// definisemo koje je vece pakovanje i cija je cena ceca
		double maxWeight = weightProduct1;
		double minWeight = weightProduct2;
		double maxPrice = price1;
		double minPrice = price2;
		// ako je obrnuto obrni vrednosti, glavni parametar mi je kolicina
		if (maxWeight < weightProduct2) {
			maxWeight = weightProduct2;
			minWeight = weightProduct1;
			maxPrice = price2;
			minPrice = price1;
		}
		// pomocna varijabla koja racuna razliku u tezini
		double x = maxWeight - minWeight;
		// pomocna varijabla koja racuna razliku u ceni
		double y = maxPrice - minPrice;
		// varijabla koja racuna razliku dva proizvoda
		double difference = y - x;
		// stampamo rezultat
		System.out.println("Of the products of " + weightProduct1 + "[kg] packages priced from " + price1
				+ "[KM] and products of " + weightProduct2 + "[kg] packages priced at " + price2 + "[km]:\n");
		// ako je razlika manja od 0 bolja je prva varijanta
		if (difference > 0) {
			System.out.println("Better packaging is " + weightProduct1 + "[kg] and the price " + price1 + "[KM]");
		} else {
			// inace druga
			System.out.println("Better packaging is " + weightProduct2 + "[kg] and the price " + price2 + "[KM]");
		}
	}

}
