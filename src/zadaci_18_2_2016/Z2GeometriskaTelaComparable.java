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

public class Z2GeometriskaTelaComparable implements Comparable<Z2GeometriskaTelaComparable> {

	// Kreiramo data fields za boju i da li je telo popunjeno.
	private String color = "white";
	private boolean filled = false;

	
	// konstruktor sa data fields poljima
	public Z2GeometriskaTelaComparable(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	// no-arg konstruktor
	public Z2GeometriskaTelaComparable() {
	}

	// metoda koja vraca da li je telo popunjeno
	public boolean isFilled() {
		return filled;
	}

	// postavljanje vrednosti za polje
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// metoda vraca boju
	public String getColor() {
		return color;
	}

	// postavljamo boju
	public void setColor(String color) {
		this.color = color;
	}

	// metoda max
	public static int max(Object o1, Object o2) {
		int r = 0;
		if (o1 instanceof Z2Krug && o2 instanceof Z2Krug) {
			if (((Z2Krug) o1).getArea() > ((Z2Krug) o2).getArea()) {
				r = 1;
				System.out.println("Larger first round!!!");
			} else if (((Z2Krug) o1).getArea() < ((Z2Krug) o2).getArea()) {
				r = -1;
				System.out.println("The larger the second round!!!");
			} else {
				r = 0;
				System.out.println("Are equal!!!");
			}
		} else if (o2 instanceof Z2Pravougaonik && o2 instanceof Z2Pravougaonik) {
			if (((Z2Pravougaonik) o1).getArea() > ((Z2Pravougaonik) o2).getArea()) {
				r = 1;
				System.out.println("Larger first rectangle!!!");
			} else if (((Z2Pravougaonik) o1).getArea() < ((Z2Pravougaonik) o2).getArea()) {
				r = -1;
				System.out.println("The larger the second rectangle!!!");
			} else {
				r = 0;
				System.out.println("Are equal!!!");
			}
		}
		return r;
	}

	// metodu override za stampanje.
	@Override
	public String toString() {
		return ("The color of the geometric object is " + getColor() + ".\nThe gometric object filled:\t" + isFilled()
				+ ".");
	}

	// metoda iz interfejsa
	@Override
	public int compareTo(Z2GeometriskaTelaComparable o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
