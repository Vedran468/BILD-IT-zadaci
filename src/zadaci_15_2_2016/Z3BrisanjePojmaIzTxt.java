/*(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the
arguments from the command line.*/
package zadaci_15_2_2016;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3BrisanjePojmaIzTxt {

	public static void main(String[] args) throws FileNotFoundException {

		// smestamo korisnikov unos u fajl
		java.io.File file = new java.io.File("unos.txt");
		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text in a txt file: ");
		try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
			output.print(input.nextLine());
		}
		// pitamo koju rec zeli da se izbrise
		System.out.println("Enter the word you want to delete the previous text: ");
		String word = input.next();
		// zatvaramo unos
		input.close();

		// lista gde smestamo unete reci korisnika i bez reci koja se ne treba
		// nalaziti ponovo upisujemo u fajl
		ArrayList<String> w = new ArrayList<>();
		// citanje iz fajla i dodavanje u listu
		java.io.File file2 = new java.io.File("unos.txt");
		Scanner input2 = new Scanner(file2);
		while (input2.hasNext()) {
			w.add(input2.next());
		}
		input2.close();
		// ponovo unosimo u ali bez nezeljene reci
		java.io.File file3 = new java.io.File("unos.txt");
		try (java.io.PrintWriter output2 = new java.io.PrintWriter(file3);) {
			for (int i = 0; i < w.size(); i++) {
				if (!w.get(i).equals(word)) {
					output2.print(w.get(i) + " ");
				}
			}
		}
		input.close();

		// ponovo iscitavamo fajl i stampamo ga
		java.io.File file4 = new java.io.File("unos.txt");
		Scanner input4 = new Scanner(file4);
		while (input4.hasNext()) {
			System.out.print(input4.next() + " ");
		}
		input4.close();
	}

}
