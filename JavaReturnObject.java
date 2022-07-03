class Shirt {
	String color;
	int size;

	public Shirt(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public Shirt doubleSize(Shirt shirt) {
		Shirt newShirt = new Shirt("Red", shirt.size * 2);
		return newShirt;
	}

}

public class JavaReturnObject {
	public static void main(String[] args) {
		Shirt myshirt = new Shirt("Red", 5);
//		myshirt = myshirt.doubleSize(myshirt);
//		myshirt = myshirt.doubleSize(myshirt);
		System.out.println(myshirt.size + "," + myshirt.color);
	}

}
