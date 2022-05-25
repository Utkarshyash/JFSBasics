package Collegepkg;

public class Student {
	int rollnumber;
	String name;
	int year;
	String branch;
	
	public Student() {
		super();
		this.year=4;
		this.branch="Computer Science andEngineering";
	}
	public Student(int rollnumber, String name, int year, String branch) {
		super();
		this.rollnumber=rollnumber;
		this.name=name;
		this.year=year;
		this.branch = branch;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", year=" + year + ", branch=" + branch + "]";
	}
	
}


