/*2. Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su 
takoder twin primes. Napisati program koji ispisuje sve twin prime 
brojeve manje od 10000, 10 parova po liniji. */

package zadaci_24_1_2016;

import java.util.ArrayList;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2TwinPrimeBrojevi {

	public static void main(String[] args) {
		// lista prostih brojeva
		ArrayList<Integer> primes = new ArrayList<>();
		// lista trazenih prostih brojeva
		ArrayList<String> result = new ArrayList<>();

		// trazenje prostih brojeva
		for (int i = 0; i < 100000; i++) {
			// varoijabla koja javlja je li broj prost ili ne
			boolean isPrime = true;
			// proveravamo da li je prost broj
			for (int divisor = 2; divisor <= i / 2; divisor++) {
				/*
				 * Ako je broj deljiv sa deliocem bez ostatka broj nije prost
				 * zaustavi petlju for
				 */
				if (i % divisor == 0) {
					isPrime = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			// ako je broj prost doddaj ga u listu prostih brojeva
			if (isPrime) {
				primes.add(i);
			}
		}
		// provera da li su dva prosta broja Twin Prime
		for (int i = 0; i < primes.size() - 1; i++) {
			if (primes.get(i + 1) - primes.get(i) == 2) {
				// ako jesu pretvori ih u string
				String s1 = primes.get(i) + "";
				String s2 = primes.get(i + 1) + "";
				// i dodaj u listu
				result.add(s1 + " i " + s2 + ";");
			}
		}
		// brojac ispisanih brojeva u jednom redu
		int count = 1;
		// stampamo rezultata
		System.out.println("Twin prime numbers are: ");
		for (int i = 0; i < result.size(); i++) {
			if (count % 10 == 0) {
				System.out.printf("%-17s\n",result.get(i));
			} else {
				System.out.printf("%-17s",result.get(i));
			}
			count++;
		}
	}
}
