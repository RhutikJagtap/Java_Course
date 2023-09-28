//Program for Instance Variable
class A{
	int i=10; //Instance Variable
	void m1()
	{
		System.out.println("m1-A");
		System.out.println(i);
	}

}
class InstanceVariable{

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.i);
		a.m1();

		A a1=null;
		System.out.println(a1.i);
		//If we access an instance variable by using a reference variable containing null value then JVM will raise an exception like java.lang.NullPointerException.

	}

}