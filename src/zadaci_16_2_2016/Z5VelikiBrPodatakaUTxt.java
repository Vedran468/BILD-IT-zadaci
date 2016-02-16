/*(Create large dataset) Create a data file with 1,000 lines. Each line in the file
consists of a faculty member’s first name, last name, rank, and salary. The
faculty member’s first name and last name for the ith line are FirstNamei and
LastNamei. The rank is randomly generated as assistant, associate, and full.
The salary is randomly generated as a number with two digits after the decimal
point. The salary for an assistant professor should be in the range from 50,000
to 80,000, for associate professor from 60,000 to 110,000, and for full professor
from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055.95
FirstName2 LastName2 associate 81112.45
. . .
FirstName1000 LastName1000 full 92255.21*/
package zadaci_16_2_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5VelikiBrPodatakaUTxt {

	public static void main(String[] args) throws FileNotFoundException {

		// niz titula
		String[] rank = { "assistant", "associate", "full" };

		// unosimo podatke u fajl
		File file = new File("podaci.txt");
		try (PrintWriter output = new PrintWriter(file);) {
			for (int i = 1; i <= 1000; i++) {
				// izbor ranga
				int r = (int) (Math.random() * 3);
				switch (r) {
				case 0:
					// ako je rang assistant plata je od 50000-80000
					double salaryA1 = (Math.random() * 3) * 10000 + 50000;
					output.printf("FirstName%d LastName%d %s %2.2f;\n", i, i, rank[r], salaryA1);
					break;
				case 1:
					// ako je rang associate plata je od 60000-110000
					double salaryA2 = (Math.random() * 5) * 10000 + 60000;
					output.printf("FirstName%d LastName%d %s %2.2f;\n", i, i, rank[r], salaryA2);
					break;
				case 2:
					// ako je rang full plata je od 75000-130000
					double salaryf = (Math.random() * 5.5) * 10000 + 75000;
					output.printf("FirstName%d LastName%d %s %2.2f;\n", i, i, rank[r], salaryf);
					break;
				}
			}
		}

		// citanje podataka iz fajla i stampanje
		File file3 = new File("podaci.txt");
		Scanner input2 = new Scanner(file3);
		while (input2.hasNextLine()) {
			System.out.println(input2.nextLine());
		}
		input2.close();
	}

}
