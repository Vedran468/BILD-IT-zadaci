/*2. Napisati metodu koja prima jedan argument, 
broj pitanja, te generise toliko nasumicnih, jednostavnih 
pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. Metoda treba da 
broji broj tacnih i netacnih odgovora te ih ispise korisniku.*/
package zadaci_16_1_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2TestOduzimanja {

	public static void test(int questions) {
		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// resenj kako treba biti i da li je bilo tacno ili ne
		String output = " ";
		// brojac odgovora
		int answer = 0;
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;
		int correctCount = 0; // Varijabla za tacne odgovore
		int count = 0; // Brojac pitanja
		// da li da se generise novi broj ili ne
		boolean newNumbers = true;

		// definisemo dva broja
		int number1 = 0;
		int number2 = 0;
		// petlja koja proverava broj pitanja da li je ispunjen
		do {

			if (newNumbers) {
				// Generisemo dva random broja
				number1 = (int) (Math.random() * 10);
				number2 = (int) (Math.random() * 10);
			}
			// Uslov ako je prvi broj manji od drugog neka zamene
			// mesta
			if (number1 < number2) {
				// Uvodimo varijablu temp da bi smo mogli izvrsiti
				// zamenu
				int temp = number1;
				// Broj 1 postaje broj 2
				number1 = number2;
				// A broj dva postaje temp a temp je jednako broju 1
				number2 = temp;
			}
			// petlja koja proverava je li korisnik uneo broj
			do {
				// Postaviti pitanje studentu
				System.out.print("What is " + number1 + " - " + number2 + "? ");
				try {

					// Korisnikov unos smestamo u varijablu
					answer = input.nextInt();
					// zaustavaljamo ovu petlju ako je broj
					continueInput = false;
					newNumbers = true;
					// Ako je odgovor tacan, ispisati da je tacno
					if (number1 - number2 == answer) {
						System.out.println("You are correct!");
						correctCount++; // Povecati brojac tacnih odgovora
					} else {
						// Odnosno, odgovor je netacan i resenje
						System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be "
								+ (number1 - number2));
					}

					/*
					 * Menjamo vrednost stringa da upise sva pitanja i odgovore
					 * i u zavisnosti da li je tacan odgovor ili nije da ispise
					 * boolean vrednosti
					 */
					output += "\n" + number1 + "-" + number2 + "=" + answer
							+ ((number1 - number2 == answer) ? " correct" : " wrong");
					count++; // Povecati brojac pitanja

				} catch (InputMismatchException ex) {
					System.out.println("Try again. (" + "Incorrect input: an integer is required)");
					input.nextLine(); // Discard input, odbaci predhodni unos
					newNumbers = false;
				}

			} while (continueInput);

		} while (count < questions);
		// Printamo brojace tacnih odgovora, i string
		System.out.println("\nCorrect count is " + correctCount + ".\nNot correct count is " + (count - correctCount)
				+ ".\n" + output);

		// Zaustavljamo unos
		input.close();

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik uneo broj
		boolean continueInput = true;

		// provera je li korisnik uneo broj
		do {
			System.out.println("How many questions you want: ");
			try {
				int questions = input.nextInt();
				// prosledjujemo broj u metodu
				test(questions);
				// zaustavljamo petlju
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		} while (continueInput);

		// zaustavljamo unos
		input.close();
	}

}
