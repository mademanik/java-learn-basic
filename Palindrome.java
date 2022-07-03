import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public boolean isPalindrome(int x) {

		String getNum = String.valueOf(x);
		String[] strArray = getNum.split("");

		ArrayList<String> saveFirstArray = new ArrayList<String>();
		ArrayList<String> saveSecondArray = new ArrayList<String>();

		for (int i = 0; i < strArray.length; i++) {
			saveFirstArray.add(strArray[i]);
		}

		for (int j = strArray.length - 1; j >= 0; j--) {
			saveSecondArray.add(strArray[j]);
		}

		return saveFirstArray.equals(saveSecondArray); // returns true because lists are equal

	}

}

public class Palindrome {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.isPalindrome(1221));

	}

}
