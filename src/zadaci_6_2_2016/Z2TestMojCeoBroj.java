/*(The MyInteger class) Design a class named MyInteger. The class contains: 
- An int data field named value that stores the int value represented by this
object.
- A constructor that creates a MyInteger object for the specified int value.
- A getter method that returns the int value.
- The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
- The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
- The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
- The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
- A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
- A static method parseInt(String) that converts a string into an int
value.
Draw the UML diagram for the class and then implement the class. Write a client
program that tests all methods in the class.*/
package zadaci_6_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2TestMojCeoBroj {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// za korisnika da unese sve potrebno da bi testirali sve metode u
		// klasiMojCeoBroj
		int n1 = 0;
		int n2 = 0;
		char[] c = new char[5];
		String s = "";

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;

		// provera prvog broja je li unesen
		while (checkingEntry1) {
			System.out.println("Enter first integer: ");
			try {
				n1 = input.nextInt();
				checkingEntry1 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// kreiramo prvi objekat
		Z2MojCeoBroj o1 = new Z2MojCeoBroj(n1);
		// proveravamo metode
		System.out.println("Number " + n1 + " is an even: " + o1.isEven() + ";");
		System.out.println("Number " + n1 + " is odd: " + o1.isOdd() + ";");
		System.out.println("Number " + n1 + " is a prime: " + o1.isPrime() + ";");

		// prazan red
		System.out.println();
		// provera drugog broja
		while (checkingEntry2) {
			System.out.println("Enter second integer: ");
			try {
				n2 = input.nextInt();
				checkingEntry2 = false;
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// proveravamo metodu
		System.out.println("Number " + n1 + " and " + n2 + " are equals: " + o1.equals(n2));
		// kreiramo drugi objekat
		Z2MojCeoBroj o2 = new Z2MojCeoBroj(n1);
		// proveravamo metode
		System.out.println("Number " + n2 + " is an even: " + Z2MojCeoBroj.isEven(o2.getValue()) + ";");
		System.out.println("Number " + n2 + " is odd: " + Z2MojCeoBroj.isOdd(o2.getValue()) + ";");
		System.out.println("Number " + n2 + " is a prime: " + Z2MojCeoBroj.isPrime(o2.getValue()) + ";");

		// novi red
		System.out.println();
		// provera metoda kada se prosledi objekat
		System.out.println("Object is an even: " + Z2MojCeoBroj.isEven(new Z2MojCeoBroj(n1)) + ";");
		System.out.println("Object is odd: " + Z2MojCeoBroj.isOdd(new Z2MojCeoBroj(n1)) + ";");
		System.out.println("Object is a prime: " + Z2MojCeoBroj.isPrime(new Z2MojCeoBroj(n1)) + ";");
		System.out.println("Object and " + n1 + " are equals: " + o1.equals(new Z2MojCeoBroj(n2)));
		// brojac za karaktere
		int counter = 0;

		// novi red
		System.out.println();
		// provera unosa za karaktere
		while (counter != c.length) {
			System.out.println("You entered " + counter + " of " + c.length + " numerical characters: ");
			try {
				// pomocni string
				String x = input.next();
				// provera je li korisnik uneo karakter
				if (x.length() == 1) {
					// provera je li korisnik uneo brojcani karakter
					if ((int) (x.charAt(0)) >= 48 || (int) (x.charAt(0)) <= 57) {
						c[counter] = x.charAt(0);
						counter++;
					} else {
						System.out.println("Enter the character with integer!!!");
					}
				} else {
					System.out.println("Enter one character to integer number!!!");
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter one character to integer number!!!: ");
				input.nextLine();
			}
			input.nextLine();
		}

		System.out.println("The character string converted to an integer is " + Z2MojCeoBroj.parseInt(c) + ".");

		// novi red
		System.out.println();
		// provera stringa
		while (checkingEntry3) {
			System.out.println("Enter a number greater than 3 digits: ");
			try {
				// smestamo ga u string
				s = input.next();
				// prrovera da li je u stringu - prvi
				if (s.charAt(0) == '-') {
					// provera je li najmanje 3 decimale
					if (s.length() >= 4) {
						// provera je li broj unet u stringu
						if (Z2MojCeoBroj.parseInt(s) > 0 || Z2MojCeoBroj.parseInt(s) < 0) {
							checkingEntry3 = false;
						}
					} else {
						checkingEntry3 = true;
					}
				} else {
					// provera je li najmanje 3 decimale
					if (s.length() >= 3) {
						// provera je li broj unet u stringu
						if (Z2MojCeoBroj.parseInt(s) > 0 || Z2MojCeoBroj.parseInt(s) < 0) {
							checkingEntry3 = false;
						}
					} else {
						checkingEntry3 = true;
					}

				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		System.out.println("String converted to an integer is " + Z2MojCeoBroj.parseInt(s) + ".");
		// zatvaramo unos
		input.close();
	}

}
