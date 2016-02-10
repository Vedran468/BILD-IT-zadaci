/*(Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending
with 0, and invokes this method to return the largest number in the input.*/
package zadaci_10_2_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3MaksimalniElementListe {

	public static Integer max(ArrayList<Integer> list) {
		// sortiramo listu
		java.util.Collections.sort(list);
		// i vratimo poslednji clan
		return list.get(list.size() - 1);
	}

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		// lista gde smestamo unos
		ArrayList<Integer> list = new ArrayList<>();
		// korisnikov unos
		int userInput = 1;
		// provera je li 0
		while (userInput != 0) {
			System.out.println("Enter the numbers spaced single space (input interrupt 0):");
			try {
				userInput = input.nextInt();
				// dodavanje u listu
				list.add(userInput);
				// u slucaju greske
			} catch (Exception e) {
				System.out.println("Enter integer!!!");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// saljeo u metodu da pronadje maksimalan broj
		System.out.println("Max array list is: " + max(list) + ".");
	}

}
