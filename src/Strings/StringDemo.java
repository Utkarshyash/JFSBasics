package Strings;

public class StringDemo {
	public static void main(String args[]) {
		char name1[]= {'s', 'u', 'm', 'i'};
		char nmae[]= {'a', 'b', 'c'};
		
		String name2=new String("Joselin is a girl in another planet");
		String name3="Joselin is a girl in another planet";
		
		int acc_no=128574;
		Integer acc=234357; //wrapper class
		
		acc.compareTo(acc_no); //valid statement
		
		String name=new String("Utkarsh");
		
		String first_presenter=name;
		String first_starter="Utkarsh";
		String myname=new String(name);
		System.out.println(name);
		System.out.println(myname.toLowerCase());
		System.out.println(myname.toUpperCase());
		name.toUpperCase();
		
		name=myname.toUpperCase();
		
		System.out.println();
		
		String cust_pan_no="AXCOH6578N";
		
		cust_pan_no=cust_pan_no+ 'A';
		System.out.println(cust_pan_no);
		System.out.println(name2.substring(2));
		
		System.out.println(name2.substring(2,5));
		
		String midDigits=cust_pan_no.substring(5,9);
		char c=cust_pan_no.charAt(9);
		
		if((!Character.isAlphabetic(c)&&((Integer.parseInt(midDigits))>0))) {
			System.out.println("Invalid Pan number");
			
		}
		
		
		
	}

}
