class Account
{
	void getAccountDetails()
	{
		System.out.println("Account Details........");
	}
}

class Employee
{
	void createAccount(Account account)
	{
		System.out.println("Employee Details.....");
		account.getAccountDetails();
	}
}

class  MethodDemo2
{
	public static void main(String[] args) 
	{
		Account account=new Account();

		Employee employee=new Employee();
		employee.createAccount(account);

		
	}
}
