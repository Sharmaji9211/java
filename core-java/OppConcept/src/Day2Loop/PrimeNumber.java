package Day2Loop;
import java.util.*;
public class PrimeNumber {
    
	static boolean isPrime(int num) {
		if(num==2) {
			return true;
		}
		if(num%2==0) {
			return false;
		}
		int sr = (int) Math.sqrt(num);
		for(int i = 3; i<=sr;i+=2) {
			if(num%i==0) {
			return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if(number>2) {
		boolean res = PrimeNumber.isPrime(number);
		System.out.println(res);
		}
	}

}
