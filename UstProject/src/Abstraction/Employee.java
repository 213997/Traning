package Abstraction;

public class Employee extends Person{
	public int empid;
	

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(empid==0) {
			System.out.println("not working employee");
			
		}else {
			System.out.println("working employee");
		}
	}
	public Employee(String name,String gender,int empid) {
		super(name,gender);
		this.empid=empid;
	}
	

}
