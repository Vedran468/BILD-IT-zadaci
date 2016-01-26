/*3. Napisati metodu sa sljedecim headerom: 
	public static int isPrime(int n) 
koja provjerava da li je broj prost/prime. 
Napsati test program koji poziva ovu metodu i ispisuje sve 
proste brojeve u rasponu od 0 do 100000.*/
package zadaci_26_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3ProstiBrojevi {
	public static int isPrime(int n) {
		// brojac prostih brojeva
		int divisor = 0;

		// prvo i definisemo da je prost broj
		boolean isPrime = true;
		// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
		// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
		// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
		// sa samim sobom.
		for (divisor = 2; divisor <= n / 2; divisor++) {
			if (n % divisor == 0) {
				isPrime = false;
				// Izadji is petlje kreni divisor ponovo od 2
				break;
			}
		}
		// Ako je broj prost vrati ga ako nije 0
		if (isPrime) {
			return divisor;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// brojac za ispis 10 brojeva u jednom redu
		int count = 0;
		System.out.println("Primes are: ");
		// proveravamo brojeve od 0 do 100000
		for (int i = 0; i <= 100000; i++) {
			// saljemo broj u metodu ako metoda ne vrati 0 broj "i" je prost
			if (isPrime(i) > 0) {
				count++;
				// Definisanje stampanja u jednom redu
				if (count % 10 == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
				// inace nastavi sa petljom
			} else {
				continue;
			}
		}
	}

}
