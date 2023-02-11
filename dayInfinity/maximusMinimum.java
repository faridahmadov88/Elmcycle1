package dayInfinity;
import java.util.Scanner;
public class maximusMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int numa;
		int numb ;
		int numC;
		System.out.println("Please input the first number: ");
		numa =in.nextInt();
		System.out.println("Please input the second number: ");
		numb =in.nextInt();
		System.out.println("Please input the third number: ");
		numC=in.nextInt();
		int maxNum =Math.max(numa, Math.max(numa, Math.max(numb, numC)));;
		int minNum =Math.min(numa, Math.min(numa, Math.min(numb, numC)));
		System.out.println("The bigger number is "+maxNum);
		System.out.println("The smaller number is "+minNum);
		
		
		

	}

}
