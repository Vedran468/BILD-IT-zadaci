/*(Enable GeometricObject comparable) Modify the GeometricObject class
to implement the Comparable interface, and define a static max method in the
GeometricObject class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write
a test program that uses the max method to find the larger of two circles and the
larger of two rectangles.*/

package zadaci_18_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z2Pravougaonik extends Z2GeometriskaTelaComparable {

	// data fields za sirinu i visinu
	private double width;
	private double height;

	// no-arg konstruktor
	public Z2Pravougaonik() {
	}

	// konstruktor sa data fields
	public Z2Pravougaonik(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// konstruktor sa data fields i data fields super klase
	public Z2Pravougaonik(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	/** vraca sirinu */
	public double getWidth() {
		return width;
	}

	/** postavlja sirinu */
	public void setWidth(double width) {
		this.width = width;
	}

	/** vraca visinu */
	public double getHeight() {
		return height;
	}

	/** postavlja visinu */
	public void setHeight(double height) {
		this.height = height;
	}

	/** vraca povrsinu */
	public double getArea() {
		return width * height;
	}

	/** vraca obim */
	public double getPerimeter() {
		return 2 * (width + height);
	}

}