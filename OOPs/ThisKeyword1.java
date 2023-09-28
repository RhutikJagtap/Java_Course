//Program using this keyword to refer current class variables
class A{
	int i=10;
	int j=20;

	A(int i,int j)
	{
		System.out.println(i+"    "+j);
		System.out.println(this.i+"   "+this.j); //To refer current class Variable
	}
}

public class ThisKeyword1{
	public static void main(String[] args) {
		A a=new A(30,40);
	}
}