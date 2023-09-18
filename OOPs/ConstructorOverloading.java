//Program for Constructor Overloading
class A{
	int i,j,k;

	A()
	{

	}

	A(int x)
	{
		i=x;
	}

	A(int x, int y)
	{
		i=x;
		j=y;

	}

	A(int x,int y,int z)
	{
		i=x;
		j=y;
		k=z;
	}

	void add()
	{
		System.out.println("Add:"+(i+j+k));
	}
}
class ConstructorOverloading{
	public static void main(String[] args) {
		A a1=new A();
		a1.add();

		A a2=new A(10);
		a2.add();

		A a3=new A(10,20);
		a3.add();

		A a4=new A(10,20,30);
		a4.add();
	}
}