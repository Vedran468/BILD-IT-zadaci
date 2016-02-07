/*(Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order.*/
package zadaci_6_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5ProstiBrojeviManjiOd120 {

	public static void main(String[] args) {
		Z4StackOfIntegers o = new Z4StackOfIntegers();
		// prolazimo kroz brojeve manje od 120
		for (int i = 0; i < 120; i++) {
			// prvo i definisemo da je prost broj
			boolean isPrime = true;
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
			// sa samim sobom.
			for (int divisor = 2; divisor <= i / 2; divisor++) {
				if (i % divisor == 0) {
					isPrime = false;
					// Izadji is petlje kreni divisor ponovo od 2
					break;
				}
			}
			// Ako je broj prost i veci od 2 dodaj ga u metodu klase
			// StackOfIntegers
			if (isPrime && i > 1) {
				o.addInteger(i);
			}
		}
		// stampamo unazad brojeve
		System.out.println("Prime numbers are:\n" + o.reverse());
	}
}