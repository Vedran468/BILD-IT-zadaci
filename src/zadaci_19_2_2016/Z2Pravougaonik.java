/*(Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal
if their areas are the same. Draw the UML diagram that involves Rectangle,
GeometricObject, and Comparable.*/

package zadaci_19_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2Pravougaonik extends Z1GeometriskaTela {

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
	@Override
	public double getArea() {
		return width * height;
	}

	/** vraca obim */
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// menjamo metodu jednaki iz klase objekat
	@Override
	public boolean equals(Object obj) {
		boolean r = false;
		if (obj instanceof Z2Pravougaonik) {
			if (getArea() == ((Z2Pravougaonik) obj).getArea()) {
				r = true;
			}
		}
		return r;
	}

	// metoda iz interfejsa
	@Override
	public int compareTo(Z1GeometriskaTela o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
