//Program using this keyword to return current class objects
class A{
	A getRef1()
	{
		A a=new A();
		return a;
	}

	A getRef2()
	{
		return this;
	}
}

public class ThisKeyword4
{
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1);
		System.out.println();
		System.out.println(a1.getRef1());
		System.out.println(a1.getRef1());
		System.out.println(a1.getRef1());
		System.out.println();

	   System.out.println(a1.getRef2());
       System.out.println(a1.getRef2());
       System.out.println(a1.getRef2());

	}
}