import java.util.ArrayList;

public class sumTwoArray {

	public static void main(String[] args) {

		int[] firstArray = { 1, 8, 5, 5, 4, 1 };
		int[] secondArray = { 9, 5, 1, 1, 5, 2 };
		ArrayList<Integer> sumArray = new ArrayList<Integer>();
		int doSum = 0;

		for (int i = 0; i < firstArray.length; i++) {

			doSum = firstArray[i] + secondArray[i];

			if ((doSum / 10) > 0) {
				sumArray.add((doSum % 10));
				
				firstArray[i + 1] = (firstArray[i + 1]) + (doSum / 10);
			} else {
				sumArray.add(doSum);
			}

		}

		System.out.println(sumArray);

	}

}
