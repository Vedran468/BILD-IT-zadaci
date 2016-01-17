/*5. Implementirati sljedecu metodu da sortira redove u 2D nizu.

public static double[ ][ ] sortRows(double[ ][ ] array)

Napisati testni program koji pita korisnika da unese 3x3 matricu 
(ili da pita korisnika koliku matricu zeli unijeti) te mu ispisuje na 
konzoli matricu sa sortiranim redovima - od najmanjeg 
broja do najveceg.*/

package zadaci_17_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5SortiranjeRedova {
	// dodatak
	public static double[][] sortColumn(double[][] array) {
		// prolazimo kroz matricu
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				// proveravamo koji je clan po koloni manji
				if (row != array.length - 1) {
					if (array[row][column] > array[row + 1][column]) {
						double temp = array[row][column];
						array[row][column] = array[row + 1][column];
						array[row + 1][column] = temp;
					}
				}
			}
		}
		// vracamo niz
		return array;

	}

	public static double[][] sortRows(double[][] array) {
		// prolazimo kroz matricu
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				// proveravamo koji je clan po redu manji
				if (column != array[row].length - 1) {
					if (array[row][column] > array[row][column + 1]) {
						double temp = array[row][column];
						array[row][column] = array[row][column + 1];
						array[row][column + 1] = temp;
					}
				}
			}
		}
		// vracamo niz
		return array;

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

		// smestamo rezultat iz metode u matricu
		double[][] r = sortRows(a);
		// stampamo rezultat
		System.out.println("\nSort matrices by rows:\n");
		// Iscitavamo matricu po redovima i kolonama
		for (int row = 0; row < r.length; row++) {
			for (int column = 0; column < r[row].length; column++) {

				// Stampamo matricu
				System.out.printf("%6.2f ", r[row][column]);
			}
			// kda zavrsi sa redom predji u novi
			System.out.println();
		}
		// buduci da je matrica a vec jednom bila sortirana po redovima ova
		// metoda znaci vise na sortira matricu a vec matricu r ako zelite da
		// vas unos bude sortiran po kolonama pretvorite u komentar kod od
		// linije koda 144 do 157
		// pozvati ako zelimo po kolonam
		double[][] c = sortColumn(a);

		// stampamo rezultat
		System.out.println("\nSort matrices by columns\n");
		// Iscitavamo matricu po redovima i kolonama
		for (int row = 0; row < c.length; row++) {
			for (int column = 0; column < c[row].length; column++) {

				// Stampamo matricu
				System.out.printf("%6.2f ", c[row][column]);
			}
			// kda zavrsi sa redom predji u novi
			System.out.println();
		}
	}

}
