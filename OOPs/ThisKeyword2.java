//Program using this keyword to refer current class methods
class A{
	void m1()
	{
		System.out.println("m1-A");
		m2();
		this.m2(); //To refer current class method

	}

	void m2()
	{
		System.out.println("m2-A");
	}
}

public class ThisKeyword2{
	public static void main(String[] args) {
		A a=new A();
		a.m1();
	}
}