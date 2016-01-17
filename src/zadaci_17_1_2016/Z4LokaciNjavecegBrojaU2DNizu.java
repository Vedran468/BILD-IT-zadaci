/*4. Napisati metodu koja vraca lokaciju najveceg elementa 
u 2D nizu. Metoda treba da koristi sljedeci header:

public static int[ ] locateLargest(double[ ][ ] a)

Napisati test program koji pita korisnika da unese 2D niz 
te mu ispisuje lokaciju najveceg elementa u nizu.*/
package zadaci_17_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z4LokaciNjavecegBrojaU2DNizu {
	public static int[] locateLargest(double[][] a) {
		// kreiramo niz koji ce imati vrednost lokacije
		int[] locate = new int[2];
		// radi poredjenja varijabla maksimalni broj u matrici
		double max = 0;

		// Iscitavamo matricu po redovima i kolonama
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				// uporedjujemo i nlazimo najveci broju matrici i indekse
				// dodeljujemo nizu
				if (a[row][column] > max) {
					max = a[row][column];
					locate[0] = row;
					locate[1] = column;
				}
			}
		}
		// vracamo niz
		return locate;
	}

	public static void main(String[] args) {

		// Kreiramo Skener za unos
		Scanner input = new Scanner(System.in);
		// Kreiramo varijablu za redove
		int rows = 0;
		// nastavi unos varijable za proveru da li je korisniik uneo broj
		boolean continueInput = true;

		// provera je li korisnik uneo broj za redove
		while (continueInput) {
			System.out.println("Enter the number of rows: ");
			try {
				rows = input.nextInt();
				// zaustavljamo petlju
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// Kreiramo varijablu za kolone
		// Kreiramo varijablu za redove
		int columns = 0;

		// nastavi unos varijable za proveru da li je korisniik uneo broj za
		// kolone
		boolean continueInput1 = true;

		// provera je li korisnik uneo broj za redove
		while (continueInput1) {
			System.out.println("Enter the number of columns: ");
			try {
				columns = input.nextInt();
				// zaustavljamo petlju
				continueInput1 = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}

		// kreiramo niz velicine koju je korisnik definisao
		double a[][] = new double[rows][columns];

		// Unesite reda i kolona
		System.out.println("Enter " + a.length + " rows and " + a[0].length + " columns: ");

		// Prolazimo kroz sve redove i kolone moatrice
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				// varijabla za proveru da li korisnik unosi brojeve
				boolean continueInput3 = true;
				// provera je li korisnik unosi brojeve
				while (continueInput3) {
					try {
						// U matricu unosimo korisnikov unos
						a[row][column] = input.nextDouble();

						// zaustavljamo petlju
						continueInput3 = false;
					} catch (InputMismatchException ex) {
						System.out.println("Try again. (" + "Incorrect input: enter the number!)");
						input.nextLine(); // Discard input, odbaci predhodni
											// unos
					}
				}
			}
		}

		// Matrica koju ste vi unjeli je
		System.out.println("Matrix you entered is: ");

		// Iscitavamo matricu po redovima i kolonama
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {

				// Stampamo matricu
				System.out.printf("%6.2f ", a[row][column]);
			}
			// kda zavrsi sa redom predji u novi
			System.out.println();
		}
		// Zaustavljamo unos
		input.close();
		// smestamo rezultat iz metode u niz
		int[] r = locateLargest(a);
		// stampamo rezultat
		System.out.println("Location largest number is: [" + r[0] + "][" + r[1] + "].");
	}

}
