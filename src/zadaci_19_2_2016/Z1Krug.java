/*(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend 
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.*/

package zadaci_19_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z1Krug extends Z1GeometriskaTela {

	// Data field podatak koji je promenjiv kroz klasu
	private double radius;

	// Konstruktor krug za kreiranje objekata krug
	Z1Krug() {
		// Pocetna vrednost po difoltu radijusa je 1
		this.radius = 1;
	}

	// Drugi konstruktor koji od korisnika uzima velicinu radijusa
	Z1Krug(double newRadius) {
		// Promeniti velicinu radijusa da bude jednaka korisnikovom broju
		this.radius = newRadius;

	}

	// Metoda get koja vraca povrsinu kruga
	@Override
	public double getArea() {
		// Vrati povrsinu kruga ako je formula
		return radius * radius * Math.PI;
	}

	// Metoda get koja vraca obim kruga
	@Override
	public double getPerimeter() {
		// Vrati obim kruga po formuli
		return 2 * radius * Math.PI;
	}

	// Metoda set koja omogucava korisniku da promeni velicinu radijusa
	void setRadius(double newRadius) {
		// Radijus postaje jednak broju korisnika
		this.radius = newRadius;
	}

	// metoda koja vraca radius
	public double getRadius() {
		return radius;
	}

	// metoda za stampanje
	@Override
	public String toString() {
		return super.toString() + "The area of the circle of radius " + radius + " is " + getArea()
				+ ".\nThe perimeter of the circle of radius " + radius + " is " + getPerimeter() + ".";
	}

	// menjamo metodu jednaki iz klase objekat
	@Override
	public boolean equals(Object obj) {
		boolean r = false;
		if (obj instanceof Z1Krug) {
			if (this.radius == ((Z1Krug) obj).getRadius()) {
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
