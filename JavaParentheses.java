import java.util.HashMap;

class GetParent {
	public boolean isValid(String s) {

		HashMap<Character, Character> charMap = new HashMap<>();
		charMap.put('(', ')');
		charMap.put('{', '}');
		charMap.put('[', ']');

		int countSuccess = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			for (int j = i + 1; j < s.length(); j++) {

				char chNext = s.charAt(j);

				if (charMap.get(ch) != null && charMap.get(ch) == chNext) {
					countSuccess++;
				} else {
                    countSuccess = 0;
                }

			}
		}

		if (countSuccess > 0) {
			return true;
		} else {
			return false;
		}

	}
}

public class JavaParentheses {
	public static void main(String[] args) {

		GetParent par = new GetParent();

//		System.out.println(par.isValid("([)]"));
		par.isValid("{[]}");

	}

}
