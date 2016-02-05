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
public class Z1Ventilator {

	// data fields za brzinu koja su konstante
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	// data field za brzinu na pocetyku je spora
	private int speed = SLOW;
	// data field, za ukljucen ventilator, radius i boju
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	// no-argument konstruktor
	public Z1Ventilator() {

	}

	// set i i get metode za data fields
	public int getSpeed() {
		return speed;
	}

	// uzavisnozti koji se broj dobije postavi brzinu
	public void setSpeed(int speed) {
		if (speed == 1) {
			this.speed = SLOW;
		} else if (speed == 2) {
			this.speed = MEDIUM;
		} else if (speed == 3) {
			this.speed = FAST;
		} else {
			System.out.println("There are only 3 speeds, not to make changes, the current speed is \"slow\"!!!");
		}
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// metoda koja vraca trenutno stanja i ponasanje ventilatora
	public String toString() {
		String speed = "";

		// u zavisnoti na kojoj je brzini ventilator dodeli vrednost stringu
		if (this.speed == 1) {
			speed = "slow";
		} else if (this.speed == 2) {
			speed = "medium";
		} else if (this.speed == 3) {
			speed = "fast";
		}
		// u zavisnosti je li ventilator ukljicen ili ne vrati string
		if (this.on) {
			return "Current fan speed is \"" + speed + "\", its radius is " + getRadius() + "[inches], and the color \""
					+ getColor() + "\".";
		} else {
			return "At present, the fan is turned off, its radius is " + getRadius() + "[inches], and the color \""
					+ getColor() + "\".";
		}

	}
}
