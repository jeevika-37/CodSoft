package atm_ife;

public class BankAccount {
	double balance;
	BankAccount(double balAmt)
	{
		this.balance=balAmt;
	}
	void deposit(double amt)
	{
		if(amt>0)
		{
			balance+=amt;
			System.out.println("Deposited :"+amt);
		}
		else
		{
			System.out.println("Invalid Amount!");
		}
	}
	void withdraw(double amt)
	{
		if(balance>=amt)
		{
			balance-=amt;
			System.out.println("Withdrawn :"+amt);
		}
		else
		{
			System.out.println("Insufficient Amount!");
		}
	}
	void checkbalance()
	{
		System.out.println("----Balance Detail----");
		System.out.println("Balance :"+balance);
	}
}
