/*(Enable GeometricObject comparable) Modify the GeometricObject class
to implement the Comparable interface, and define a static max method in the
GeometricObject class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write
a test program that uses the max method to find the larger of two circles and the
larger of two rectangles.*/

package zadaci_18_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z2TestGeometriskaTelaComparable {

	public static void main(String[] args) {
		// objekti klase
		Z2GeometriskaTelaComparable p1 = null;
		Z2GeometriskaTelaComparable p2 = null;
		Z2Krug c1 = null;
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
					c1 = new Z2Krug(r1);
					c2 = new Z2Krug(r2);
					check = false;
				}

				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
				System.out.println("Enter the number!!!");
			}
		}

		check = true;

		// stranice za 2 pravougaonika
		double a1 = 0;
		double b1 = 0;
		double a2 = 0;
		double b2 = 0;
		// provera unosa
		while (check) {
			try {
				System.out.println("Size page can not be a negative number!!!");
				System.out.println("Enter the page size of \"a\" and \"b\" the rectangle1: ");
				a1 = input.nextDouble();
				b1 = input.nextDouble();
				System.out.println("Enter the page size of \"a\" and \"b\" the rectangle2: ");
				a2 = input.nextDouble();
				b2 = input.nextDouble();
				if (a1 > 0 && a2 > 0 && b1 > 0 && b2 > 0) {
					p1 = new Z2Pravougaonik(a1, b1);
					p2 = new Z2Pravougaonik(a2, b2);
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

		// stampamo resenje
		Z2GeometriskaTelaComparable.max(c1, c2);
		Z2GeometriskaTelaComparable.max(p1, p2);
	}
}
