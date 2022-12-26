package Encapsulation;

public class Main {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setId(101);
	e.setLocation("Blr");
	e.setName("Aashish");
	
	System.out.println(e.getId()+" "+e.getName()+" "+e.getLocation());
}
}
