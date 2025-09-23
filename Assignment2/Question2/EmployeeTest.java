import java.util.Scanner;


class Employee{
	private String fname;
	private String lname;
	private double salary;
	Scanner sc = new Scanner(System.in);
	
	public Employee( ) {
		
	}
	
	public Employee(String fname,String lname,double salary) {
		this.fname = fname;
		this.lname = lname;
		if(salary>0) {
		this.salary = salary;
		}else {
			System.out.println("Salary cannot be negative!!");
		}
	}
	
	public void setRecord( ) {
		 System.out.println("Enter the First name:");
		 this.fname = sc.next();
		 System.out.println("Enter the Last name:");
		 this.lname = sc.next();
		 System.out.println("Enter the Salary:");
		 this.salary = sc.nextInt();
	}
	
	

	public void getRecord( ) {
		System.out.println("First name: "+fname);
		System.out.println();
		System.out.println("Last name: "+lname);
		System.out.println();
		System.out.println("Salary: "+salary);
	}
	
	public void incSalary( ) {
		this.salary = this.salary + (0.1*this.salary);
	}
}


public class EmployeeTest {
	public static void main(String[] args) {
    Employee e1 = new Employee( );
    Employee e2 = new Employee( );
    
    e1.setRecord();
    e1.incSalary();
    e1.getRecord();
    
    e2.setRecord();
    e2.incSalary();
    e2.getRecord();
	}
    
    
    
}
