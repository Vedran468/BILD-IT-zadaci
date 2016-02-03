/*(Sort two-dimensional array) Write a method to sort a two-dimensional array
using the following header:
public static void sort(int m[][])
The method performs a primary sort on rows and a secondary sort on columns.
For example, the following array
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.*/
package zadaci_3_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4SortiranaMatrica {
	public static void sort(int m[][]) {
		// prolazimo kroz matricu
		for (int j = 0; j < m.length; j++) {
			for (int i = 0; i < m.length - 1; i++) {
				// sortiramo je po redovima tj kolona 0 ce biti sortirana
				if (m[i][0] > m[i + 1][0]) {
					int temp = m[i][0];
					m[i][0] = m[i + 1][0];
					m[i + 1][0] = temp;
					// ako smo zavrsili izmenu zameni i na indeksu kolone 1
					int temp2 = m[i][1];
					m[i][1] = m[i + 1][1];
					m[i + 1][1] = temp2;

				}
			}
		}
		// zatim gde se poklapaju indeksi reda izvrsi sortiranje brojeva kolone
		// sa indeksom 1
		for (int j = 0; j < m.length; j++) {
			for (int i = 0; i < m.length - 1; i++) {
				if (m[i][0] == m[i + 1][0]) {
					if (m[i][1] > m[i + 1][1]) {
						int temp = m[i][1];
						m[i][1] = m[i + 1][1];
						m[i + 1][1] = temp;
					}
				}
			}
		}
		// stampanje matrice
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// kreiramo niz za proveru
		int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		// niz saljemo u metodu
		sort(m);
	}

}
