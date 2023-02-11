package section9_0;
import java.util.ArrayList;
import java.util.Iterator;
public class practice {
	
	public static void main(String[] args) {
		
		ArrayList <String>words = new ArrayList<>();
		words.add("Fidan");
		words.add("Leyla");
		words.add("Farid");
		words.add("Sevinc");
		
		Iterator iterator = words.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}
