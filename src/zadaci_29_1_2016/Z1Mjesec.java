/*1. Napisati program koji nasumicno generise cijeli broj izmedu 
1 i 12 te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)*/
package zadaci_29_1_2016;

public class Z1Mjesec {
	/**
	 * @author Vedran Vidakovic
	 *
	 */
	public static void main(String[] args) {

		// generisemo nasumicni broj od 0 do 11 i dodajemo mu 1
		int month = (int)(Math.random()*12)+1;
		// varijabla za naziv meseca u slucaju broja 
		String nameMonth="";
		// ako je broj 1 to je Januar i tako dalje...
		switch (month) {
		case 1:
			nameMonth = "January";
			break;
		case 2:
			nameMonth = "February";
			break;
		case 3:
			nameMonth = "March";
			break;
		case 4:
			nameMonth = "April";
			break;
		case 5:
			nameMonth = "May";
			break;
		case 6:
			nameMonth = "June";
			break;
		case 7:
			nameMonth = "July";
			break;
		case 8:
			nameMonth = "August";
			break;
		case 9:
			nameMonth = "September";
			break;
		case 10:
			nameMonth = "October";
			break;
		case 11:
			nameMonth = "November";
			break;
		case 12:
			nameMonth = "December";
			break;
		}
		// stampamo rezultat
		System.out.println("The program has chosen "+month+", and it is "+nameMonth+".");
	}

}
