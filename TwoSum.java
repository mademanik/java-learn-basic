import java.util.ArrayList;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {

		ArrayList<Integer> initArr = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					initArr.add(i);
					initArr.add(j);
//					return new int[] { i, j };
				}
			}
		}

//		return initArr;
		int[] arr = initArr.stream().mapToInt(i -> i).toArray();
		return arr;

	}

	public static void main(String[] args) {
		TwoSum sol = new TwoSum();
		int[] myNum = { 2, 7, 11, 15 };

		System.out.println(sol.twoSum(myNum, 9));
	}
}