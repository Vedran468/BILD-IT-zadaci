/*1. Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase  
karaktera i 4 broja u sljedecem formatu AAA-1234. 
Napisati program koji nasumicno generise tablicu.*/
package zadaci_26_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1RegistarskaTablicaAuta {

	public static void main(String[] args) {
		// definisemo broj za prvo slovo
		int x = (int) (Math.random() * 26);
		// broj pretvaramo u karakter na osnovu ASCII koda
		char firstLetter = (char) (x + 65);
		// definisemo broj za drugo slovo
		int y = (int) (Math.random() * 26);
		// broj pretvaramo u karakter na osnovu ASCII koda
		char secondLetter = (char) (y + 65);
		// definisemo broj za trece slovo
		int z = (int) (Math.random() * 26);
		// broj pretvaramo u karakter na osnovu ASCII koda
		char thirdLetter = (char) (z + 65);
		// definisemo 4 nasumicna broja od 0 do 9 ukljucujucu i 9
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);
		int number4 = (int) (Math.random() * 10);
		// definisemorezultata i stampamo ga
		String result = firstLetter + "" + secondLetter + "" + thirdLetter + "-" + number1 + "" + number2 + "" + number3
				+ "" + number4;
		System.out.println("Your license plate of the car was \"" + result + "\".");

	}

}
