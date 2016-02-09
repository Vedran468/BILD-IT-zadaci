/*(Implement the Character class) The Character class is provided in the Java
library. Provide your own implementation for this class. Name the new class
MyCharacter.*/
package zadaci_9_2_2016;

import java.util.ArrayList;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3MojKarakter {
	// data field za listu karaktera
	private ArrayList<Character> chars2 = new ArrayList<>();

	// no-arg konstruktor
	public Z3MojKarakter() {

	}

	// string pretvaramo u listu karaktera
	public char[] stringToArrayChar(String s) {
		return s.toCharArray();
	}

	// broj pretvaramo u listu karaktera
	public char[] intToArrayChar(int i) {
		ArrayList<Character> chars = new ArrayList<>();
		do {
			// varijabla za cifre
			int decimals = i % 10;
			// cifru pretvaramo u string
			String s = decimals + "";
			// a zatim kao karakter ododajemo nizu
			chars.add(s.charAt(0));
			// otpisujemo decimalu
			i /= 10;
		} while (i != 0);
		char[] c = new char[chars.size()];
		// podatke iz liste dodeljujemo nizu
		for (int j = 0; j < chars.size(); j++) {
			c[j] = chars.get(j);
		}
		return c;
	}

	// long pretvaramo u niz karaktera
	public char[] longToArrayChar(long l) {
		ArrayList<Character> chars = new ArrayList<>();
		do {
			// varijabla za cifre
			long decimals = l % 10;
			// pretvaramo je u string i kao karakter dodajemo listi
			String s = (int) (decimals) + "";
			chars.add(s.charAt(0));
			// otpisujemo decimalu
			l /= 10;
		} while (l != 0);
		char[] c = new char[chars.size()];
		// podatke iz liste dodajemo nizu
		for (int i = 0; i < chars.size(); i++) {
			c[i] = chars.get(i);
		}
		return c;
	}

	// metoda koaj proverava da li su dva karaktera jednaka
	public boolean equals(char c1, char c2) {
		if (c1 == c2) {
			return true;
		} else {
			return false;
		}
	}

	// metoda koja sakuplja sve karaktere i vraca niz tih sakupljenih karaktera
	public char[] addToBuildersArrayOfCharacters(char... c) {
		// proveravamo kolio je karaktera uneto da li pojedinacno ili kao niz
		for (int i = 0; i < c.length; i++) {
			// i dodajemo listikaraktera
			chars2.add(c[i]);
		}
		char[] chars = new char[chars2.size()];
		// podatke iz liste dodeljujemo nizu
		for (int i = 0; i < chars2.size(); i++) {
			chars[i] = chars2.get(i);
		}
		return chars;
	}

	/*
	   // primer kako funkcionise graditelj niza
	   public static void main(String[] args) {
		Z3MojKarakter o = new Z3MojKarakter();
		o.addToBuildersArrayOfCharacters('v', 'e');
		char[] c2 = o.addToBuildersArrayOfCharacters('d', 'r');
		System.out.println(c2[0] + " " + c2[1]);
		System.out.println(c2[2] + " " + c2[3]);

		System.out.println(o.intToArrayChar(11));
	}*/
}
