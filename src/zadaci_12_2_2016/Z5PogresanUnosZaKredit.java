package zadaci_12_2_2016;

import java.util.Scanner;

public class Z5PogresanUnosZaKredit {

	public static void main(String[] args) {
		// kreiramo skener
		Scanner input = new Scanner(System.in);
		// nastavi unos varijabla za proveru je korisniik isparavno broj
		boolean continueInput = true;
		// smestanje korisnikovih unosa
		double annualInterestRate = 0;
		int numberOfYears = 0;
		double loanAmount = 0;

		// provera unosa
		while (continueInput) {
			System.out.print("Enter the annual interest rate: ");
			annualInterestRate = input.nextDouble();

			System.out.print("Enter the number of years: ");
			numberOfYears = input.nextInt();

			System.out.print("Enter the loan amount: ");
			loanAmount = input.nextDouble();
			try {
				// kreiramo objekat klase kredit
				Z5Kredit l = new Z5Kredit(annualInterestRate, numberOfYears, loanAmount);
				// stampamo rezultat
				System.out.println(l.toString());
				continueInput = false;
			} catch (IllegalArgumentException ex) {
				System.out.println("The numbers must be greater than 0");
				input.nextLine(); // Discard input, odbaci predhodni unos
			}
		}
		// zaustavljamo unos
		input.close();

	}

}
