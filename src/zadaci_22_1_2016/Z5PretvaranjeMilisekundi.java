/*5. Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
Metoda treba da koristi sljedeci header: 
	public static String convertMillis(long millis). 
Metoda treba da vraca vrijeme kao string u formatu 
sati:minute:sekunde.  
Na primjer convertMillis(100000) treba da vrati 0:1:40.*/
package zadaci_22_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5PretvaranjeMilisekundi {

	public static String convertMillis(long millis) {
		// kreiramo string za rezultat
		String result = "";
		// pretvaramo npr 89999499 milisekundi u 8999,499 sekunde
		double convertedInSeconds = (double) (millis) / 1000;
		// pretvaramo npr 8999,499 sekundi u 24,999861... sati
		double x = convertedInSeconds / 3600;
		// izdvajamo npr iz 24,99986... da ima 24 sata
		double h = Math.floor(x);
		// iz npr 24,999861... izdvajamo 0,999861 i mnozimo sa 60 da bi smo
		// dobili 59,99165 minuta
		double y = (x - h) * 60;
		// od npr 59.999861 izdvajamo da ima 59 minuta
		double minute = Math.floor(y);
		// iz npr 59,99... izdvajamo 0,99... i mnozimo sa 60 da bi smo
		// dobili 59,49... sekundi
		double z = (y - minute) * 60;
		// iz npr 59,49... izdvajamo 59 sekundi
		double seconds = Math.rint(z);
		// proveravamo ako je sekundi preko 60
		if (seconds >= 60) {
			// ako jeste sekunde postaju npr za 100 sekundi bice sekunde 40
			seconds = seconds - 60;
			// i povecavamo minute za 1
			minute = minute + 1;
		}
		// ako su minute preko 60
		if (minute >= 60) {
			// postaju npr za 100 minuta bice 40 minuta
			minute = minute - 60;
			// a povecavamo sate za 1
			h = h + 1;
		}
		// postavljamo resenje i metoda ga vraca
		result = "For " + millis + " milliseconds have (hh: mm: ss): \n" + (int) (h) + ":" + (int) (minute) + ":"
		// sekunde zaokruzujemo npr za unos 499 bice 0:0:0 a za 599 bice 0:0:1
				+ (int) (Math.rint(seconds));
		return result;
	}

	public static void main(String[] args) {

		// skener
		Scanner input = new Scanner(System.in);

		// korisnikov unos
		long userInput = 0;
		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter the number of milliseconds ");
			try {
				userInput = input.nextLong();

				// provera je li unos veci od 0
				if (userInput > 0) {
					// ako jeste saljemo u metodu
					System.out.println(convertMillis(userInput));
					checkingEntry = false;
				} else {
					System.out.println("Should be greater than 0 !!!");
					checkingEntry = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter the number: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();

	}

}
