/*Procedure to Use Classes in Java Applications:
*/
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
			System.out.print("Employee Address  :"+eaddr);

		}
	
}

class classDemo
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.displayEmpDetails();
	}
	
}
