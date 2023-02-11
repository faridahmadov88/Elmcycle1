package section6_4;

public class StringBufferMethods {

	public static void main (String  args[]) {
		
		//append method is concatinates stringbuffer together.
		
		StringBuffer sb= new StringBuffer ("Farid");
		
		sb.append(" is funny ");
		System.out.println(sb);
		
		//insert method - adds new parameter after given int 
		
		StringBuffer nsb= new StringBuffer ("World");
		
		nsb.insert(3, "Round");
		System.out.println(nsb);
		
		//replace -replaces indexes of stringbuffer from given int to given int with givrn string.
		
		StringBuffer repsb = new StringBuffer ("Iphone");
		
		repsb.replace(2, 4, "sam");
		System.out.println(repsb);
		
		//delete -deletes from given int to given int index
		
		StringBuffer delsb = new StringBuffer ("Javaisnoteasy");
		delsb.delete(6, 9);
		System.out.println(delsb);
		
		// reverse - reverse method of string buffer is reversing string buffer
		StringBuffer revsb = new StringBuffer ("reverse");
		
		revsb.reverse();
		System.out.println(revsb);
		
		//public String substring -
		
		StringBuffer testsb= new StringBuffer ("TEST");
		testsb.substring(2);
		System.out.println(testsb);
		
	}
	
}
