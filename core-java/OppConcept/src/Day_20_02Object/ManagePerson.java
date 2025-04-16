package Day_20_02Object;

public class ManagePerson {

	public static void main(String[] args) {
		Person person1,person2;
		person1 =new Person();
		person2=new Person();
		person1.setName("Shiavm");
		person1.setAge(22);
		person2.setName("Deepak");
		person2.setAge(26);
		
		System.out.println("Details of First person");
		System.out.println("Name = "+person1.getName());
		System.out.println("Age = "+person1.getAge());
		
		System.out.println("Details of Second person");
		System.out.println("Name = "+person2.getName());
		System.out.println("Age = "+person2.getAge());
		

	}

}
