/*(Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)
For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
{2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
each with five integers, and displays their union. The numbers are separated by
exactly one space in the output.*/
package zadaci_11_2_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5Kombinacija2Liste {

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// kreiramo listu koju metoda vraca
		ArrayList<Integer> result = new ArrayList<>();
		// u nju smestamo msve brojeve prve liste
		for (int i = 0; i < list1.size(); i++) {
			result.add(list1.get(i));
		}
		// u nju smestamo msve brojeve druge liste liste
		for (int i = 0; i < list1.size(); i++) {
			result.add(list2.get(i));
		}
		return result;
	}

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		// liste gde smestamo unos
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		// korisnikov unos
		int userInput = 1;
		// brojac unosa
		int counter = 0;
		System.out.println("Enter the 5 integers spaced one space to the first list:\n");
		// provera je uneto 5 brojeva
		while (counter != 5) {
			counter++;
			try {
				userInput = input.nextInt();
				// dodavanje u listu1
				list1.add(userInput);
				// u slucaju greske
			} catch (Exception e) {
				System.out.println("Enter integer!!!");
				input.nextLine();
			}
		}
		// ponistavanje brojaca
		counter = 0;
		System.out.println("Enter the 5 integers spaced one space to a second list:\n");
		// provera je uneto 5 brojeva
		while (counter != 5) {
			counter++;
			try {
				userInput = input.nextInt();
				// dodavanje u listu2
				list2.add(userInput);
				// u slucaju greske
			} catch (Exception e) {
				System.out.println("Enter integer!!!");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// saljeo u metodu i stampamo rezultat
		System.out.println("List combining of the two lists is:\n" + union(list1, list2) + ".");
	}

}
