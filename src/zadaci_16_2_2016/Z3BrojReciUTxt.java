/*(Count words) Write a program that counts the number of words in President
Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
Lincoln.txt.*/
package zadaci_16_2_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3BrojReciUTxt {

	public static void main(String[] args) throws FileNotFoundException {

		int counter = 0;

		//  iscitamo sta se nalazi u fajlu
		File file = new File("tekst.txt");
		Scanner in2 = new Scanner(file);
		while (in2.hasNext()) {
			// cisto da se uradi nesto sa podatkom koji iscitamo da bi brojac
			// radio
			@SuppressWarnings("unused")
			String s = in2.next();
			counter++;
		}
		in2.close();
		// stampamo rezultat
		System.out.println("The text is " + counter + " words.");
	}

}
