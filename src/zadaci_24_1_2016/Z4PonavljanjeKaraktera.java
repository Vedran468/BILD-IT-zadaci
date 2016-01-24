/*4. Napisati metodu koja pronalazi broj ponavljanja odredenog karaktera
u stringu. Metoda treba da koristi sljedeci header: 
	public static int count(String str, char a). 
Na primjer, ukoliko pozovemo metodu na sljedeci nacin: 
	count("Welcome", e) 
metoda treba da vrati 2. 
Napisati program koji pita korisnika da unese string i koji karakter zeli da 
prebroji u datom stringu te mu ispise koliko se puta odredeni karakter 
ponovio u zadatom stringu.*/
package zadaci_24_1_2016;

import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z4PonavljanjeKaraktera {
	public static int count(String str, char a) {
		// brojac karaktera
		int count = 0;
		// pretvaramo string u karaktere
		char[] characters = str.toCharArray();
		// prolazimo kroz string i poredimo ima li definisanog karaktera
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == a) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or sentence");
		// korisnikov unos stringa stavljamo u varijablu
		String str = input.nextLine();
		// provera je li korisnik uneo 1 karakter
		boolean checkingEntry = true;
		// varijabla za karakter
		String a = null;
		System.out.println("Which character you want to count: ");
		// petlja radi dok korisnik ne unese 1 karakter
		while (checkingEntry) {
			a = input.next();
			// proveravamo je li unet jedan karakter
			if (a.length() != 1) {
				System.out.println("Enter 1 character!!!");
				checkingEntry = true;
			} else {
				checkingEntry = false;
			}
		}
		// zatvaramo unos
		input.close();
		// stampamo rezultat
		System.out.println("In the string: \n\"" + str + "\",\n the character \"" + a.charAt(0) + "\" appears "
				+ count(str, a.charAt(0)) + " times.");
	}

}
