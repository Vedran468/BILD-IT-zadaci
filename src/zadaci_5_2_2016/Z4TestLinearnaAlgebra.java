/*The class contains:
- Private data fields a, b, c, d, e, and f.
- A constructor with the arguments for a, b, c, d, e, and f.
- Six getter methods for a, b, c, d, e, and f.
- A method named isSolvable() that returns true if ad - bc is not 0.
- Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.”*/
package zadaci_5_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4TestLinearnaAlgebra {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// za unos vrednosti a,b, c, d, e i f
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		boolean checkingEntry4 = true;
		boolean checkingEntry5 = true;
		boolean checkingEntry6 = true;

		// UNOS ZA SVE PODATKE
		while (checkingEntry1) {
			System.out.println("For the linear algebra, enter the value \"a\": ");
			try {
				a = input.nextDouble();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e1) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry2) {
			System.out.println("For the linear algebra, enter the value \"b\": ");
			try {
				b = input.nextDouble();
				checkingEntry2 = false;
				// u slucaju greske
			} catch (InputMismatchException e2) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry3) {
			System.out.println("For the linear algebra, enter the value \"c\": ");
			try {
				c = input.nextDouble();
				checkingEntry3 = false;
				// u slucaju greske
			} catch (InputMismatchException e3) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry4) {
			System.out.println("For the linear algebra, enter the value \"d\": ");
			try {
				d = input.nextDouble();
				checkingEntry4 = false;
				// u slucaju greske
			} catch (InputMismatchException e4) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry5) {
			System.out.println("For the linear algebra, enter the value \"e\": ");
			try {
				e = input.nextDouble();
				checkingEntry5 = false;
				// u slucaju greske
			} catch (InputMismatchException e5) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry6) {
			System.out.println("For the linear algebra, enter the value \"f\": ");
			try {
				f = input.nextDouble();
				checkingEntry6 = false;
				// u slucaju greske
			} catch (InputMismatchException e6) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		// zaustavljamo unos
		input.close();

		// objekat klase linearna jednacina
		Z4LinearnaAlgebra o = new Z4LinearnaAlgebra(a, b, c, d, e, f);

		// provera je li postoji resenje
		if (o.isSolvable()) {
			System.out.printf("Size of \"x\" axis %2.2f, and if \"y\" axis %2.2f.", o.getX(), o.getY());
		} else {
			System.out.println("The equation has no solution.");
		}

	}
}