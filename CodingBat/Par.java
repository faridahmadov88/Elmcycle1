package CodingBat;

public class Par {

	public static void main(String[] args) {
		String str = "aaacodebbb";
		System.out.println(hasCorrectParenthesis("farid"));
		
	}


	
	
	public static int hasCorrectParenthesis(String str) {
		int left = 0;
		

		  
		int cat= 0;
		int dog = 0;
		  
		 for (int i = 0 ; i < str.length()-1; i ++){
		 
		  if(str.substring(i,i+4).equals("code")){
		   cat++
		   return cat;
		  

}
		return false;
	}
}
