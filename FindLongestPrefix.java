import java.util.Arrays;

class GetPrefix {
	public String longestCommonPrefix(String[] strs) {

		int size = strs.length;

		if (size == 0)
			return "";

		if (size == 1)
			return strs[0];

		Arrays.sort(strs);

		String pre = "";

		int end = Math.min(strs[0].length(), strs[size - 1].length());

		int i = 0;
		while (i < end && strs[0].charAt(i) == strs[size - 1].charAt(i)) {
			i++;

			pre = strs[0].substring(0, i);
		}

		return pre;
	}

}

public class FindLongestPrefix {
	public static void main(String[] args) {
		GetPrefix gp = new GetPrefix();

		String[] strs = { "flower", "flow", "flight" };

		System.out.println(gp.longestCommonPrefix(strs));

	}
}
