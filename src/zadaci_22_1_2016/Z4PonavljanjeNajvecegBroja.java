/*4. Napisite program koji ucitava neodreden broj cijelih brojeva 
(unos prekida nula), pronalazi najveci od unijetih brojeva te ispisuje 
koliko se najveci broj puta ponovio.  Na primjer, ukoliko unesemo 
3 5 2 5 5 5 0 program ispisuje da je najveci broj 5 te ispisuje da se isti 
ponavlja 4 puta. */

package zadaci_22_1_2016;
/**
 * @author Vedran Vidakovic
 *
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4PonavljanjeNajvecegBroja {

	public static void main(String[] args) {

		// skener
		Scanner input = new Scanner(System.in);

		// korisnikov unos smestamo u listu
		ArrayList<Integer> numbers = new ArrayList<>();
		// brojac za ispis 10 u jednom redu brojeva
		int counter = 0;
		// korisnikov unos
		int userInput = 1;
		// radi dok unos ne bude 0
		do {
			System.out.println("Enter integers, input interrupt 0: ");
			try {
				userInput = input.nextInt();
				// ako nije o dodaj u listu
				if (userInput != 0) {
					numbers.add(userInput);
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		} while (userInput != 0);
		// zatvaramo unos
		input.close();
		// definisemo da je maksimalan clan prvi iz liste
		int max = numbers.get(0);
		// provera koji je broj najveci
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}
		// provera koliko se puta ponovio 
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == max) {
				counter++;
			}
		}
		// stampamo rezultat
		System.out.println("The highest number is " + max + ", the same repeated " + counter + " times.");
	}

}
