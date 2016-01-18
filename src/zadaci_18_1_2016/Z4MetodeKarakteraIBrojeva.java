/*4. Napisati metodu koja printa 100 nasumicnih uppercase 
karaktera i 100 nasumicnih brojeva, 10 po liniji.*/
package zadaci_18_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4MetodeKarakteraIBrojeva {
	public static void print() {
		// int pretvaramo u karakter i stampamo
		System.out.println("Uppercase letters:");

		// 100 da se ispise
		for (int i = 1; i <= 100; i++) {
			// definisemobrojcanu vrednost za velika slova ASCII kodu
			int characters = (int) (Math.random() * 26) + 65;
			if (i % 10 == 0) {

				System.out.printf("%5c\n", (char) (characters));
			} else {
				System.out.printf("%5c", (char) (characters));
			}
		}

		System.out.println("\nNumbers:");

		// 100 da se ispise
		for (int i = 1; i <= 100; i++) {
			// definisemo da brojevi budu jednaki ASCII kodu
			int numbers = (int) (Math.random() * 10) + 48;
			// ASCII kod pretvaramo u karakter i stampamo ga
			if (i % 10 == 0) {

				System.out.printf("%5c\n", (char) (numbers));
			} else {
				System.out.printf("%5c", (char) (numbers));
			}
		}
	}

	public static void main(String[] args) {

		// pozivamo metodu
		print();
	}

}
