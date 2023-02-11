package section3_2;

public class NestedTernary {

	public static void main(String[] args) {
		ifDemo(0);
		ternaryDemo(0);

	}

	public static void ifDemo(int num) {
		String message;
		if (num > 0) {
			message = "positive";
		} else if (num == 0) {
			message = "zero";

		} else {
			message = "negative";
		}
		System.out.println(message);
	}

	public static void ternaryDemo(int num) {

		String message = (num > 0) ? "positive" : (num == 0) ? "zero" : "negative";
		System.out.println(message);

	}
}
