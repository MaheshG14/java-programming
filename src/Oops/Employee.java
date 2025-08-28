package Oops;
public class Employee  extends SoftwareCompany
{
	void m1()
	{  
    System.out.println("Emp_id : "+Emp_id);
	System.out.println("Emp_designation :"+ Emp_designation);
	System.out.println("Emp_salary : "+Emp_salary);
	System.out.println("Emp_workinglocation: "+Emp_workinglocation);

    }
    public static void main(String[] args)
     {
	
	Employee e1= new Employee();
	e1.m1();
     }
}