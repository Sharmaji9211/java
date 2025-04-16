package OOPs;

public class Main {
	public static void main(String[] args) {
		Circle circle= new Circle();
		circle.Draw();
		
//		Encapsulatio
		Person person = new Person();
		person.setAge(24);
		person.setName("Shivam");
		
		System.out.println("Name : "+person.getName());
		System.out.println("Age : "+person.getAge());
		
		
		Cat cat =new Cat();
		cat.name="Cat";
		cat.makeSound();
		cat.eat();
		
	}
}
