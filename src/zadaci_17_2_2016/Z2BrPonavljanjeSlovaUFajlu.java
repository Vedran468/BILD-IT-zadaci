/*(Occurrences of each letter) Write a program that prompts the user to enter
a file name and displays the occurrences of each letter in the file. Letters are
case-insensitive.*/
package zadaci_17_2_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2BrPonavljanjeSlovaUFajlu {

	public static void main(String[] args) {

		// kreiram skener za unos
		Scanner input = new Scanner(System.in);
		// provera unosa
		boolean check = true;
		// smestamo tekst u string
		String w = "";
		System.out.println("Enter a location on a drive from txt file: ");
		// provera je li postoji fajl i spremanje teksta u string
		File file = new File(input.next());
		Scanner input2;
		while (check) {
			try {
				input2 = new Scanner(file);
				while (input2.hasNext()) {
					w += input2.next();
				}
				check = false;
				input2.close();
				// u slucaju greske
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		input.close();
		// pretvaramo string u velika slova
		w = w.toUpperCase();
		// niz za proveru
		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		// niz koji broji koliko se puta ponovilo slovo
		int[] counter = new int[26];
		// provera na kojem indeksu se nalazi ponovljeno slovo
		for (int i = 0; i < w.length(); i++) {
			for (int j = 0; j < letters.length; j++) {
				if (letters[j].equals(w.charAt(i) + "")) {
					counter[j]++;
				}
			}
		}

		// stampanje rezultata
		for (int j = 0; j < letters.length; j++) {
			System.out.println("Number of " + letters[j] + "'s: " + counter[j] + ".");
		}
	}

}
