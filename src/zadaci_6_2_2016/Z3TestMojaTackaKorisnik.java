/*(The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
- The data fields x and y that represent the coordinates with getter
methods.
- A no-arg constructor that creates a point (0, 0).
- A constructor that constructs a point with specified coordinates.
- A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
- A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class. Write a
test program that creates the two points (0, 0) and (10, 30.5) and displays the
distance between them.*/
package zadaci_6_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3TestMojaTackaKorisnik {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// za unos vrednosti
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		boolean checkingEntry4 = true;

		// UNOS ZA SVE PODATKE
		while (checkingEntry1) {
			System.out.println("Enter the value \"x1\": ");
			try {
				x1 = input.nextDouble();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e1) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry2) {
			System.out.println("Enter the value \"y1\": ");
			try {
				y1 = input.nextDouble();
				checkingEntry2 = false;
				// u slucaju greske
			} catch (InputMismatchException e2) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry3) {
			System.out.println("Enter the value \"x2\": ");
			try {
				x2 = input.nextDouble();
				checkingEntry3 = false;
				// u slucaju greske
			} catch (InputMismatchException e3) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry4) {
			System.out.println("Enter the value \"y2\": ");
			try {
				y2 = input.nextDouble();
				checkingEntry4 = false;
				// u slucaju greske
			} catch (InputMismatchException e4) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		// zaustavljamo unos
		input.close();

		// kreiramo objekat
		Z3MojaTacka p1 = new Z3MojaTacka(x1, y1);
		// pozivamo metodu za udaljenost sa rzlicitim x i y
		System.out.println("The distance " + p1.distance(new Z3MojaTacka(x2, y2)) + ".");
	}
}
