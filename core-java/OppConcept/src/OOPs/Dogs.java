package OOPs;

public class Dogs implements Animal{
	public void makeSound(){
		System.out.println(" Dogs Sound Is Woof woof");
	}
	public static void main(String[] args) {
		  Dogs dog= new Dogs();
		  dog.makeSound();
	}

}
