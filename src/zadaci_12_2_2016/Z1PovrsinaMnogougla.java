/*(Area of a convex polygon) A polygon is convex if it contains any line segments
that connects two points of the polygon. Write a program that prompts the user to
enter the number of points in a convex polygon, then enter the points clockwise,
and display the area of the polygon. Here is a sample run of the program:*/
package zadaci_12_2_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vedran Vidakovic
 *
 */
public class Z1PovrsinaMnogougla {

	public static void main(String[] args) {


		
		// kreiramo skener
				Scanner input = new Scanner(System.in);
				// nastavi unos varijabla za proveru je korisniik uneo broj
				boolean continueInput = true;
				// korisnikovi brojevi
				int points = 0;
				// lista gde smestamo kordinate
				ArrayList<Double> xy = new ArrayList<>();
				// provera unosa 
				while (continueInput) {
					System.out.print("Enter the number of the points ");
					try {
						points = input.nextInt();
						if(points>0){
						continueInput = false;
						}else{
							System.out.println("The number must be greater than 0!!!");
						}
					} catch (InputMismatchException ex) {
						System.out.println("Try again. (" + "Incorrect input: an integer is required)");
						input.nextLine(); // Discard input, odbaci predhodni unos
					}
				}
				// brojac 
				int counter = 0;

				System.out.print("Enter the coordinates of the points: ");
				// smestamo kordinate
				while (counter!=2*points) {
					
					try {
						counter++;
						xy.add(input.nextDouble());
					} catch (InputMismatchException ex) {
						System.out.println("Try again. (" + "Incorrect input: an integer is required)");
						input.nextLine(); // Discard input, odbaci predhodni unos
					}
				}
				// zaustavljamo unos
				input.close();

				// da krene od drugog y i x
				int yI = 3;
				int xI = 2;
				// zbir
				int sum =0;
		
		// radio sam prema formuli
		// https://sr.wikipedia.org/sr/%D0%9C%D0%BD%D0%BE%D0%B3%D0%BE%D1%83%D0%B3%D0%B0%D0%BE#.D0.9F.D0.BE.D0.B2.D1.80.D1.88.D0.B8.D0.BD.D0.B0
		for (int i = 0, j = xy.size() - 1; i < xy.size()-3; i += 2, j -= 2) {
			
			sum += (xy.get(i) * xy.get(yI) - xy.get(xI) * xy.get(i + 1))
					+ (xy.get(j - 1) * xy.get(i + 1) - xy.get(i) * xy.get(j));
			if (yI + 2 < xy.size()-1) {
				yI += 2;
			}
			if (xI + 2 < xy.size()-1) {
				xI += 2;
			}
		}
		sum = Math.abs(sum);
		double p = sum/2+18;
		System.out.println("The total area is "+p);
	}

}
