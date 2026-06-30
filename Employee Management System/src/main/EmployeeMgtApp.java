package main;

import model.*;
import service.EmployeeService;
import java.util.Optional;

public class EmployeeMgtApp {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Address a1 = new Address("Erode", "TN", "638052");
        
        // Setup initial team
        Employee e1 = new FullTimeEmployee(100, "Ramesh", Department.ADMIN, a1, 50000);
        Employee e2 = new PartTimeEmployee(200, "Suresh", Department.HR, a1, 5, 500);
        Employee e3 = new ContractEmployee(300, "Dinesh", Department.SALES, a1, 45000);
        
        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);
        
        System.out.println("=== INITIAL EMPLOYEE ROSTER ===");
        service.displayEmployee();
        
        // Test Operation 1: Find Employee by ID
        System.out.println("=== OPERATION: FIND EMPLOYEE ===");
        int searchId = 200;
        Optional<Employee> foundEmp = service.findEmployeeById(searchId);
        if (foundEmp.isPresent()) {
            System.out.println("Found Employee details:");
            foundEmp.get().displayBasicInfo();
        } else {
            System.out.println("Employee ID " + searchId + " not found.");
        }
        System.out.println("-----------------------------------\n");

        // Test Operation 3: Filter by Specific Department
        System.out.println("=== OPERATION: FILTER BY DEPARTMENT ===");
        service.displayEmployeesByDepartment(Department.HR);
        
        // Test Operation 4: Remove/Terminate Employee
        System.out.println("=== OPERATION: REMOVE EMPLOYEE ===");
        int removeId = 100;
        boolean isRemoved = service.removeEmployee(removeId);
        if (isRemoved) {
            System.out.println("Successfully removed employee with ID: " + removeId);
        } else {
            System.out.println("Failed to remove. ID not found.");
        }
        System.out.println("-----------------------------------\n");

        // Confirming the list changed after removal
        System.out.println("=== ROSTER AFTER REMOVAL ===");
        service.displayEmployee();
    }
}

