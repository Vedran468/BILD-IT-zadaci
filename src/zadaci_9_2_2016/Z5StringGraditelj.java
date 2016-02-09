/*(Implement the StringBuilder class) The StringBuilder class is provided
in the Java library. Provide your own implementation for the following methods
(name the new class MyStringBuilder1):
public MyStringBuilder1(String s);
public MyStringBuilder1 append(MyStringBuilder1 s);
public MyStringBuilder1 append(int i);
public int length();
public char charAt(int index);
public MyStringBuilder1 toLowerCase();
public MyStringBuilder1 substring(int begin, int end);
public String toString();*/
package zadaci_9_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z5StringGraditelj {

	// data field za string
	private String string = "";

	// no-arg konstruktor
	public Z5StringGraditelj() {

	}

	// konstruktor prima string
	public Z5StringGraditelj(String s) {
		this.string = s;
	}

	// metoda koja postojecem stringu dodaje novi string i vraca ga kao objekat
	public Z5StringGraditelj append(Z5StringGraditelj s) {
		String result = this.string + s;
		return new Z5StringGraditelj(result);
	}

	// metoda koja postojecem stringu dodaje broj i vraca ga kao objekat
	public Z5StringGraditelj append(int i) {
		String result = this.string + (i + "");
		return new Z5StringGraditelj(result);
	}

	// metoda koja vraca velicinu stringa
	public int length() {
		return string.length();
	}

	// metoda koja vraca karakter sa indeksom dobijenim iz stringa
	public char charAt(int index) {
		return string.charAt(index);
	}

	// metoda koja vraca string sa malim slovima kao objekat
	public Z5StringGraditelj toLowerCase() {
		String result = this.string.toLowerCase();
		return new Z5StringGraditelj(result);
	}

	// metoda koja pravi novi string od do i vraca ga kao objekat
	public Z5StringGraditelj substring(int begin, int end) {
		String result = "";
		for (int i = begin; i < end; i++) {
			result += result.charAt(i);
		}
		return new Z5StringGraditelj(result);
	}

	// metoda koja vraca string
	public String toString() {
		return string;
	}
}
