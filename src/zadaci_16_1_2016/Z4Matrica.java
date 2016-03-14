/*4. Napisati metodu koja ispisuje n x n matricu korsiteci sljedeci header: 

public static void printMatrix(int n)

Svaki element u matrici je ili 0 ili 1, generisan nasumicno. 
Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.*/
package zadaci_16_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4Matrica {
	public static void printMatrix(int n) {

		// Definisemo matricu velicine nxn
		int[][] m = new int[n][n];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// dodeljujemo matrici brojeve  0 i 1
				m[i][j] = (int) (Math.random() * 2);
				// Stampamo matricu
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		// provera je li korisnik uneo broj
		while (continueInput) {
			System.out.println("How matrix you want: ");
			try {
				int n = input.nextInt();
				// prolsedujemo u metodu
				printMatrix(n);
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
