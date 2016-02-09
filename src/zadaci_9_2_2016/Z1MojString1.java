/*(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);*/
package zadaci_9_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1MojString1 {

	// data field za string koji metoda vraca
	private String string="";
	
	// no-qrg konstruktor
	public Z1MojString1() {

	}

// konstruktor koji prima niz karakera i definise string
	public Z1MojString1(char[] chars){
		for(int i=0; i<chars.length; i++){
			this.string+= chars[i];
		}
	}
	

	// metoda koja vraca karakter sa indeks dobijenog
	public char charAt(int index){
		return string.charAt(index);
	}
	
	// velicinu stringa vraca
	public int length(){
		return string.length();
	}

	// metoda koja od do indeksa vraca novi string
	public Z1MojString1 substring(int begin, int end){
		char[] c = new char[end-begin];
		for(int i=begin; i<end; i++){
			c[i]=this.string.charAt(i);
		}
		return new Z1MojString1(c);
	}
	

	// metoda koja vraca novi string sa malim slovima
	public Z1MojString1 toLowerCase(){
		String result = string.toLowerCase();
		return new Z1MojString1(result.toCharArray());
	}
	
	// metoda koaj proverava da li su dva stringa jednaki
	public boolean equals(Z1MojString1 s){
		if(s.equals(string)){
			return true;
		}else{
			return false;
		}
	}
	
	// metoda koja broj pretvara u string
	public static Z1MojString1 valueOf(int i){
		String result = i + "";
		return new Z1MojString1(result.toCharArray());
	}

}
