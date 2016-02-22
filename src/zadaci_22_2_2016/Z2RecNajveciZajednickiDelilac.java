/*(Compute greatest common divisor using recursion) The gcd(m, n) can also
be defined recursively as follows:
- If m % n is 0, gcd(m, n) is n.
- Otherwise, gcd(m, n) is gcd(n, m % n).
Write a recursive method to find the GCD. Write a test program that prompts the
user to enter two integers and displays their GCD.*/
package zadaci_22_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z2RecNajveciZajednickiDelilac {

	public static int gcd(int m, int n) {
		// u sliucaju da su brojevi manji od 10 npr 3 i 4 a i da nisu jednaki
		// samo ih pomnozi
		if (n < 10 && m < 10 && m != n) {
			return m * n;
			// inace proveri jesu li jednaki ako jesu vrati n
		} else if (m % n == 0) {
			return n;
			// inace "m" postaje "n", a "n" postaje ostatak od deljenja m i n
			// dok ne postanu jednaki m i n odnosno (n i m%n)
		} else {
			return gcd(n, m % n);
		}
	}

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		// korisnikov unos
		int m = 0;
		int n = 0;

		// varijabla za proveru unosa
		boolean check = true;

		// provera unosa
		while (check) {
			try {
				System.out.println("Enter two integers and displays their GCD.: ");
				m = input.nextInt();
				n = input.nextInt();
				check = false;

				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
			}
		}

		// zatvaramo unos
		input.close();

		// pozivamo metodu i stampamo rezultat
		System.out.println(m + " and " + n + " is the greatest common divisor " + gcd(m, n) + ".");
	}
}
