/*(Find the largest number in an array) Write a recursive method that returns the
largest integer in an array. Write a test program that prompts the user to enter a
list of eight integers and displays the largest element.*/
package zadaci_23_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z5NajveciBrNiza {

	// static data fields za indeks i najveci broj
	static int i = 0;
	static int max;

	public static int largestNumber(int[] array) {
		// ako je indeks karaktera veci od 0
		if (i < array.length) {
			// proveri je li karakter na tom indeksu jednak dobijenom karakteru
			if (array[i] > max) {
				max = array[i];
			}
			i++;
			largestNumber(array);
		}
		return max;
	}

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		// varijabla za proveru unosa
		boolean check = true;

		// indeks na kojem se smesta korisnikov unos
		int index = 0;
		// niz od 8 brojeva
		int[] array = new int[8];
		// radi dok se ne unese 8 brojeva
		System.out.println("Enter a list of eight integers and displays the largest element: ");
		while (index < 8) {
			// provera unosa
			while (check) {
				try {
					// smestamo unos u niz i povecavamo brojac
					array[index] = input.nextInt();
					index++;
					check = false;

					// u slucaju greske unosa
				} catch (InputMismatchException e) {
					System.out.println("Enter an integer: ");
					input.nextLine();
				}
			}
			// ponistavamo varijablu za unos
			check = true;
		}
		// zatvaramo unos
		input.close();

		// dodeljujemo da je maksimalni broj prvi broj
		max = array[0];
		// saljemo u metodu i stamapmo rezultat
		System.out.println("The largest number of array " + largestNumber(array) + ".");
	}
}
