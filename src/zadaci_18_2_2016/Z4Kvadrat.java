/*(The Colorable interface) Design an interface named Colorable with a void
method named howToColor(). Every class of a colorable object must implement
the Colorable interface. Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to
display the message Color all four sides.
Draw a UML diagram that involves Colorable, Square, and GeometricObject.
Write a test program that creates an array of five GeometricObjects. For each
object in the array, display its area and invoke its howToColor method if it is
colorable.*/

package zadaci_18_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z4Kvadrat extends Z2GeometriskaTelaComparable implements Z4Colorable {
	// polje podatka za velicinu kvadrata
	private double s;

	// konstruktor sa poljima podataka super klase i ove klase
	public Z4Kvadrat(double s, String color, boolean filled) {
		super(color, filled);
		this.s = s;
	}

	// metoda koja vcraca velicinu kvadrata
	public double getS() {
		return s;
	}

	// menjamo metodu kako obojiti
	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	// metoda za povrsinu
	public double area(){
		return (this.s*this.s);
	}
}
