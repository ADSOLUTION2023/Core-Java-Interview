package methodOverriding;

public class Manager extends Employee{
	
	@Override
	public void calculateSalary(double per) {
		 if(salary>0 && per>0) {
			 salary = (int) (salary + (salary*per/100));
			 System.out.println("Manager's Salary after Bonus:" + salary);
		 }
	}
	

}
