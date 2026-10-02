package Inheritance;

public class Developer extends Employee{
@Override
public void calculateSalary(double percentage) {
	if (getSalary() > 0 && percentage > 0) {
		setSalary(getSalary() + (getSalary() * percentage / 100));
		System.out.println(getName());
		System.out.println("Develpoer's Salary: " + getSalary());
	}
}
}
