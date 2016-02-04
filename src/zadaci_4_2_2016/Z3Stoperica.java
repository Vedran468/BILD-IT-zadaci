/*(Stopwatch) Design a class named StopWatch. The class contains:
- Private data fields startTime and endTime with getter methods.
- A no-arg constructor that initializes startTime with the current time.
- A method named start() that resets the startTime to the current time.
- A method named stop() that sets the endTime to the current time.
- A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.*/
package zadaci_4_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z3Stoperica {

	// data fields za start i kraj merenja
	private long startTime;
	private long endTime;

	// konstruktor kojim pri kreiranj pokrece stopericu
	public Z3Stoperica() {
		startTime = System.currentTimeMillis();
	}

	// vraca startno vreme u mili sekundama
	public long getStartTime() {
		return startTime;
	}

	// vraca krajnje vreme u mili sekundama
	public long getEndTime() {
		return endTime;
	}

	// metoda kojom pocinjemo merenje
	public long start() {
		return startTime = System.currentTimeMillis();
	}

	// metoda kojom zavrsavamo merenje
	public long stop() {
		return endTime = System.currentTimeMillis();
	}

	// metoda koja vraca proteklo vreme merenja
	public double getElapsedTime() {
		return (endTime - startTime) / 1000.0;
	}
}
