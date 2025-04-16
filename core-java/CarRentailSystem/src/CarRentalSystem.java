import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystem {
	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rentals;
	
	public CarRentalSystem() {
		cars= new ArrayList<>();
		customers =new ArrayList<>();
		rentals=new ArrayList<>();
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public void rentalCar(Car car, Customer  customer , int days) {
		if(car.isAvailable()) {
			car.rent();
			rentals.add(new Rental(car , customer, days));
		}
		else {
			System.out.println("Car is not Available for Rent.");
		}
	}
	public void returnCar(Car car) {
		car.returnCar();
		Rental rentalToRemove= null;
		for(Rental rental : rentals) {
			if(rental.getCar()== car) {
				rentalToRemove= rental;
				break;
			}
		}
		if(rentalToRemove != null) {
			rentals.remove(rentalToRemove);
			
		}
		else {
			System.out.println("Car was not rented.");
		}
	}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("==== Car Rental System ====");
			System.out.println("1. Rent a Car");
			System.out.println("2. Return a  Car");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.println("\n == Rent a Car == \n");
				System.out.println("Enter your Name: ");
				String customerName = sc.nextLine();
				System.out.println("\n Available Cars: \n");
				for(Car car : cars) {
					if(car.isAvailable()) {
						System.out.println(car.getCarId() + "  - " + car.getBrand() + " " + car.getModel());
					}
				}
				System.out.print("Enter the  car Id you want to rent : ");
				String carId= sc.nextLine();
				
				System.out.print("Enter the number of days for rental: ");
				int rentalDays = sc.nextInt();
				sc.nextLine();
				
				Customer newCustomer = new Customer((customers.size() + 1),customerName);
				addCustomer(newCustomer);
				
				Car selectedCar = null;
				for(Car car : cars) {
					if(car.getCarId().equals(carId) && car.isAvailable()) {
						selectedCar= car;
						break;
					}
				}
				if(selectedCar != null) {
					double totalPrice = selectedCar.calculatePrice(rentalDays);
					System.out.println("\n == Rental Information ==\n");
					System.out.println("Customer ID:  "+newCustomer.getId());
					System.out.println("Customer Name : "+newCustomer.getName());

					System.out.println("Car : "+selectedCar.getBrand());
					System.out.println("Retal Days : "+rentalDays);
					System.out.printf("Total Price : $%.2f%n",totalPrice);
					System.out.println("\n Confirm rental (Y/N): ");
					String confirm = sc.nextLine();
					
					if(confirm.equalsIgnoreCase("Y")) {
						rentalCar(selectedCar, newCustomer, rentalDays);
						System.out.println("\n Car rented successfully.");
					}
					else {
						System.out.println("\n Rental canceled");
					}
				}
					else {
						System.out.println("\n Invalid car selection or car not available for rent.");
					}
			}
				else if(choice == 2) {
					System.out.println("\n Return a Car ==\n");
					System.out.println("Enter the Car Id you want to return : ");
					String carId= sc.nextLine();
					Car carToReturn = null;
					for(Car car : cars ) {
						if(car.getCarId().equals(carId)&& ! car.isAvailable()) {
							carToReturn = car;
							break;
						}  
					}
					
					if(carToReturn != null) {
						Customer customer = null;
						for(Rental rental : rentals) {
							if(rental.getCar() == carToReturn) {
								customer= rental.getCustomer();
								break;
							}
						}
						if(customer != null) {
							returnCar(carToReturn);
							System.out.println("Car returned successfully by "+customer.getName());
						}
						else {
							System.out.println("Car was not rental information is missing.");
						}
					}
					else {
						System.out.println("Invalid car Id or Car is Not rented.");
					}
				} else if (choice == 3) {
					break;
				} else {
					System.out.println("Invalid choice. Please enter a valid option.");
				}
			}
		 System.out.println("\n Thank you for using the car Rental system!");
		 sc.close();
		} 
	
	}
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

