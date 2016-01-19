/*2.  Napisati program koji simulira nasumicno izvlacenje
karte iz spila od 52 karte. Program treba ispisati koja karta 
je izvucena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem
je data karta (Srce, Pik, Djetelina, Kocka). Primjer: 
	Karta koju ste izvukli je 10 u znaku kocke.*/
package zadaci_19_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2KartaIzSpila {

	public static void main(String[] args) {

		// definisemo spil karata
		String[] deckCards = { "A Srce", "A Pik", "A  Djetelina", "A Kocka", "2 Srce", "2 Pik", "2  Djetelina",
				"2 Kocka", "3 Srce", "3 Pik", "3  Djetelina", "3 Kocka", "4 Srce", "4 Pik", "4  Djetelina", "4 Kocka",
				"5 Srce", "5 Pik", "5  Djetelina", "5 Kocka", "6 Srce", "6 Pik", "6  Djetelina", "6 Kocka", "7 Srce",
				"2 Pik", "7  Djetelina", "7 Kocka", "8 Srce", "8 Pik", "8  Djetelina", "8 Kocka", "9 Srce", "9 Pik",
				"9  Djetelina", "9 Kocka", "10Srce", "10Pik", "10Djetelina", "10Kocka", "J Srce", "J Pik",
				"J  Djetelina", "J Kocka", "Q Srce", "Q Pik", "Q Djetelina", "Q Kocka", "K Srce", "K Pik",
				"K  Djetelina", "K Kocka" };
		// neki broj koji ce imati indeks iz spila karat
		int n = (int) (Math.random() * 52);
		// izvucu kartu sa indeksom
		String card = deckCards[n];
		// pretvori string u karaktere
		char[] characters = card.toCharArray();
		// varijable za znak i broj
		String sign = "";
		String number = "";
		// dodeli znak i broj
		for (int i = 0; i < characters.length; i++) {
			if (i == 0 || i == 1) {
				number += characters[i];
			} else {
				sign += characters[i];
			}
		}
		// ispisi rezultat
		System.out.println("Card you draw is " + number + " marked " + sign + ".");

	}

}
