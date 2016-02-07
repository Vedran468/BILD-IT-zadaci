/*(Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.*/
package zadaci_6_2_2016;

import java.util.ArrayList;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4StackOfIntegers {
	private ArrayList<Integer> list = new ArrayList<>();

	public ArrayList<Integer> getList() {
		return list;
	}

	public Z4StackOfIntegers() {
	}

	public void addInteger(int n) {
		list.add(n);
	}

	public ArrayList<Integer> reverse() {
		ArrayList<Integer> r = new ArrayList<>();
		for (int i = getList().size() - 1; i >= 0; i--) {
			r.add(list.get(i));
		}
		return r;
	}
}
