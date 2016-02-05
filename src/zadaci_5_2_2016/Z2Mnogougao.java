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

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2Mnogougao {

	// data field za broj strana
	private int n = 3;
	// data field za velicinu stranica
	private double side = 1;
	// data field za velicinu centra po x
	private double x = 0;
	// data field za velicinu centra po y
	private double y = 0;

	// no-argument konstruktor
	public Z2Mnogougao() {

	}

	// konstruktor za brojem stranica velicinom stranice
	public Z2Mnogougao(int n, double side) {
		super();
		this.n = n;
		this.side = side;
	}

	// konstruktor sa data fields
	public Z2Mnogougao(int n, double side, double x, double y) {
		super();
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	// get i set metode za sva data fields
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// metoda za obim
	public double getPerimeter() {
		return n * side;
	}

	// metoda za povrsinu
	public double getArea() {
		// pomocne varijable racunaju deo formule
		double x = n * Math.pow(side, 2);
		double y = Math.tan(Math.PI / n);
		// nakraju kompletiraj formulu i vrati povrsinu
		return x / (4 * y);
	}

}
