/*(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
- Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
- A no-arg constructor that creates a default triangle.
- A constructor that creates a triangle with the specified side1, side2, and
side3.
- The accessor methods for all three data fields.
- A method named getArea() that returns the area of this triangle.
- A method named getPerimeter() that returns the perimeter of this triangle.
- A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.*/
package zadaci_10_2_2016;

import java.util.InputMismatchException;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1TestTrougao {

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		java.util.Scanner input = new java.util.Scanner(System.in);

		// polja koja trazimo da korisnik unese
		String field = "";
		double a = 0;
		double b = 0;
		double c = 0;

		// provera unosa
		boolean check1 = true;
		boolean check2 = true;
		boolean check3 = true;
		boolean check4 = true;

		// provera za stranicu a
		while (check1) {
			System.out.println("Enter the page size of \"a\" the triangle: ");
			try {
				a = input.nextDouble();
				if (a >= 0) {
					check1 = false;
				} else {
					System.out.println("Size page can not be a negative number!!!");
				}
				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
				System.out.println("Enter the number!!!");
			}
		}

		// provera za stranicu b
		while (check2) {
			System.out.println("Enter the page size of \"b\" the triangle: ");
			try {
				b = input.nextDouble();
				if (b >= 0) {
					check2 = false;
				} else {
					System.out.println("Size page can not be a negative number!!!");
				}
				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
				System.out.println("Enter the number!!!");
			}
		}

		// provera za stranicu c
		while (check3) {
			System.out.println("Enter the page size of \"c\" the triangle: ");
			try {
				c = input.nextDouble();
				if (c >= 0) {
					check3 = false;
				} else {
					System.out.println("Size page can not be a negative number!!!");
				}
				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
				System.out.println("Enter the number!!!");
			}
		}
		// krreiramo objekat klase trougao sa stranicama
		Z1Trugao t = new Z1Trugao(a, b, c);
		// prelazimo na sledecu liniju skeniranja
		input.nextLine();
		System.out.println("Enter the color for the triangle: ");

		// Menjamo boju kruga preko metode setting.
		t.setColor(input.nextLine());

		// provera za polje da li je popunjeno ili ne
		while (check4) {
			System.out.println("Did you geometric object filled or not, enter yes, if so and no, if it is not.");
			try{
			// unos za polje
			field = input.next().toLowerCase();

			// Proveravamo je li korisnik unjeo da ili ne.
			if (field.equals("yes")) {
				t.setFilled(true);
				check4 = false;
			} else if (field.equals("no")) {
				t.setFilled(false);
				check4 = false;
			}
			} catch (InputMismatchException e) {
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();

		// Pozovemo metodu za stampanje.
		System.out.println(t.toString());

	}
}
