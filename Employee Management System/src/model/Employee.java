package model;
public sealed abstract class Employee permits FullTimeEmployee,PartTimeEmployee,ContractEmployee{
            
	protected int empId;
	protected String empName;
	protected Department department;
	protected Address address;
	
	public int getEmpId() { return empId; } 
	public Department getDepartment() { return department; }
	
	public Employee(int empId,String empName,Department department,Address address) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.address=address;
	}
	public abstract double calcSalary();
		public void displayBasicInfo() {
			System.out.println("Emp Id: "+ empId);
			System.out.println("Emp Name: "+ empName);
			System.out.println("Department: "+ department);
			System.out.println("Address: "+ address);
		}
	}
