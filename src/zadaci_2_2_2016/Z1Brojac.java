/*(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)*/
package zadaci_2_2_2016;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z1Brojac {

	public static void main(String[] args) {
		// lista od 10 brojeva
		int[] array = new int[10];
		// sto puta generisemo nasumicni broj
		for (int j = 0; j < 100; j++) {
			int number = (int) (Math.random() * 10);
			// na ideks od tog broja u nizu povecaj vrednost
			array[number]++;
		}

		// proveravamo koliko se koi broj ponovio puta
		for (int j = 0; j < 10; j++) {
			System.out.println("No. " + j + " is repeated " + array[j] + " times.");
		}
	}
}
