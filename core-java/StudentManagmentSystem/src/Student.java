
public class Student
{
	private int stdId;
	private String name;
	private String course;
	private int age;
	
	public Student(int stdId, String name, String course, int age) {
		this.age=age;
		this.course=course;
		this.name=name;
		this.stdId=stdId;
	}
	public int getStdId() {
		return stdId;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setCourse(String course) {
		this.course= course;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public void dispalyStudent() {
		System.out.println("Student ID = " +stdId);
		System.out.println("Student Name = "+name);
		System.out.println("Student Course = "+course);
		System.out.println("Student Age = "+age);
		System.out.println("----------------------------------");
	}
}
