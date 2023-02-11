package section5_1;

public class PrintEvens {

	public static void main(String[] args) {
		
		

			int[] arr = { 1, 5, 10, 48, 6, 7, 2 };

			System.out.println(isThere(arr, 54));

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
