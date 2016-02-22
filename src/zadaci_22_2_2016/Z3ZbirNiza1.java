/*(Sum series) Write a recursive method to compute the following series:
m(i) = 1 +1/2 +1/3 + ... + 1/i
Write a test program that displays m(i) for i = 1, 2, . . ., 10.*/

package zadaci_22_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z3ZbirNiza1 {
	
	public static double m(int i) {
		// uslov da se zaustavi rekurzija metoda poziva sama sebe
		if (i == 1)
			return 1;
		else
			// inace sabiri 1/i i smanjuj i,
			return (double) 1 / i + m(i - 1);
	}

	public static void main(String[] args) {
		// metoda sabira za i=1 pa do i=10
		for (int i = 1; i < 11; i++) {
			System.out.println("The summation of a series of \"i = " + i + "\" shall be " + m(i) + ".");
		}
	}
}
