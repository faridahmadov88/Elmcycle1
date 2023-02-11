package section5_2;

public class SumOfArrays {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			//1  //0 + 1
			// 3  1 +2
			//  6  3 + 3
			// 10  6    +4
			// 15   10 + 5
			sum=sum + arr[i];
			
			
			
		}
		System.out.println(sum);

	}

}
