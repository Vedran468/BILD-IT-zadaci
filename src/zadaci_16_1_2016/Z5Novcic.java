/*5. Napisati metodu koja prima jedan argument te simulira bacanje novcica 
toliko puta. Nakon sto se simulacija zavrsi, program ispisuje 
koliko puta je novcic pokazao glavu a koliko puta pismo.*/
package zadaci_16_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5Novcic {
	
	public static void throwsCoin(int n){
		// definisemo brojac za glava ako se pojavila a ne pismo
		int head = 0;
		// bacamo novic 
		for (int i = 0; i < n; i++) {
			// nasumicno biramo je li 0 ili 1 odnosno glava ili pismno
			int number = (int) (Math.random() * 2);
			//System.out.print(number);
			// ako je 1 poveca brojac 
			if (number == 1) {
				head++;
			}
		}
		
		System.out.println("Letter " + (n - head) + ";\nHead "
				+ head+";");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		// provera je li korisnik uneo broj
		while (continueInput) {
			System.out.println("How many times do you want to flip a coin: ");
			try {
				int n = input.nextInt();
				// prolsedujemo u metodu
				throwsCoin(n);
				// zaustavljamo petlju
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// zaustavljamo unos
		input.close();
	}

}
