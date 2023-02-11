package section4_1;

public class FooBar {

	public static void main(String[] args) {
		
		
		int number=18;
		int count=1;
		
		
		while(number >= count) {
			
			
			if (count % 3 ==0) {
				System.out.println("Foo");
			}
			
			if (count % 5 ==0) {
				System.out.println("Bar");
			}
			if (count % 3 !=0  && count % 5 !=0) {
				
				System.out.println(count);
			}
			count++;
		}

	}

}
