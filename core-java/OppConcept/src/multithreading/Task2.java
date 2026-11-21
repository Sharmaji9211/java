package multithreading;

public class Task2 extends Thread{
	
	public void print() {
		System.out.println("Executing task 2");
	}
	
	@Override
	public void run() {
		print();
	}

}
