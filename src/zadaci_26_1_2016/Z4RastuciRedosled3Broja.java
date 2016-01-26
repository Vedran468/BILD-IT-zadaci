/*4. Napisati program koji pita korisnika da unese 3 cijela broja 
te mu ispise ta ista tri broja u rastucem redosljedu. 
	Bonus: 
	Napisati metodu koja prima tri cijela broja kao argumente te 
vraca brojeve u rastucem redosljedu. */
package zadaci_26_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z4RastuciRedosled3Broja {
	public static int[] sort(int n1, int n2, int n3) {
		// brojeve stavljamo u niz, sortiramo niz, i metoda ga vraca
		int[] sort = { n1, n2, n3 };
		java.util.Arrays.sort(sort);
		return sort;

	}

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// korisnikov unos za tri broja
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		// radi dok unos1 ne bude celi broj
		while (checkingEntry1) {
			System.out.println("Enter first integer: ");
			try {
				number1 = input.nextInt();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// radi dok unos2 ne bude celi broj
		while (checkingEntry2) {
			System.out.println("Enter the second integer: ");
			try {
				number2 = input.nextInt();
				checkingEntry2 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// radi dok unos3 ne bude celi broj
		while (checkingEntry3) {
			System.out.println("Enter the third integer: ");
			try {
				number3 = input.nextInt();
				checkingEntry3 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// brojeve sortiramo preko metode
		int[] sort = sort(number1, number2, number3);
		// stampamo rezultat iz metoode
		System.out.println("Sorted numbers in the method  are: " + sort[0] + ", " + sort[1] + ", " + sort[2] + ".");
		// prikaz posle metode da korisnikovi brojevi nisu sortirani
		System.out.println(
				"Numbers: " + number1 + ", " + number2 + " and " + number3 + ". Sorted numbers in the program are: ");
		// brojeve stavljamo u niz i sortiramo ih
		int[] array = { number1, number2, number3 };
		java.util.Arrays.sort(array);
		// stampamo brojeve sortirane u programu
		System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ".");
	}

}
