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

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4LinearnaAlgebra {

	// date fields za vrednosti a, b, c, d, e, i f linarne jednacine
	private double a, b, c, d, e, f;

	// konstruktor sa vrednostima data fields
	public Z4LinearnaAlgebra(double a, double b, double c, double d, double e, double f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// metoda koja proverava je li resiva linarna jednacina
	public boolean isSolvable() {
		if (((a * d) - (b * c)) != 0) {
			return true;
		} else {
			return false;
		}
	}

	// metoda koja vraca x
	public double getX() {
		if (isSolvable()) {
			// matematicki postupak resenja
			// ax +by = e
			// cx + dy = f
			// y = (e-ax)/b
			// bcx + de -dax=fb
			// (bc - da)x = fb -de
			// x = (fb -de)/ (bc - da)
			return (f * b - d * e) / (b * c - d * a);
		} else {
			return 0;
		}
	}

	// metoda koja vraca y
	public double getY() {
		if (isSolvable()) {
			// matematicki postupak resenja
			// ax +by = e
			// cx + dy = f
			// x = (e-by)/a
			// (ce - cby)/a +ady = f
			// (ad - cb)y = fa -ce
			// y = (fa -ce)/ (ad - cb)
			return (f * a - c * e) / (a * d - c * b);
		} else {
			return 0;
		}
	}

}
