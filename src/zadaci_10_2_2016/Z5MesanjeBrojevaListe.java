/*(Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list)*/
package zadaci_10_2_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5MesanjeBrojevaListe {
	public static void shuffle(ArrayList<Integer> list){
		// jednostavno ukucate umesto trazite Shuffle
		java.util.Collections.shuffle(list);
		// stampamo rezultat
		System.out.println("After shuffle array list is:\n" + list);
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
		// saljeo u metodu 
		shuffle(list);
	}

}
