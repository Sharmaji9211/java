import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagemnetSystem 
{
	ArrayList<Student> student = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		while(true) {
			System.out.println("======   Student Management System    =======");
			System.out.println("1. Add Student");
			System.out.println("2. Search Student By ID ");
			System.out.println("3. View All Students ");
			System.out.println("4. Update Student Deatils");
			System.out.println("5. Delete Details");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice ");
			
			int choice =sc.nextInt();
		switch(choice) {
		case 1 :addStudent();
		break;
		case 2 :searchStudent();
		break;
		case 3 :viewStudents();
		break;
		case 4 :updateDetails();
		break;
		case 5 :delete();
		break;
		case 6 :{
			System.out.println(".............Exiting the Program................");
			return;
		}
		default: {
			System.out.println("Invalid Choice plaese Try Again ");
		    }
		 }	
	   }
	}	
		
	public void addStudent() {
		System.out.println(" Enter ID ");
		int stuId = sc.nextInt();
		sc.nextLine();
		System.out.println(" Enter Student Name  ");
		String name = sc.nextLine();
		System.out.println(" Enter Course Name  ");
		String course = sc.nextLine();
		System.out.println(" Enter Age ");
		int age = sc.nextInt();
		sc.nextLine();
		Student students = new Student(stuId, name, course , age);
		student.add(students);
		System.out.println("----------------- Student added Successfully -------------------\n");
	    }
		public void searchStudent() {
			System.out.println(" Enter Student ID to search:");
			int id = sc.nextInt();
			sc.nextLine();
			for(Student s : student) {
				if(s.getStdId() == id) {
					System.out.println("-------------- Student Found -------------");
					s.dispalyStudent();
					break;
				}
				else {
					System.out.println("Student not Found Please enter Valid ID ");
				}
			}
			
		}
		
		public void viewStudents() {
			if(student.isEmpty()) {
				System.out.println(" No Student Found ");
			}
			else {
				System.out.println("----------------- Student List ---------------");
				for(Student s : student) {
					s.dispalyStudent();
				}
			}
		}
		public void updateDetails() {
			System.out.println("Enter the ID want to delete the Details");
			int id = sc.nextInt();
			sc.nextLine();
			for(Student s : student) {
				if(s.getStdId()==id) {
					System.out.println("Enter Student Name ");
					String name = sc.nextLine();
					System.out.println("Enter Student Course ");
					String course = sc.nextLine();
					System.out.println("Enter Student Age ");
					int age = sc.nextInt();
					s.setName(name);
					s.setAge(age);
					s.setCourse(course);
				}
			}
		}
		public void delete() {
			System.out.println("Enter the ID want to delete the Details");
			int id = sc.nextInt();
			for(Student s : student) {
				if(s.getStdId()==id) {
					student.remove(s);
					System.out.println("Sudent Details Successfully Deleted");
				}
				else {
					System.out.println("Please Enter the Valid");
				}
			}
		}
	}

