package section3_2;

public class SingularOrPlural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple(2);

	}

	public static void apple(int pound) {
		System.out.println("There are "+pound +" pound"+(((pound>1 && 0==pound)?"s of apples left." : " of apples left.")));
		
		

	}
}