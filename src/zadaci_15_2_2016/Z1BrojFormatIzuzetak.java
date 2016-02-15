/*(NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the
bin2Dec method to throw a NumberFormatException if the string is not a
binary string.*/
package zadaci_15_2_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1BrojFormatIzuzetak {

	public static int bin2Dec(String binaryString) {
		// niz binarnih brojeva
		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		// smestanje desimala broja npr ako je broj 1115
		String r = "";
		// u slucaju da je binarni broj od 0 do 15
		if (binaryString.length() == 4) {
			for (int i = 0; i < binary.length; i++) {
				if (binaryString.equals(binary[i])) {
					r = i + "";
				}
			}

			// u slucaju da je broj koij metoda vraca od 0 do 100
		} else if (binaryString.length() == 8) {
			String s1 = binaryString.substring(0, 4);
			String s2 = binaryString.substring(4, 8);
			System.out.println(s2);
			int i1 = 0;
			int i2 = 0;
			for (int i = 0; i < binary.length; i++) {
				if (s1.equals(binary[i])) {
					i1 = i;
				}
				if (s2.equals(binary[i])) {
					i2 = i;
				}
			}
			r = i1 + "" + i2 + "";
			// u slucaju da je broj koij metoda vraca od 0 do 1000
		} else if (binaryString.length() == 12) {
			String s1 = binaryString.substring(0, 4);
			String s2 = binaryString.substring(4, 8);
			String s3 = binaryString.substring(8, 12);
			int i1 = 0;
			int i2 = 0;
			int i3 = 0;
			for (int i = 0; i < binary.length; i++) {
				if (s1.equals(binary[i])) {
					i1 = i;
				}
				if (s2.equals(binary[i])) {
					i2 = i;
				}
				if (s3.equals(binary[i])) {
					i3 = i;
				}
			}
			r = i1 + "" + i2 + "" + i3 + "";
			// u slucaju da je broj koij metoda vraca od 0 do 10000
		} else if (binaryString.length() == 16) {
			String s1 = binaryString.substring(0, 4);
			String s2 = binaryString.substring(4, 8);
			String s3 = binaryString.substring(8, 12);
			String s4 = binaryString.substring(12, 16);
			int i1 = 0;
			int i2 = 0;
			int i3 = 0;
			int i4 = 0;
			for (int i = 0; i < binary.length; i++) {
				if (s1.equals(binary[i])) {
					i1 = i;
				}
				if (s2.equals(binary[i])) {
					i2 = i;
				}
				if (s3.equals(binary[i])) {
					i3 = i;
				}
				if (s4.equals(binary[i])) {
					i4 = i;
				}
			}
			r = i1 + "" + i2 + "" + i3 + "" + i4;
			// u slucaju progresnog unosa baci izuzetak
		} else {
			throw new NumberFormatException();
		}
		// ako string nije prazan pretvori string u int broj i metoda nek ga
		// vrati
		if (!r.equals("")) {
			return Integer.parseInt(r);
		} else {
			// inace baci izuzetak
			throw new NumberFormatException();
		}
	}

	public static void main(String[] args) {

		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter binary number: ");
			try {
				System.out.println("Binary number converted to decimal number is: " + bin2Dec(input.next()));
				checkingEntry = false;
				// u slucaju greske
			} catch (NumberFormatException e) {
				System.out.println("Enter the correct binary number!!!");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
	}

}
