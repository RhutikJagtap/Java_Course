//Demo Program For Mutator And Accesor Method
class Employee{
	
	private int eno;
	private String ename;
	private String eaddr;
	
	public void setEno(int empNo) {
		eno = empNo;
	}

	public int getEno() {
		return eno;
	}
	
	public void setEname(String empName) {
		ename = empName;
	}
	public String getEname() {
		return ename;
	}
	
	public void setEaddr(String empAddr) {
		eaddr = empAddr;
	}
	public String getEaddr() {
		return eaddr;
	}
	
}
public class MutatorAccesorMethod {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setEno(111);
		employee.setEname("Rhutik");
		employee.setEaddr("Kolgaon");
		
		System.out.println("Employee Details");
		System.out.println("--------------------------");
		System.out.println("Employee Number : "+employee.getEno());
		System.out.println("Employee Name : "+employee.getEname());
		System.out.println("Employee Address : "+employee.getEaddr());
		
	}
}
