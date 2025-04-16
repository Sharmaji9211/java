package Assignment_3;
import java.util.*;
public class LCM_HCF {
	
	static int hcf(int n1, int n2) {
		int HCF =0;
		for(int i=1; i<=n1||i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				HCF=i;
			}
		}
		return HCF;
	}
	static int lcm(int n1,int n2) {
		int lcm=0;
		int max=(n1>n2)?n1:n2;
		for(int i=max;i<=n1*n2;i++) {
			if(i%n1==0&&i%n2==0) {
				lcm=i;
				break;
			}
		}
		return lcm;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the Number 1");
	int num1 = sc.nextInt();
	System.out.println("Enter the Number 2");
	int num2 = sc.nextInt();
	System.out.println("HCF "+hcf(num1,num2));	
	System.out.println("LCM "+lcm(num1,num2));	
}
}