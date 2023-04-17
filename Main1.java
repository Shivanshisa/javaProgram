
class Account
{  
	int accountNo;
	String accountType;
	int accountBalance;
	int deposit;
	void setAccountDetails()
	{
	   accountNo = 34522;
	   accountType = "Savings";
	   accountBalance = 56000;
	}
	void withdraw(int withdraw1)
	{
		this.accountBalance = accountBalance - withdraw1;
	}
	void deposit(int deposit1)
	{
		this.accountBalance = accountBalance + deposit1;
	}
	
	void dispAccountDetails()
	{
		System.out.println("Account Number is = " + accountNo);
		System.out.println("Account Type is = " +accountType);
		System.out.println("Account Balance is = " + accountBalance);
		
	}
}


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		ac.setAccountDetails();
		ac.withdraw(1000);
		ac.deposit(3000);
		ac.dispAccountDetails();
		
	}

}
