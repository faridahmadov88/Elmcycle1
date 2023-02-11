package section6_4;

public class HomeworkTask2_2 {

	public static void main(String[] args) {

		
		/*
		 * Task: Add motivation() method into your MyStringMethods class that uses String methods to replace the words 
			'build' with 'develop',
				'wall' with 'program',
			'lay' with 'write',
			'brick' with 'line of code', and
				'laid' with 'written'
			in this quote and prints out the output. You will call this method every time you need a small motivation.
		 * */
		
		
		String str = "build";
		str=str.replaceAll("build", "develop");
		
		System.out.println(str);
		
		
	}
	
	public static void motivation () {
		
		
	}

}
