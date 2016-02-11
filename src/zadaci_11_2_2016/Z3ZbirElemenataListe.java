/*(Sum ArrayList) Write the following method that returns the sum of all numbers
in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum.*/
package zadaci_11_2_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3ZbirElemenataListe {
	public static double sum(ArrayList<Double> list) {
		// definisemo zbir varijablu
		double sum = 0;
		// prolazimo kroz listu i sabiramo ih
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// lista gde smestamo unos
		ArrayList<Double> list = new ArrayList<>();
		// korisnikov unos
		double userInput = 1;
		// brojac unosa
		int counter = 0;
		System.out.println("Enter the 5 integers spaced one space to the list:\n");
		// provera je uneto 5 brojeva
		while (counter != 5) {
			counter++;
			try {
				userInput = input.nextDouble();
				// dodavanje u listu1
				list.add(userInput);
				// u slucaju greske
			} catch (Exception e) {
				System.out.println("Enter integer!!!");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// saljeo u metodu i stampamo unos
		System.out.println("The sum of all elements in the list is " + sum(list) + ".");
	}

}
