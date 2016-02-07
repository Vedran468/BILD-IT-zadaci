/*(Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.*/
package zadaci_6_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4ProstiFaktori {
	public static void main(String[] args) {
		// kreiramo objekat klase
		Z4StackOfIntegers o = new Z4StackOfIntegers();
		// skener za unos
		Scanner input = new Scanner(System.in);
		// za unos broj
		int n = 0;

		// provera unosa
		boolean checkingEntry1 = true;

		// UNOS ZA SVE PODATKE
		while (checkingEntry1) {
			System.out.println("Enter an integer greater than 0: ");
			try {
				n = input.nextInt();
				if (n > 0)
					checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e1) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		// zaustavljamo unos
		input.close();
		// provera krece sa brojem 2
		int i = 2;
		// proveravamo i saljemo u metodu klase StackOfIntegers
		while (n != 1) {
			if (n % i == 0) {
				o.addInteger(i);
				n = n / i;
				i = 2;
			} else {
				i++;
			}
		}
		// stampamo unazad brojeve
		System.out.println("Prime factors are:\n" + o.reverse());

	}
}
