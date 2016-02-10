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

public class Z2MojDatum {
	// data fields za godinu mesec i vreme i dan
		private int year = 0;
		private String month = "";
		private String time = "";
		private int day = 0;

		// konstruktori
		public Z2MojDatum(int year, String month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

		// konstruktor koji pretvara mili sekunde sate minute i sekunde
		public Z2MojDatum(long tameInMilliseconds) {
			long elapseTime = tameInMilliseconds;
			setTime(elapseTime);
		}
		// konstruktor koji prikazuje trenutno vreme
		public Z2MojDatum() {
			long elapseTime = System.currentTimeMillis();
			setTime(elapseTime);
		}
		// get za date fields 
		public String getTime() {
			return time;
		}

		public int getYear() {
			return year;
		}

		public String getMonth() {
			return month;
		}

		public int getDay() {
			return day;
		}

		// metoda koja postavlja trenutno vreme
		public String setTime(long allSecond) {

			// dobijene mili sekunde pretvaramo u sekunde
			double convertedInSeconds = allSecond / 1000;
			// pomocna varijabla koja dobijene sekunde pretvara u dane ali sa
			// zarezom
			double x = convertedInSeconds / 86400;
			// dane definisemo u mani nbroj bez obzira kolika je vrednost iza zareza
			int day = (int) Math.floor(x);
			// ostatak od broja da na pretvaramo u sate npr 0,7 dana je 60480
			// sekundi
			double y = (x - day) * 86400;
			// pomocna varijabla koja dobijene sekunde pretvara u sate
			double z = y / 3600;
			// sate definisemo kao manji broj bez obzira na velicinu broja iza
			// zareza
			int hour = (int) Math.floor(z);
			// pomocna varijabla koja broj iza zareza dobijenih od sati pretvara u
			// sekunde npr 0,7 sati je 2520 sekundi
			double e = (z - hour) * 3600;
			// pomocna varijabla gde dobijamo minute sa zarezom
			double t = e / 60;
			// minute definisemo kao manji broj bez obzira na velicinu broja iza
			// zareza
			int minute = (int) Math.floor(t);
			// pomocna varijabla gde dobijamo sekunde sa zarezom
			double j = (t - minute) * 60;
			// sekunde pretvaramo u int i to da se zaokruzi na blize
			int seconds = (int) Math.rint(j);
			// varijabla za proveru je li godina prestupna
			boolean leapYear = false;
			// pocetna godina
			int year = 1970;
			// varijabl;a za dani u godini
			int dayInYear = 0;
			// oduzimamo dane od dobijenog broja trenutnih dana a
			while (day >= 366) {
				// ako je godina prestupna oduzmi 366
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					dayInYear = 366;
					// a varijablu za godinu prestupnu postavi na tacno
					leapYear = true;
				} else {
					// inace nije prestupna i oduzmi 365
					dayInYear = 365;
					leapYear = false;
				}
				day = day - dayInYear;
				// svaki put povecaj godinu
				year++;
			}
			// varijabla za naziv meseca
			String monthName = "";

			// definisemo naziv meseca u zavisnosti koji je dan u godini pa npr ako
			// godina nije prestupna a dan u godini je veci od 90 a manji od 121 to
			// je April znaci i tako dalje
			if (day <= 31) {
				monthName = "January";
			} else {
				if (!leapYear) {
					if (day > 31 && day <= 59) {
						day = day - 31;
						monthName = "February";
					} else if (day > 59 && day <= 90) {
						day = day - 59;
						monthName = "March";
					} else if (day > 90 && day <= 120) {
						day = day - 90;
						monthName = "April";
					} else if (day > 120 && day <= 151) {
						day = day - 120;
						monthName = "May";
					} else if (day > 151 && day <= 181) {
						day = day - 151;
						monthName = "June";
					} else if (day > 181 && day <= 212) {
						day = day - 181;
						monthName = "July";
					} else if (day > 212 && day <= 243) {
						day = day - 212;
						monthName = "August";
					} else if (day > 243 && day <= 273) {
						day = day - 243;
						monthName = "September";
					} else if (day > 273 && day <= 304) {
						day = day - 273;
						monthName = "October";
					} else if (day > 304 && day <= 334) {
						day = day - 304;
						monthName = "November";
					} else {
						day = day - 334;
						monthName = "December";
					}
				} else {
					if (day > 31 && day <= 60) {
						day = day - 31;
						monthName = "February";
					} else if (day > 60 && day <= 91) {
						day = day - 60;
						monthName = "March";
					} else if (day > 91 && day <= 121) {
						day = day - 91;
						monthName = "April";
					} else if (day > 121 && day <= 152) {
						day = day - 121;
						monthName = "May";
					} else if (day > 152 && day <= 182) {
						day = day - 152;
						monthName = "June";
					} else if (day > 182 && day <= 213) {
						day = day - 182;
						monthName = "July";
					} else if (day > 213 && day <= 244) {
						day = day - 213;
						monthName = "August";
					} else if (day > 244 && day <= 274) {
						day = day - 244;
						monthName = "September";
					} else if (day > 274 && day <= 305) {
						day = day - 274;
						monthName = "October";
					} else if (day > 305 && day <= 335) {
						day = day - 305;
						monthName = "November";
					} else {
						day = day - 335;
						monthName = "December";
					}
				}
			}
			// stampamo rezultat (datumu dodajemo 1 jer je vremenska zona +1, a satu
			// dodajemo 1 jer je zimsko racunanje vremena)
			// dodeljujemo
			this.day = day + 1;
			this.month = monthName;
			this.year = year;
			this.time = (hour + 1) + " : " + minute + " : " + seconds + ".";
			return ("Date of employment:\t" + this.day + ". " + this.month + ", " + this.year + ". " + (hour + 1) + " : "
					+ minute + " : " + seconds + ".");
		}
}
