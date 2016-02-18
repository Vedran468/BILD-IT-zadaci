/*(Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
a deep copy of the list field.*/

package zadaci_18_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

import java.util.ArrayList;

public class Z5MojStek {

	// data field lista
	private ArrayList<Object> list = new ArrayList<>();

	// provera je li prazan stek
	public boolean isEmpty() {
		return list.isEmpty();
	}

	// trenutna velicina steka
	public int getSize() {
		return list.size();
	}

	// vraca poslednji clan liste
	public Object peek() {
		return list.get(getSize() - 1);
	}

	// brise poslednjeg clana liste i vraca izbrisani clan
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	// dodavanje u listu
	public void push(Object o) {
		list.add(o);
	}

	// metoda koja prazni predhodan stek i kopira citav niz dobijeni
	public void copy(ArrayList<Object> array) {
		list.clear();
		for (int i = 0; i < array.size(); i++) {
			list.add(array.get(i));
		}
	}

	// metoda koja stampa listu
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
