package multithreading;

public class Task3 extends Thread{
	
	public void print() {
		System.out.println("Executing task 3");
	}
	
	@Override
	public void run() {
		print();
	}

}
