package Assignment_3;
public class series {
	public static void main(String[] args) {
		System.out.println("Print Series");
		int f=1,s=1;
	for(int i=1;i<11;i++) {
		System.out.print(f +" ");
		int next=f+s;
		f=s;
		s=next;
	}
	System.out.println();
     for(int i=1;i<=6;i++) {
    		 System.out.print(i+" "+(i-1)+" ");
     }
     System.out.println();
     int c=0;
     int j=1;
     for(int i =1;i<12;i++) {
//    	 1 2 4 7 11 16 22 29 37 46 56;
    	 j = j+c;
    	 System.out.print(j+" ") ;
    	 c++;
     }System.out.println(); 
     for(int i=1;i<6;i++) {
    	 
    	 System.out.print(i+" ");	 
     }
     System.out.println();
     for(int i=1;i<=10;i++) {
		 System.out.print(i+" "+(11-i)+" ");
 }
	}

}
