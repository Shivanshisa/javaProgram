class Customer
{
	int custId;
	String custName;
	String custAddress;
	
	Customer(int custId,String custName,String custAddress)
	{
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	Customer(){}
	void display()
	{
		System.out.println("Customer Id is " + custId);
		System.out.println("Customer Name is " + custName);
		System.out.println("Customer Address is " + custAddress);
	}
}
 class Accounts
{
	    int acctId;
		String acctType;
		String Customer;
		int acctBalance;
		
		Accounts(int acctId,String acctType,String Customer,int acctBalance)
		{
			this.acctId = acctId;
			this.acctType = acctType;
			this.Customer = Customer;
			this.acctBalance = acctBalance;
	}
	Accounts(){}
	 void display()
	{
	System.out.println("Account Id is " + acctId);
	System.out.println("Account Type is  " + acctType);
	System.out.println("Customer is " + Customer);
	System.out.println("Account Balance = " + acctBalance);
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus = new Customer(32,"Akshay","Mumbai");
		cus.display();
		Accounts ac = new Accounts(68,"Saving","NewCust",54000);
		ac.display();
     
	}

}
