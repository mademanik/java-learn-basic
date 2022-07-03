class Vehicle {
	protected String brand = "Ford";

	private String model = "Toyota";

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

public class JavaInheritance extends Vehicle {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		JavaInheritance inherit = new JavaInheritance();

		inherit.honk();

		System.out.println(inherit.brand + "-" + inherit.modelName + "-" + inherit.getModel());
	}

}
