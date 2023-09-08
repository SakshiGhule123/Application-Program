package com.java.demo.intro;

class EmployeeX
{
	public void work()
	{
		
			System.out.println("inside work method");
		
	}
	
	public void getSalary()
	{
		
			System.out.println("inside getSalary method");
		
	}
}
class HRManager extends EmployeeX
{
	public void work()
	{
		
			System.out.println("inside work method of HRManager");
		
	}
	
	public void addEmployee()
	{
		System.out.println("The employee is added");
		
	}
}
public class office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EmployeeX obj = new HRManager();
       obj.work();
       
	}

}
