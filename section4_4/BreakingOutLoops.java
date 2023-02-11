package section4_4;

public class BreakingOutLoops {

	public static void main(String[] args) {
		outter:
		for (int b=1; b <10; b++) {
	inner:
	for (int i=1; i <= 10; i++) {
		
		System.out.print(i);
		
		if (i==5) {
			break;
		}
		
	}
	
		System.out.println(" ");
		}
		
		

	}

}
