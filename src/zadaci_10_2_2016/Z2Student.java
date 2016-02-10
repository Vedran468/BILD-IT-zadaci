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

public class Z2Student extends Z2Osoba {
	// konstante za godinu studija i godina studija
	final private int FRESHMAN = 1;
	final private int SOPHOMORE = 2;
	final private int JUNIOR = 2;
	final private int SENIOR = 2;
	private int classStatus = 0;

	// no-arg konstruktor
	public Z2Student() {
	}

	// konstruktor koji prima godinu studija
	public Z2Student(int classStatus) {
		if (classStatus == 1) {
			this.classStatus = this.FRESHMAN;
		} else if (classStatus == 2) {
			this.classStatus = this.SOPHOMORE;
		} else if (classStatus == 3) {
			this.classStatus = this.JUNIOR;
		} else if (classStatus == 4) {
			this.classStatus = this.SENIOR;
		} else {
			System.out.println("Error!!!");
		}
	}

	// get metoda koja vraca status studenta
	public int getClassStatus() {
		return classStatus;
	}

	// metoda koja menja statut studenta
	public void setClassStatus(int classStatus) {
		if (classStatus == 1) {
			this.classStatus = this.FRESHMAN;
		} else if (classStatus == 2) {
			this.classStatus = this.SOPHOMORE;
		} else if (classStatus == 3) {
			this.classStatus = this.JUNIOR;
		} else if (classStatus == 4) {
			this.classStatus = this.SENIOR;
		} else {
			System.out.println("Error!!!");
		}
	}

	// Kreiramo metodu za stmpanje i pozivamo vec kreiranu u super klasi.
	@Override
	public String toString() {
		return (super.toString() + "\nClass status:\t" + getClassStatus() + ".");
	}

}
