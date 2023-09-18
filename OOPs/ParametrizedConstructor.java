//Parametrized Constructor
class Account{
	String accNo;
	String accHolderName;
	String accType;
	int balance;

	public Account(String accountNo, String accountHolderName, String accountType, int accountBalance) {
		accNo = accountNo;
		accHolderName = accountHolderName;
		accType = accountType;
		balance = accountBalance;
	}


	public void getAccountDetails()
	{
		System.out.println("Account Details");
		System.out.println("------------------------------------");
		System.out.println("Account Details: "+accNo);
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Account Type: "+accType);
		System.out.println("Account Balance: "+balance);
	}
}

class ParametrizedConstructor{
	public static void main(String[] args) {
		Account account1 = new Account("a111", "Rhutik","Savings", 7500000);		
		account1.getAccountDetails();	
		System.out.println();
		
		Account account2 = new Account("a222", "Rj", "Savings", 860000);
		account2.getAccountDetails();
		System.out.println();
		
		Account account3 = new Account("a333", "Amoal", "Savings", 500000);
		account3.getAccountDetails();


		
	}
}