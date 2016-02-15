/*(OutOfMemoryError) Write a program that causes the JVM to throw an
OutOfMemoryError and catches and handles this error.*/
package zadaci_15_2_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2IzuzetakPrekoracenjeMemorije {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// definisemo da je trenutna velicina niza maksimalni int broj
		int size = Integer.MAX_VALUE;

		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla
		boolean continueInput = true;
		// korisnikov broj
		int n = 0;
		// provera koja velicina niza je dobra
		while (continueInput) {
			try {
				System.out.println("Reduce the size of the array, is currently " + size
						+ ".\n(Number of them with whom to share that size is reasonable!)");
				n = input.nextInt();
				// smanjujemo velicinu niza za broj korisnika
				size /= n;
				int[] array = new int[size];
				continueInput = false;
				// u slucaju greske
			} catch (OutOfMemoryError e) {
				System.out.println("Try a different number.");
			}
		}
		// zatvaramo unos
		input.close();
		// stampamo rezultat velicine
		System.out.println("The size of array is good and is " + size + ".");
	}

}
