/*(Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci
numbers. The current Fibonacci number would then be f0 + f1. The algorithm
can be described as follows:
f0 = 0; // For fib(0)
f1 = 1; // For fib(1)
for (int i = 1; i <= n; i++) {
currentFib = f0 + f1;
f0 = f1;
f1 = currentFib;
}
// After the loop, currentFib is fib(n)
Write a test program that prompts the user to enter an index and displays its
Fibonacci number.*/
package zadaci_22_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z1FibonacijeviBr {
	
	
	// metoda koja vraca za indeks broj fibonajcijevog niza
	public static long fib(long index) {
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
		// ako je indeks 0 vrati f0
		if (index == 0) {
			return f0;
			// ako je indeks 1 vrati f1
		} else if (index == 1) {
			return f1;
			// inace izracunaj fibonacijev broj
		} else {
			for (int i = 2; i <= index; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
			return currentFib;
		}
	}
	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		// korisnikov unos
		long  index = 0;

		// varijabla za proveru unosa
		boolean check = true;

		// provera unosa
		while (check) {
			try {
				System.out.println(
						"Enter an index for a Fibonacci number: ");
				index = input.nextLong();
				if (index>=0) {
					// pozivamo metodu i stampamo rezultat
					System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
					check = false;
				}
				// u slucaju greske unosa
			} catch (InputMismatchException e) {
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();

	}
}
