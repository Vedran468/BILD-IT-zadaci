/*3. Napisati program koji sabira sljedecu seriju 
1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.*/
package zadaci_29_1_2016;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z3Razlomci {

	public static void main(String[] args) {

		// definisemo variojablu za rezultat
		double result = 0;
		// sabiramo sve brojeve
		for (int j = 3, i = 1; j < 100; j += 2, i += 2) {
			// pomocne varijable koje pretvaraju brojeve "i" i "j" u decimalne
			double z = (double) (i);
			double v = (double) (j);
			// varijabla koja deli "i" i "j"
			double x = z / v;
			// sabiramo to sa rezultatom
			result = result + x;

		}
		// pomocna varijabla koja mnozi sa sto kako bi smo rezultat dobili u
		// razlomku
		double o = result * 100;
		// zaokruzujemo taj broj na vecu vrednost
		int p = (int) Math.rint(o);
		// stampamo rezultat
		System.out.println("Sum of \"1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99\': ");
		System.out.printf("The decimal number is %10.2f;", result);
		System.out.println("\nIn a fraction of the sum of the "+p+"/100.");


	}

}
