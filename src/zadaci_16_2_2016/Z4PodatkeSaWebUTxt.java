/*(Process scores in a text file on the Web) Suppose that the text file on the
Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
of scores. Write a program that reads the scores from the file and displays their
total and average. Scores are separated by blanks.*/
package zadaci_16_2_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4PodatkeSaWebUTxt {

	public static void main(String[] args) throws FileNotFoundException {
		// korisniku da unese url adresu
		System.out.print("Enter a URL: ");
		@SuppressWarnings("resource")
		String URLString = new Scanner(System.in).next();
		// smestamo podatke sa weba u fajl
		File file = new File("web.txt");
		PrintWriter output = new PrintWriter(file);
		try {
			URL url = new URL(URLString);
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				output.println((input.nextLine() + " "));

			}
			input.close();
			// u slucaju greske
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
		output.close();
		// varijable za zbir i prosek
		double suma = 0;
		double counter = 0;

		// iscitavamo podatke iz fajlsa i racunamo zbir i brojimo broj podataka
		File file4 = new File("web.txt");
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
