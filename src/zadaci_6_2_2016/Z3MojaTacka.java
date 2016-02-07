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

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3MojaTacka {
	// data fields za x i y
	private double x;
	private double y;

	// no-arg konstriktor koji dodeljuje vrednost 0 za x i y
	public Z3MojaTacka() {
		this.x = 0;
		this.y = 0;
	}

	// konstruktor koji prima vrednosti za x i y
	public Z3MojaTacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// get metode koje vracaju vrednost za x i y
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// prema pitagorinoj teoremi racunamo udaljenost tacaka dva objekta
	public double distance(Z3MojaTacka o) {

		double c = 0;
		// UZIMAMO U OBZIR SVE VARIJEANTE ZA IKSEVE I IPSILONE
		if (this.x > -1 && this.y > -1 && o.getX() > -1 && o.getY() > -1) {
			// pomocne varijable
			double a = Math.pow((Math.abs((this.x - o.getX()))), 2);
			double b = Math.pow((Math.abs((this.y - o.getY()))), 2);
			c = Math.sqrt(a + b);
		} else if (this.x < 0 && this.y < 0 && o.getX() < 0 && o.getY() < 0) {

			// pomocne varijable
			double x1 = Math.abs(this.x);
			double y1 = Math.abs(this.y);
			double x2 = Math.abs(o.getX());
			double y2 = Math.abs(o.getY());
			double a = Math.pow((Math.abs(x1 - x2)), 2);
			double b = Math.pow((Math.abs(y1 - y2)), 2);
			c = Math.sqrt(a + b);
		} else if (this.x < 0) {
			// pomocne varijable
			double x1 = Math.abs(this.x);
			double a = Math.pow((Math.abs((x1 + o.getX()))), 2);
			double b = Math.pow((Math.abs((this.y - o.getY()))), 2);
			c = Math.sqrt(a + b);
		} else if (this.y < 0) {
			// pomocne varijable
			double y1 = Math.abs(this.y);
			double a = Math.pow((Math.abs((this.x - o.getX()))), 2);
			double b = Math.pow((Math.abs((y1 + o.getY()))), 2);
			c = Math.sqrt(a + b);
		} else if (o.getX() < 0) {
			// pomocne varijable
			double x2 = Math.abs(o.getX());
			double a = Math.pow((Math.abs((x2 + this.x))), 2);
			double b = Math.pow((Math.abs((this.y - o.getY()))), 2);
			c = Math.sqrt(a + b);
		} else if (o.getY() < 0) {
			// pomocne varijable
			double y2 = Math.abs(o.getY());
			double a = Math.pow((Math.abs((this.x - o.getX()))), 2);
			double b = Math.pow((Math.abs((y2 + this.y))), 2);
			c = Math.sqrt(a + b);
		}

		return c;
	}

	// prema pitagorinoj teoremi racunamo udaljenost dve tacke
	public double distance(int x2, int y2) {

		double c = 0;
		// UZIMAMO U OBZIR SVE VARIJEANTE ZA IKSEVE I IPSILONE
		if (this.x > -1 && this.y > -1 && x2 > -1 && y2 > -1) {
			// pomocne varijable
			double a = Math.pow((Math.abs((this.x - x2))), 2);
			double b = Math.pow((Math.abs((this.y - y2))), 2);
			c = Math.sqrt(a + b);
		} else if (this.x < 0 && this.y < 0 && x2 < 0 && y2 < 0) {

			// pomocne varijable
			double x1 = Math.abs(this.x);
			double y1 = Math.abs(this.y);
			double x = Math.abs(x2);
			double y = Math.abs(y2);
			double a = Math.pow((Math.abs(x1 - x)), 2);
			double b = Math.pow((Math.abs(y1 - y)), 2);
			c = Math.sqrt(a + b);
		} else if (this.x < 0) {
			// pomocne varijable
			double x1 = Math.abs(this.x);
			double a = Math.pow((Math.abs((x1 + x2))), 2);
			double b = Math.pow((Math.abs((this.y - y2))), 2);
			c = Math.sqrt(a + b);
		} else if (this.y < 0) {
			// pomocne varijable
			double y1 = Math.abs(this.y);
			double a = Math.pow((Math.abs((this.x - x2))), 2);
			double b = Math.pow((Math.abs((y1 + y2))), 2);
			c = Math.sqrt(a + b);
		} else if (x2 < 0) {
			// pomocne varijable
			double x = Math.abs(x2);
			double a = Math.pow((Math.abs((x + this.x))), 2);
			double b = Math.pow((Math.abs((this.y - y2))), 2);
			c = Math.sqrt(a + b);
		} else if (y2 < 0) {
			// pomocne varijable
			double y = Math.abs(y2);
			double a = Math.pow((Math.abs((this.x - x2))), 2);
			double b = Math.pow((Math.abs((y + this.y))), 2);
			c = Math.sqrt(a + b);
		}

		return c;
	}

}
