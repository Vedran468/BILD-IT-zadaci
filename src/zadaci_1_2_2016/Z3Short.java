/*3. U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji 
pita korisnika da unese short broj te mu ispise svih 16 bita za dati cijeli broj. 
Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101*/
package zadaci_1_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3Short {

	public static void main(String[] args) {

		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// korisnikov broj
		short number = 0;
		// provera unosa
		boolean checkingEntry = true;
		// prema tabeli F.1 na strani 1276 iz knjige Introduction to Java
		// programming kreiramo niz Binary brojeva za odgovarajuci broj
		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		// definisemo drugi niz gde smestamo binarni broj
		String[] result = new String[4];
		// radi dok unos ne bude short broj
		while (checkingEntry) {
			System.out.println("Enter the short number: ");
			try {
				number = input.nextShort();
				// prveravamo da li broj koji je unet se sastoji od 4 cifre jer
				// je 16/4=4
				if (number < 10000) {
					checkingEntry = false;
				} else {
					checkingEntry = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the short integer: ");
				input.nextLine();
			}
		}
		// pretvaramo broj u pozitivan u slucaju da korisnik unese negativan
		int number1 = (short) Math.abs(number);
		// zatvaramo unos
		input.close();
		// brojac indeksa za rezultat niz
		int counter = 3;
		// provera ako je korisnik uneo manji broj od 15
		if (number1 <= 15) {
			// ako je postavi u niz rezultat i smanji brojac indeksa
			result[counter] = binary[number1];
			counter--;
			// posto je brojac indeksa veci od nula na ostalim indeksima dodaj
			// cetri 0
			if (counter > -1) {
				do {
					result[counter] = "0000";
					counter--;
				} while (counter > -1);
			}
		} else {

			do {
				// broj razbij na cifre
				int digit = number1 % 10;
				// zatim za svaku cifru dodeli vrednost ninary broja i smanji
				// brojac indeksa
				result[counter] = binary[digit];
				counter--;
				number1 /= 10;
			} while (number1 != 0);
			// posto je brojac indeksa veci od nula na ostalim indeksima dodaj
			// cetri 0
			if (counter > -1) {
				do {
					result[counter] = "0000";
					counter--;
				} while (counter > -1);
			}
		}
		// stampamo rezultat
		System.out.print("For the number " + number + " all binary numbers are \"");
		for (String e : result) {
			System.out.print(e);
		}
		System.out.print("\".");
	}

}
