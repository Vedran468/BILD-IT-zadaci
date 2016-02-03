/*(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
matrix filled with 0s and 1s, displays the matrix, and checks if every row and
every column have an even number of 1s.*/
package zadaci_3_2_2016;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z5ParanBrojJedinicaUMatrici {

	public static void main(String[] args) {
		// definisemo matricu 6x6
		int[][] m = new int[6][6];
		// dva brojaca za brojenje jedinica po redovima i kolonama
		int counter1 = 1;
		int counter2 = 1;
		// broje redove i kolone sa parnim brojem jedinica
		int c1 = 1;
		int c2 = 1;
		// dve vvarijable za laksu proveru
		boolean even1 = false;
		boolean even2 = false;

		// dodeljujemo joj vrednosti 0 i 1 i proveravamo broj jedinica po
		// redovima da li je paran
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
				// ako je jedninica povecaj brojac
				if (m[i][j] == 1) {
					counter1++;
				}
			}
			// ako je brojac paran broj povecaj brojac za redove sa parnim
			// brojem
			if (counter1 % 2 == 0) {
				c1++;

			}
			// ponistavamo brojac posle svakog reda
			counter1 = 1;
		}
		// provera kolone da li imaju paran broj kolona
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m.length; i++) {
				// ako je jedinica povecaj brojac
				if (m[i][j] == 1) {
					counter2++;
				}
			}
			// ako je brojac deljiv sa dva znaci da je broj jedinica u toj
			// koloni paran pa povecaj brojac
			if (counter2 % 2 == 0) {
				c2++;
			}
			// ponistavamo brojac posle svake kolone
			counter2 = 1;
		}
		// stampamo matricu
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		// u novom redu seldece stampanje
		System.out.println();
		// provera je li svi redovi imaju paran broj jedinica
		if (c1 % 2 == 0) {
			even1 = true;
		}
		// provera je li sve kolone imaju paran broj jedinica
		if (c2 % 2 == 0) {
			even2 = true;
		}
		// u zacisnosti da li imaju ili nemaju stampamo rezultat
		if (even1 && even2) {
			System.out.println("The matrix in all rows and columns having an even number of 1s!!!");
		} else {
			System.out.println("The matrix in all rows and columns does not even number of 1s!!!");
		}

	}

}
