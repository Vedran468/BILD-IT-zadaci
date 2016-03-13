package zadaci_15_1_2016;

/*3. Napisati metodu koja prima dva cijela broja kao argumente te 
vraca najveci zajednicki djelilac za ta dva broja.*/
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Zad3NajveciDelilac {

	public static int divisor(int n1, int n2) {
		// Varijabla za najveci deljivi broj pocetna vrednost 1
		int gcd = 1;
		// Provera deljivosti da krece od 2
		int k = 2;
		// proveravamo da lii je delilac trenutni broj koji ima k varijabla
		while (k <= n1 && k <= n2) {

			// Ulov if je da li je prvi broj deljiv sa k i drugi
			if (n1 % k == 0 && n2 % k == 0) {

				// ako jesu postaju najveci zajednicki delilac
				gcd = k;
			}

			/*
			 * Ako nisu ili jesu opet povecati k za 1 cisto da se proveri do
			 * kojeg broja ide k, tj. koji je najveci zajednicki delilac.
			 */
			k++;
		}

		return gcd;

	}

	public static void main(String[] args) {

		// Kreiramo skener
		Scanner input = new Scanner(System.in);

		// Printamo korisniku da unese dva broja.
		System.out.println("Enter first integer: ");
		// Kreiram varijablu za prvi broj zatim i za drugi
		int n1 = input.nextInt();
		System.out.println("Enter second integer: ");
		int n2 = input.nextInt();
		// Zaustaviti unos
		input.close();

		// Printati Najmanji zajednicki delilaz za br1 i br2 je
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + divisor(n1, n2));
	}

}
