/*(Algebra: perfect square) Write a program that prompts the user to enter an integer
m and find the smallest integer n such that m * n is a perfect square. (Hint:
Store all smallest factors of m into an array list. n is the product of the factors that
appear an odd number of times in the array list. For example, consider m = 90,
store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
in the array list. So, n is 10.) Here are sample runs:*/
package zadaci_12_2_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2SavrsenKvadrat {

	public static void main(String[] args) {

		// kreiramo skener za unoa
		Scanner input = new Scanner(System.in);
		// smestamo korisnikov unos
		int number = 0;

		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		// provera unosa za broj 1
		while (continueInput) {
			System.out.println("Enter an integer m: ");
			try {
				number = input.nextInt();
				if (number > 0) {
					continueInput = false;
				} else {
					System.out.println("The number must be greater than 0!!!");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}

		// pamtimo broj
		int m = number;
		// broj kojim proveravamo najmanji faktor
		int k = 2;
		// lista u koju smestamo resenje
		ArrayList<Integer> members = new ArrayList<>();
		// proveravamo koji su faktori broja
		while (number != 1) {
			if (number % k == 0) {
				number = number / k;
				// string dodajemo u listu
				members.add(k);
			} else {
				// ako nijetrenutno i najmanji faktor povecaj i za 1
				k++;
			}
		}
		// lista u koju smestamo neparan broj ponovljanja
		ArrayList<Integer> anOddNumberOfRepetitions = new ArrayList<>();
		// definisemo brojac
		int counter1 = 0;
		// pronalazimo brojeve koji se ponavljaju neparaN broj puts
		for (int i = 0; i < members.size(); i++) {
			for (int j = 0; j < members.size(); j++) {
				if (members.get(i) == members.get(j)) {
					// ako da povecaj brojac
					counter1++;
				}
			}
			// ako je brojac 0 znaci nije dupli broj dodaj ga u listu
			if (counter1 % 2 != 0) {
				anOddNumberOfRepetitions.add(members.get(i));
			}
			// ponisti brojac
			counter1 = 0;
		}

		// lista brojeva koji se ne ponavljaju
				ArrayList<Integer> result = new ArrayList<>();
				// definisemo brojac
				int counter = 0;
				// uporedjujemo da li se nalaze dupli brojevi
				for (int i = 0; i < anOddNumberOfRepetitions.size(); i++) {
					for (int j = 0; j < result.size(); j++) {
						if (anOddNumberOfRepetitions.get(i) == result.get(j)) {
							// ako da povecaj brojac
							counter++;
						}
					}
					// ako je brojac 0 znaci nije dupli broj dodaj ga u listu
					if (counter == 0) {
						result.add(anOddNumberOfRepetitions.get(i));
					}
					// ponisti brojac
					counter = 0;
				}

		// broj n koji trazimo
		int n = 1;
		for (int j = 0; j < result.size(); j++) {
			n *= result.get(j);
		}
		// stampamo rezultat
		System.out.println("The smallest number n for m * n to be a perfect square is " + n + "\nm * n is " + (m * n));

		// zaustavljamo unos
		input.close();
	}

}
