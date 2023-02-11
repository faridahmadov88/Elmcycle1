package section9_0;
import java.util.ArrayList;
public class CollectionsIntro {

	
	//Iterable >> Collection>Set, List ,Queue
	
	public static void main(String[] args) {
		
		//add method is coming from collection interface helps us to add elements into our list and returns boolean
		
		int [] numbers = {10,13,7,91,84,102};
		ArrayList<Integer> listofints = new ArrayList<>();
		for  (Integer arr:numbers) {
	
			if (arr%2==0) {
				
				listofints.add(arr);
			
			}
			
			
		}
		System.out.println(listofints);
		
		
		String word = "google";
		
	}
	
	
	

		
	}
	
	
	
	

