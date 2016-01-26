/*5. Napisati program koji ucitava cijele brojeve u rasponu od 1 do 100 
te broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da 
nula prekida unos brojeva. Ukoliko unesemo sljedeci niz brojeva 
2 5 6 23 42 58 2 6 0 
program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, 
broj 6 2 puta, broj 23 jednom, itd.*/
package zadaci_26_1_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5PonovljeniBrojevi {

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// definisemo niz i unjega upisujemo dozvoljene brojeve
		int[] array = new int[100];
		for (int i = 0, j = 1; i < 100; i++, j++) {
			array[i] = j;
		}
		// definisemo niz koji broji koliko se koji broj ponovio
		int[] count = new int[100];
		// varijabla lista za korisnikove unose
		ArrayList<Integer> user = new ArrayList<>();
		// varijabla za korisnikov unos
		int userInput = 1;
		// provera unosa
		while (userInput != 0) {
			System.out.println("Enter the numbers from 1 to 100 (input interrupt 0):");
			try {
				userInput = input.nextInt();
				// provera je li broj izmedju 0 i 100
				if (userInput > 0 && userInput <= 100) {
					// ako jeste dodaj ga listi
					user.add(userInput);
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// prolazimo kroz brojac
		for (int i = 0; i < 100; i++) {
			// prolazimo kroz brojeve koje je korisnik uneo
			for (int j = 0; j < user.size(); j++) {
				// ako je korisnik uneo dozvoljen broj
				if (array[i] == user.get(j)) {
					// na ideks od tog broja u brojacu povecaj vrednost
					count[user.get(j) - 1]++;
				}
			}
		}
		// prolazimo kroz citavu listu
		for (int i = 0; i < user.size(); i++) {
			// od trenutnog indeksa do kraja liste prodji
			for (int j = i; j < user.size() - 1; j++) {
				// ako je trenutni broj liste dupli u listi
				if (user.get(i).equals(user.get(j + 1))) {
					// izbrisi ga
					user.remove(j + 1);
					i = 0;
				}
			}
		}
		// posto preskacemo proveru za 0 indeks proveri ga ovde sa sledecim
		if (user.get(0).equals(user.get(1))) {
			// izbrisi ga
			user.remove(0);
		}
		System.out.println();
		// stampamo rezultat
		for (int i = 0; i < user.size(); i++) {
			for (int j = 0; j < array.length; j++) {
				// provera na kojem se indeksu u brojacu nalazi trenutni broj 
				if (user.get(i)==array[j]) {
					System.out.println("No. " + user.get(i) + " is repeated " + count[j] + " times.");
				}
			}
		}
	}

}
