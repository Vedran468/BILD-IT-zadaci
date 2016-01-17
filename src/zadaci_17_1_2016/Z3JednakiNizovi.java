/*3. Nizovi niz1 i niz2 su striktno identicni ukoliko su svi 
njihovi elementi na istim pozicijama jednaki. Napisati 
metodu koja vraca true ukoliko su nizovi niz1 i niz2 
striktno identicni. Koristiti sljedeci header:

public static boolean equals(int[ ] niz1, int[ ] niz2)

Napisati testni program koji pita korisnika da unese dva 
niza cijelih brojeva te provjerava da li su striktno identicni.*/
package zadaci_17_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z3JednakiNizovi {
	public static boolean equals(int[] niz1, int[] niz2) {
		// proci kroz nizove
		for (int i = 0; i < niz1.length; i++) {
			// ako je neki element razlicit ivarti false
			if (niz1[i] != niz2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		// pravimo skener
		Scanner input = new Scanner(System.in);
		// velicina niza
		int number = 0;
		// nastavi unos varijable za proveru da li je korisniik uneo broj
		boolean continueInput = true;

		// provera je li korisnik uneo broj za velicinu niza
		while (continueInput) {
			System.out.println("How many elements in the two array you want");
			try {
				number = input.nextInt();
				// zaustavljamo petlju
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}

		// prvi niz
		int[] niz1 = new int[number];
		System.out.println("Enter " + number + " element for 1. array: ");

		// unosimo brojeve u niz 1
		for (int i = 0; i < number; i++) {

			// nastavi unos varijable za proveru da li je korisniik uneo broj
			boolean continueInput1 = true;

			// provera je li korisnik uneo broj za niz 1
			while (continueInput1) {
				try {
					niz1[i] = input.nextInt();
					// zaustavljamo petlju
					continueInput1 = false;
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: an integer is required)");
					input.nextLine(); // Discard input, odbaci predhodni unos
				}
			}
		}
		System.out.println("Enter " + number + " element for 2. array: ");
		// niz 2
		int[] niz2 = new int[number];
		// unosimo elemente u niz 2
		for (int i = 0; i < number; i++) {

			// nastavi unos varijable za proveru da li je korisniik uneo broj
			boolean continueInput2 = true;

			// provera je li korisnik uneo broj za niz 2
			while (continueInput2) {
				try {
					niz2[i] = input.nextInt();
					// zaustavljamo petlju
					continueInput2 = false;
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: an integer is required)");
					input.nextLine(); // Discard input, odbaci predhodni unos
				}
			}
		}
		// stampamo rezultat
		System.out.println((equals(niz1, niz2)) ? "Two array are equal!!!" : "Two array are not equal!!");
		input.close();
	}

}
