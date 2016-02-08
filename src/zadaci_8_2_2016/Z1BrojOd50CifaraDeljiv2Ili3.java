/*(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
divisible by 2 or 3.*/
package zadaci_8_2_2016;

import java.math.BigInteger;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1BrojOd50CifaraDeljiv2Ili3 {

	public static void main(String[] args) {

		// definisemo da nam broj krece od 1 i 49 nula BigInteger je string pa
		// ga ovako zapisujemo
		BigInteger big1 = new BigInteger("1000000000" + "0000000000" + "0000000000" + "0000000000" + "0000000000");
		// definisemo brojac
		int counter = 0;
		System.out.println("The first 10 numbers divisible by 2 or 3 of the 50 digits: ");
		// petlja radi dok je brojac ne bude 10
		while (counter != 10) {
			// objasnjenje metode mod nalazi se kada ukucate big. izbaci vam se
			// meni zatim tab da se zaustavite na prvom polju i u desnom prozoru
			// kliknete na BigInteger tu su i sve ostale metode o bigInteger
			if (big1.mod(new BigInteger("2")).equals(new BigInteger("0"))
					|| big1.mod(new BigInteger("3")).equals(new BigInteger("0"))) {
				// povecaj brojac ako je broj deljiv sa 2 ili 3
				counter++;
				System.out.println(big1);
			}
			// povecaj big broj za 1
			big1 = big1.add(new BigInteger("1"));
		}
	}

}
