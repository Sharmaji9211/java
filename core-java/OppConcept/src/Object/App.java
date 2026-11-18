package Day_20_02Object;

public class App {
	public static void main(String[] args) 
	{
		MyInt num =new MyInt(10);
		System.out.println("Before increment :"+num.getValue());
		num.setValue(num.getValue()+1);
		System.out.println("After increment :" +num.getValue());
	}
}
