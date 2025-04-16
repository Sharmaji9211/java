package Assignment_2;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age= sc.nextInt();
        if(age<18) {
        	System.out.println("You must be at least 18 years old to donate blood");
        }else if(age>=18) {
        	System.out.println("Enter the Weight");
    		int w= sc.nextInt();
    		if(w<50) {
    			System.out.println("You must weigh at least 50 kilograms to donate blood");
    		}else if (w>=50) {
    			System.out.println("You are eligible to donate blood");
    		}
        }
	}

}
