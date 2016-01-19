/*3. Napisati program koji pita korisnika da unese 2 stringa  
te ispisuje najveci zajednicki prefix za ta dva stringa, ukoliko 
isti postoji. Na primjer, ukoliko korisnik unese sljedeca dva 
stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" 
program treba da ispise: Najveci zajednicki prefix za dva stringa je 
"Dobrodošli u". */
package zadaci_19_1_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3ZajednickiPrefix {

	public static void main(String[] args) {
		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// varijabla za resenje
		String result = "";
		System.out.println("Enter the first sentence: ");
		// smestamo unos i pretvaramo ga u karaktere
		String firstSentence = input.nextLine();
		char[] char1 = firstSentence.toCharArray();
		System.out.println("Enter the second sentence: ");
		// smestamo unos i pretvaramo ga u karaktere
		String secondSentence = input.nextLine();
		char[] char2 = secondSentence.toCharArray();
		// varijabla za duzu recenicu
		int maxSize = 0;
		// provera koja je duza recenica
		if (char1.length < char2.length) {
			maxSize = char2.length;
		} else if (char1.length > char2.length) {
			maxSize = char1.length;

		} else {
			maxSize = char1.length;
		}

		// provera zajednickih prvih karaktera 2 recenice
		for (int i = 0; i < maxSize; i++) {
			if (char1[i] == char2[i]) {
				result += char1[i];
			} else {
				break;
			}
		}
		// zaustavljamo unos
		input.close();
		// stampamo rezultat
		if(result.length()==0){
			System.out.println("No common prefixes!!!");
		}else{
		System.out.println("Common prefixes are: \"" + result + "\".");
		}
	}

}
