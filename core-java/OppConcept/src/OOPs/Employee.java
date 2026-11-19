package OOPs;

public class Employee {
	
	int Employee_Id;
	String Employee_Name;
	int Monthly_Salary;
	
	
	public Employee(int employee_Id, String employee_Name, int monthly_Salary) {
		this.Employee_Id = employee_Id;
		this.Employee_Name = employee_Name;
		this.Monthly_Salary = monthly_Salary;
	}

	public void calculateAnnualSalary() {
		System.out.println("Employee ID "+ Employee_Id);
		System.out.println("Employee Name "+Employee_Name);
		System.out.println("Monthly Salary"+Monthly_Salary);
		System.out.println("Annual Salary "+Monthly_Salary*12);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Shivam",30000);
		Employee emp2 = new Employee(102,"Ashu",50000);
		Employee emp3 = new Employee(103,"kapil",80000);
		
		emp1.calculateAnnualSalary();
		emp2.calculateAnnualSalary();
		emp3.calculateAnnualSalary();
	}
}
