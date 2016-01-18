/*3. Napisati metodu sa sljedecim headerom koja ispisuje tri broja u 
rastucem redosljedu: 
	public static void displaySortedNumbers(double num1, double 
			num2, double num3). 
Napisati program koji pita korisnika da unese tri broja te ispise ta tri broja u 
rastucem redosljedu. */
package zadaci_18_1_2016;

import java.util.Scanner;

public class Z3Sortiranje3Broja {
	/**
	 * @author Vedran Vidakovic
	 *
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		// dobijene brojeve smestamo u niz
		double[] result = { num1, num2, num3 };
		// zatim ga sortiramo i to da bude rastucim redosledom
		java.util.Arrays.sort(result);
		System.out.println("The result is:\n");
		// stampamo resenje u obliku npr 1.0, 4.0, 9.0.
		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {

				System.out.print(result[i] + ".");
			} else {
				System.out.print(result[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner input = new Scanner(System.in);

		// stampamo korisniku da unese 3 broja i ta 3 broja smestamo u varijable
		System.out.println("Enter the 1th number of the three numbers: ");
		double num1 = input.nextDouble();
		System.out.println("Enter the 2th number of the three numbers: ");
		double num2 = input.nextDouble();
		System.out.println("Enter the 2th number of the three numbers: ");
		double num3 = input.nextDouble();
		// brojeve prosledjujemo u metodu
		displaySortedNumbers(num1, num2, num3);
		// zatvaramo unos
		input.close();
	}

}
