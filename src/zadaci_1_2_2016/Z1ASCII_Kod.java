/*1. Napisati program koji prima ASCII kod (cijeli broj izmedu 0 i 127) 
te ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 
kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.*/
package zadaci_1_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1ASCII_Kod {

	public static void main(String[] args) {

		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// korisnikov broj
		int number = 0;
		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude ceo broj
		while (checkingEntry) {
			System.out.println("Enter a number from 0 to 127: ");
			try {
				number = input.nextInt();
				// provera broja da li je izmedju 0 i 127
				if (number >= 0 && number <= 127) {
					checkingEntry = false;
				} else {
					checkingEntry = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// stampamo rezultat
		System.out.println(
				"For the number " + number + " in ASCII code to the character \"" + (char) (number) + "\" !!!");
	}

}
