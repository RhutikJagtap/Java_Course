//Program For Var Arg Method
class Calculator
{
	void add(int ...params)
	{
		System.out.println("No of Arguments :"+params.length);
		System.out.print("Argument List : ");
		int addResult=0;
		for(int index=0;index<params.length;index++)
		{
			System.out.print(params[index]+" ");
			addResult=addResult+params[index];
		}
		System.out.println();
		System.out.println("Addition Result :"+addResult);
		System.out.println("---------------------------");

	}
}
class  VarArgMethod
{
	public static void main(String[] args) 
	{
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.add(10,20);
		calculator.add(10,20,30);

	}
}