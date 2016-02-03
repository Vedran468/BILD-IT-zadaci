/*(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
most 1s.*/
package zadaci_3_2_2016;

public class Z3NajveciZbirPoKoloniIReduIndex {
	/**
	 * @author Vedran Vidakovic
	 *
	 */
	public static void main(String[] args) {
		// definisemo matricu 4x4
		int[][] m = new int[4][4];
		// dodeljujemo joj vrednosti 0 i 1 i stampamo je
		System.out.println("Matrix is: \n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		// definisemo varijablu za proveru zbira
		int sum = m[0][0];
		// varijabla za proveru zbira po redovima
		int sumRow = m[0][0];
		// varijabla koja smesta indeks od kolone sa najvecim zbirom
		int indexRow = 0;
		// provera koja kolona ima najveci zbir
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sumRow += m[i][j];
			}
			if (sumRow > sum) {
				sum = sumRow;
				indexRow = i;
			}
			sumRow = m[0][0];
		}
		// stampamo rezultat od redove
		System.out.println("The largest row index: " + indexRow + ".");
		// ponistavamo zbir provere
		sum = m[0][0];
		// varijabla za zbir po kolonama
		int sumColum = m[0][0];
		// indeks od najveceg zbira po kolonama
		int indexColum = 0;
		// provera koja kolona ima najveci zbir
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m.length; i++) {
				sumColum += m[i][j];
			}
			if (sumColum > sum) {
				sum = sumColum;
				indexColum = j;
			}
			sumColum = m[0][0];
		}
		// stampamo rezultat od kolona
		System.out.println("The largest column index: " + indexColum);
	}

}
