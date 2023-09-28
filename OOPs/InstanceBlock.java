class A{

	//Instance Block
	{
		System.out.println("Instance Block-A");
	}

	//Constructor
	A()
	{
		System.out.println("A-Constructor");
	}
}

public class InstanceBlock
{
	public static void main(String[] args) {
		A a=new A();

	}
}