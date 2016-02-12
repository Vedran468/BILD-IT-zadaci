/*(InputMismatchException) Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect.*/
package zadaci_12_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3NetacanUnosBroja {

	public static void main(String[] args) {

		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		// korisnikovi brojevi
		int n1 = 0;
		int n2 = 0;
		// provera unosa za broj 1
		while (continueInput) {
			System.out.print("Enter first integer: ");
			try {
				n1 = input.nextInt();
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}

		continueInput = true;
		// provera unosa za broj 2
		while (continueInput) {
			System.out.print("Enter second integer: ");
			try {
				n2 = input.nextInt();
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// zaustavljamo unos
		input.close();

		// stampamo rezulta
		System.out.println("The sum of your entries is "+(n1+n2)+".");
	}

}
