class Test {

	int x;

	public Test(int x) {
		this.x = x;
	}

	Test updateObject(int y) {
		Test temp = new Test(x + y);
		return temp;
	}

}

public class JavaReturnObject2 {

	public static void main(String[] args) {
		Test getTest = new Test(10);

		System.out.println("Before object update " + getTest.x);
		getTest = getTest.updateObject(50);
		System.out.println("Before after update " + getTest.x);

	}

}
