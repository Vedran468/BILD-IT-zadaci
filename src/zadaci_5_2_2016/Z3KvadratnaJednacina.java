/*The class contains:
- Private data fields a, b, and c that represent three coefficients.
- A constructor for the arguments for a, b, and c.
- Three getter methods for a, b, and c.
- A method named getDiscriminant() that returns the discriminant.
- The methods named getRoot1() and getRoot2() for returning two roots.
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
. Write a test program that prompts the user to enter values for a, b, and c and 
displays the result based on the discriminant. If the discriminant is positive, display 
the two roots. If the discriminant is 0, display the one root. Otherwise, display “.*/
package zadaci_5_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3KvadratnaJednacina {

	// data fields za 3 koeficijenta
	private double a, b, c;

	// konstruktor sa data fields
	public Z3KvadratnaJednacina(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// get metode za data fields
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	// diskriminanta kvadratne jednacine
	public double getDiscriminant() {
		// pomocna varijabla za formulu
		double x = Math.pow(b, 2);
		return x - (4 * a * c);
	}

	// kvadratna jednacina za tacku prvu
	public double getRoot1() {
		// provera je li diskriminanta negativan broj
		if (getDiscriminant() > 0) {
			// pomocne varijable
			double x = Math.pow(b, 2);
			double y = Math.sqrt(x - (4 * a * c));
			return ((-b) + y) / (2 * a);
		} else {
			return 0;
		}
	}

	// kvadratna jednacina za tacku drugu
	public double getRoot2() {
		// provera je li diskriminanta negativa broj
		if (getDiscriminant() > 0) {
			// pomocne varijable
			double x = Math.pow(b, 2);
			double y = Math.sqrt(x - (4 * a * c));
			return ((-b) - y) / (2 * a);
		} else {
			return 0;
		}
	}

}
