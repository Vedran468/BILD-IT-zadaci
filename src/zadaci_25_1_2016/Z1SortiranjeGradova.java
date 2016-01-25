/*1. Napisati program koji pita korisnika da unese imena tri grada te ih ispise 
u abecednom redu. Na primjer, ukoliko korisnik unese 
Chicago, Los Angeles i Atlanta kao gradove, 
program vraca Atlanta, Chicago, Los Angeles.*/
package zadaci_25_1_2016;

import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z1SortiranjeGradova {

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		// za prvi grad da se unese i njega smestamo u varijablu
		System.out.println("Enter the name of the first city: ");
		String c1 = input.nextLine();
		// za drugi grad da se unese i njega smestamo u varijablu
		System.out.println("Enter a name for another city: ");
		String c2 = input.nextLine();
		// za treci grad da se unese i njega smestamo u varijablu
		System.out.println("Enter a name for the third city: ");
		String c3 = input.nextLine();
		// zatvaramko unos
		input.close();
		// unose smestamo u niz da bi smo mogli ih sortirati
		String[] array = { c1, c2, c3 };
		// sortiramo niz
		java.util.Arrays.sort(array);
		// ispisemo dobijeni sortirani niz
		System.out.println("Sorted by alphabet. cities are");
		System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ".");
	}

}
