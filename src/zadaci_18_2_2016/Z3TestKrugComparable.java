/*(The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.*/

package zadaci_18_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z3TestKrugComparable {

	public static void main(String[] args) {
		// objekti klase
		Z3KrugComparable c1 = null;
		Z2Krug c2 = null;
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		// radisusi za 2 kruga
		double r1 = 0;
		double r2 = 0;

		// varijabla za proveru unosa
		boolean check = true;

		// provera unosa
		while (check) {
			try {
				System.out.println("Size radius can not be a negative number!!!");
				System.out.println("Enter the radius of the first round: ");
				r1 = input.nextDouble();
				System.out.println("Enter the radius of the second round: ");
				r2 = input.nextDouble();

				if (r1 > 0 && r2 > 0) {
					c1 = new Z3KrugComparable(r1);
					c2 = new Z3KrugComparable(r2);
					check = false;
				}

				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
				System.out.println("Enter the number!!!");
			}
		}

		// zatvaramo unos
		input.close();
		// pozivamo metodu
		int r = c1.compareTo(c2);
		// stampamo resenje
		if (r == 1) {
			System.out.println("Larger first round!!!");
		} else if (r == -1) {
			System.out.println("The larger the second round!!!");
		} else {
			System.out.println("Are equal!!!");
		}
	}
}
