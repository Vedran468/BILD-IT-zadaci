/*Design a class named Complex for representing complex numbers and the
methods add, subtract, multiply, divide, and abs for performing complexnumber
operations, and override toString method for returning a string representation
for a complex number. The toString method returns (a + bi) as a
string. If b is 0, it simply returns a. Your Complex class should also implement the
Cloneable interface.
Provide three constructors Complex(a, b), Complex(a), and Complex().
Complex() creates a Complex object for number 0 and Complex(a) creates
a Complex object with 0 for b. Also provide the getRealPart() and
getImaginaryPart() methods for returning the real and imaginary part of the
complex number, respectively.
Write a test program that prompts the user to enter two complex numbers and
displays the result of their addition, subtraction, multiplication, division, and absolute
value.*/
package zadaci_20_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z4KompleksanBr implements Cloneable {
	
	// data fields za realni i imaginarni broj
	private double a;
	private double b;

	// konstruktor sa data fields
	public Z4KompleksanBr(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// konstruktor sa realnim brojem 
	public Z4KompleksanBr(double a) {
		this.a = a;
		this.b = 0;
	}

	// no-arg konstruktor
	public Z4KompleksanBr() {
		this.a = 0;
		this.b = 0;
	}

	// vraca realni broj
	public double getRealPart() {
		return a;
	}

	// vraca imaginarni  broj
	public double getImaginaryPart() {
		return b;
	}

	// sabirasnje kompleksnih brojeva
	public String add(Z4KompleksanBr o) {
		double x = this.a + o.getRealPart();
		double y = this.b + o.getImaginaryPart();
		String s = "(" + this.a + " + " + this.b + "i) + (" + o.getRealPart() + " + " + o.getImaginaryPart() + "i) = "
				+ x + " + " + y + "i";
		return s;
	}

	// oduzimanje kompleksnih brojeva
	public String subtract(Z4KompleksanBr o) {
		double x = this.a - o.getRealPart();
		double y = this.b - o.getImaginaryPart();
		String s = "(" + this.a + " + " + this.b + "i) - (" + o.getRealPart() + " + " + o.getImaginaryPart() + "i)  = "
				+ x + " + " + y + "i";
		return s;
	}

	// mnozenje kompleksnih brojeva
	public String multiply(Z4KompleksanBr o) {
		double x1 = this.a * o.getRealPart();
		double x2 = this.b * o.getImaginaryPart();
		double y1 = this.b * o.getRealPart();
		double y2 = this.a * o.getImaginaryPart();
		double x = x1 - x2;
		double y = y1 + y2;

		String s = "(" + this.a + " + " + this.b + "i) * (" + o.getRealPart() + " + " + o.getImaginaryPart() + "i)  = "
				+ x + " + " + y + "i";
		return s;
	}

	// deljenje kompleksnih brojeva
	public String divide(Z4KompleksanBr o) {
		double x1 = this.a * o.getRealPart();
		double x2 = this.b * o.getImaginaryPart();
		double y1 = this.b * o.getRealPart();
		double y2 = this.a * o.getImaginaryPart();
		double z = Math.pow(o.getRealPart(), 2) + Math.pow(o.getImaginaryPart(), 2);
		double x = (x1 + x2) / z;
		double y = (y1 - y2) / z;

		String s = "(" + this.a + " + " + this.b + "i) / (" + o.getRealPart() + " + " + o.getImaginaryPart() + "i)  = "
				+ x + " + " + y + "i";
		return s;
	}

	// absolutna vrednost kompleksnog broja
	public double abs() {
		double x = Math.pow(a, 2);
		double y = Math.pow(b, 2);
		double z = x + y;
		return Math.sqrt(z);
	}

	// metoda za kloniranje
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// metoda koja vraca string sa absolutnom vrednoscu kompleksnog broja
	@Override
	public String toString() {
		return "|(" + getRealPart() + " + " + getImaginaryPart() + "i)| = " + abs();
	}

}
