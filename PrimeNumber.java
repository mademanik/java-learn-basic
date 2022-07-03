class GetPrime {

	public void findPrimeNumber(int nums) {

		int countPrime = 0;

		for (int i = 2; i <= nums; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					countPrime++;
				}
			}

			if (countPrime == 0) {
				System.out.print(i + " ");
			}

			countPrime = 0;

		}
	}

}

public class PrimeNumber {
	public static void main(String[] args) {
		GetPrime pri = new GetPrime();

		pri.findPrimeNumber(100);
	}

}
