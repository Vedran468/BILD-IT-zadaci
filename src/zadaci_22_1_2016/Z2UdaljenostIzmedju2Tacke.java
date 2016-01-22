/*2. Great circle distance predstavlja udaljenost izmedu dvije tacke 
na povrsine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku 
sirinu i duzinu dvije tacke. Great circle distance izmedu ove dvije tacke 
moze biti izracunata koristeci se sljedecom formulom: 
	d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
Napisati program koij pita korisnika da unese geografsku sirinu i duzinu u 
stepenima dvije tacke na povrsini zemlje te mu ispisuje great circle distance. 
Prosjecni radius zemlje je 6.371.01 km. 
Stepene koje korisnik unese trebamo promijeniti u radianse koristeci se 
Math.toRadians metodom 
jer Java trigonometrijske metode koriste radianse. sirina i duzina u ovoj formuli 
se odnose na zapad i sjever. Koristimo negativne vrijednosti da oznacimo istok i jug. */
package zadaci_22_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z2UdaljenostIzmedju2Tacke {

	public static void main(String[] args) {

		// skener
		Scanner input = new Scanner(System.in);

		// korisnikov unos
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude tacan
		while (checkingEntry) {
			System.out.println("Enter the latitude and longitude of two points on the surface "
					+ "of the sphere as the coordinates x1, x2, y1 and y2, in degrees:"
					+ "The width and length in this formula relate to the west and north. "
					+ "We use negative values to denote east and south.\n");
			try {
				x1 = input.nextDouble();
				x2 = input.nextDouble();
				y1 = input.nextDouble();
				y2 = input.nextDouble();

				// provera je li korisnik uneo brojeve
				checkingEntry = false;

				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Again all!!! Enter the number: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// prertvaramo stepene u radijane
		double inRadiansX1 = Math.toRadians(x1);
		double inRadiansX2 = Math.toRadians(x2);
		double inRadiansY1 = Math.toRadians(y1);
		double inRadiansY2 = Math.toRadians(y2);
		double averageRadiusOfEarth = 6371.01;
		// prema formului racunamo tacku d = radius * Math.acos(sin(x1) X
		// sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
		double d = averageRadiusOfEarth
				* Math.acos(Math.sin(inRadiansX1) * Math.sin(inRadiansX2) + Math.cos(inRadiansX1) * Math.cos(inRadiansX2) * Math.cos(inRadiansY1 - inRadiansY2));
	// stampamo rezulta
		System.out.println("Great circle distance is:\n"+d);
	}

}