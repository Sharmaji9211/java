package OOPs;

public abstract class Employee1 {
	
	int Employee_Id;
	String Employee_Name;
	int Monthly_Salary;
	
	
	public Employee1(int employee_Id, String employee_Name, int monthly_Salary) {
		this.Employee_Id = employee_Id;
		this.Employee_Name = employee_Name;
		this.Monthly_Salary = monthly_Salary;
	}

	public abstract void dispalyDetails();
	public abstract void calculateSalary();
}
