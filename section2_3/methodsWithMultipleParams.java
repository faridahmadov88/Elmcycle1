package section2_3;

public class methodsWithMultipleParams {

	public static void main(String[] args) {
		
		int a= 15;
		int b =3;
		
		printDivisionResult(a,b);
		//create smartPrint method
		int max =Math.max(15, 10);
		smartPrint("Max value is "  ,max);
		

	}
	public static void smartPrint(String str, int num) {
		
		System.out.println(str +num);
		
		
	}
	
	
    /**
     * This method is to division of two numbers
     * @param num1 -an int argument
     * @param num2 - an int argument
     */
	public static void printDivisionResult (int num1, int num2) {
		
		int result= num1 / num2;
		System.out.println("Dvision result is : "+ result);
	}
	
	public static void customMethod (String a,int b, boolean f) {
		
	}

}
