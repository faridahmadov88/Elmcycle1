package section6_2;

public class pract {

	public static void main(String[] args) {
		String str = "asdfdogcatdogcatdcatcatdogcat";
		int dogCount = 0;
		int catCount= 0;
	
		
		while(str.contains("dog") || str.contains("cat")) {
			if  (str.contains("dog")) {
				str = str.replaceFirst("dog", "");
				dogCount++;
			}
			if (str.contains("cat"))
				str = str.replaceFirst("cat", "");
			    catCount++;
		
			
		}
		System.out.println(dogCount);
		System.out.println(catCount);

	}

}
