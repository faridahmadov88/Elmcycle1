package section4_3;

public class Homework4_1_3 {

	public static void main(String[] args) {
		multiplicationLine( 2,12);
		
		int i = 3;
		int counter=0;
		while (counter<10) {
			counter++;
			int m=counter*i;
			System.out.print(m);
			
			
		}
		
		
		
		
		
		

	}
public static void multiplicationLine(int num,int row) {
	
	

	
	int counter=0;
	int result=0;
	for (int i=1;i<row;i++) {
		
		result= num*i;
		
		System.out.println(result);
		
	}
	
	
	
	
}
}
