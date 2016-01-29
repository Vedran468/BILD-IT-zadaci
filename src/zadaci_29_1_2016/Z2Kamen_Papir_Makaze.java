/*2.  Napisati program koji igra sa protivnikom rock-paper-scissors. 
(papir-bunar-makaze ili tako nekako po naski) Program nasumicno 
generise brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da 
li je korisnik pobijedio, da li je racunar pobijedio ili je bilo nerijeseno. */
package zadaci_29_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2Kamen_Papir_Makaze {

	public static void main(String[] args) {

		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// resenja moguca u izboru
		String result[] = { "rock", "paper", "scissors" };
		// korisnikov izbor broja
		int number = 0;
		// korisnikov izbor u smislu kamen, papir ili makaze
		String user = "";
		// generisani nasumicni broj za kopjuterov izbor
		int numberComputer = (int) (Math.random() * 3);
		// definisemo u kom obliku da li je kamen, papir ili makaze izabrao
		// kompjuter
		String computer = result[numberComputer];
		// provera unosa
		boolean checkingEntry = true;
		// radi dok unos ne bude ceo broj
		while (checkingEntry) {
			System.out.println("Enter 0 for rock, paper 1 and 2 of scissors:: ");
			try {
				number = input.nextInt();
				// provera sta je korisnik uneo
				if (number == 0) {
					user = result[number];
					checkingEntry = false;
				} else if (number == 1) {
					user = result[number];
					checkingEntry = false;
				} else if (number == 2) {
					user = result[number];
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
			// stampamo izbore
			System.out.println("You chose " + user + ", computer " + computer + " in this case: ");

			// provera da li je korisnik dobio
			if (number == 0 && numberComputer == 1) {
				System.out.println("You lost!!!");
			} else if (number == 0 && numberComputer == 2) {
				System.out.println("You win!!!");
			} else if (number == 1 && numberComputer == 0) {
				System.out.println("You win!!!");
			} else if (number == 1 && numberComputer == 2) {
				System.out.println("You lost!!!");
			} else if (number == 2 && numberComputer == 0) {
				System.out.println("You lost!!!");
			} else if (number == 2 && numberComputer == 1) {
				System.out.println("You win!!!");
			} else {
				System.out.println("Draw!!!");
			}
		
	}

}
