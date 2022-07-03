class declareMethod {
	static void sayaMethodStatic() {
		System.out.println("Saya dipanggil tanpa membuat objek");
	}

	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}

	public void speed(int maxSpeed) {
		System.out.println("Max speed is: " + maxSpeed);
	}
}

public class JavaClassMethodVersi2 {
	public static void main(String[] args) {
		declareMethod.sayaMethodStatic();

		declareMethod js = new declareMethod();
		js.fullThrottle();
		js.speed(200);
	}

}
