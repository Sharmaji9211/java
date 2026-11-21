package multithreading;

public class PrintNumber {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			for(int i =1 ; i<=29;i=i+2) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i =2 ; i<=30; i=i+2) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		t1.start();
		Thread.sleep(2000);
		t2.start();
	}

}
