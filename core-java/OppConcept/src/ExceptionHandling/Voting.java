package ExceptionHandling;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age= sc.nextInt();
		try {
			if(age<18) {
				throw new YoungerAgeException("you are not eligible");
			}
			else {
				System.out.println("Voting....");
			}
		
	 }
		catch(YoungerAgeException e) {
			
			e.printStackTrace();
		}
		
	}

}
