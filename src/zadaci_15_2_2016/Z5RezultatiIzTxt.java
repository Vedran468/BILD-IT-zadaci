/*(Process scores in a text file) Suppose that a text file contains an unspecified
number of scores separated by blanks. Write a program that prompts the user
to enter the file, reads the scores from the file, and displays their total and
average.*/
package zadaci_15_2_2016;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5RezultatiIzTxt {

	public static void main(String[] args) throws IOException {

		// smestamo korisnikov unos u fajl
		java.io.File file = new java.io.File("rezultati.txt");
		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// smestamo u fajl rezultate
		System.out.println("Enter the results with one a space between: ");
		try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
			output.print(input.nextLine());
		}
		// pitamo koju rec zeli da se izbrise
		input.close();
		// varijable za zbir i prosek
		double suma = 0;
		double counter = 0;

		// iscitavamo podatke iz fajlsa i racunamo zbir i brojimo broj podataka
		java.io.File file4 = new java.io.File("rezultati.txt");
		Scanner input4 = new Scanner(file4);
		while (input4.hasNext()) {
			suma += Double.parseDouble(input4.next());
			counter++;
		}
		// stampamo rezultat za zbir
		System.out.println("The sum of the results of the " + suma + ".");
		// racunamo prosek
		double average = suma / counter;
		// stampamo rezultat proseka
		System.out.println("And average is " + average + ".");
		input4.close();
	}

}
