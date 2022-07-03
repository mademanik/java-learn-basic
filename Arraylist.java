import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Mitsubishi");

		System.out.println(cars);
		cars.set(0, "Datsun");
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);
		System.out.println(cars.size());

		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i) + ",");
		}
		System.out.println();

		for (String i : cars) {
			System.out.print(i);
		}
		
		System.out.println();
		
		Collections.sort(cars);
		
		for (String i : cars) {
			System.out.print(i);
		}

	}
}
