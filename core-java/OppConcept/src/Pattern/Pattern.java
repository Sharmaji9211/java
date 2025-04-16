package Pattern;

public class Pattern {
   public static void main (String args[]) {
	   int n =6;
	   for(int i=n;i>=1;i--) {
		   for(int j =1 ;j<=i;j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   } 
	   for(int i=n;i>=1;i--) {
		   for(int k=n-i;k>=1;k--) {
			   System.out.print(" ");
		   }
		   for(int j =1 ;j<=i;j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   for(int i=n;i>=1;i--) {
		   for(int k=n-i;k>=1;k--) {
			   System.out.print(" ");
		   }
		   for(int j =1 ;j<=i;j++) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   for(int i=n;i>=1;i--) {
		   for(int k=n-i;k>=1;k--) {
			   System.out.print(" ");
		   }
		   for(int j =1 ;j<=i;j++) {
			   System.out.print("*");
		   }
		   for(int l=i-1;l>=1;l--) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   for(int i=n;i>=6;i++) {
		   for(int j =1 ;j<6-i;j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
}
