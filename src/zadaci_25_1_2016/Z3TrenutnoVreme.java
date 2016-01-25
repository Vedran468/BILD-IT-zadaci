/*3. Ako pozovemo metodu System.currentTimeMillis() 
dobijemo broj milisekundi od 1. januara 1970 do 
trenutka pozivanja metode. Napisati program koji ispisuje 
trenutacni datum i vrijeme u formatu 
"Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"*/
package zadaci_25_1_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3TrenutnoVreme {
	public static void main(String[] args) {
		// pozivamo metodu da nam vrati do sada koliko je proslo milisekunde od
		// 1.1.1970.
		long allSecond = System.currentTimeMillis();
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
					monthName = "February";
				} else if (day > 59 && day <= 90) {
					monthName = "March";
				} else if (day > 90 && day <= 120) {
					monthName = "April";
				} else if (day > 120 && day <= 151) {
					monthName = "May";
				} else if (day > 151 && day <= 181) {
					monthName = "June";
				} else if (day > 181 && day <= 212) {
					monthName = "July";
				} else if (day > 212 && day <= 243) {
					monthName = "August";
				} else if (day > 243 && day <= 273) {
					monthName = "September";
				} else if (day > 273 && day <= 304) {
					monthName = "October";
				} else if (day > 304 && day <= 334) {
					monthName = "November";
				} else {
					monthName = "December";
				}
			} else {
				if (day > 31 && day <= 60) {
					monthName = "February";
				} else if (day > 60 && day <= 91) {
					monthName = "March";
				} else if (day > 91 && day <= 121) {
					monthName = "April";
				} else if (day > 121 && day <= 152) {
					monthName = "May";
				} else if (day > 152 && day <= 182) {
					monthName = "June";
				} else if (day > 182 && day <= 213) {
					monthName = "July";
				} else if (day > 213 && day <= 244) {
					monthName = "August";
				} else if (day > 244 && day <= 274) {
					monthName = "September";
				} else if (day > 274 && day <= 305) {
					monthName = "October";
				} else if (day > 305 && day <= 335) {
					monthName = "November";
				} else {
					monthName = "December";
				}
			}
		}
		// stampamo rezultat (datumu dodajemo 1 jer je vremenska zona +1, a satu
		// dodajemo 1 jer je zimsko racunanje vremena)
		System.out.println("The time and date is: " + (day + 1) + ". " + monthName + ", " + year + ". " + (hour + 1)
				+ " : " + minute + " : " + seconds + ".");
	}

}
