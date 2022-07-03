class GetFactorial {
	public void calculateFactorial(int nums) {

		int calc = 1;
		for (int i = 1; i <= nums; i++) {
			calc = calc * i;
			System.out.print(i);

			if (i == nums) {
				break;
			}

			System.out.print(" x ");
		}

		System.out.println(" = " + calc);
	}
}

public class Factorial {
	public static void main(String[] args) {

		GetFactorial fact = new GetFactorial();
		fact.calculateFactorial(8);

	}

}
