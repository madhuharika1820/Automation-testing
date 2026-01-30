package exam1;

class balance1 {
	double balance;
	void deposit(double amount)
	{
		balance =balance+amount;
		System.out.println("deposited" +amount);
	}
	void withdraw(double amount)
	{
		if (amount<=balance)
		{
			balance=balance-amount;
			System.out.println("withdraw" +amount);
		}
			}
	void getbalance()
	{
		System.out.println("balance" +balance);
	
	}
}
class saving_account extends balance1
{
	void savingdetails()
	{
		System.out.println("saving");
	}
}
class current_account extends balance1
{
	void currentdetails()
	{
		System.out.println("current_account");
	}
}
class balance
{
	public static void main(String[] args)
	{
	saving_account s=new saving_account();
	s.savingdetails();
	s.deposit(5000);
	s.withdraw(1000);
	s.getbalance();
	
	current_account c=new current_account();
	c.currentdetails();
	c.deposit(8000);
	c.withdraw(7000);
	c.getbalance();
}
}
	
	
	
	