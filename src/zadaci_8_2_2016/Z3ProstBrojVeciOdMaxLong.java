/*(Large prime numbers) Write a program that finds five prime numbers larger 
than Long.MAX_VALUE.*/
package zadaci_8_2_2016;

import java.math.BigInteger;

/**
 * @author Vedran VidakovicF
 *
 */
public class Z3ProstBrojVeciOdMaxLong {
	
	public static void main(String[] args) {

		// prikaz maksimalnog longa
		System.out.println("The maximum number is long:\n" + Long.MAX_VALUE);
		// pretvaramo ga u string
		String max = Long.MAX_VALUE + "";
		// definisemo da nam broj krece od maksimalnog long broja plus 1
		BigInteger big1 = new BigInteger(max).add(new BigInteger("1"));
		// definisemo brojac
		int counter = 0;
		System.out.println("The first 5 primes larger than the maximum long: ");
		// petlja radi dok je brojac ne bude 5
		while (counter != 5) {
			// objasnjenje metoda nalazi se kada ukucate big1. izbaci vam se
			// meni zatim tab da se zaustavite na prvom polju i u desnom prozoru
			// kliknete na BigInteger tu su i sve metode o bigInteger
			if (big1.isProbablePrime(7)) {
				System.out.println(big1);
				// povecaj brojac
				counter++;
			}
			// povecaj big broj za 1
			big1 = big1.add(new BigInteger("1"));
		}
	}

}
