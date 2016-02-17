/*(Process large dataset) A university posts its employees’ salaries at http://
cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
member’s first name, last name, rank, and salary (see Programming Exercise
12.24). Write a program to display the total salary for assistant professors,
associate professors, full professors, and all faculty, respectively, and display
the average salary for assistant professors, associate professors, full professors,
and all faculty, respectively.*/
package zadaci_17_2_2016;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1Fakultet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String URLString = "";
		// smestamo podatke sa weba u listu
		ArrayList<String> line = new ArrayList<>();
		// brojaci rangova profesora
		int assistant = 0;
		int associate = 0;
		int full = 0;
		// provera url adrese
		boolean check = true;
		while (check) {
			// korisniku da unese url adresu
			System.out.print("Enter a URL:\n");
			try {
				URLString = in.next();
				URL url = new URL(URLString);
				Scanner input = new Scanner(url.openStream());
				check = false;
				// podatke sa weba smestamo u listu
				while (input.hasNext()) {
					line.add(input.nextLine());
				}
				input.close();
				// u slucaju greske
			} catch (MalformedURLException ex) {
				System.out.println("Invalid URL");

			} catch (IOException ex) {
				System.out.println("I/O Errors: no such file");
			}
		}
		in.close();
		// pomocni stringovi i varijable za prosek
		String s = "";
		String s2 = "";
		double averageAssistant = 0;
		double averageAssociate = 0;
		double averageFull = 0;
		// iscitavamo iz liste podatke sa weba
		for (int i = 0; i < line.size(); i++) {

			if (line.get(i).contains("assistant")) {
				// ponistavamo pomocne stringove
				s = "";
				s2 = "";
				char[] c = line.get(i).toCharArray();
				for (int j = c.length - 1; j >= 0; j--) {
					if (c[j] == ' ') {
						break;
					} else {
						s += c[j] + "";
					}
				}
				// okrecemo string naopako
				for (int j = s.length() - 1; j >= 0; j--) {
					s2 += s.charAt(j);
				}
				// u listi karaktera izdvajamo brojcanu vrednost plate
				assistant++;
				averageAssistant += Double.parseDouble(s2);
			} else if (line.get(i).contains("associate")) {
				// ponistavamo pomocne stringove
				s = "";
				s2 = "";
				// u listi karaktera izdvajamo brojcanu vrednost plate
				char[] c = line.get(i).toCharArray();
				for (int j = c.length - 1; j >= 0; j--) {
					if (c[j] == ' ') {
						break;
					} else {
						s += c[j] + "";
					}
				}
				// okrecemo string naopako
				for (int j = s.length() - 1; j >= 0; j--) {
					s2 += s.charAt(j);
				}
				// povecavamo brojac za rang profesora i sabiramo plate
				associate++;
				averageAssociate += Double.parseDouble(s2);
			} else if (line.get(i).contains("full")) {
				// ponistavamo pomocne stringove
				s = "";
				s2 = "";
				char[] c = line.get(i).toCharArray();
				// u listi karaktera izdvajamo brojcanu vrednost plate
				for (int j = c.length - 1; j >= 0; j--) {
					if (c[j] == ' ') {
						break;
					} else {
						s += c[j] + "";
					}
				}
				// okrecemo string naopako
				for (int j = s.length() - 1; j >= 0; j--) {
					s2 += s.charAt(j);
				}
				// povecavamo brojac za rang profesora i sabiramo plate
				full++;
				averageFull += Double.parseDouble(s2);
			}
		}
		// racunanje ukupne plate po rangu profesora
		BigDecimal sumaAssistant = new BigDecimal((averageAssistant + ""));
		BigDecimal sumaAssociate = new BigDecimal((averageAssociate + ""));
		BigDecimal sumaFull = new BigDecimal((averageFull + ""));

		// varijabla za ukupnu platu
		BigDecimal sumaAll = new BigDecimal((averageFull + averageAssistant + averageAssociate) + "");

		// racunamo proseke
		double averageAll = (averageFull + averageAssistant + averageAssociate) / (full + assistant + associate);
		averageAssistant = averageAssistant / assistant;
		averageAssociate = averageAssociate / associate;
		averageFull = averageFull / full;

		// stampamo rezultate
		System.out.printf("\nThe total salary for an assistant is:\n%2.2f.", sumaAssistant);
		System.out.printf("\nAverage salary for assistantis:\n%2.2f.", averageAssistant);
		System.out.printf("\n\nTotal salaries for associate professors is:\n%2.2f.", sumaAssociate);
		System.out.printf("\nAverage salary of the associate professors is:\n%2.2f.", averageAssociate);
		System.out.printf("\n\nThe total salary for full professors is:\n%2.2f:", sumaFull);
		System.out.printf("\nAverage salary of full professors is:\n%2.2f.", averageFull);
		System.out.printf("\n\nThe total amount of the faculty of the salaries is:\n%2.2f.", sumaAll);
		System.out.printf("\nAverage faculty salariesis:\n%2.2f.", averageAll);

		/*
		 * http://cs.armstrong.edu/liang/data/Salary.txt
		 */

	}

}
