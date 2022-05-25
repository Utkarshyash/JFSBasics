package Inheritance;

public class Student extends Person {
	 int rollno;
	 String dept;
	public Student() {
		super();
	}
	public Student(int rollno, String dept, String name, int age) {
		super(name, age);
		this.rollno = rollno;
		this.dept = dept;
		

	}

}
