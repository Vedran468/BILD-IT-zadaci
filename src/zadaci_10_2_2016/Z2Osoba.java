/*(The Person, Student, Employee, Faculty, and Staff classes) Design a
class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name,
address, phone number, and email address. A student has a class status (freshman,
sophomore, junior, or senior). Define the status as a constant. An employee has
an office, salary, and date hired. Use the MyDate class defined in Programming
Exercise 10.14 to create an object for date hired. A faculty member has office
hours and a rank. A staff member has a title. Override the toString method in
each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods.*/
package zadaci_10_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z2Osoba {

	// data fields za ime telefonski broj, adresu i email
	private String name = "";
	private String address = "";
	private String phoneNumber = "";
	private String emailAddress = "";

	// no-arg konstruktor
	public Z2Osoba() {
	}

	// konstruktor sa podacima o data field
	public Z2Osoba(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	// get metode koje vracaju vrednosti polja podataka
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	// metodu override za stampanje.
	@Override
	public String toString() {
		return "Persons:\t" + getName() + ".\nAddress:\t" + getAddress() + ".\nPhone Number:\t" + getPhoneNumber()
				+ ".\nEmail:\t" + getEmailAddress() + ".";

	}

	// set metode za promenu data fields
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
