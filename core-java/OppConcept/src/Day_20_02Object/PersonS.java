package Day_20_02Object;

public class PersonS {
  private String name;
  private int age;
  public PersonS(String name , int age) {
	  this.name= name ;
	  this.age= age;
  }
  public void showPerson() {
	  System.out.println("Name= "+this.name+", Age ="+this.age);
  }
}
