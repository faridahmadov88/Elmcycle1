package day_06;

public class ExerciseIfElse {

	public static void main(String[] args) {
		
		method(55,5,false,120);

	}                                     //55               //5                  /false           //120
	public static void method(double speedOfScooter,double speedOfFlow,boolean flowDirection,double distance) {
		
		boolean forward = ("flowDirection" == "up");
		if (forward) {
			System.out.println((speedOfScooter+speedOfFlow)/distance);
		} else {			System.out.println((speedOfScooter-speedOfFlow)/distance);
}
	
		
	}

}
