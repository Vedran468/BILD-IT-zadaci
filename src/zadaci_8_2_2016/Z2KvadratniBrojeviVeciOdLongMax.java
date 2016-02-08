/*(Square numbers) Find the first ten square numbers that are greater than 
Long.MAX_VALUE. A square number is a number in the form of n2. For example,
4, 9, and 16 are square numbers. Find an efficient approach to run your
program fast.*/
package zadaci_8_2_2016;

import java.math.BigInteger;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2KvadratniBrojeviVeciOdLongMax {

	public static void main(String[] args) {

		// prikaz maksimalnog longa
		System.out.println("The maximum number is long:\n" + Long.MAX_VALUE);
		String max = Long.MAX_VALUE+"";
		// definisemo da nam broj krece od  maksimalnog long broja plus 1
		BigInteger big1 = new BigInteger(max).add(new BigInteger("1"));
		// definisemo brojac
		int counter = 0;
		System.out.println("The first ten of square numbers that range from the maximum number of long: ");
		// petlja radi dok je brojac ne bude 10
		while (counter != 10) {
			// objasnjenje metoda nalazi se kada ukucate big1. izbaci vam se
			// meni zatim tab da se zaustavite na prvom polju i u desnom prozoru
			// kliknete na BigInteger tu su i sve metode o bigInteger
			BigInteger big2 = big1.pow(2);
			// povecaj brojac
			counter++;
			System.out.println(big2);

			// povecaj big broj za 1
			big1 = big1.add(new BigInteger("1"));
		}
	}

}
