/*/*(The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.*/

package zadaci_18_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z3KrugComparable extends Z2Krug implements Comparable<Z2Krug> {

	// konsruktor sa data field super klase
	public Z3KrugComparable(double radius) {
		super(radius);
	}

	// menjamo metodu iz interfejsa
	@Override
	public int compareTo(Z2Krug o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

}