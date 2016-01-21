/*4. Pozitivni cijeli broj je savrsen broj ukoliko je jednak zbiru svih svojih 
pozitivnih djelilaca, iskljucujuci sebe. Na primjer, 
6 je prvi savrseni broj jer 6 = 3 + 2 + 1. 
Sljedeci savrseni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
Samo 4 savrsena broja postoje u rasponu od 0 do 10.000. 
Napisite program koji ispisuje sva 4.*/
package zadaci_21_1_2016;

import java.util.ArrayList;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4SavrsenBroj {

	public static void main(String[] args) {

		// lista savrsenih brojeva
		ArrayList<Integer> result = new ArrayList<>();
		// delioci njihov zbir
		int divisor = 0;
		// prolazimo kroz sve brojeve od 1 do 10000
		for (int i = 1; i <= 10000; i++) {
			// prolazimo sa deliocima
			for (int j = 1; j <= i; j++) {
				// provera koji su to delioci
				if (i % j == 0 && j != i) {
					divisor += j;

				}
			}
			// provera je li broj savrsen
			if (divisor == i) {
				// ako jeste dodaj u listu
				result.add(i);
			}
			// inace zbir delioca postavi na 0
			divisor = 0;
		}
		// syampamo rezultat
		System.out.println("Perfect numbers in the range of 0 to 10000 are as follows: ");
		System.out.println(result);
	}

}
