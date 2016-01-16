/*3. Napisite program koji ce brojati broj karaktera, 
rijeci i linija teksta u nekom fileu. Rijeci trebaju biti odvojene 
jednim spaceom. Ime file proslijediti kao argument u vas program. */
package zadaci_16_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3Fajl {
	public static void file(String name) throws Exception {
		// objekat u klasi fajl kome prosledjuemo ime fajla
		java.io.File file = new java.io.File(name);
		// kreiramo skener da skenira sto se nalazi u objektu
		Scanner input = new Scanner(file);
		// kreiramo niz gde smestamo redove
		ArrayList<String> line = new ArrayList<>();
		// varjiabla kojom cemo dodeliti vrednosti
		String words = "";
		// prolazimo kroz sve redove u fajlu
		while (input.hasNextLine()) {
			// sadrzaj redova dodeljujeo listi
			line.add(input.nextLine());
		}
		// definisemo broj redova
		int lines = line.size();
		// prolazimo kroz niz i dodeljujemo stringu sadrzaj niza, tj citav tekst
		// smestamo u string
		for (int i = 0; i < line.size(); i++) {
			words = words + line.get(i);
		}
		// string pretvaramo u niz karaktera
		char[] c = words.toCharArray();
		// definisemo broj karaktera
		int characters = c.length;
		// brojac reci
		int numberWords = 0;
		// prolazimo kroz niz karaktera 
		for (int i = 0; i < c.length; i++) {
			// i ako je karakter jednak praznom polju povecaj broj reci
			if (c[i] == ' ') {
				numberWords++;
			}
		}
		// stampamo resenje
		System.out.println("Your file has " + lines + " lines;\nYour file has " + characters
				+ " characters;\nYour file has " + numberWords + " words.");
		input.close();
	}

	public static void main(String[] args) throws Exception {
		// skener za unos
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the file name or adresu: ");
		// C:\\Users\\Srki\git\\BILD-IT-zadaci\\src\\zadaci_16_1_2016\\test2
		String name = input.nextLine();
		// string prosledjujemo u metodu
		file(name);
		input.close();
	}

}
