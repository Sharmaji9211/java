package Assignment_2;

import java.util.Scanner;

public class Income {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Income");
		double income= sc.nextDouble();
		double tax =0;
		if(income<=250000) {
			System.out.println("No Tax");
		}else if(income<=500000) {
			tax = (income-250000)*0.05;
		}else if(income<=1000000) {
			tax = (500000-250000)*0.05+(income-500000)*0.20;
		}else{
			tax = (500000-250000)*0.05+(1000000-500000)*0.20+(income-1000000)*0.30;
		}
		System.out.println("Income Tax:  " + tax);
	}
}
