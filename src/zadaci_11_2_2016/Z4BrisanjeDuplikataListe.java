package zadaci_11_2_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Z4BrisanjeDuplikataListe {

	public static void removeDuplicate(ArrayList<Integer> list) {
		// kreiramo listu koju metoda vraca
		ArrayList<Integer> result = new ArrayList<>();
		// definisemo brojac
		int counter = 0;
		// uporedjujemo da li se nalaze dupli brojevi
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < result.size(); j++) {
				if (list.get(i) == result.get(j)) {
					// ako da povecaj brojac
					counter++;
				}
			}
			// ako je brojac 0 znaci nije dupli broj dodaj ga u listu
			if (counter == 0) {
				result.add(list.get(i));
			}
			// ponisti brojac
			counter = 0;
		}
		// stampamo rezultat
		System.out.println("Unique numbers are:\n" + result + ".");
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
		System.out.println("Enter the 10 integers spaced one space to the list:\n");
		// provera je uneto 10 brojeva
		while (counter != 10) {
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
		removeDuplicate(list);
	}

}
