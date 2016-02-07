/*(The MyInteger class) Design a class named MyInteger. The class contains: 
- An int data field named value that stores the int value represented by this
object.
- A constructor that creates a MyInteger object for the specified int value.
- A getter method that returns the int value.
- The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
- The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
- The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
- The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
- A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
- A static method parseInt(String) that converts a string into an int
value.
Draw the UML diagram for the class and then implement the class. Write a client
program that tests all methods in the class.*/
package zadaci_6_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2MojCeoBroj {
	// data field za vrednost
	private int value = 0;

	// konstruktor koji prima broj
	public Z2MojCeoBroj(int value) {
		this.value = value;
	}

	// metoda koja vraca broj
	public int getValue() {
		return value;
	}

	// metoda koja proverava je li broj paran
	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// provera je li broj neparan
	public boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	// provera je li borj prost
	public boolean isPrime() {

		if (this.value > 1) {
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
			// sa samim sobom.
			for (int divisor = 2; divisor <= this.value / 2; divisor++) {
				if (this.value % divisor == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	// STATIC METODE KOJE PRIMAJU BROJ I PROVERAVAJU
	// metoda koja proverava je li broj paran
	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// provera je li broj neparan
	public static boolean isOdd(int n) {
		if (n % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	// provera je li borj prost
	public static boolean isPrime(int n) {

		if (n > 1) {
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
			// sa samim sobom.
			for (int divisor = 2; divisor <= n / 2; divisor++) {
				if (n % divisor == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	// STATIC METODE KOJE PRIMAJU OBJEKAT OVE KLASE I PROVERAVAJU
	// metoda koja proverava je li broj paran
	public static boolean isEven(Z2MojCeoBroj o) {
		if (o.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// provera je li broj neparan
	public static boolean isOdd(Z2MojCeoBroj o) {
		if (o.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	// provera je li borj prost
	public static boolean isPrime(Z2MojCeoBroj o) {
		if (o.getValue() > 1) {
			// proveravamo da li je prost broj, prost ako je deljiv samo sa 1 i
			// sa samim sobom, ova petlja proverava da li je broj deljiv sa dva
			// i sa brojevima do polovine svoje vrednosti a zatim je li deljiv i
			// sa samim sobom.
			for (int divisor = 2; divisor <= o.getValue() / 2; divisor++) {
				if (o.getValue() % divisor == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	// metoda koja proverava je li broj jednak sa brojem objekta
	public boolean equals(int n) {
		if (n == this.value) {
			return true;
		} else {
			return false;
		}
	}

	// metoda koja proverava jesu li brojevi dva objekta jednaki
	public boolean equals(Z2MojCeoBroj o) {
		if (o.getValue() == this.value) {
			return true;
		} else {
			return false;
		}
	}

	// metoda koja pretvara niz karaktera u broj
	public static int parseInt(char[] c) {
		int result = 0;
		for (int i = 0; i < c.length; i++) {
			result = result * 10 + ((int) (c[i]) - 48);
		}
		return result;
	}

	// metoda koja pretvara string u broj
	public static int parseInt(String s) {
		char[] c = s.toCharArray();
		int result = 0;
		if (c[0] == '-') {
			for (int i = 1; i < c.length; i++) {

				result = result * 10 - ((int) (c[i]) - 48);
			}
			return result;
		} else {
			for (int i = 0; i < c.length; i++) {

				result = result * 10 + ((int) (c[i]) - 48);
			}
			return result;
		}
	}
}
