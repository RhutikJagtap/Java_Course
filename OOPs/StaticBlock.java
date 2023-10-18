//Program For Static Variable
class A{
	int i=10;
	static int j=20;

	static{
		System.out.println("Static Block-A");
		//System.out.println(i);  //Error

		A a=new A();
		System.out.println(a.i);
		System.out.println(j);
		//System.out.println(this.j);  //Error
	}
}
public class StaticBlock{
	public static void main(String[] args) {
		A a=new A();

	}
}