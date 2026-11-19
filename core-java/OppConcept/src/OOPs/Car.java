package OOPs;

public class Car {

	String brand;
	String model;
	double price;
	
	public void displayDetails() {
		System.out.println("Car Brand"+ brand);
		System.out.println("Car Model" + model);
		System.out.println("Car Price"+ price);
		System.out.println("---------------------");
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.brand="BMW";
		car1.model="X5";
		car1.price=5000000;
		car2.brand="Audi";
		car2.model="C1";
		car2.price=7000000;
		car1.displayDetails();
		car2.displayDetails();
	}

}
