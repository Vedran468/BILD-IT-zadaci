/*3. Napisati metode sa sljedecim headerima: 
	public static int reverse(int number) i 
	public static boolean isPalindrome(int number). 
Prva metoda prima cijeli broj kao argument i vraca isti 
ispisan naopako. (npr. reverse(456) vraca 654.) 
Druga metoda vraca true ukoliko je broj palindrom a 
false ukoliko nije. Koristite reverse metodu da implementirate 
isPalindrome metodu. Napisite program koji pita korisnika da 
unese broj te mu vrati da li je broj palindrome ili ne. */
package zadaci_20_1_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3MetodeUnazadIPalindrom {
	public static int reverse(int number) {
		// za cifru varijabla tj. ostatku deljenje od 10
		int digit = 0;
		// rezultat varijabla
		int result = 0;

		do {
			// definisemo ostatak deljenja sa 10 tj poslednju cifru
			digit = number % 10;
			// dodajemo rezultatu cifre
			result = result * 10 + digit;
			// razbijamo broj dok ne postane 0
			number /= 10;
		} while (number != 0);
		// stampamo resenje metode palindrom kojoj saljemo broj
		System.out.println(isPalindrome(result) ? "Your number is a palindrome!!!" : "Your number is not palnidrom!!!");
		// ova metoda vraca definisani broj za rezultat
		return result;
	}

	public static boolean isPalindrome(int number) {
		// za pretvorene cifre da se smeste u listu radi provere je li broj
		// palindrom
		ArrayList<Integer> result = new ArrayList<>();
		// varaijabla za cifre
		int digit = 0;
		do {
			// poslednja cifra broja
			digit = number % 10;
			// dodaj je u listu
			result.add(digit);
			// odbij poslednju cifru
			number /= 10;
		} while (number != 0);

		// Varijabla za prvi indeks u listi
		int low = 0;
		// Varijabla za poslednji indeks u listi
		int high = result.size() - 1;
		// provera je li broj palindrom
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
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// skener
		Scanner input = new Scanner(System.in);
		// investicija
		int number = 0;
		// varijable za proveru unosa
		boolean checkingEntry = true;
		// provera unosa broja
		while (checkingEntry) {
			System.out.println("Enter an integer for example, 123 or 12321: ");
			try {
				number = input.nextInt();
				checkingEntry = false;

				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter an integer: ");
				input.nextLine();
			}
		}
		// saljemo u metodu za obrnuto i stampamo broj
		System.out.println("Your number in reverse has numbers: " + reverse(number));
		// zaustavljamo unos
		input.close();
	}

}
