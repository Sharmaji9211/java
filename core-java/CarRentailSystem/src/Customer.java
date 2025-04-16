
public class Customer {
	 
	private String name;
	private int id;
	private int mobile;
	
	public Customer(int id,String name) {
		 this.name= name;
		 this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getMobile() {
		return mobile;
	}
}
