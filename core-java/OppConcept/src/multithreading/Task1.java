package multithreading;

public class Task1 extends Thread {
	
	public void print() {
		System.out.println("Executing task 1");
	}
	
	@Override
	public void run() {
		print();
	}

}
