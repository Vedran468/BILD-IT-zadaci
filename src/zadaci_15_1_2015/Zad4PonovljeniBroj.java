package zadaci_15_1_2015;

/*4. Napisite program koji generise 100 nasumicnih
cijelih brojeva izmedu 0 i 9 te ispisuje koliko se puta
koji broj ponovio.*/
/**
 * @author Vedran Vidakovic
 *
 */
public class Zad4PonovljeniBroj {

	public static void main(String[] args) {
		// lista brojeva od 0 do 9
		int[] result = new int[10];
		int counter = 1;
		// definisemo 100 brojeva od 0 do 9
		for (int i = 0; i < 100; i++) {
			int number = (int) (Math.random() * 10);
			// stampamo svaki generisani broj
			if (counter < 10) {
				System.out.printf("%4d", number);
				counter++;
			} else {
				System.out.printf("%4d\n", number);
				counter = 1;
			}
			// ako je broj dob ijeni jednak indeksu niza povecaj trenutnu
			// njegovu vrednost
			result[number]++;
		}

		// stampamo koliko se koji broj puta pojavio
		for (int j = 0; j < result.length; j++) {
			System.out.println("The numbers " + j + " has " + result[j] + ";");
		}
	}
}
