/*(Reformat Java source code) Write a program that converts the Java source 
code from the next-line brace style to the end-of-line brace style. For example,
the following Java source in (a) uses the next-line brace style. Your program
converts it to the end-of-line brace style in (b).*/
package zadaci_16_2_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1FormatiranjeTekstaUTxt {

	public static void main(String[] args) throws FileNotFoundException {

		// lista gde smestamo redove iz txt fajla
		ArrayList<String> line = new ArrayList<>();
		// citanje iz fajla i dodavanje u listu
		File file = new File("Next-line brace style.txt");
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
			line.add(input.nextLine());
		}
		input.close();
		// prolazimo kroz listu i proveravamo gde se nalaze viticaste zagrade
		for (int i = 0; i < line.size(); i++) {
			String w = line.get(i);
			char[] c = w.toCharArray();
			int counter = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[j] == ' ' || c[j] == '{') {
					counter++;
				}
			}
			// kada nadjemo red sa samo viticastim zagradama dodajemo predhodmom
			// redu taj red i brisemo taj string iz liste
			if (counter == c.length) {
				line.set((i - 1), (line.get(i - 1) + " {"));
				line.remove(i);
			}
		}
		// unosimo u drugi fajl formatiran tekst
		File file2 = new File("End-of-line brace style.txt");
		try (PrintWriter output = new PrintWriter(file2);) {
			for (int i = 0; i < line.size(); i++) {
				output.println(line.get(i));
			}
		}
		input.close();

		// iscitavamo formatiran tekst i stampamo ga
		File file3 = new File("End-of-line brace style.txt");
		Scanner input2 = new Scanner(file3);
		while (input2.hasNextLine()) {
			System.out.println(input2.nextLine());
		}
		input2.close();

	}

}