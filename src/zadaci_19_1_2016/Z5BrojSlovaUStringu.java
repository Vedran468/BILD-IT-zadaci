/*5. Napisati metodu koja broji slova u stringu. Metoda 
treba koristiti sljedeci header: 
	public static int countLetters(String s). 
Napisati program koji pita korisnika da unese neki string
te mu vrati koliko taj string ima slova.*/
package zadaci_19_1_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic 
 *
 */
public class Z5BrojSlovaUStringu {

	public static int countLetters(String s) {
		// pretvaramo unesena sva slova u mlal
		String temp = s.toLowerCase();
		// pa u karaktere
		char[] characters = temp.toCharArray();
		// brojac slova
		int countLetters = 0;
		// prolazimo kroz dobijeni string i proveravamo ima li slova
		for (int i = 0; i < characters.length; i++) {
			if ((int) (characters[i]) >= 97 && ((int) (characters[i]) <= 122)) {
				countLetters++;
			}
		}
		// metoda vraca brojac
		return countLetters;
	}

	public static void main(String[] args) {

		// kreiramo skener
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		// pohranjujemo u varijablu unos
		String sentence = input.nextLine();
		// zatvaramo unos
		input.close();
		// saljemo u metodu string i stampamo rezultat
		if(countLetters(sentence)==0){
			System.out.println("Your sentence does not contain letters!!!");
		}else{
		System.out.println("Your sentence has " + countLetters(sentence) + " letters");
		}
	}

}
