/*1. Napisati program koji ispisuje sve prestupne godine, 
10 po liniji, od godine 101 do 2100, odvojene jednim spaceom. 
Takoder ispisati i ukupan broj prijestupnih godina u ovom 
vremenskom periodu.*/
package zadaci_16_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1PrestupneGodine {

	public static void main(String[] args) {

		System.out.println("Leap years are:\n");
		// brojac za broj linija u jednom redu i za ukupno godina
		int counter = 1;
		int years = 0;
		// provera za svaku godinu u datom periodu
		for (int i = 101; i <= 2100; i++) {

			// provera da li je godina prestupna
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				// stampanje godina
				if (counter == 10) {
					System.out.println(i + " ");
					counter = 1;
				} else {
					System.out.print(i + " ");
					counter++;
				}
				years++;
			}
		}
		// ukupan broj godina
		System.out.println("\nTotal leap years is " + years + ".");
	}
}
