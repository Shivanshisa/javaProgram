
class Account1
{  
	int accountNo;
	String accountType;
	int accountBalance;
	
	Account1(int accountNo,String accountType,int accountBalance)
	{
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	void withdraw(int withdraw)
	{
		this.accountBalance = accountBalance - withdraw;
	}
	void deposit(int deposit)
	{
		this.accountBalance = accountBalance + deposit;
	}
	
	void dispAccountDetails()
	{
		System.out.println("Account Number is " + accountNo);
		System.out.println("Account Type is " +accountType);
		System.out.println("Account Balance = " + accountBalance);
		
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 acc = new Account1(1234786,"Savings",79400);
		acc.withdraw(3500);
		acc.deposit(200);
		acc.dispAccountDetails();

	}

}
