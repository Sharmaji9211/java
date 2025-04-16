package Assignment_2;

import java.util.Scanner;

public class LargestOne {
   public static void main(String agrs []) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the Four Numbers :");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    
	  int largest = a;
	  if(b>a) {
		  largest =b;
	  }
	  if(c>largest) {
		  largest = c;
	  }if(d>largest) {
		  largest = d;
	  }
	  System.out.println("The Largest Number is "+largest);
   }
}
