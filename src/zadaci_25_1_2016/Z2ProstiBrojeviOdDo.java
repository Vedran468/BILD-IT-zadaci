/*2.  Napisati program koji ispisuje sve proste brojeve od 2 do 1000, 
ukljucujuci i 2 i 1000. Program treba da ispise 8 brojeva po liniji te 
razmak izmedu brojeva treba da bude jedan space.*/

package zadaci_25_1_2016;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z2ProstiBrojeviOdDo {

	public static void main(String[] args) {
		// brojac prostih brojeva
		int count = 0;

		// definisemo od kojeg do kojeg broja da se proveri ima li prostih
		for (int i = 2; i <= 1000; i++) {
			// prvo i definisemo da je prost broj
			boolean isPrime = true;
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti  a zatim je li deljiv i
			// sa samim sobom.
			for (int divisor = 2; divisor <= i/2 ; divisor++) {
				if (i % divisor == 0) {
					isPrime = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			// Ako je broj prost
			if (isPrime) {
				// Povecaj brojac
				count++;
				// Definisanje stampanja u jednom redu
				if (count % 8 == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}
}
