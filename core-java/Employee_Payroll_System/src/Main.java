
public class Main {

	public static void main(String[] args)
	{
		PayrollSystem payrollSystem =new PayrollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("Vikas", 1, 50000);
		PartTimeEmployee emp2 = new PartTimeEmployee("Kapil",2,40,25);
		
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		System.out.println("Intial Employee Details: ");
		payrollSystem.displayEmployees();
		System.out.println("Romove Employees");
		payrollSystem.removeEmployee(2);
		payrollSystem.displayEmployees();
		
	}

}
