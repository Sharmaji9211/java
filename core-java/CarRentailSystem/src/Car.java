
public class Car {
	  
	private String carId;
	private String brand;
	private String model;
	private boolean isAvailable;
	private double basePricePerDay;
	
	public Car(String carId , String brand, String model, double basePricePerDay ) {
		this.carId= carId;
		this.brand= brand;
		this.model= model;
		this.basePricePerDay= basePricePerDay;
		this.isAvailable= true;
	}
	
	public String getCarId() {
		return carId;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void rent() {
		isAvailable= false;
	}
	public void returnCar() {
		isAvailable= true;
	}
	
	public double calculatePrice(int retalDays){
		return basePricePerDay*retalDays;
	}
}
