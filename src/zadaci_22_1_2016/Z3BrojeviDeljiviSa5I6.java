/*3. Napisite program koji ispisuje sve brojeve, od 100 do 1000, 
10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmedu 
brojeva treba biti tacno jedan space.*/
package zadaci_22_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3BrojeviDeljiviSa5I6 {

	public static void main(String[] args) {

		// brojac za ispis 10 u jednom redu brojeva
		int counter = 1;
		System.out.println("Numbers divisible by 5, and 6 in the range of 100 to 1000:");
		// prolazak kroz brojeve od 100 do 100
		for (int i = 100; i <= 1000; i++) {
			// provera je li broj deljiv sa 5 i 6
			if (i % 5 == 0 && i % 6 == 0) {
				// ispisi 10 u jednom redu
				if (counter < 10) {
					System.out.print(i+" ");
					counter++;
				} else {
					System.out.println(i);
					counter = 1;
				}
			}
		}
	}

}
