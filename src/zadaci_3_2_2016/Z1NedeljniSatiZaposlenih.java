/*(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours.*/
package zadaci_3_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z1NedeljniSatiZaposlenih {

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);

		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// definisemo dane za koje se unose sati
		String[] days = { "M", "T", "W", "Th", "F", "Sa", "Su" };

		// varijabla za broj radnika
		int employees = 0;
		while (checkingEntry1) {
			System.out.println("Enter the number of employees: ");
			try {
				// ako je korisnik uneo broj zastavi petlju za proveru
				employees = input.nextInt();
				// provera da li ima radnika, mora biti najmanje 1 radnik (ako
				// niko drugi direktor)
				if (employees > 0) {
					checkingEntry1 = false;
				} else {
					System.out.println(
							"And you do not have employees, the player does not kidding, enter a number greater than 0!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}
		// matrica u koju smestamo sate
		double[][] hours = new double[employees][7];

		// smestamo korisnikov unos u matricu2
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < hours[i].length; j++) {
				System.out.println("For an employee enter " + (i + 1) + "th sets for the day " + days[j] + ".: ");
				while (checkingEntry2) {
					try {
						// ako je korisnik uneo broj veci od 0 ili o sati ne
						// mogu biti u minusu
						hours[i][j] = input.nextDouble();
						if (hours[i][j] >= 0) {
							checkingEntry2 = false;
						} else {
							System.out.println("Hours can not be negative, employed or worked or not!!!");
						}
						// u slucaju greske
					} catch (InputMismatchException e) {
						System.out.println("Againl!!! Enter the number: ");
						input.nextLine();
					}
				}
				// ponistavamo varijablu za proveru da bi ponovo usli u petlju
				checkingEntry2 = true;
			}
		}
		// zastavljamo unos
		input.close();
		// stampamo dane
		System.out.print("\t\t\t");
		for (int k = 0; k < days.length; k++) {
			System.out.print("  " + days[k] + "  ");
		}
		// stampamo broj radnika i njegove sate
		System.out.println();
		for (int i = 0; i < hours.length; i++) {
			System.out.print("Employee " + (i + 1) + "th: ");
			for (int j = 0; j < hours[i].length; j++) {
				System.out.printf(" %2.1f ", hours[i][j]);
			}
			System.out.println();
		}
		// definisemo listu ukupnih sati
		double[] totalHours = new double[employees];
		// racunamo ukupne sate
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < hours[i].length; j++) {
				totalHours[i] += hours[i][j];
			}
		}
		// niz u koji smestamo rezultate
		String[] result = new String[employees];
		// varijabla koja definise ko ima najvise sati
		double max = 0;
		// varijabla koja cuva indeks od niza ukupni sati sa najvecim brojem
		// sati
		int index = 0;
		// prolazak onolikom puta koliko imradnika
		for (int j = 0; j < totalHours.length; j++) {
			// svaki put proveri koji je naveci broj sati
			for (int i = 0; i < totalHours.length; i++) {
				if (totalHours[i] > max) {
					max = totalHours[i];
				}
			}
			// uporedi broj sati iz niza sa maksimalnim
			for (int i = 0; i < totalHours.length; i++) {
				if (totalHours[i] >= max) {

					// indeksu dodaj vrednost i +1 da ne bude radnik 0
					index = i + 1;
					// a vrednost u nizu ponisti na 0 da bi se moglo ponovo
					// proveriti
					totalHours[i] = 0;
					// kad nadjes najveci broj sati zaustavi petlju ovo je bitno
					// ako imam jednak broj sati kod dva radnika
					break;
				}
			}
			// dodoeli nizu rezultat rezultate i ponisti maksimalnu vrednost
			result[j] = "Employee " + index + "th achieved total hours: " + max + ";";
			max = 0;
		}
		// ispisi sve iz niza rezultat
		System.out.println("\nTotal hours are:");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
