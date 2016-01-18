/*1. Napisati program koji pita korisnika da unese neki cijeli  
broj te ispisuje njegove najmanje faktore u rastucem redosljedu. 
Na primjer, ukoliko korisnik unese 120 program treba da ispise 
2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)*/
package zadaci_18_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1NajmanjiFaktoriBroja {

	public static void main(String[] args) {

		// kreiramo skener za unoa
		Scanner input = new Scanner(System.in);
		// stampamo korisniku
		System.out.println("Enter an integer: ");
		// smestamo korisnikov unos
		int number = input.nextInt();
		// broj kojim proveravamo najmanji faktor
		int i = 2;
		// lista u koju smestamo resenje
		ArrayList<String> members = new ArrayList<>();
		// proveravamo koji su faktori broja
		while (number != 1) {
			if (number % i == 0) {
				number = number / i;
				// int pretvaramo u string
				String intToString = i + "";
				// string dodajemo u listu
				members.add(intToString);
			} else {
				// ako nijetrenutno i najmanji faktor povecaj i za 1
				i++;
			}
		}
		java.util.Collections.sort(members);
		System.out.println("The result is:\n");
		// stampamo resenje u obliku npr 2, 2, 2, 3, 5.
		for (int j = 0; j < members.size(); j++) {
			if (j == members.size() - 1) {

				System.out.print(members.get(j) + ".");
			} else {
				System.out.print(members.get(j) + ", ");
			}
		}
		// zaustavljamo unos
		input.close();
	}

}
