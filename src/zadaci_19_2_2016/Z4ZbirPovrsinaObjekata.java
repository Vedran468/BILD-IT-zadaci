/*(Sum the areas of geometric objects) Write a method that sums the areas of all the
geometric objects in an array. The method signature is:
public static double sumArea(GeometricObject[] a)
Write a test program that creates an array of four objects (two circles and two
rectangles) and computes their total area using the sumArea method.*/
package zadaci_19_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4ZbirPovrsinaObjekata {

	public static double sumArea(Z1GeometriskaTela[] a) {
		double r = 0;
		// prolazimo kroz niz i sabiramo povrsine
		for (int i = 0; i < a.length; i++) {
			r += a[i].getArea();
		}
		return r;
	}

	public static void main(String[] args) {

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

		// kreiramo niz objekata
		Z1GeometriskaTela[] a = { new Z1Krug(r1), new Z1Krug(r2), new Z2Pravougaonik(a1, b1),
				new Z2Pravougaonik(a2, b2) };
		// saljemo u metodu i stampamo zbir
		System.out.println("The sum of surface area geometry of the body is " + sumArea(a) + ".");
	}
}
