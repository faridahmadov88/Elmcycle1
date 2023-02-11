package section4_1;

public class LoopsRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 20;
		int start = 1;
		
		while (number > start ) {
			//System.out.println(start);
			
			if ( start % 2 == 0) {
				System.out.println(start);
			}
			
			start++;
			
		}
		System.out.println("counting done");

	}

}
