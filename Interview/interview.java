package Interview;

public class interview {

	public static void main(String[] args) {
	/*
	 * create method accepts int array and int target
	 * we need to check if sum of any pair of number in this array will give me target
	 * return true if it does if not return false.
	 */

			int[] arr = { 1, 5, 10, 48, 6, 7, 2 };

			System.out.println(isThere(arr, 102));

		}

		public static boolean isThere(int[] arr, int target) {

			for (int i = 0; i < arr.length; i++) {

				for (int a = 0; a < arr.length; a++) {

					if (arr[i] + arr[a] == target && i != a) {

						return true;
					}

				}

			}
			return false;

		
	
	}

}
