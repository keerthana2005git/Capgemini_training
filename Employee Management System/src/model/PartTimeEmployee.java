package model;

public final class PartTimeEmployee extends Employee {
private int hoursWorked;
private double hourlyRate;
public PartTimeEmployee (int empId, String empName, Department dep, Address address, int hoursWorked, double hourlyRate) {
	super(empId, empName, dep, address);
	this.hoursWorked=hoursWorked;
	this.hourlyRate=hourlyRate;
}
@Override
public double calcSalary() {
	return hoursWorked * hourlyRate;
   	 
    }
}

