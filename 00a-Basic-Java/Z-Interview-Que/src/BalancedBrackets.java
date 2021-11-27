import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) {

		String str = "{[()]{}{[()()]()}";
		if (isBalancedString(str))
			System.out.println("Balanced..");
		else

			System.out.println("Not Balanced..");

	}

	private static boolean isBalancedString(String str) {
		boolean isBalanced = false;
		Stack<Character> characters = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '{' || c == '[' || c == '(') {

			}
		}

		return isBalanced;
	}
}
