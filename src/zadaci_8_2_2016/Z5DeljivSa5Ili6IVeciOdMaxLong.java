/*(Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
that are divisible by 5 or 6.*/
package zadaci_8_2_2016;

import java.math.BigInteger;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5DeljivSa5Ili6IVeciOdMaxLong {

	public static void main(String[] args) {

		// prikaz maksimalnog longa
		System.out.println("The maximum number is long:\n" + Long.MAX_VALUE);
		// pretvaramo ga u string
		String max = Long.MAX_VALUE + "";
		// definisemo da nam broj krece od maksimalnog long broja plus 1
		BigInteger big1 = new BigInteger(max).add(new BigInteger("1"));
		// definisemo brojac
		int counter = 0;
		System.out.println(
				"The first 10 numbers divisible by 5 or 6 and that are larger than the maximum number of long: ");
		// petlja radi dok je brojac ne bude 10
		while (counter != 10) {
			// objasnjenje metoda nalazi se kada ukucate big1. izbaci vam se
			// meni zatim tab da se zaustavite na prvom polju i u desnom prozoru
			// kliknete na BigInteger tu su i sve metode o bigInteger
			if (big1.mod(new BigInteger("5")).equals(new BigInteger("0"))
					|| big1.mod(new BigInteger("6")).equals(new BigInteger("0"))) {
				// povecaj brojac ako je broj deljiv sa 2 ili 3
				counter++;
				System.out.println(big1);
			}
			// povecaj big broj za 1
			big1 = big1.add(new BigInteger("1"));
		}
	}

}