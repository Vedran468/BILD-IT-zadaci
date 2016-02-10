/*(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method.*/
package zadaci_10_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z4Krug {

	// Data field podatak koji je promenjiv kroz klasu
	double radius;

	// Konstruktor krug za kreiranje objekata krug
	Z4Krug() {
		// Pocetna vrednost po difoltu radijusa je 1
		this.radius = 1;
	}

	// Drugi konstruktor koji od korisnika uzima velicinu radijusa
	Z4Krug(double newRadius) {
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
		return "The area of the circle of radius " + radius + " is " + getArea()
				+ ".\nThe perimeter of the circle of radius " + radius + " is " + getPerimeter() + ".";
	}
}