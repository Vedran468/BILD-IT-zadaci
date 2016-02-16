/*(Add package statement) Suppose you have Java source files under the directories
chapter1, chapter2, . . . , chapter34. Write a program to insert the
statement package chapteri; as the first line for each Java source file under
the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
are under the root directory srcRootDirectory. The root directory and
chapteri directory may contain other folders and files. Use the following
command to run the program:
java Exercise12_18 srcRootDirectory*/
package zadaci_16_2_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2DodavanjePoglavljaUTxt {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		// pitamo korisnika za naslov
		System.out.println("Enter the chapter title: ");
		String title = input.nextLine();

		// pitamo korisnika za sadrzaj naslov
		System.out.println("Enter the contents of the chapter: ");
		String contents = input.nextLine();
		input.close();

		// lista preko koje upisujemo u fajl
		ArrayList<String> t = new ArrayList<>();

		// prvo iscitamo sta se vec nalazi u fajlu i dodamo listi
		File file = new File("roman.txt");
		Scanner in2 = new Scanner(file);
		while (in2.hasNextLine()) {
			t.add(in2.nextLine());
		}
		in2.close();
		// prazan red pa bnaslov sa tabom i opet prazan red
		t.add(" ");
		t.add(("    " + title));
		t.add(" ");

		// pretvaramo uneti tekst u karaktere
		char[] c = contents.toCharArray();

		// pomocna varijabla koja karaktere pretvara u string da bi mogli dodati
		// listi
		String s = "";
		// indeks do kojeg je uneto u listu
		int index = 0;
		// brojac karaktera u jednom stringu ide do 100 karaktera
		int counter = 1;
		// string iz liste prestavlja jedan red teksta a red ne sme biti veci od
		// 100 karaktera
		for (int i = 0; i < c.length; i++) {
			s += c[i] + "";
			if (counter == 100 && c[i] != ' ') {
				index = i;
				t.add((s + '-'));
				s = "";
				counter = 0;
			} else if (counter == 100 && c[i] == ' ') {
				t.add((s + '-'));
				counter = 0;
				index = i;
			} else if (c.length < 100) {
				t.add((s + '-'));
				s = "";
			}
			counter++;
		}
		// nastavljamo unos u listu karaktera koi nisu uneti
		s = "";
		for (int i = index; i < c.length; i++) {
			s += c[i] + "";
		}
		t.add((s + '-'));

		// unosimo u fajl listu
		File file2 = new File("roman.txt");
		try (PrintWriter output = new PrintWriter(file2);) {
			for (int i = 0; i < t.size(); i++) {
				output.println(t.get(i));
			}
		}
		input.close();

		// stampamo sadrzaj fajla
		System.out.println("Contents txt file:\n");
		File file3 = new File("roman.txt");
		Scanner input2 = new Scanner(file3);
		while (input2.hasNextLine()) {
			System.out.println(input2.nextLine());
		}
		input2.close();

	}

}
