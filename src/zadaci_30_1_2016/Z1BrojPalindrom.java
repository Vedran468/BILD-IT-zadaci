/*1. Napisati program koji pita korisnika da unese cijeli trocifreni broj
te provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko 
se cita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd*/
package zadaci_30_1_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1BrojPalindrom {

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		// strin da broj pretvorimo u string radi lakse manipulacije sa njim
		String s = "";
		// korisnikov unos
		int number = 0;
		// nastavi unos varijabla za proveru je korisniik uneo trocifren ceo
		// broj
		boolean continueInput = true;
		// provera je li korisnikov unos ispravan
		while (continueInput) {
			System.out.println("Enter the three-digit integer: ");
			try {
				number = input.nextInt();
				// broj pretvaramo u string
				s = number + "";
				// provera je li broj pozitivan ili negativan i je li trocifren
				if (s.charAt(0) == '-' && s.length() == 4) {
					// zaustavljamo petlju
					continueInput = false;
				} else if (s.charAt(0) != '-') {
					if (s.length() == 3)
						continueInput = false;
				} else {
					continueInput = true;
				}
				// u slucaju greske pri unosu
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// zaustavljamo unos
		input.close();
		// pretvaramo strnig sa brojem u karaktere
		char[] characters = s.toCharArray();
		// lista da smestimo karaktere stringa
		ArrayList<Character> result = new ArrayList<>();
		// smestamo karaktere stringa u niz
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] != '-') {
				result.add(characters[i]);
			}
		}

		// varijabla za proveru je li broj palindrom
		boolean isPalindrome = false;

		// Varijabla za prvi indeks u listi
		int low = 0;
		// Varijabla za poslednji indeks u listi
		int high = result.size() - 1;
		// petlja radi dok indeks koji je devinisan kao duzina liste ne postane
		// 0
		while (high != 0) {

			if (result.get(low) == result.get(high)) {
				/*
				 * Ako jeste jednak prvi sa poslednjim indeksom liste, prvi
				 * indeks povecati a poslednji smanjiti za 1
				 */
				high--;
				low++;

			} else {
				// ako nije zaustavi petlju
				break;
			}
		}
		// ako je broj koji je kretao od 0 dosao do poslednjeg indeksa liste
		// vrati tacno da je palindrom, inace vrati da nije
		if (low == result.size() - 1) {
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		// ispisi rezultat ako je palindrom broj i ako nije
		if (isPalindrome) {
			System.out.println("Number " + number + " is a palindrome!!!");
		} else {
			System.out.println("Number " + number + " is not a palindrome!!!");
		}
	}

}
