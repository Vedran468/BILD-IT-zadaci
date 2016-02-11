/*(Sort ArrayList) Write the following method that sorts an ArrayList of
numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.*/
package zadaci_11_2_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2SortiranaLista {
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		System.out.println("Sorted list in ascending order is:\n" + list + ".");
	}

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// liste gde smestamo unos
		ArrayList<Integer> list = new ArrayList<>();
		// korisnikov unos
		int userInput = 1;
		// brojac unosa
		int counter = 0;
		System.out.println("Enter the 5 integers spaced one space to the list:\n");
		// provera je uneto 5 brojeva
		while (counter != 5) {
			counter++;
			try {
				userInput = input.nextInt();
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
		// saljeo u metodu
		sort(list);
	}

}
