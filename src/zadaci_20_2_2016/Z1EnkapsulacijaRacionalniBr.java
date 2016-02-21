/*(Demonstrate the benefits of encapsulation) Rewrite the Rational class in
Listing 13.13 using a new internal representation for the numerator and denominator.
Create an array of two integers as follows:
private long[] r = new long[2];
Use r[0] to represent the numerator and r[1] to represent the denominator.
The signatures of the methods in the Rational class are not changed, so a client
application that uses the previous Rational class can continue to use this new
Rational class without being recompiled.*/
package zadaci_20_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

// suzbijanje upozorenja "seriski"
@SuppressWarnings("serial")
public class Z1EnkapsulacijaRacionalniBr extends Number implements Comparable<Z1EnkapsulacijaRacionalniBr> {


	
	// polja podataka niz za brojilac i imenilac 
	private long[] r = new long[2];

		// konstruktor sa default vrednostima
		public Z1EnkapsulacijaRacionalniBr() {
			r[0] = 0;
			r[1] = 1;
		}

		// konstruktor sa specificnim vrednostima za brojilac i imenilac
		public Z1EnkapsulacijaRacionalniBr(long numerator, long denominator) {
			// specificne vrednosti prosledjujemo u metodu najveci zajednicki
			// delilac
			long gcd = gcd(numerator, denominator);

			// dodeljujemo od korisnika vrednost brojuocu kroz formulu
			r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
			// dodeljujemo od korisnika vrednost imeniocu kroz formulu
			r[1] = Math.abs(denominator) / gcd;
		}

		// njveci zajednicki metoda
		private static long gcd(long n, long d) {
			// pravimo dva long broja koji su jednaki abstraktnim brojevima iz
			// argumenta
			long n1 = Math.abs(n);
			long n2 = Math.abs(d);
			// najveci zajednicki broj po default je 1
			int gcd = 1;
			// povecavamo za jedan najveci zajednicki broj
			for (int k = 1; k <= n1 && k <= n2; k++) {
				// uslov ako je n1 sa najvecim deljiv bez ostatka i n2 isto
				if (n1 % k == 0 && n2 % k == 0)
					// on postaje najveci delilac
					gcd = k;
			}
			// vrati najveci delilac
			return gcd;

		}

		// metoda get koja vraca brojilac
		public long getNumerator() {
			return r[0];
		}

		// metoda get koja vraca imenilac
		public long getDenominator() {
			return r[1];
		}

		// dodavaje racionalnog broja za objekat koji dobijemo, sve vrsimo preko
		// formule
		// a/b + c/d = (ad + bc)/ bd
		public Z1EnkapsulacijaRacionalniBr add(Z1EnkapsulacijaRacionalniBr secondRational) {
			long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
			long d = r[1] * secondRational.getDenominator();
			return new Z1EnkapsulacijaRacionalniBr(n, d);
		}

		// oduzimanje racionalnog broja od objekta, preko formule
		// a/b - c/d = (ad - bc)/ bd
		public Z1EnkapsulacijaRacionalniBr subtract(Z1EnkapsulacijaRacionalniBr secondRational) {
			long n = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
			long d = r[1] * secondRational.getDenominator();
			return new Z1EnkapsulacijaRacionalniBr(n, d);
		}

		// mnozenje racionalnih brojeva sa objektnim brojem, preko formule
		// a/b x c/d = ac/bd
		public Z1EnkapsulacijaRacionalniBr multiply(Z1EnkapsulacijaRacionalniBr secondRational) {
			long n = r[0] * secondRational.getNumerator();
			long d = r[1] * secondRational.getDenominator();
			return new Z1EnkapsulacijaRacionalniBr(n, d);
		}

		// deljenje racionalnog broja sa brojem u objektu, preko formule
		// (a/b) / (c/d) = ad/bc
		public Z1EnkapsulacijaRacionalniBr divide(Z1EnkapsulacijaRacionalniBr secondRational) {
			long n = r[0] * secondRational.getDenominator();
			long d = r[1] * secondRational.r[0];
			return new Z1EnkapsulacijaRacionalniBr(n, d);
		}

		// overajdovana metoda iz klase broj za stampanje resenja i to kao string
		@Override
		public String toString() {
			// ako je imenilac jednak 1
			if (r[1] == 1)
				// vrati kao string brojilac
				return r[0] + "";
			else
				// imace vrati brojilac kroz imenilac
				return r[0] + "/" + r[1];
		}

		// overajdovana metoda iz klase objekt (klasa broj prosiruje klasu objekt)
		// za proveru da li su jednaki dva objekta
		@Override 
		public boolean equals(Object other) {
			// preko metode oduzmi saljemo argument objekat iz metode kao objekat
			// klae da pozove metodu vrati brojilac da je jednak 0
			if ((this.subtract((Z1EnkapsulacijaRacionalniBr) (other))).getNumerator() == 0)
				return true;
			else
				// inace nije jednaka dva objekta
				return false;
		}

		// overajdujemo metodu iz klase broj za pretvaranje decimalnog broja u celi
		@Override 
		public int intValue() {
			return (int) doubleValue();
		}

		// overajdujemo metodu iz klase broj za pretvaranje decimalnog broja u tip
		// float
		@Override 
		public float floatValue() {
			return (float) doubleValue();
		}

		// overajdujemo metodu iz klase broj za vracanje resenja podeljenog dva
		// broja brojioca i imenioca
		@Override 
		public double doubleValue() {
			return r[0] * 1.0 / r[1];
		}

		// overajdujemo metodu iz klase broj za pretvaranje decimalnog broja u tip
		// long
		@Override 
		public long longValue() {
			return (long) doubleValue();
		}

		// overajdujemo metodu za poredjenje odnosno sortiranje da bude od najveceg
		// do najmanjeg broioca
		@Override
		public int compareTo(Z1EnkapsulacijaRacionalniBr o) {
			if (this.subtract(o).getNumerator() > 0)
				return 1;
			else if (this.subtract(o).getNumerator() < 0)
				return -1;
			else
				return 0;
		}
	}

