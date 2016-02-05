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
/**
 * @author Vedran Vidakovic
 *
 */
public class Z1TestVentilator {

	public static void main(String[] args) {

		// kreiramo prvi objekat ventilator
		Z1Ventilator fan1 = new Z1Ventilator();
		// dodeljujemo mu da je ukljucen brzina maksimalna, boja zuta i radius
		// 10 inca
		fan1.setOn(true);
		fan1.setSpeed(3);
		fan1.setColor("yellow");
		fan1.setRadius(10);
		// stampamo trenutno stanje ventilatora i ponasanje
		System.out.println("The state and behavior of the first fan:\n"+fan1.toString());

		// kreiramo drugi obejkat ventilator
		Z1Ventilator fan2 = new Z1Ventilator();
		// dodeljujemo mu da je iskljucen brzina srednja, boja plava i radius
		// 5 inca, naravno da se brzina nece izvrsiti zato sto je iskljucen
		// ostalo hoce jer su iste vrednosti kao po default
		fan2.setOn(false);
		fan2.setSpeed(2);
		fan2.setColor("blue");
		fan2.setRadius(5);
		
		// stampamo trenutno stanje ventilatora i ponasanje
		System.out.println("\nThe state and behavior of the second fan:\n"+fan2.toString());

	}

}
