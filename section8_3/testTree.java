package section8_3;

public class testTree {

	public static void main(String[] args) {
		
		
		Tree tree1 = new Tree();
		tree1.rootSize=10;
		tree1.treeName="oak";
		
		Tree tree2 = new Tree();
		tree2.rootSize= 9;
		tree2.treeName= "apple";
		
		Tree tree3 = new Tree();
		tree3.rootSize= 8;
		tree3.treeName= "mapple";
		
		Tree [] arr = {tree1,tree2,tree3};
		
		
		for (int i = 0 ; i <arr.length;i++) {
			if (arr[i].rootSize%2==0) {
				System.out.println(arr[i].treeName);
			}
			
		}


		
		

	}

}
