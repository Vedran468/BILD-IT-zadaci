/*1. (Izracunavanje napojnice) Napisati program koji ucitava ukupan iznos 
racuna koji treba uplatiti kao i procenat tog racuna kojeg želimo platiti 
kao napojnicu te izracunava ukupan racun i napojnicu. Na primjer, ukoliko 
korisnik unese 10 kao racun i 15 % kao procenat za napojnicu program treba 
da ispise da je ukupan racun za uplatiti 11.5 a napojnica 1.5.*/
package zadaci_27_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1IzracunavanjeNapojnice {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// korisnikov unos za ukupan racun i procenat napojnice
		double totalAmountInvoice = 0;
		double percentageTips = 0;
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		// radi dok unos1 ne bude broj
		while (checkingEntry1) {
			System.out.println("Enter the total amount you have to pay: ");
			try {
				totalAmountInvoice = input.nextDouble();
				// provera je li pozitivan
				if (totalAmountInvoice >= 0) {
					checkingEntry1 = false;
				} else {
					System.out.println("Should be greater than 0!!!");
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}

		// radi dok unos2 ne bude broj
		while (checkingEntry2) {
			System.out.println("Enter the percentage you want to pay as a tip: ");
			try {
				percentageTips = input.nextDouble();
				// provera je li pozitivan
				if (percentageTips >= 0) {
					checkingEntry2 = false;
				} else {
					System.out.println("Should be greater than 0!!!");
					checkingEntry2 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the number: ");
				input.nextLine();
			}
		}
		// zatvaramo unos
		input.close();
		// pomocna varijabla koja procenat pretvara u deicmalni broj radi racuna
		double x = percentageTips / 100;
		// racunamo napojnicu
		double tip = totalAmountInvoice * x;
		// ukupan racun
		double totalBill = totalAmountInvoice + tip;
		// stampamo rezultat
		System.out.printf("Total bill to pay:\n%20.2f[KM].\nAnd\n%20.2f[KM] tip.", totalBill, tip);
	}

}
