/*5. Napisati program koji pita korisnika da unese dva stringa te 
provjerava i ispisuje da li je drugi string substring prvog stringa. 
Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC 
kao drugi string program mu ispisuje da je BC substring ABCD stringa.*/
package zadaci_24_1_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5Substring {

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		// smestamo u varijablu prvi unos
		String s1 = input.nextLine();
		System.out.println("Enter the second string: ");
		// smestamo u varijablu drugi unos
		String s2 = input.nextLine();
		// pretvaramo unose u karaktere
		char[] characters1 = s1.toCharArray();
		char[] characters2 = s2.toCharArray();
		// varijabla za rezultat sybstringa
		String result = "";
		// proveravamo da li je drugi unos substring prvog unosa
		for (int i = 0; i < characters2.length; i++) {
			for (int j = 0; j < characters1.length; j++) {
				if (characters2[i] == characters1[j]) {
						result += characters2[i];
					}
				}
			}
		
		// zaustavljamo unos
		input.close();
		// stampamo rezultat
		System.out.println("\"" + result + "\" is substring \"" + s1 + "\" string.");
	}

}
