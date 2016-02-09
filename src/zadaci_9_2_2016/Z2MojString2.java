/*(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);*/
package zadaci_9_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2MojString2 {

	// data field za string
	private String string = "";

	// no-qrg konstruktor
	public Z2MojString2() {

	}

	// konstruktor koji prima string
	public Z2MojString2(String s) {
		this.string = s;
	}

	// metoda koja vraca trenutni string
	public String getString() {
		return string;
	}

	// metoda koja uporedjuje dva stringa
	public int compare(String s) {
		return s.compareTo(string);
	}

	// metoda koja pravi substring od indeksa dobijenog do kraja
	public Z2MojString2 substring(int begin) {
		String result = "";
		for (int i = begin; i < string.length(); i++) {
			result += result.charAt(i);
		}
		return new Z2MojString2(result);
	}

	// metoda koja vraca novi string sa velikim slovima
	public Z2MojString2 toUpperCase() {
		String result = string.toUpperCase();
		return new Z2MojString2(result);
	}

	// metoda koja pretvara string u niz karaktera
	public char[] toChars() {
		return string.toCharArray();
	}

	// metoda koja pravi novi string sa vrednostima boolean
	public static Z2MojString2 valueOf(boolean b) {
		String result = "";
		// u zavisnosti sta dobije metoda vrati string false ili true
		if (b) {
			result = "true";
		} else {
			result = "false";
		}
		return new Z2MojString2(result);
	}
}
