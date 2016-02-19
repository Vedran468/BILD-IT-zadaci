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

public class Z3TestOsmougla {

	public static void main(String[] args) throws CloneNotSupportedException {

		// prvi objekat i njegova povrsina i obim
		Z3Osomougao o1 = new Z3Osomougao(5);
		System.out.println("Area the first octagon: " + o1.getArea() + ".");
		System.out.println("Perimeter the first octagon: " + o1.getPerimeter() + ".");
		// drugi objekat i njegova povrsina i obim
		Z3Osomougao o2 = (Z3Osomougao) (o1.clone());
		System.out.println("Area the second octagon: " + o2.getArea() + ".");
		System.out.println("Perimeter the second octagon: " + o2.getPerimeter() + ".");
		// uporediti da li su dva objekta jednaka
		o1.compareTo(o2);
	}

}
