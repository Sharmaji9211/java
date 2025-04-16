
public class Main {
	public static void main(String[] args) {
		CarRentalSystem rentalSystem = new CarRentalSystem();
		Car car1 = new Car("C001","Toyota","Camry", 75.0);
		rentalSystem.addCar(car1);
		Car car2 = new Car("C002","Mahendra","Thar", 150.0);
		rentalSystem.addCar(car2);
		Car car3 = new Car("C003","Suzuki","I10", 60.0);
		rentalSystem.addCar(car3);
		rentalSystem.menu();
	}
}
