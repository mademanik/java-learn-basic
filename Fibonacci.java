class GetFibonacci {

	public void countFibonacci(int nums) {

		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		for (int i = 0; i < nums; i++) {
//			System.out.print(num1+" "+num2+" "+num3);
//			System.out.println();
//			System.out.print(num1 + " ");
			System.out.print(num1+" " );

			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;

		}
		
		//flow 1 : num 3 = 1, num 1 = 1, num 2 = 1
		//flow 2 : num 3 = 2, num 1 = 1, num 2 = 2,
		//flow 3 : num 3 = 3, num 1 = 2, num 2 = 3,
		//flow 4 : num 3 = 5, num 1 = 3, num 2 = 5,
		//flow 5 : num 3 = 8, num 1 = 5, num 2 = 8,
		
		

	}

}

public class Fibonacci {
	public static void main(String[] args) {
		GetFibonacci fibo = new GetFibonacci();

		fibo.countFibonacci(10);

	}

}
