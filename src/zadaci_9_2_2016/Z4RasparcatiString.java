/*(New string split method) The split method in the String class returns an
array of strings consisting of the substrings split by the delimiters. However, the
delimiters are not returned. Implement the following new method that returns
an array of strings consisting of the substrings split by the matching delimiters,
including the matching delimiters.
public static String[] split(String s, String regex)
For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
#, and e in an array of String.*/
package zadaci_9_2_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4RasparcatiString {
	public static String[] split(String s, String regex) {
		// lista u koji smestamo stringove
		ArrayList<String> strings = new ArrayList<>();
		// string koji pamti karaktere prije regex karaktera
		String memberArray = "";
		// brojac za proveru
		int counter = 0;
		// indeks stringa s
		int i = 0;
		while (i < s.length()) {
			for (int j = 0; j < regex.length(); j++) {
				// u slucaju uglastih zagrada nastavi
				if (regex.charAt(j) == '[' || regex.charAt(j) == ']') {
					continue;
					// u slucaju da je karakter stringa jednak karakteru regex
				} else if (s.charAt(i) == regex.charAt(j)) {
					// povecaj brojac
					counter++;
				}
			}
			// u zavisnosti od brojaca dodaj string listi
			if (counter == 0) {
				memberArray += s.charAt(i) + "";
			} else {
				strings.add(memberArray);
				strings.add(s.charAt(i) + "");
				memberArray = "";
			}
			counter = 0;
			i++;
		}

		String[] result = new String[strings.size()];

		// podatke iz liste dodeljujemo nizu
		for (int j = 0; j < strings.size(); j++) {
			result[j] = strings.get(j);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// trazimo unos stringa i smestamo ga u varijablu
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		// trazimo unos regex i smestamo unos u varijablu
		System.out.println("Enter your regex, for example if one only \"#\", or if it is more character \"[?#]\"");
		String regex = input.next();
		// podatke saljemo u metodu i rezultat smestamo u niz
		String[] result = split(s, regex);
		System.out.println();
		// stampamo rezultat
		for (int i = 0; i < result.length; i++) {
			if (i < result.length - 1) {
				System.out.print(result[i] + ", ");
			} else {
				System.out.print(result[i] + ". ");
			}
		}
		// zatvaramo unos
		input.close();
	}
}
