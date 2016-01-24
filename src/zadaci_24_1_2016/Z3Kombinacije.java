/*3. Napisati program koji ispisuje sve moguce kombinacije za biranje dva broja
u rasponu od 1 do 7. Takoder, program ispisuje broj svih mogucih kombinacija.  
Dakle, program treba da ispise sve moguce parove brojeva u datom rasponu, 
krenuvsi sa 1 2, 1 3, 1 4, itd. Broj mogucih kombinacija je 21.*/
package zadaci_24_1_2016;

import java.util.ArrayList;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3Kombinacije {

	public static void main(String[] args) {
		// lista trazenih kombinacija
		ArrayList<String> result = new ArrayList<>();
		// brojac kobinacija
		int count = 0;
		// trazenje kombinacija
		for (int j = 1; j < 7; j++) {
			for (int i = 1; i <= j; i++) {
				// pretvaranje kombinacija u string i dodavanje listi
				String s1 = i + "";
				String s2 = j + "";
				if (j == 6) {
					result.add(s1 + " " + s2 + ".");
					count++;
				} else {
					result.add(s1 + " " + s2 + ", ");
					count++;
				}
			}
		}
		// sortiramo dobijene kombinacije
		java.util.Collections.sort(result);
		// brojac ispisanih brojeva u jednom redu
		int count2 = 1;
		// stampamo rezultata
		System.out.println("Combinations are: ");
		for (int i = 0; i < result.size(); i++) {
			if (count2 % 7 == 0) {
				System.out.printf("%-7s\n", result.get(i));
			} else {
				System.out.printf("%-7s", result.get(i));
			}
			count2++;
		}

		// stampamo ukupan broj kombinacija
		System.out.println("\nThe total number of combinations is: " + count + ".");

	}
}
