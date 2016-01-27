/*3. Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj 
i kada ispisemo naopako. Na primjer, broj 17 i broj 71 su prosti brojevi tako da 
su brojevi i 17 i 71 emirp brojevi. Napisati program koji ispisuje prvih 100 emirp 
brojeva, 10 brojeva po liniji. */
package zadaci_27_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3EmirpBrojevi {

	public static void main(String[] args) {

		// brojac koliko je ispisano emirp brojeva
		int counter = 0;
		System.out.println("Emirp numbers are: ");
		// definisemo da prosti broj krene od 2
		int i = 2;
		// petlja radi dok se ne ispise 100 prostih brojeva
		while (counter < 100) {
			// definisemo broj koji je jednak prvom broju provere, a sluzi da bi
			// se isti ispisao naopako
			int number = i;
			// varijabla za broj naopako
			int reverse = 0;
			do {
				// varijabla za cifre
				int decimals = number % 10;
				// cifru dodajemo unazad broju
				reverse = reverse * 10 + decimals;
				// otpisujemo decimalu
				number = number / 10;
			} while (number != 0);

			// delilac za prosti broj
			int divisor = 0;

			// prvo i definisemo da je prost broj i "pravi" i unazad
			boolean isPrime1 = true;
			boolean isPrime2 = true;
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
			// sa samim sobom.
			for (divisor = 2; divisor <= i / 2; divisor++) {
				if (i % divisor == 0) {
					isPrime1 = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			for (divisor = 2; divisor <= reverse / 2; divisor++) {
				if (reverse % divisor == 0) {
					isPrime2 = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			// uslov da nije isti broj "pravi" i unazad
			if (i != reverse) {
				// Ako je broj prost ispisi ga
				if (isPrime1 && isPrime2) {
					counter++;
					// Definisanje stampanja u jednom redu
					if (counter % 10 == 0) {
						System.out.println(i + " and " + reverse + ";");
					} else {
						// sortiranje brojeva tabelarno
						if (i < 100) {
							System.out.print(i + " and " + reverse + ";           ");
						} else if (i < 1000) {
							System.out.print(i + " and " + reverse + ";       ");
						} else {
							System.out.print(i + " and " + reverse + ";   ");
						}
					}
				}
			}
			// povecaj broj za proveru
			i++;
		}

	}

}
