package OOPs;

public class Developer extends Employee1{

	String lang;
	public Developer(int employee_Id, String employee_Name, int monthly_Salary,String lang) {
		super(employee_Id, employee_Name, monthly_Salary);
		this.lang=lang;
	}
    @Override
	public void dispalyDetails() {
		System.out.println("Employee ID "+ Employee_Id);
		System.out.println("Employee Name "+Employee_Name);
		System.out.println("Monthly Salary "+Monthly_Salary);
		System.out.println("Programming Language " +lang);
		
	}
	@Override
	public void calculateSalary() {
		System.out.println("Anaual Salary "+Monthly_Salary*12);
		
	}
	public static void main(String[] args) {
		Developer dev = new Developer(101, "Shivam", 100000, "Java");
		dev.calculateSalary();
		dev.dispalyDetails();
	}

}
