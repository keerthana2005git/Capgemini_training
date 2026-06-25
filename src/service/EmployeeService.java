package service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Employee;
import model.Department;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    
    // 1. Existing: Add Employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    // 2. Existing: Display All Employees
    public void displayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees found in the system.");
            return;
        }
        for (Employee emp : employees) {
            emp.displayBasicInfo();
            System.out.println("Calculated Salary: $" + emp.calcSalary());
            System.out.println("-----------------------------------");
        }
    }

    // 3. NEW: Find Employee by ID (Returns an Optional to prevent NullPointerException)
    public Optional<Employee> findEmployeeById(int empId) {
        return employees.stream()
                .filter(emp -> emp.getEmpId() == empId)
                .findFirst();
    }

    // 4. NEW: Remove Employee by ID
    public boolean removeEmployee(int empId) {
        // removeIf returns true if an element was removed
        return employees.removeIf(emp -> emp.getEmpId() == empId);
    }

    // 5. NEW: Calculate Total Payroll Expense
    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.calcSalary();
        }
        return total;
    }

    // 6. NEW: Filter and Display Employees by Department enum
    public void displayEmployeesByDepartment(Department dept) {
        System.out.println("\n--- Employees in Department: " + dept + " ---");
        long count = employees.stream()
                .filter(emp -> emp.getDepartment() == dept)
                .peek(emp -> {
                    emp.displayBasicInfo();
                    System.out.println("Calculated Salary: $" + emp.calcSalary());
                    System.out.println("-----------------------------------");
                }).count();
        
        if (count == 0) {
            System.out.println("No employees found in this department.");
        }
    }
}
