/*The two endpoints
for the first line segment are (x1, y1) and (x2, y2) and for the second line
segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point.*/
package zadaci_5_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z5TackaPreseka {

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		// za unos vrednosti a,b, c, d, e i f
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;
		double x4 = 0;
		double y4 = 0;

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;
		boolean checkingEntry4 = true;
		boolean checkingEntry5 = true;
		boolean checkingEntry6 = true;
		boolean checkingEntry7 = true;
		boolean checkingEntry8 = true;

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

		while (checkingEntry5) {
			System.out.println("Enter the value \"x3\": ");
			try {
				x3 = input.nextDouble();
				checkingEntry5 = false;
				// u slucaju greske
			} catch (InputMismatchException e5) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry6) {
			System.out.println("Enter the value \"y3\": ");
			try {
				y3 = input.nextDouble();
				checkingEntry6 = false;
				// u slucaju greske
			} catch (InputMismatchException e6) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		
		while (checkingEntry7) {
			System.out.println("Enter the value \"x4\": ");
			try {
				x4 = input.nextDouble();
				checkingEntry7 = false;
				// u slucaju greske
			} catch (InputMismatchException e5) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry8) {
			System.out.println("Enter the value \"y4\": ");
			try {
				y4 = input.nextDouble();
				checkingEntry8 = false;
				// u slucaju greske
			} catch (InputMismatchException e6) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		// zaustavljamo unos
		input.close();
		// prema formuli definisemo vrednosti za a, b, c, d, e, i f
		//(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
		//(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
		double a= y1 - y2;
		double b= x1 - x2;
		double c= y3 - y4;
		double d= x3 - x4;
		double e= (y1 - y2)*x1 - (x1 - x2)*y1;
		double f= (y3 - y4)*x3 - (x3 - x4)*y3;

		// objekat klase linearna jednacina
		Z4LinearnaAlgebra o = new Z4LinearnaAlgebra(a, b, c, d, e, f);

		// provera je li postoji resenje
		if (o.isSolvable()) {
			System.out.printf("\nThe intersecting point is at (%2.4f, %2.4f).", o.getX(), o.getY());
		} else {
			System.out.println("\nThe two lines are parallel.");
		}

	}
}
