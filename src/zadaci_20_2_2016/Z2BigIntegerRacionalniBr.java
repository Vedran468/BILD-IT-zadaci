/*(Use BigInteger for the Rational class) Redesign and implement the
Rational class in Listing 13.13 using BigInteger for the numerator and
denominator.*/
package zadaci_20_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.math.BigInteger;

// suzbijanje upozorenja "seriski"
@SuppressWarnings("serial")
public class Z2BigIntegerRacionalniBr extends Number implements
Comparable<Z2BigIntegerRacionalniBr>{

	
		// polja podataka za brojilac i imenilac koji po default imaju 0 i 1
	private BigInteger numerator= new BigInteger("0");
	private BigInteger denominator= new BigInteger("1");

		// konstruktor sa default vrednostima
		public Z2BigIntegerRacionalniBr() {
		}

		// konstruktor sa specificnim vrednostima za brojilac i imenilac
		public Z2BigIntegerRacionalniBr(BigInteger numerator, BigInteger denominator) {
			long num = numerator.longValue();
			long den = denominator.longValue();
			// specificne vrednosti prosledjujemo u metodu najveci zajednicki
			// delilac
			long gcd = gcd(num, den);

			// dodeljujemo od korisnika vrednost brojuocu kroz formulu
			 long n = ((den > 0) ? 1 : -1) * num / gcd;
			 this.numerator = new BigInteger(n+"");
			// dodeljujemo od korisnika vrednost imeniocu kroz formulu
			long d = Math.abs(den) / gcd;
			this.denominator = new BigInteger(d+"");
		}

		

		// najveci zajednicki metoda
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
		public BigInteger getNumerator() {
			return numerator;
		}

		// metoda get koja vraca imenilac
		public BigInteger getDenominator() {
			return denominator;
		}

		// dodavaje racionalnog broja za objekat koji dobijemo, sve vrsimo preko
		// formule
		// a/b + c/d = (ad + bc)/ bd
		public Z2BigIntegerRacionalniBr add(Z2BigIntegerRacionalniBr secondRational) {
			BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
			return new Z2BigIntegerRacionalniBr(n, d);
		}

		// oduzimanje racionalnog broja od objekta, preko formule
		// a/b - c/d = (ad - bc)/ bd
		public Z2BigIntegerRacionalniBr subtract(Z2BigIntegerRacionalniBr secondRational) {
			BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
			BigInteger d = denominator.multiply(secondRational.getDenominator());
			return new Z2BigIntegerRacionalniBr(n, d);
		}

		// mnozenje racionalnih brojeva sa objektnim brojem, preko formule
		// a/b x c/d = ac/bd
		public Z2BigIntegerRacionalniBr multiply(Z2BigIntegerRacionalniBr secondRational) {
			BigInteger n = numerator.multiply(secondRational.getNumerator());
			BigInteger d = denominator.multiply(secondRational.getDenominator());
			return new Z2BigIntegerRacionalniBr(n, d);
		}

		// deljenje racionalnog broja sa brojem u objektu, preko formule
		// (a/b) / (c/d) = ad/bc
		public Z2BigIntegerRacionalniBr divide(Z2BigIntegerRacionalniBr secondRational) {
			BigInteger n = numerator.multiply(secondRational.getDenominator());
			BigInteger  d = denominator.multiply( secondRational.numerator);
			return new Z2BigIntegerRacionalniBr(n, d);
		}

		// overajdovana metoda iz klase broj za stampanje resenja i to kao string
		@Override
		public String toString() {
			// ako je imenilac jednak 1
			if (denominator.equals("1"))
				// vrati kao string brojilac
				return numerator + "";
			else
				// imace vrati brojilac kroz imenilac
				return numerator + "/" + denominator;
		}

		// overajdovana metoda iz klase objekt (klasa broj prosiruje klasu objekt)
		// za proveru da li su jednaki dva objekta
		@Override 
		public boolean equals(Object other) {
			// preko metode oduzmi saljemo argument objekat iz metode kao objekat
			// klae da pozove metodu vrati brojilac da je jednak 0
			if ((this.subtract((Z2BigIntegerRacionalniBr) (other))).getNumerator().equals("0"))
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
			BigInteger x = numerator.divide( denominator);
			double n= x.doubleValue();
			return n;
		}

		@Override // Implement the abstract longValue method in Number
		public long longValue() {
			return (long) doubleValue();
		}

		// overajdujemo metodu za poredjenje odnosno sortiranje da bude od najveceg
		// do najmanjeg broioca
	@Override
	public int compareTo(Z2BigIntegerRacionalniBr o) {
		if (this.subtract(o).getNumerator().intValue() > 0)
			return 1;
		else if (this.subtract(o).getNumerator().intValue() < 0)
			return -1;
		else
			return 0;
	}

	}