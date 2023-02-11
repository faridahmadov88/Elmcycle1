package section5_1;
import java.util.Arrays;

public class ex5 {

	public static void main(String[] args) {
		
		
		
		String [] names = {"Farid","Sevinc"};
		
		String temp = names[0];//farid
		
		names [0]= names[1]; 
		
		names [1]= temp ;
		
		String str = Arrays.toString(names);
		
		System.out.println(names [0]+" "+names [1]);
		System.out.println(str);
		
			
			
		}
		
		
		
		
	
		     
		     
		
		
		
		
		
		

	}


