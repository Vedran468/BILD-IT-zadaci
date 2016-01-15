package zadaci_15_1_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*1. Napisati sljedecu metodu koja vraca najvecu vrijednosti u
 *  ArrayListu Integera. Metoda vraca null ukoliko je lista null 
 *  iil ukoliko lista sadrzi 0 elemenata.
public static Integer max(ArrayList<Integer> list)*/

public class Zad1Max {
	/**
	 * @author Vedran Vidakovic
	 *
	 */

	public static Integer max(ArrayList<Integer> list) {
		// proveravamo je li lista przna
		if (list.isEmpty() || list.size() == 0) {
			return null;
		} else {
			// ako nije sortiramo je i vracamo poslednji clan liste jer je on
			// najveci
			java.util.Collections.sort(list);
			int max = list.get(list.size() - 1);
			return max;
		}
	}

	public static void main(String[] args) {

		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		// kreiramo listu za korisnikov unos
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter the numbers in the list, input interrupt 0: ");
		while (continueInput) {
			try {
				int number = input.nextInt();
				// ako je korisnik uneo 0 zaustavi petlju
				if (number == 0) {
					continueInput = false;
				} else {
					// inace dodaj broj u listu
					list.add(number);
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// zaustavljamo unos
		input.close();
		System.out.println(max(list));
	}

}
