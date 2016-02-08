/*(Mersenne prime) A prime number is called a Mersenne prime if it can be written 
in the form 2p - 1 for some positive integer p. Write a program that finds
all Mersenne primes with p … 100 and displays the output as shown below.
(Hint: You have to use BigInteger to store the number, because it is too big to
be stored in long.*/
package zadaci_8_2_2016;

import java.math.BigInteger;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4MersenneProstiBrojevi {

	public static void main(String[] args) {

		// definisemo da nam p krece od 2
		int p = 2;
		// veliki ceo broj koji je uvek 2
		final BigInteger b = new BigInteger("2");
		// stampamo brojeve
		System.out.println("\tp\t\t  2^p – 1");
		// petlja radi dok je p manje ili jednako 100
		while (p <= 100) {
			boolean isPrime = true;
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
			// sa samim sobom.
			for (int divisor = 2; divisor <= p / 2; divisor++) {
				if (p % divisor == 0) {
					isPrime = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			// Ako je broj prost
			if (isPrime) {
				System.out.print("\t" + p);
				// uradi 2 stepenuj sa p brojem i oduzmi 1 i to dodeli velikom
				// celom broju b1
				// objasnjenje metoda nalazi se kada ukucate b. izbaci vam se
				// meni zatim tab da se zaustavite na prvom polju i u desnom
				// prozoru kliknete na BigInteger tu su i sve metode o
				// bigInteger
				BigInteger b1 = b.pow(p).subtract(new BigInteger("1"));
				System.out.print("\t\t\t" + b1 + "\n");
			}
			// povecaj p za 1
			p++;
		}
	}

}
