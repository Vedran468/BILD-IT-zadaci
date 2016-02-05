/*The class contains: 
- Private data fields a, b, and c that represent three coefficients.
- A constructor for the arguments for a, b, and c.
- Three getter methods for a, b, and c.
- A method named getDiscriminant() that returns the discriminant.
- The methods named getRoot1() and getRoot2() for returning two roots.
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
. Write a test program that prompts the user to enter values for a, b, and c and 
displays the result based on the discriminant. If the discriminant is positive, display 
the two roots. If the discriminant is 0, display the one root. Otherwise, display “.*/
package zadaci_5_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3TestKvadratnaJednacina {

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		// za unos vrednosti a,b i c
		double a = 0;
		double b = 0;
		double c = 0;

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;

		while (checkingEntry1) {
			System.out.println("For the quadratic equation, enter the value \"a\": ");
			try {
				a = input.nextDouble();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry2) {
			System.out.println("For the quadratic equation, enter the value \"b\": ");
			try {
				b = input.nextDouble();
				checkingEntry2 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		while (checkingEntry3) {
			System.out.println("For the quadratic equation, enter the value \"c\": ");
			try {
				c = input.nextDouble();
				checkingEntry3 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		// zaustavljamo unos
		input.close();

		// objekat klase kvadratna jednacina
		Z3KvadratnaJednacina o = new Z3KvadratnaJednacina(a, b, c);

		// provera je li diskriminanta negativan broj
		if (o.getDiscriminant() > 0) {
			System.out.printf("The first roots is %2.2f, and the second %2.2f.", o.getRoot1(), o.getRoot2());
		} else {
			System.out.println("The equation has no roots.");
		}

	}
}