/*2.  ISBN-10 (International Standard Book Number) se  
sadrzi od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
Posljednji broj, d10, sluzi kao checksum i njega 
izracunavamo iz prvih devet brojeva koristeci se 
sljedecom formulom: 
	(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 
		* 7 + d8 * 8 + d9 * 9) % 11. 
Ukoliko je checksum 10, zadnji broj oznacavamo sa X u 
skladu sa ISBN-10 konvencijom. Napisati program koji 
pita korisnika da unese prvih 9 brojeva te ispise 
desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, 
kao prvih 9 brojeva, 013601267 program nam ispisuje 
0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 
kao prvih 9 brojeva, program nam ispisuje 013031997X 
kao ISBN-10 broj)*/
package zadaci_18_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2ISBN {

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// definisemo niz za unos
		int[] nine = new int[9];
		// smestamo u niz korisnikov unos
		for (int i = 0; i < nine.length; i++) {
			System.out.println("Enter the " + (i + 1) + "th integer  of the nine numbers ISBN: ");
			nine[i] = input.nextInt();
		}

		// varijabla za pretvoriti int u string
		String intToString = "";

		// lista u kojoj smestamo rezultat
		ArrayList<String> result = new ArrayList<>();

		// pretvaramo clanove niza u string i dodajemo listi
		for (int i = 0; i < nine.length; i++) {
			// int pretvaramo u string
			intToString = nine[i] + "";
			result.add(intToString);
		}
		// racunamo 10. clan isbn-a
		int tenth = (nine[0] * 1 + nine[1] * 2 + nine[2] * 3 + nine[3] * 4 + nine[4] * 5 + nine[5] * 6 + nine[6] * 7
				+ nine[7] * 8 + nine[8] * 9) % 11;
		// ako je jednak 10 u listu rezultat ubaci X inace ubaci resenje racuna
		if (tenth == 10) {
			result.add("X");
		} else {
			intToString = tenth + "";

			result.add(intToString);
		}
		// stampamo rezultat
		System.out.println("The result is:\n");
		for (int i = 0; i < result.size(); i++) {
			System.out.print("" + result.get(i));
		}
		// zatvaramo unos
		input.close();
	}

}
