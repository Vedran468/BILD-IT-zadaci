/*(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array. Here is a sample run:*/
package zadaci_4_2_2016;
/**
 * @author Vedran Vidakovic
 *
 */
public class Z5LokacijaNajvecegBrojaUMatrici {

	// definisemo data fields za indekse reda i kolone i maksimalne vrednosti u
	// matrici
	public int row;
	public int column;
	public double maxVaule;

	public static Z5LokacijaNajvecegBrojaUMatrici locateLargest(double[][] a) {
		// u metodi pravimo objekat koji cemo vratiti kao metoda
		Z5LokacijaNajvecegBrojaUMatrici l = new Z5LokacijaNajvecegBrojaUMatrici();
		// definisemo po default vredfnosti za data fields
		l.maxVaule = a[0][0];
		l.row = 0;
		l.column = 0;
		// provera koji je broj najveci i njegova lokacija
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (l.maxVaule < a[i][j]) {
					l.maxVaule = a[i][j];
					l.row = i;
					l.column = j;
				}
			}
		}
		// stampamo rezultat
		System.out.println(
				"The location of the largest element is " + l.maxVaule + " at (" + l.row + ", " + l.column + ").");
		return l;
	}
}
