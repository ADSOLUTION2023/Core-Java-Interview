package methodOverriding;

public class Developer extends Employee{
	@Override
	public void calculateSalary(double per) {
		 if(salary>0 && per>0) {
			 salary = (int) (salary + (salary*per/100));
			 System.out.println("Developer's salary after bonus:" + salary);
		 }
 
	}
	
	

}
