/*(Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides  
have the same length and all angles have the same degree (i.e., the polygon is
both equilateral and equiangular). Design a class named RegularPolygon that
contains:
- A private int data field named n that defines the number of sides in the polygon
with default value 3.
- A private double data field named side that stores the length of the side with
default value 1.
- A private double data field named x that defines the x-coordinate of the polygon’s
center with default value 0.
- A private double data field named y that defines the y-coordinate of the polygon’s
center with default value 0.
- A no-arg constructor that creates a regular polygon with default values.
- A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
- A constructor that creates a regular polygon with the specified number of sides,
length of side, and x- and y-coordinates.
- The accessor and mutator methods for all data fields.
- The method getPerimeter() that returns the perimeter of the polygon.
- The method getArea() that returns the area of the polygon.
Write a test
program that creates three RegularPolygon objects, created using the no-arg
constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
4, 5.6, 7.8). For each object, display its perimeter and area.*/
package zadaci_5_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2TestMnoguglaKorisnikUnosiPodatke {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// za unos vrednosti a,b, c, d, e i f
		int n = 0;
		double side = 0;
		double x = 0;
		double y = 0;

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		boolean checkingEntry4 = true;

		// UNOS ZA SVE PODATKE
		while (checkingEntry1) {
			System.out.println("Enter the number of pages of a polygon: ");
			try {
				n = input.nextInt();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e1) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		while (checkingEntry2) {
			System.out.println("Enter the size of a polygon side: ");
			try {
				side = input.nextDouble();
				checkingEntry2 = false;
				// u slucaju greske
			} catch (InputMismatchException e2) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry3) {
			System.out.println("Enter the center point along the  \"x\" axis: ");
			try {
				x = input.nextDouble();
				checkingEntry3 = false;
				// u slucaju greske
			} catch (InputMismatchException e3) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry4) {
			System.out.println("Enter the center point along the  \"x\" axis: ");
			try {
				y = input.nextDouble();
				checkingEntry4 = false;
				// u slucaju greske
			} catch (InputMismatchException e4) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		// zaustavljamo unos
		input.close();

		// objekat klase mnogougao
		Z2Mnogougao p = new Z2Mnogougao(n, side, x, y);

		// povrsina i obim njegava
		System.out.printf("For the first polygon perimeter is %2.2f, and the area of the polygon is %2.2f.",
				p.getPerimeter(), p.getArea());

	}
}
