package Assignment_3;

public class alphabet_no_vowels {

	public static void main(String[] args) {
		char ch;
		for(ch='A';ch<='Z';ch++) {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				continue;
			}
			System.out.print(ch+" ");
		}
	}

}
