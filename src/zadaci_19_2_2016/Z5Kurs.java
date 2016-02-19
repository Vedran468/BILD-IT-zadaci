/*(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.*/

package zadaci_19_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z5Kurs implements Cloneable {

	// data fields za naziv kursa, niza studenata, i br studenata
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	// konstruktor sa nazivom kursa
	public Z5Kurs(String courseName) {
		this.courseName = courseName;
	}

	// dodavanje studenta
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// vracanje liste studenata
	public String[] getStudents() {
		return students;
	}

	// vracanje broja studenata
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// vracanje naziva kursa
	public String getCourseName() {
		return courseName;
	}

	// izbacivanje studenta
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				students[i] = "";
				numberOfStudents++;
			}
		}
	}

	// menjamo metodu kloniranje tj omogucujemo kolniranje objekta student
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
