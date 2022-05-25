package assesment;

public class Account extends Custmer {
	int balance;
	Account(int balance){
		super();
		this.balance=balance;
	}	
	
	 void updateAccount(int balance,int accNumber) {
		 int myAccount=this.getAccountNumber();
	if(myAccount==accNumber)
		this.balance=balance;
	}
	
	int checkAccount(int accNumber) {
		int myAccount=this.getAccountNumber();
		if(myAccount==accNumber)
		    return this.balance;
	return -1;	
	}
	
}
