class Bank
{
	public String[] getCustomerNames()
	{
		String[] customerNames={"AA","BB","CC","DD","EE"};
		return customerNames;
	}
}


class  MethodDemo3
{
	public static void main(String[] args) 
	{
		Bank bank=new Bank();
		String[] customerNames=bank.getCustomerNames();
		for (int index=0;index<customerNames.length ;index++ )
		{
			System.out.println(customerNames[index]);
		}
	}
}
