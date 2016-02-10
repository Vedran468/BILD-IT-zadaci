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

public class Z2Fakultet extends Z2Zaposlenik {
	// data fields za kancelariju sate i titulu
	private int office = 0;
	private double hours = 0;
	private String rank = "";

	// no-arg konstruktor
	public Z2Fakultet() {

	}

	// konstruktor sa data fields
	public Z2Fakultet(int office, double hours, String rank) {
		this.hours = hours;
		this.rank = rank;
	}

	// get meteode koje vracaju podatak i set koje postavljaju novi podatak za
	// data fields
	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public double getHours() {
		return hours;
	}

	// sate sabiramo rada
	public void setHours(double hours) {
		this.hours = this.hours + hours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	// Kreiramo metodu za stmpanje i pozivamo vec kreiranu u super klasi.
	@Override
	public String toString() {
		return (super.toString() + "\nNumber of offices:\t" + getOffice() + ".\nHours:\t" + getHours() + ".\nRank:\t"
				+ getRank() + ".");
	}

}
