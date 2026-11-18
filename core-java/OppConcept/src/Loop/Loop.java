package Day2Loop;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			System.out.println("Cetpa");
//		}
//		
//		int i=0; 
//		while(i<5) {
//			System.out.println("Shivam");
//			i++;
//		}
//		int j=0;
//		do {
//			System.out.println("Deepak");
//			j++;
//			}while(j<5);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0,rem;
		while(num!=0) {
			rem = num%10;
			sum = sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
