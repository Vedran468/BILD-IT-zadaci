/*5. Ako imamo ubrzanje aviona a te brzinu pri kojoj avion 
uzlijece v, mozemo izracunati minimalnu duzinu piste 
potrebne da avion uzleti koristeci se sljedecom formulom: 
	duzina = v * v / 2a. 
Napisati program koji pita korisnika da unese v u m/s i 
a u m/s² te ispisuje korisniku minimalnu duzinu piste. 
(Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje 
		duzina piste je 514.286)*/
package zadaci_20_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5DuzinaPiste {

	public static void main(String[] args) {
		// skener
		Scanner input = new Scanner(System.in);
		// brzina
		double v = 0;
		// varijabla za ubrzanje
		double a = 0;
		// duzina piste
		double runwayLength = 0;

		// varijable za proveru unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// provera unosa za brzinu
		while (checkingEntry1) {
			System.out.println("Enter the speed of the aircraft in [m/s]: ");
			try {
				v = input.nextDouble();
				// brzina ne bi trebala biti u minusu
				if (v > 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("It should be a positive number!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter the number: ");
				input.nextLine();
			}
		}
		// provera unosa za ubrzanje
		while (checkingEntry2) {
			System.out.println("Enter the acceleration of the aircraft in [m/s^2]: ");
			try {
				a = input.nextDouble();
				// ubrzanje bi trebalo biti vee od 0
				if (a > 0) {
					checkingEntry2 = false;
				} else {
					System.out.println("It should be a positive number!!!");
					checkingEntry2 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Enter the number: ");
				input.nextLine();
			}
		}
		// zaustavljamo unos
		input.close();
		// duzina piste
		runwayLength = (v * v) / (2 * a);
		// stampamo rezultat
		System.out.printf("The required minimum runway length is:\n%50.3f[m].", runwayLength);
	}

}
