package Assignment_2;
import java.util.Scanner;
public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of Hindi");
		int Hindi= sc.nextInt();
		System.out.println("Enter the Marks of English");
		int English= sc.nextInt();
		System.out.println("Enter the Marks of Maths");
		int Maths= sc.nextInt();
		System.out.println("Enter the Marks of Physics");
		int Physics= sc.nextInt();
		System.out.println("Enter the Marks of Chemistry");
		int Chemistry= sc.nextInt();
		float sum = Hindi+English+Maths+Physics+Chemistry;
		float Per= (sum/500)*100;
		if(Per>=85) {
			System.out.println("Excellent");
		}else if(85>Per&&Per>=70) {
			System.out.println("Very Good");
		}else if(70> Per&&Per >=55) {
			System.out.println("Good");
		}else if(55> Per&&Per >=40) {
			System.out.println("Poor");
		}else if (40>Per) {
			System.out.println("Very Poor");
		}
		
		
	}
}
