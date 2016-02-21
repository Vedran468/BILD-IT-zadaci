/*Design a class named Complex for representing complex numbers and the
methods add, subtract, multiply, divide, and abs for performing complexnumber
operations, and override toString method for returning a string representation
for a complex number. The toString method returns (a + bi) as a
string. If b is 0, it simply returns a. Your Complex class should also implement the
Cloneable interface.
Provide three constructors Complex(a, b), Complex(a), and Complex().
Complex() creates a Complex object for number 0 and Complex(a) creates
a Complex object with 0 for b. Also provide the getRealPart() and
getImaginaryPart() methods for returning the real and imaginary part of the
complex number, respectively.
Write a test program that prompts the user to enter two complex numbers and
displays the result of their addition, subtraction, multiplication, division, and absolute
value.*/
package zadaci_20_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4TestKompleksnogBr {

	public static void main(String[] args) {

		// skener za unos
		Scanner input = new Scanner(System.in);
		// korisnikov unos za brojeve
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;

		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos1 ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter the first complex number: ");
			try {
				a = input.nextDouble();
				b = input.nextDouble();
				checkingEntry = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		checkingEntry = true;
		// radi dok unos2 ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter the second complex number: ");
			try {
				c = input.nextDouble();
				d = input.nextDouble();
				checkingEntry = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();

		// pravimo dva objekta 
		Z4KompleksanBr c1 = new Z4KompleksanBr(a, b);
		Z4KompleksanBr c2 = new Z4KompleksanBr(c, d);
		// stampamo rezultate
		System.out.println(c1.add(c2));
		System.out.println(c1.subtract(c2));
		System.out.println(c1.multiply(c2));
		System.out.println(c1.divide(c2));
		System.out.println(c1.toString());
	}

}
