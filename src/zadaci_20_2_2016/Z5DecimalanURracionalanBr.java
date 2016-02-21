/*(Convert decimals to fractions) Write a program that prompts the user to enter
a decimal number and displays the number in a fraction. Hint: read the decimal
number as a string, extract the integer part and fractional part from the string,
and use the BigInteger implementation of the Rational class in Programming
Exercise 13.15 to obtain a rational number for the decimal number.*/
package zadaci_20_2_2016;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5DecimalanURracionalanBr {

	public static boolean split(String s) {

		// provera je korisnik uneo ispravan unos ako nije da ponovi
		boolean r = false;
		// brojaci za proveru
		int counter = 0;
		int counter2 = 0;
		// string za broj izpred tacke
		String s1 = "";

		// provera je su li brojevi i 1 tacka
		for (int i = 0; i < s.length(); i++) {
			if ((((int) (s.charAt(i)) <= 57 && (int) (s.charAt(i)) >= 48)) || s.charAt(i) == '-') {
				counter2++;
			} else if (s.charAt(i) == '.') {
				counter++;
			}
		}

		// ako je pravilan unos metoda vraca tacno
		if (counter2 == (s.length() - 1) && counter == 1) {
			r = true;

			// u string s1 spremi sve do tacke i zapamti od kojeg indeksa je
			// tacka
			int index = 0;
			for (int i = 0; i < s.length(); i++) {
				if (((int) (s.charAt(i)) <= 57 && (int) (s.charAt(i)) >= 48) || s.charAt(i) == '-') {
					s1 += s.charAt(i) + "";
				} else {
					index = i + 1;
					break;
				}
			}

			// broj sa brojem 0 koliko ima cifara iza tacke
			int x = 1;
			// lista za spremanje brojeva sa kojima mnozimo cifre iz tacke
			ArrayList<Integer> x10 = new ArrayList<>();
			for (int i = index; i < s.length(); i++) {
				x10.add(x);
				x *= 10;
			}
			// pretvaramo brojeve iza tacke u jedan broj int
			int y = (int) (Double.parseDouble(s) * x);
			// provera koji je veci broj imenilac ili brojilac
			int max = 0;
			if (y >= 0) {
				max = y;
			} else {
				max = y * (-1);
			}
			// liste za brojioce i imenioce
			ArrayList<Integer> numerator = new ArrayList<>();
			ArrayList<Integer> denominator = new ArrayList<>();
			// zajednicki broj za brojilac i imenilac
			int number = 0;
			// varijabla za cifru
			int z = 0;
			// pretvaramo broj int u cifre
			for (int i = 0; i < x10.size(); i++) {
				// definisemo ostatak deljenja sa 10 tj poslednju cifru
				int digit = y % 10;
				// mnozimo sa brojevima iz liste da bi broj int podelili na
				// cifra i
				// nule
				z = digit * x10.get(i);

				// pronalazak zajednickog delioca
				for (int j = 2; i <= max; j++) {
					if (z % j == 0 && x % j == 0) {
						number = j;
						break;
					}
				}
				// dodajemo listama broj sa cifrom i nulama podeljen sa
				// zajednickim
				// deliocem
				numerator.add((z / number));
				// dodajemo listama broj sa nulamam koliko ima cifri podeljen sa
				// zajednickim deliocem
				denominator.add((x / number));
				// delimo int broj da otpisemo poslednju cifru
				y /= 10;
			}
			// kreiramo objekat klase sa big int
			Z2BigIntegerRacionalniBr b = new Z2BigIntegerRacionalniBr();
			// sabiramo razbijeni int broj
			for (int i = 0; i < numerator.size(); i++) {
				b = b.add(new Z2BigIntegerRacionalniBr(new BigInteger(numerator.get(i) + ""),
						new BigInteger(denominator.get(i) + "")));
			}
			// kreiraj dva objekta gde sabiramo sa s1 broj iza tacke sabran kao
			// racionalni broj
			Z2BigIntegerRacionalniBr b1 = new Z2BigIntegerRacionalniBr(new BigInteger(s1), new BigInteger("1"));
			Z2BigIntegerRacionalniBr b2 = new Z2BigIntegerRacionalniBr(b.getNumerator(), b.getDenominator());
			// ispisi rezultat
			System.out.println("The fraction number is " + b1.add(b2));

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
				System.out.println("Enter a decimal number: ");
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
