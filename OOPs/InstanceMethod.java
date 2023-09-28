//Program for InstanceMethod
class A{
	//Instance Method
	void m1()
	{
		System.out.println("m1-A");
	}

	void m2()
	{
		System.out.println("m2-A");
		m1();
		 //Within the same class we are able to access instance methods directly without using any reference variable and without using any special keyword.

	}
}
//Main class
public class InstanceMethod{
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();

		A a1=null;
		a1.m1();
		//If we access an instance method by using a reference variable that contains null value then JVM will raise an exception like java.lang.NullPointerException.

	}
}