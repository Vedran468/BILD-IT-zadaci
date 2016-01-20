/*4. Napisati program koji pita korisnika da unese neki string 
te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
Na primjer, ako korisnik unese string Beijing Chicago, program vraca 
BiigCiao.*/
package zadaci_20_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
import java.util.Scanner;

public class Z4IspisNeparnihPozicijaUStringu {

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		// smestamo korisnikov unos u varijabl;u
		String sentence = input.nextLine();
		// pretvaramo string u karaktere
		char[] characters = sentence.toCharArray();
		// stampamo rezultat
		System.out.println("On the odd positions of the letters:");
		for (int i = 0; i < characters.length; i++) {
			if (i % 2 == 0) {
				System.out.print(characters[i]);
			}
		}
		// zatvaramo unos
		input.close();

	}

}
