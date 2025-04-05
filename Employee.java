package assignment;

public class Employee {
	int empId;
	String empName;
	String designation;
	double salary;
	
	public Employee(int empId,String empName,String designation,double salary) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void displayDetail() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Desigation: "+designation);
		System.out.println("Salary: "+salary+" LPA");
		
	}
	
	
	
	 public void Bonus() {
	        double bonus;
	        if (salary < 50000) {
	            bonus = salary * 0.10;
	            System.out.println(bonus);
	        } else {
	            bonus = salary * 0.05;
	            System.out.println(bonus);
	        }
	       
	    }
}
