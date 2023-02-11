package dayInfinity;

public class stringSubstring {

	public static void main(String[] args) {
		
		
		String str = "farid.ahmadov@mail.com";
		
		String name = str.substring(0,str.indexOf("."));
		System.out.println(name);
		String lastname= str.substring(str.indexOf(".")+1,str.indexOf("@"));
		System.out.println(lastname);
		String mail = str.substring(str.indexOf("@")+1);
		System.out.println(mail);

	}

}
