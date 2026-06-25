package model;

public final class FullTimeEmployee extends Employee {
private double monthlySalary;
public FullTimeEmployee(int empId, String empName, Department dep, Address address, double monthlySalary) {
	super(empId, empName,dep,address);
	this.monthlySalary=monthlySalary;
}
@Override
public double calcSalary() {
	return monthlySalary;
}
}
