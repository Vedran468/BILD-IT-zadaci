package zadaci_15_1_2015;

import java.util.Scanner;

/*2.Pretpostavimo da su slova A, E, I, O i U samoglasnici. Napisati program koji
pita korisnika da unese string te mu ispiste broj samoglasnika i suglasnika 
u datom stringu.*/

public class Zad2Samoglasnici {
	/**
	 * @author Vedran Vidakovic
	 *
	 */
	public static void main(String[] args) {

		// lista samoglasnika
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		// skener 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence or word");
		// korisnikov unos smestamo u varijablu
		String user = input.nextLine();
		// pretvaramo sve u mala slova
		String l = user.toLowerCase();

		// pretvaramo unos u karaktere
		char[] u = l.toCharArray();
		// definisemo brojac
		int[] numberVowels = new int[vowels.length];
		// ispitujemo koliko je samoglasnika
		for (int i = 0; i < u.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (u[i] == vowels[j]) {
					numberVowels[j]++;
				}
			}
		}
		// stamamo rezultat
		for (int j = 0; j < vowels.length; j++) {
			System.out.println("The letters " + vowels[j] + " has " + numberVowels[j] + ";");
		}
		input.close();
	}

}
