package section5_3;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		
		
		
		
		String[][] countries = {  {"Canada", "Vancouver", "Calgary", "Edmonton", "Ottawa", "Quebec City"}, {"The USA", "New York City", "Los Angeles", "Chicago", "Houston", "Phoenix"}, {"Mexico", "Mexico City", "Ecatepec", "Guadalajara", "Puebla", "Tijuana"}
               };
		
		//System.out.println(countries[2][3]);
		
		/*
		 * for (int i = 0; i < countries.length; i++ ) {
		 * 
		 * System.out.println(Arrays.toString(countries[i]));
		 * 
		 * }
		 */
		/*
		 * for (String[] con :countries) { System.out.println(Arrays.deepToString(con));
		 * 
		 * }
		 */
		
	for (int i = 0 ; i < countries.length; i++) {
		//System.out.println(Arrays.toString(countries[i]));
		
		for (int a = 0 ; a< countries[i].length; a++) {
			//System.out.println(Arrays.toString(countries[i]));
			String car = countries[i][a];
			System.out.println(car);
		}
		
	}
		
		
		
		

	}

}
