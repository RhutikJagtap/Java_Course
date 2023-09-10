interface I
{
	int x=10; //public static final
	void m1(); //public abstract
	void m2();  //public abstract
	void m3();  //public abstract
}


class A implements I
{
	//x  is available here as apublic static final variable
	public void m1()
	{
		System.out.println("m1-A");
	}

	public void m2()
	{
		System.out.println("m2-A");
	}

	public void m3()
	{
		System.out.println("m3-A");
	}

	public void m4()
	{
		System.out.println("m4-A");
	}
	
}


class InterfaceDemo
{
	public static void main(String[] args) 
	{
		//I i= new I();  error-I is abstract; cannot be instantiated

		I i= new A();
		i.m1();
		i.m2();
		i.m3();
		// i.m4();  error: cannot find symbol
		System.out.println();

		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		System.out.println();

		System.out.println(I.x);
		System.out.println(i.x);
		System.out.println(A.x);
		System.out.println(a.x);

	}
}
