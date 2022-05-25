package Collegepkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentDetails {
	public static void main(String[]args) throws FileNotFoundException{
		ArrayList<Student> students= new ArrayList<Student>();
		
		Student s1= new Student(1, "Shiva", 4, "CSE");
		students.add(s1);
		Student s2= new Student(2, "Dipu", 4, "EL");
		students.add(s2);
		
		students.add(new Student(3, "Abhinav", 3, "EC"));
		students.add(new Student(4, "Alok", 2, "EL"));
		
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\JFSBasics\\src\\Collegepkg\\student_details");
		if(file.exists()) {
			Scanner s = new Scanner(file);
			System.out.println("Student Details");
			while(s.hasNextLine()) {
				Student stud = new Student();
				stud.setRollnumber(s.nextInt());
				stud.setName(s.next());
				students.add(stud);
			}
			for(Student sp : students) {
				System.out.println(sp);
			}
		}
	}

}
