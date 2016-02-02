/*(Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)*/
package zadaci_2_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2IzborSlucajnogBroja {

	public static int getRandom(int... numbers) {
		// varijabla za proveru da li ne postoji broj
		boolean check = true;
		// definisemo nasumicni broj od 1 do 54
		int number = ((int) (Math.random() * 54)) + 1;
		// metoda radi dok broj postoji
		while (check) {
			// brojac radi lakse provere
			int counter = 0;
			// prolazimo kroz niz brojeva dobijenih kao argument
			for (int i = 0; i < numbers.length; i++) {
				// ako je jednak definisanom broju povecajbrojac
				if (numbers[i] == number) {
					counter++;
				}
			}
			// ako je brojac 0 zaustavi petlju
			if (counter == 0) {
				check = false;
			} else {
				// inace novi broj generisi
				number = ((int) (Math.random() * 54)) + 1;
			}
		}
		// metoda vraca broj
		return number;
	}

	public static void main(String[] args) {
		// dva nacina pozivanje metode, tj kao argument saljemo grupu
		// pojedinacnih brojeva ili niz brojeva
		System.out.println("Method returns a number that is: "
				+ getRandom(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
						26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49)
				+ ".");
		System.out.println("Method returns a number that is: " + getRandom(new int[] { 4, 2, 3 }) + ".");

	}

}
