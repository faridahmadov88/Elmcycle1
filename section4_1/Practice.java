package section4_1;

public class Practice {

	public static void main(String[] args) {
		multiplicationtable(1);

	}

	public static void custom(int num) {
		int multiplier = 1;

		while (10 > multiplier) {
			
			System.out.print(" ");
			
			System.out.print(num * multiplier);
			
			multiplier++;
		}
		
		System.out.println(" ");
	}

	public static void multiplicationtable(int a) {
		
		int multiplier = 1;
		
		while (10 > multiplier) {
			
			custom(multiplier);
			
			multiplier++;
		}
		System.out.println("complete");
	}
}
