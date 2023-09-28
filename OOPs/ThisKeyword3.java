//Program using this keyword to refer current class Constructors

class A{
	A()
	{
		this(10);
		System.out.println("A-Constructor");
	}

	A(int i)
	{
		this(22.22f);
		System.out.println("A-Int-Parametrized Constructor");
	}

	A(float f)
	{
		this(33.3333);
		System.out.println("A-float-Parametrized Constructor");
	}

	A(double d)
	{
		System.out.println("A-Double-Parametrized Constructor");
	}
}

class ThisKeyword3{
	public static void main(String[] args) {
		A a=new A();
	}
}