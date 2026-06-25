package model;

public final class ContractEmployee extends Employee {
	private double contractAmount;
	public ContractEmployee (int empId, String empName, Department dep, Address address, double contractAmount) {
		super(empId, empName, dep, address);
		this.contractAmount=contractAmount;
	}
	 @Override
	    public double calcSalary() {
	        return contractAmount; 
	    }
}
