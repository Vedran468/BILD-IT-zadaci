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

public class Z2Krug  {

	// Data field podatak koji je promenjiv kroz klasu
	double radius;

	// Konstruktor krug za kreiranje objekata krug
	Z2Krug() {
		// Pocetna vrednost po difoltu radijusa je 1
		this.radius = 1;
	}

	// Drugi konstruktor koji od korisnika uzima velicinu radijusa
	Z2Krug(double newRadius) {
		// Promeniti velicinu radijusa da bude jednaka korisnikovom broju
		this.radius = newRadius;

	}

	// Metoda get koja vraca povrsinu kruga
	double getArea() {
		// Vrati povrsinu kruga ako je formula
		return radius * radius * Math.PI;
	}

	// Metoda get koja vraca obim kruga
	double getPerimeter() {
		// Vrati obim kruga po formuli
		return 2 * radius * Math.PI;
	}

	// Metoda set koja omogucava korisniku da promeni velicinu radijusa
	void setRadius(double newRadius) {
		// Radijus postaje jednak broju korisnika
		this.radius = newRadius;
	}

	// metoda za stampanje
	@Override
	public String toString() {
		return super.toString() + "The area of the circle of radius " + radius + " is " + getArea()
				+ ".\nThe perimeter of the circle of radius " + radius + " is " + getPerimeter() + ".";
	}

	

}
