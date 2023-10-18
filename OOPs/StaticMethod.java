//Program For Static Method
class A{
	static int i=10;
	int j=20;
	static void m1()
	{
		System.out.println("m1-A");
		System.out.println(i);
		//System.out.println(j);  //Error

		A a=new A();
		System.out.println(a.j);
		//System.out.println(this.i); //Error	
	}

	void m2()
	{
		System.out.println("m2-A");
		this.m1();
	}
}

public class StaticMethod{
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		A.m1();
		a.m2();

		A a1=null;
		a1.m1();
		a1.m2();
	}
}