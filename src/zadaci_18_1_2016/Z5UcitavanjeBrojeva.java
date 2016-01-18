/*5. Napisati program koji ucitava neodredeni broj cijelih 
brojeva (nula prekida unos) te ispisuje koliko je brojeva 
bilo iznad ili jednako prosjeku svih unesenih brojeva a 
koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je 
maksimalan niz brojeva koje korisnik moze unijeti 100.*/
package zadaci_18_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5UcitavanjeBrojeva {

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// definisemolistu u koju smestamo korisnikov unos
		ArrayList<Integer> numbers = new ArrayList<>();
		// brojac unosa
		int counter = 0;
		// brojac za iznad proseka
		int aboveAverage = 0;
		// brojac za ispod proseka
		int belowAverage = 0;
		// brojac za jednako proseku
		int equalsAverage = 0;
		// varijabla za zbir
		int sum = 0;
		// varijabla za prosek
		double average = 0;
		// varijabla za korisnikov unos
		int number = 1;

		// petlja radi dok korisnik ne unese 0 ili 100 brojeva ne ukljucujuci 0
		while (number != 0 || counter == 101) {

			System.out.println("Enter integers, input interrupt 0: ");
			number = input.nextInt();
			// ako nije 0 
			if (number!=0){
				// povecaj brojac
				counter++;
			// dodavanje u listu korisnikove brojeve
			numbers.add(number);

			// zbir izracunaj
			sum = sum + number;
			}
		}
		// prosek izracunaj
		average = (double) (sum) / (double) (counter);
		// provera koliko je bilo brojeva ispod, iznad ili isto proseku
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < average) {
				belowAverage++;

			} else if (numbers.get(i) > average) {
				aboveAverage++;
			} else {
				equalsAverage++;
			}

		}
		// zatvaramo unos
		input.close();
		// stampamo rezultat
		System.out.println("If the average is " + average + ";" + "\nNo numbers below the average is " + belowAverage
				+ ";" + "\nNo numbers above the average is " + aboveAverage + ";" + "\nNo numbers equal average was "
				+ equalsAverage + ", based on your input numbers;");

	}

}
