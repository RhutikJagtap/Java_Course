class  Employee
{
	
		int eno=111;
		String ename="Rj";
		float esal=84345.32f;
		String eaddr="Kolgaon";

		public void displayEmpDetails()
		{
			System.out.println("Employee Details :");
			System.out.println("-----------------------");
			System.out.println("Employee Number :"+eno);
			System.out.println("Employee Salary :"+esal);
			System.out.println("Employee Address  :"+eaddr);

		}
	
}

class Student{
	String sid="s-111";
	String sname="Rj";
	String semail="rhutikjagtap68@gmail.com";
	String smobile="7385893771";

		public void displayStudentDetails()
		{
			System.out.println("Student Details :");
			System.out.println("-----------------------");
			System.out.println("Student Id :"+sid);
			System.out.println("Student Name :"+sname);
			System.out.println("Student Email  :"+semail);
			System.out.println("Student Mobile  :"+smobile);

		}


}

class  classDemo2
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.displayEmpDetails();
		System.out.println();

		Student stu=new Student();
		stu.displayStudentDetails();


	}
}
