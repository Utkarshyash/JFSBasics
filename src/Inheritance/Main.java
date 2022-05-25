package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(23,"CSE","Dipu",22);
		System.out.println("Student data:");
		System.out.println("name "+s1.name);
		System.out.println("age "+s1.age);
		System.out.println("dept "+s1.dept);
		
		System.out.println("Employee data:");
		Employee e1=new Employee("utkarsh",21,1, "manager",58000);
		System.out.println("name "+e1.name);
		System.out.println("age "+e1.age);
		System.out.println("Empid "+e1.Empid);
		System.out.println("designation "+e1.designation);
		System.out.println("salary "+e1.salary);
	}

}
