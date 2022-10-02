package Entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax; 
	
	public double netSalary(){
		return grossSalary - tax; 
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += ((grossSalary / 100) * percentage);
	}

	@Override
	public String toString() {
		return "Employee Name = " + name + ", Gross Salary = " + grossSalary + ", Net Salary: " + netSalary();
	}

	
	
}
