/*(The Fan class) Design a class named Fan to represent a fan. The class contains:
- Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
denote the fan speed.
- A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
- A private boolean data field named on that specifies whether the fan is on (the
default is false).
- A private double data field named radius that specifies the radius of the fan
(the default is 5).
- A string data field named color that specifies the color of the fan (the default
is blue).
- The accessor and mutator methods for all four data fields.
- A no-arg constructor that creates a default fan.
- A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined
string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Fan objects. Assign maximum speed, radius 10, color
yellow, and turn it on to the first object. Assign medium speed, radius 5, color
blue, and turn it off to the second object. Display the objects by invoking their
toString method.*/
package zadaci_5_2_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1TestVentlatorUpravljaKorisnik {

	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// varijabla za ukljucivanje
		int on = 0;
		// varijabla za radius
		double radius = 0;
		// varijabla za boju
		String color = "";
		// varijabla za brziunu
		int speed = 0;
		// objekat klase ventilator
		Z1Ventilator fan = new Z1Ventilator();
		// provera unosa
		boolean checkingEntry1 = true;
		boolean checkingEntry2 = true;
		boolean checkingEntry3 = true;

		while (checkingEntry1) {
			System.out.println("Enter 1 to turn on the fan order to be able to modify and speed, "
					+ "\nif you do not want turn on type 2 input radius and color fan."
					+ "\nIf you do not want to change the initial value of the radius enter 3: ");
			try {
				on = input.nextInt();
				// uzavisnosti od toga sta je korisnik uneo izvrsi
				if (on == 1 || on == 2) {
					checkingEntry1 = false;
				} else if (on == 3) {
					System.out.println(fan.toString());
					checkingEntry1 = false;
					checkingEntry2 = false;
					checkingEntry3 = false;
				} else {
					checkingEntry1 = true;
				}
				// u slucaju greske
			} catch (InputMismatchException e) {
				System.out.println("Againl!!! Enter the integer: ");
				input.nextLine();
			}
		}

		if (on == 2) {
			while (checkingEntry2) {
				System.out.println("Enter the size in inches of radius greater than 0: ");
				try {
					radius = input.nextDouble();
					// uzavisnosti od toga sta je korisnik uneo izvrsi
					if (radius > 0) {
						fan.setRadius(radius);
						checkingEntry2 = false;
					} else {
						checkingEntry2 = true;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the number: ");
					input.nextLine();
				}
			}
			input.nextLine();
			// promena bopje radiusa
			System.out.println("Enter the color of the radius");
			color = input.nextLine();
			fan.setColor(color);
			// ispisi stanje i ponasanje
			System.out.println(fan.toString());

		} else if (on == 1) {
			fan.setOn(true);
			while (checkingEntry3) {
				System.out.println("To speed enter 1 if you want to be slow, 2 for medium and 3 for fast: ");
				try {
					speed = input.nextInt();
					// uzavisnosti od toga sta je korisnik uneo izvrsi
					if (speed == 1 || speed == 2 || speed == 3) {
						fan.setSpeed(speed);
						checkingEntry3 = false;
					} else {
						checkingEntry3 = true;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the number: ");
					input.nextLine();
				}
			}

			while (checkingEntry2) {
				System.out.println("Enter the size in inches of radius greater than 0: ");
				try {
					radius = input.nextDouble();
					// uzavisnosti od toga sta je korisnik uneo izvrsi
					if (radius > 0) {
						fan.setRadius(radius);
						checkingEntry2 = false;
					} else {
						checkingEntry2 = true;
					}
					// u slucaju greske
				} catch (InputMismatchException e) {
					System.out.println("Againl!!! Enter the number: ");
					input.nextLine();
				}
			}
			input.nextLine();
			// promena bopje radiusa
			System.out.println("Enter the color of the radius");
			color = input.nextLine();
			fan.setColor(color);
			// ispisi stanje i ponasanje
			System.out.println(fan.toString());
		}
		// zatvaramo unos
		input.close();
	}

}
