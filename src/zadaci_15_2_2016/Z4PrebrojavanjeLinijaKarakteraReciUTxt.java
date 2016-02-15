/*(Count characters, words, and lines in a file) Write a program that will count
the number of characters, words, and lines in a file. Words are separated by
whitespace characters. The file name should be passed as a command-line
argument, as shown in Figure 12.13.*/
package zadaci_15_2_2016;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4PrebrojavanjeLinijaKarakteraReciUTxt {

	public static void main(String[] args) {

		// kreiram skener za unos
		Scanner input = new Scanner(System.in);
		// provera unosa
		boolean check = true;
		// smestamo tekst po linijama iz fajla
		ArrayList<String> line = new ArrayList<>();
		System.out.println("Enter a location on a drive from txt file: ");
		// provera je li postoji fajl i spremanje teksta po liniji u liustu
		java.io.File file = new java.io.File(input.next());
		Scanner input2;
		while (check) {
			try {
				input2 = new Scanner(file);
				while (input2.hasNextLine()) {
					line.add(input2.nextLine());
				}
				check = false;
				input2.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		input.close();
		// prikazujemo broj linija u tekstu
		System.out.println("The number of lines in the file is " + line.size() + ".");

		// string gde smestamo citav tekst
		String w = "";
		for (int i = 0; i < line.size(); i++) {
			w += line.get(i) + " ";
		}

		// tekst pretvaramo u niz karaktera
		char[] chars = w.toCharArray();
		// stampamo broj karaktera u tekstu (odizimamo broj praznih polja koje smo dodali)
		System.out.println("The number of characters in the text " + (chars.length - line.size()) + ".");
		// brojac reci
		int counter = 0;
		// prebrojavamo reci
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == ' ' && chars[i + 1] != ' ') {
				counter++;
			}
		}
		// prikazujemo broj reci u tekstu koliko je
		System.out.println("Number of words in the text " + counter + ".");

	}

}
