package assesment;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	  System.out.println("input account");
	  int accNumber=sc.nextInt();
	  System.out.println("input address");
	  String  address=sc.next();
	  System.out.println("input phone");
	  String phone=sc.next();
	  System.out.println("input name");
	  String  name=sc.next();
	  System.out.println("input age");
	  int age=sc.nextInt();
	  
	  Custmer c= new Custmer(accNumber,address,phone,name,age);
	  
	  System.out.println("Custmer Details : name "+name+" age "+age+" address "+ address);
	}

}
