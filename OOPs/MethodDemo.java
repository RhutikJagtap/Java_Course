//Program for Method
class Transaction
{
	public void deposit(String accNo,int depositAmt)
	{
		System.out.println("deposit() method from Transaction Class");
		System.out.println(depositAmt+" deposited in an Account "+accNo);
	}

	public void withdraw(String accNo,int withdrawAmount)
	{
		System.out.println("withdraw() method from Transaction class");
		System.out.println(withdrawAmount+" withdraw from the Account "+accNo);
	}

	public void transferFunds(String fromAccount,String toAccount,int transferAmount)
	{
		System.out.println("transferFunds() from Transaction Class");
		System.out.println(transferAmount+" is Transfered from the Account "+fromAccount+" To the Account "+toAccount);
	}

}

class MethodDemo 
{
	public static void main(String[] args) 
	{
		Transaction transaction=new Transaction();

		transaction.deposit("Rj",1000);
		System.out.println();

		transaction.withdraw("Rj",2000);
		System.out.println();

		transaction.transferFunds("Rj","Rhutik",4000);
		
	}
}
