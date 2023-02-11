package section8_3;
import java.util.Arrays;
public class Shapes {
public static void main(String[] args) {
		
//		Dell dell = new Dell();
//		
//		dell.setModelNumber(1000001);
//		dell.setName("Dell");
//		dell.setScreenSize(17);
//		dell.model = "Alinware";
//		dell.memory = 1024;
//		dell.OS = "Windows";
//		
//		dell.printFields();
		
		Shape shape1 = new Shape("cirlce", 6);
		Shape shape2 = new Shape("square", 4);
		Shape shape3 = new Shape("triangle", 7);		
		Shape shape4 = new Shape("hectagon", 9);
		
		Shape [] shapes = {shape1, shape2, shape3, shape4};
	
		for (int i = 0 ; i < shapes.length; i++) {
			if(shapes[i].length%2==0) {
				System.out.println(shapes[i].name);
				
			}
		
			
		}
		
		

	}

}
