/*(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend 
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.*/

package zadaci_19_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public abstract class Z1GeometriskaTela extends Object implements Comparable<Z1GeometriskaTela> {

	// Kreiramo data fields za boju i da li je telo popunjeno.
		private String color = "white";
		private boolean filled = false;

		
		// konstruktor sa data fields poljima
		public Z1GeometriskaTela(String color, boolean filled) {
			super();
			this.color = color;
			this.filled = filled;
		}

		// no-arg konstruktor
		public Z1GeometriskaTela() {
		}

		// metoda koja vraca da li je telo popunjeno
		public boolean isFilled() {
			return filled;
		}

		// postavljanje vrednosti za polje
		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		// metoda vraca boju
		public String getColor() {
			return color;
		}

		// postavljamo boju
		public void setColor(String color) {
			this.color = color;
		}

		
		// metodu override za stampanje.
		@Override
		public String toString() {
			return ("The color of the geometric object is " + getColor() + ".\nThe gometric object filled:\t" + isFilled()
					+ ".");
		}
	
		// metoda za povrsinu 
		public abstract double getArea();
		
		// metoda za obim
		public abstract double getPerimeter();
	}

