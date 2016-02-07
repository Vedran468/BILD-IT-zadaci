/*(The Time class) Design a class named Time. The class contains:
- The data fields hour, minute, and second that represent a time.
- A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
- A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
- A constructor that constructs a Time object with the specified hour, minute,
and second.
- Three getter methods for the data fields hour, minute, and second,
respectively.
- A method named setTime(long elapseTime) that sets a new time
for the object using the elapsed time. For example, if the elapsed time is
555550000 milliseconds, the hour is 10, the minute is 19, and the second is
10.
Draw the UML diagram for the class and then implement the class. Write
a test program that creates two Time objects (using new Time() and new
Time(555550000)) and displays their hour, minute, and second in the format
hour:minute:second.
(Hint: The first two constructors will extract the hour, minute, and second
from the elapsed time. For the no-arg constructor, the current time can be
obtained using System.currentTimeMillis(), as shown in Listing 2.7,
ShowCurrentTime.java.)*/

package zadaci_6_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1Vreme {

	// data fields za sat minu i sekunde
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	// konstruktor koji prikazuje trenutno vreme
	public Z1Vreme() {
		long elapseTime = System.currentTimeMillis();
		setTime(elapseTime);
		System.out.println(
				"Now's the time (hh: mm: ss): " + (getHour() + 1) + " : " + getMinute() + " : " + getSecond() + ".");
	}

	// konstruktor koji prima trenutno vreme
	public Z1Vreme(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		System.out.println("Time entered the " + getHour() + " : " + getMinute() + " : " + getSecond() + ".");
	}

	// konstruktor koji pretvara mili sekunde sate minute i sekunde
	public Z1Vreme(long tameInMilliseconds) {
		long elapseTime = tameInMilliseconds;
		System.out.println(setTime(elapseTime));
	}

	// get metode koje vracaju sate minute i sekunde
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	// metoda koja postavlja trenutno vreme
	public String setTime(long elapseTime) {
		// kreiramo string za rezultat
		String result = "";

		double convertedInSeconds = elapseTime / 1000;
		// pomocna varijabla koja dobijene sekunde pretvara u dane ali sa
		// zarezom
		double x = convertedInSeconds / 86400;
		// dane definisemo u mani broj bez obzira kolika je vrednost iza zareza
		int day = (int) Math.floor(x);
		// ostatak od broja da na pretvaramo u sate npr 0,7 dana je 60480
		// sekundi
		double y = (x - day) * 86400;
		// pomocna varijabla koja dobijene sekunde pretvara u sate
		double z = y / 3600;
		// sate definisemo kao manji broj bez obzira na velicinu broja iza
		// zareza
		int hour = (int) Math.floor(z);
		this.hour = hour;
		// pomocna varijabla koja broj iza zareza dobijenih od sati pretvara u
		// sekunde npr 0,7 sati je 2520 sekundi
		double e = (z - hour) * 3600;
		// pomocna varijabla gde dobijamo minute sa zarezom
		double t = e / 60;
		// minute definisemo kao manji broj bez obzira na velicinu broja iza
		// zareza
		int minute = (int) Math.floor(t);
		this.minute = minute;
		// pomocna varijabla gde dobijamo sekunde sa zarezom
		double j = (t - minute) * 60;
		// sekunde pretvaramo u int i to da se zaokruzi na blize
		int seconds = (int) Math.rint(j);
		this.second = seconds;
		// postavljamo resenje i metoda ga vraca
		result = "For " + elapseTime + " milliseconds have (hh: mm: ss): \n" + getHour() + ":" + getMinute() + ":"
		// sekunde zaokruzujemo npr za unos 499 bice 0:0:0 a za 599 bice 0:0:1
				+ getSecond();
		return result;
	}
}
