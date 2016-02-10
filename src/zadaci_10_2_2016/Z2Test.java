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

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z2Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner i = new Scanner(System.in);
		// kreiramo varijable za izbor unosa
		int choice = 0;
		int choice2 = 0;
		// provera unosa
		boolean check1 = true;

		// provera za prvi izbor
		while (check1) {
			System.out.println("If you want to input student press 1 and 2 for employee:");
			try {
				choice = i.nextInt();
				// provera je li broj koji je trazen
				if (choice == 1 || choice == 2) {
					check1 = false;
				}
				// u slucaju greske unosa
			} catch (InputMismatchException e1) {
				i.nextLine();
				System.out.println("Enter the integer!!!");
			}
		}
		// u slucaju unosa studenta
		if (choice == 1) {
			i.nextLine();
			// trazeni podaci od klase osoba
			System.out.println("Enter the name: ");
			String n = i.nextLine();
			System.out.println("Enter address: ");
			String a = i.nextLine();
			System.out.println("Enter phone number: ");
			String p = i.nextLine();
			System.out.println("Enter email: ");
			String e = i.nextLine();
			// podaci specificni za studenta
			int status = 0;
			check1 = true;
			while (check1) {
				System.out.println("Enter your student status:");
				try {
					status = i.nextInt();
					if (status == 1 || status == 2 || status == 3 || status == 4) {
						check1 = false;
					}
					// u slucaju greske unosa
				} catch (InputMismatchException e2) {
					i.nextLine();
					System.out.println("Enter the integer!!!");
				}
			}
			// kreiramo objekat student
			Z2Student s = new Z2Student();
			// posto prosiruje klasu osoba preko studenta postavljamo sve
			// vrednosti
			s.setName(n);
			s.setAddress(a);
			s.setPhoneNumber(p);
			s.setEmailAddress(e);
			s.setClassStatus(status);
			// na kraju sve ih stampamo
			System.out.println(s.toString());
			// ako je unos zaposlenika
		} else {
			check1 = true;
			// provera je li profesor ili osoblje
			while (check1) {
				System.out.println("To enter employees in the staff enter 1, and 2 for faculty:");
				try {
					choice2 = i.nextInt();
					if (choice2 == 1 || choice2 == 2) {
						check1 = false;
					}
					// u slucaju greske unosa
				} catch (InputMismatchException e1) {
					i.nextLine();
					System.out.println("Enter the integer!!!");
				}
			}
			// u slucaju da je profesor
			if (choice2 == 2) {
				i.nextLine();
				// podaci klase osoba
				System.out.println("Enter the name: ");
				String n = i.nextLine();
				System.out.println("Enter address: ");
				String a = i.nextLine();
				System.out.println("Enter phone number: ");
				String p = i.nextLine();
				System.out.println("Enter email: ");
				String e = i.nextLine();
				// podaci klase zaposlenik
				int office = 0;
				check1 = true;
				while (check1) {
					System.out.println("Enter the number of offices:");
					try {
						office = i.nextInt();
						if (office >= 0) {
							check1 = false;
						} else {
							System.out.println("Number of offices can not be negative!!!");
						}
						// u slucaju greske unosa
					} catch (InputMismatchException e1) {
						i.nextLine();
						System.out.println("Enter the integer!!!");
					}
				}
				check1 = true;
				double salary = 0;
				while (check1) {
					System.out.println("Enter the salary:");
					try {
						salary = i.nextInt();
						if (salary >= 0) {
							check1 = false;
						} else {
							System.out.println("salary can not be negative!!!");
						}
						// u slucaju greske unosa
					} catch (InputMismatchException e1) {
						i.nextLine();
						System.out.println("Enter the integer!!!");
					}
				}
				check1 = true;
				// podaci klase fakultet
				double hours = 0;
				while (check1) {
					System.out.println("Enter the number of hours:");
					try {
						hours = i.nextInt();
						if (hours > 0) {
							check1 = false;
						} else {
							System.out.println("The number of hours can not be negative!!!");
						}
						// u slucaju greske unosa
					} catch (InputMismatchException e1) {
						i.nextLine();
						System.out.println("Enter the integer!!!");
					}
				}
				System.out.println("Enter ranking");
				i.nextLine();
				String rank = i.nextLine();
				// radi datuma kreiramo i objekat klase zaposlenik
				Z2Zaposlenik em = new Z2Zaposlenik(office, salary);
				// i naravno klase fakultet
				Z2Fakultet f = new Z2Fakultet(office, hours, rank);
				// posto je klasa fakultet poslednja u nasledjivanju preko nje
				// dodajemo sve podatke
				f.setName(n);
				f.setAddress(a);
				f.setPhoneNumber(p);
				f.setEmailAddress(e);
				// i stampamo sve
				System.out.println(f.toString());
				// u slucaju osoblje
			} else {
				i.nextLine();
				// podaci klase osoba
				System.out.println("Enter the name: ");
				String n = i.nextLine();
				System.out.println("Enter address: ");
				String a = i.nextLine();
				System.out.println("Enter phone number: ");
				String p = i.nextLine();
				System.out.println("Enter email: ");
				String e = i.nextLine();
				// podaci klase zaposlenik
				int office = 0;
				check1 = true;
				while (check1) {
					System.out.println("Enter the number of offices:");
					try {
						office = i.nextInt();
						if (office >= 0) {
							check1 = false;
						} else {
							System.out.println("Number of offices can not be negative!!!");
						}
						// u slucaju greske unosa
					} catch (InputMismatchException e1) {
						i.nextLine();
						System.out.println("Enter the integer!!!");
					}
				}
				check1 = true;
				double salary = 0;
				while (check1) {
					System.out.println("Enter the salary:");
					try {
						salary = i.nextInt();
						if (salary >= 0) {
							check1 = false;
						} else {
							System.out.println("salary can not be negative!!!");
						}
						// u slucaju greske unosa
					} catch (InputMismatchException e1) {
						i.nextLine();
						System.out.println("Enter the integer!!!");
					}
				}
				// podaci klase osoblje
				System.out.println("Enter a title: ");
				i.nextLine();
				String title = i.nextLine();
				// zbog datuma kreiramo objekat klase zaposlenik
				Z2Zaposlenik em = new Z2Zaposlenik(office, salary);
				// posto je klasa osoblje poslednja u lancu nasledjivanja preko
				// nje dodajemo podatke
				Z2Osoblje s = new Z2Osoblje(title);
				s.setName(n);
				s.setAddress(a);
				s.setPhoneNumber(p);
				s.setEmailAddress(e);
				// i stampamo ih sve
				System.out.println(s.toString());

			}
		}
		// zatvaramo unos
		i.close();
	}

}
