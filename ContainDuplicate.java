class FindDuplicate {
	public boolean containsDuplicate(int[] nums) {
		if(nums==null || nums.length==0) {
			return false;
		}
		int countDuplicate = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int j = nums[i] + 1; j < nums.length; j++) {

				if (nums[j] == nums[i]) {
					countDuplicate = countDuplicate + 1;
				}
			}
		}

		if (countDuplicate > 0) {
			return true;
		} else {
			return false;
		}
	}
}

class ContainDuplicate {

	public static void main(String[] args) {
		FindDuplicate cd = new FindDuplicate();

		int[] nums = { 1, 2, 3, 1 };

		System.out.println(cd.containsDuplicate(nums));
	}

}