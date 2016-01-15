package zadaci_15_1_2015;

/*5. Napisati program koji ucitava niz brojeva, pronalazi najveci broj 
te ispisruje koliko se puta taj broj ponavlja. Pretpostavimo da se unos brojeva
zavrsava sa nulom.*/
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * import java.util.ArrayList; import java.util.InputMismatchException; import
 * java.util.Scanner;
 * 
 * @author Vedran Vidakovic
 *
 */
public class Zad5PonavljanjeNajvecegBroja {

	public static void main(String[] args) {

		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		// kreiramo listu za korisnikov unos
		ArrayList<Double> list = new ArrayList<>();
		System.out.print("Enter the numbers in the list, input interrupt 0: ");
		while (continueInput) {
			try {
				double number = input.nextDouble();
				// ako je korisnik uneo 0 zaustavi petlju
				if (number == 0) {
					continueInput = false;
				} else {
					// inace dodaj broj u listu
					list.add(number);
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. Incorrect input: a number is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// zaustavljamo unos
		input.close();
		// provera je li lista prazna
		if (list.isEmpty() || list.size() == 0) {
			System.out.println("List is empty!");
		} else {
			// ako nije sortiramo je i vracamo poslednji clan liste jer je on
			// najveci
			java.util.Collections.sort(list);
			double max = list.get(list.size() - 1);
			int counter = 0;
			// prolazimo kroz listu i proveravamo koliko puta se pojavio
			// maksimalan broj
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(max)) {
					counter++;
				}
			}

			System.out.println("The maximum number is " + max + " and you entered " + counter + " times.");
		}
	}

}
