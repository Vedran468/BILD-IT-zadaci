/*(The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable interfaces.
Assume that all eight sides of the octagon are of equal length. The area can
be computed using the following formula:
area = (2 + 4/22)* side * side
Draw the UML diagram that involves Octagon, GeometricObject,
Comparable, and Cloneable. Write a test program that creates an Octagon
object with side value 5 and displays its area and perimeter. Create a new object
using the clone method and compare the two objects using the compareTo
method.*/

package zadaci_19_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z3Osomougao extends Z1GeometriskaTela implements Cloneable {

	// data field velicina stranice s
	private double s;

	// no-arg konstruktor
	public Z3Osomougao() {

	}
	
	// konstruktor sa poljima podataka ove klase
		public Z3Osomougao( double s) {
			this.s = s;
		}

	// konstruktor sa poljima podataka super klase i ove klase
	public Z3Osomougao(String color, boolean filled, double s) {
		super(color, filled);
		this.s = s;
	}

	// metoda koja vraca velicinu stranica
	public double getS() {
		return s;
	}

	// metoda koja postavlja velicinu stranica
	public void setS(double s) {
		this.s = s;
	}

	// metoda povrsina osmougla
	// povrsina pravilnog mnogouga sa sajta
	/*
	 * https://sr.wikipedia.org/sr/%D0%9E%D1%81%D0%BC%D0%BE%D1%83%D0%B3%D0%B0%D0
	 * %BE#.D0.9F.D1.80.D0.B0.D0.B2.D0.B8.D0.BB.D0.BD.D0.B8_.D0.BE.D1.81.D0.BC.
	 * D0.BE.D1.83.D0.B3.D0.B0.D0.BE
	 */
	@Override
	public double getArea() {
		return (2 * (1 + Math.sqrt(2)) * s * s);
	}

	// metoda za obim
	@Override
	public double getPerimeter() {
		return 8 * s;
	}

	// menjamo metodu uporedi
	@Override
	public int compareTo(Z1GeometriskaTela o) {
		int r = 0;
		if (o instanceof Z3Osomougao) {
			if (this.getArea() > ((Z3Osomougao) o).getArea()) {
				r = 1;
				System.out.println("Larger first octagon!!!");
			} else if (this.getArea() < ((Z3Osomougao) o).getArea()) {
				r = -1;
				System.out.println("The larger the second octagon!!!");
			} else {
				r = 0;
				System.out.println("Are equal!!!");
			}
		}
		return r;
	}
	
	// menjamo metodu kloniranje
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
