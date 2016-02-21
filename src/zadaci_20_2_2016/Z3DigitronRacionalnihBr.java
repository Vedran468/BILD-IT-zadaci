/*(Create a rational-number calculator) Write a program similar to Listing 7.9,
Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10a.
You will need to use the split method in the String class, introduced in
Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator string and
denominator string, and convert strings into integers using the Integer.parseInt
method.*/
package zadaci_20_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z3DigitronRacionalnihBr {
	public static boolean split(String s) {
		// provera je korisnik uneo ispravan unos ako nije da ponovi
		boolean r = false;
		// brojaci za proveru
		int counter = 0;
		int counter2 = 0;
		int counter3 = 0;
		// broioci i imenioci
		int n1 = 0;
		int d1 = 0;
		int n2 = 0;
		int d2 = 0;
		// string za matematicku operaciju
		String o = "";
		// pomocni string za sabiranje karaktera
		String x = "";
		// pocetni indeks
		int start = 0;
		if (s.charAt(0) == '-') {
			start = 1;
		}
		// razbijanje stringa na imeniovce, broioce i operaciju
		for (int i = start; i < s.length(); i++) {
			if (((int) (s.charAt(i)) <= 57 && (int) (s.charAt(i)) >= 48) || s.charAt(i) == '/' || s.charAt(i) == '+'
					|| s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == ' ') {
				counter2++;
				if ((int) (s.charAt(i)) <= 57 && (int) (s.charAt(i)) >= 48) {
					x += s.charAt(i) + "";
				} else if (s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*') {
					counter++;

					if (counter == 1) {
						n1 = Integer.parseInt(x);
						x = "";
					} else if (counter == 2) {
						d1 = Integer.parseInt(x);
						o = s.charAt(i) + "";
						x = "";
					} else if (counter == 3) {
						if (s.charAt(i) == '/') {
							n2 = Integer.parseInt(x);
							x = "";
						} else {
							counter--;
							counter3++;
						}
					}
				}
			}
		}
		d2 = Integer.parseInt(x);
		// u slucaju da je prvi broj negativan
		if (start == 1) {
			n1 = n1 * (-1);
			counter2++;
		}
		// u slucaju da je drugi broj negativan
		if (counter3 == 1) {
			n2 = n2 * (-1);
		}
		// ako je pravilan unos
		if (counter2 == s.length()) {
			// kreiraj dva objekta
			Z1EnkapsulacijaRacionalniBr r1 = new Z1EnkapsulacijaRacionalniBr(n1, d1);
			Z1EnkapsulacijaRacionalniBr r2 = new Z1EnkapsulacijaRacionalniBr(n2, d2);
			// ispisi rezultat
			System.out.println("Result:");
			if (o.equals("+")) {
				System.out.println(s + " = " + r1.add(r2));
			} else if (o.equals("-")) {
				System.out.println(s + " = " + r1.subtract(r2));
			}
			if (o.equals("/")) {
				System.out.println(s + " = " + r1.divide(r2));
			}
			if (o.equals("*")) {
				System.out.println(s + " = " + r1.multiply(r2));
			}
			r = true;
		}
		return r;
	}

	public static void main(String[] args) {
		// Kreiramo skener za unos.
		Scanner input = new Scanner(System.in);

		// korisnikov unos
		String s = "";

		// varijabla za proveru unosa
		boolean check = true;

		// provera unosa
		while (check) {
			try {
				System.out.println(
						"Enter a task such as \"-3/4 * 7/4\" (or 3/4 * -1/5, and  or -3/4 * -1/5)\noperations are \"+, -, *, /,\": ");
				s = input.nextLine();
				if (split(s)) {
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
