/*(ArrayIndexOutOfBoundsException) Write a program that meets the following
requirements:
- Creates an array with 100 randomly chosen integers.
- Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds.*/
package zadaci_12_2_2016;

import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z4GreskaIndeksaNiza {

	public static void main(String[] args) {

		int [] array =new int [100];
		for (int i=0; i<array.length; i++){
			array[i]= (int) (Math.random()*100);
		}
		
		// kreiramo skener
				Scanner input = new Scanner(System.in);
				// nastavi unos varijabla za proveru je korisniik uneo broj
				boolean continueInput = true;
				// korisnikovi brojevi
				int n = 0;
				// kreiramo listu za korisnikov unos
				while (continueInput) {
					System.out.print("Enter the index for the number of array: ");
					try {
						n = input.nextInt();

						continueInput = false;

					} catch (ArrayIndexOutOfBoundsException ex) {
						System.out.println("This index does not exist! Again!!!");
						input.nextLine(); // Discard input, odbaci predhodni unos
					}
				}

		
				// zaustavljamo unos
				input.close();

				System.out.println("On the index, you enter the number of the "+array[n]+".");
			}

		}
