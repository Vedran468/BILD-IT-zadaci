/*(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method.*/
package zadaci_10_2_2016;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4ListeRazlicitihObjekata {

	public static void main(String[] args) {

		// kreiramo listu objekata
		ArrayList<Object> list = new ArrayList<>();
		// dodajemo u listu trazene objekte
		list.add(new Z4Kredit(4, 12, 50000));
		list.add(new Date());
		list.add(new String("Helo!!!"));
		list.add(new Z4Krug(10));
		// preko petlje pozivamometodu toString da se ipise
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).toString());
		}
	}

}
