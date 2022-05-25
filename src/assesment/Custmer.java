package assesment;

public class Custmer extends Person {

private int accNumber;
Custmer(){
	
}
Custmer(int accNumber,String address,String phone,String custmerName,int age){
	super(custmerName,age,address,phone);
	this.accNumber=accNumber;
}
public void createAccount(int accNumber) {
 this.accNumber=accNumber;
}
public int getAccountNumber() {
	return this.accNumber;
}
//public getBalance() {
	 
//}
//public int deposit(int x,int accNumber) {

//	if accNumber match
	
//	deposit the money
	
//	update the balance

//}
//public int withdrawl(int x,int accNumber) {
//	if accNumber match 
//	1.check for balance in the account
//	 1.1 if balance greater than withdrawl ammount done the trans
//	 1.2 else giv him a warning
	
//	udate balance
}
//}
