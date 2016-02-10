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

/**
 * @author Vedran Vidakovic
 *
 */

public class Z1Trugao extends Z1GeometriskaTela {

	// Kreiramo data fields stranica sa difoltnim vrijednostima
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	// Kriramo np-arg konstruktor.
	public Z1Trugao() {

	}

	// Kreiramo konstruktor sa argumentima velicine stranica.
	public Z1Trugao(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// get metode koje vracaju velicinu stranica
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// metodu za povrsinu.
	public double getArea() {
		// Kreiramo "s" potrebno za formulu.
		double s = (side1 + side2 + side3) / 2.0;
		// "S" ubacujemo u formulu za povrsinu, korijen kvadratni iz.
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// Kreiramo metodu za obim trougla.
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	// Kreiramo metodu za stmpanje i pozivamo vec kreiranu u super klasi.
	@Override
	public String toString() {

		return (super.toString() + "\nTriangle: side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = "
				+ getSide3() + ".\nArea of the triangle is: " + getArea() + ".\nPerimeter of the triangle is: "
				+ getPerimeter() + ".");
	}
}
