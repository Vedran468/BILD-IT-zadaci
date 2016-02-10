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

public class Z2Osoblje extends Z2Zaposlenik {
	// data field za nazivg grupe kojoj pripadaju
	private String title = "";

	// no-arg konstruktor
	public Z2Osoblje() {

	}

	// konstruktor za naziv grupe
	public Z2Osoblje(String title) {
		this.title = title;
	}

	// get i set metoda koja vraca i postavlja naslov
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Kreiramo metodu za stmpanje i pozivamo vec kreiranu u super klasi.
	@Override
	public String toString() {
		return (super.toString() + "\nTitle:\t" + getTitle() + ".");
	}

}
