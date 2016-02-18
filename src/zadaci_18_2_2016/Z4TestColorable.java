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

public class Z4TestColorable {

	public static void main(String[] args) {

		// niz objekata
		Z4Kvadrat array[] = { new Z4Kvadrat(1, "blue", true), new Z4Kvadrat(2, "blue", false),
				new Z4Kvadrat(3, "blue", true), new Z4Kvadrat(4, "blue", false), new Z4Kvadrat(5, "blue", true) };

		// ispisujemo povrsinu i ako je popunjeno pojom kako obojiti
		for (int i = 0; i < array.length; i++) {
			System.out.printf("\nArea of squares for the page size of %2.2f cm is %2.2f.\n", array[i].getS(),
					array[i].area());
			if (array[i].isFilled()) {
				array[i].howToColor();
			}
		}
	}

}
