/*(Baby name popularity ranking) The popularity ranking of baby names from
years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
babynameranking2010.txt. Each file contains one thousand lines. Each line
contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
and number for the girl’s name. For example, the first two lines in the file
babynameranking2010.txt are as follows:
So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s
name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named
Jacob and 22,731 girls are named Isabella. Write a program that prompts the
user to enter the year, gender, and followed by a name, and displays the ranking
of the name for the year.*/
package zadaci_17_2_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3PopularnostImena {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		// korisnikov unos za godinu
		int year = 1;
		// provera unosa
		boolean checkingEntry = true;

		// radi dok unos ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter a year between 2010 and 2014: ");
			try {
				year = input.nextInt();
				if (year >= 2010 && year <= 2014) {
					checkingEntry = false;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!!");
				input.nextLine();
			}
		}
		// ponistavamo za proveru unos
		checkingEntry = true;

		// radi dok unos ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter the gender (M or F): ");
			if (input.next().toUpperCase().equals("M") || input.next().toUpperCase().equals("F")) {
				checkingEntry = false;
			}
		}

		checkingEntry = true;
		String name = "";
		// radi dok unos ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter the name, the first letter must be a lot of other small: ");
			name = input.next();
			int counter = 0;
			if ((int) (name.charAt(0)) >= 65 && (int) (name.charAt(0)) <= 90) {
				for (int i = 1; i < name.length(); i++) {
					if ((int) (name.charAt(i)) >= 97 && (int) (name.charAt(i)) <= 122) {
						counter++;
					}
				}
			}
			if (counter == (name.length() - 1)) {
				checkingEntry = false;
			}
		}

		// zatvaramo unos
		input.close();
		// varijable za pohranu teksta iz fajla koji sadrzi ime i rang
		String line = "";
		String rank = "";

		// pretrzai fajl za godinu unosa
		File file = new File("imena" + year + ".txt");
		Scanner input2;
		try {
			input2 = new Scanner(file);
			do {
				line = input2.nextLine();
				if (line.contains(name)) {
					break;
				} else {
					line = "";
				}
			} while (input2.hasNextLine());
			input2.close();
			// u slucaju greske
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// stampamo rezultat u zavisnosti da li ime postoji
		if (line.equals("")) {
			System.out.println("The name " + name + " is not ranked in year " + year + ".");
		} else {
			for (int i = 0; i < 6; i++) {
				if ((int) (line.charAt(i)) <= 57 && (int) (line.charAt(i)) >= 48) {
					rank += line.charAt(i);
				}
			}
			System.out.println(name + " is ranked #" + rank + " in year " + year + ".");
		}
	}
}