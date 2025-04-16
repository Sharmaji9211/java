package Day26_02;

import java.util.Scanner;

public class Calculator1 {
	
	protected int num1;
	protected int num2;
	protected int res;
	
	protected void acceptNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1 ");
		num1=sc.nextInt();
		System.out.println("Enter the Number 2 ");
		num2=sc.nextInt();
		sc.close();
		}
	protected void showResult() {
		System.out.println(res);
	}

}
