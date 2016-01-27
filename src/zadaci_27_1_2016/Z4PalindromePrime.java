/*4. Palindrome prime je prosti broj koji je takoder i palindrom. 
Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 
10 brojeva po liniji. */
package zadaci_27_1_2016;

import java.util.ArrayList;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4PalindromePrime {

	public static void main(String[] args) {

		// brojac palindrome prime brojeva
		int counter = 0;
		System.out.println("Palindrome prime numbers are: ");
		// definisemo da prosti broj krene od 2
		int i = 2;
		// petlja radi dok se ne ispise 100 brojeva
		while (counter < 100) {
			// varijabla za proveru je li broj palindrom
			boolean isPalindrome = false;
			// decimale stavljamo u niz
			ArrayList<Integer> result = new ArrayList<>();
			// varaijabla za cifre
			int digit = 0;
			// varijabala za proveriu je li broj i palindrom
			int number = i;
			do {

				// poslednja cifra broja
				digit = number % 10;
				// dodaj je u listu
				result.add(digit);
				// odbij poslednju cifru
				number /= 10;
			} while (number != 0);

			// Varijabla za prvi indeks u listi
			int low = 0;
			// Varijabla za poslednji indeks u listi
			int high = result.size() - 1;
			// provera je li broj palindrom
			while (high != 0) {

				if (result.get(low) == result.get(high)) {
					/*
					 * Ako jeste jednak prvi sa poslednjim indeksom liste, prvi
					 * indeks povecati a poslednji smanjiti za 1
					 */
					high--;
					low++;

				} else {
					// ako nije zaustavi petlju
					break;
				}
			}
			// ako je broj koji je kretao od 0 dosao do poslednjeg indeksa liste
			// vrati tacno da je palindrom, inace vrati da nije
			if (low == result.size() - 1) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
			// delilac za prosti broj
			int divisor = 0;
			// prvo i definisemo da je prost broj 
			boolean isPrime = true;
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
			// sa samim sobom.
			for (divisor = 2; divisor <= i / 2; divisor++) {
				if (i % divisor == 0) {
					isPrime = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			// ispisi brojeve vece od 10
			if (i >= 10) {
				// uslov da nije isti broj "pravi" i unazad
				// Ako je broj prost ispisi ga
				if (isPalindrome&&isPrime) {
					counter++;
					// Definisanje stampanja u jednom redu
					if (counter % 10 == 0) {
						System.out.println(i);
					} else {
						// sortiranje brojeva tabelarno
						if (i < 100) {
							System.out.print(i + "         ");
						} else if (i < 928) {
							System.out.print(i + "       ");
						} else if (i < 10301) {
							System.out.print(i + "       ");
						}else{
							System.out.print(i + "   ");
							
						}
					}
				}
			}
			// povecaj broj za proveru
			i++;
		}

	}

}
