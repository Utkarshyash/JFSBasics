package Inheritance;

public class Employee extends Person {

	 int Empid;
	 String designation;
	int salary;
	
	public Employee(String name,int age) {
		super(name,age);
	}
	public Employee(String name,int age,int Empid, String designation, int salary) {
		super(name,age);
		this.Empid = Empid;
		this.designation = designation;
		this.salary=salary;
	}
}

