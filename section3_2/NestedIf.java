package section3_2;

public class NestedIf {

	public static void main(String[] args) {
		custom();

	}

	public static void custom() {

		int num = 105;
		
		if (num > 0 && num<101) {
			
			if (num % 2 ==0) {
				System.out.println("number is even");
			}else {
				System.out.println("number is odd ");
			}
			
		}else {
			System.out.println("number out of range");
		}
		
		

	}
	public static void custom1(int num) {
		num = 150;
		 if (num % 3 == 0) {
			 
		 }
	}
}