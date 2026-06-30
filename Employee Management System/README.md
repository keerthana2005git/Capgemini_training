EMPLOYEE MANAGEMENT SYSTEM 
A modern high utility console based Employee Management System built in Java. 
This project models corporate workforce structures by leveraging core Object Oriented Programming concepts along with modern Java features to achieve a clean maintainable enterprise architecture.

KEY FEATURES AND OPERATIONS
Polymorphic Roster Management: Handles distinct payroll calculations and attributes across various structural employee types.
Departmental Transfer Processing: Simulates real world workflow mobility by shifting employees dynamically across branches.
Granular Enterprise Audits: Runs safety triggers identifying cost centers and high earning anomalies using context guards.
Dynamic Search and Removal: Fast ID indexed queries and clean worker termination pathways safely wrapped to avoid null issues.

MODERN JAVA ARCHITECTURE ELEMENTS
This repository utilizes recent Java features to enforce domain boundaries and clean data modeling:
1. Domain Enforcements with Sealed ClassesThe core Employee parent class is designated as a sealed abstract class. It strictly limits subclass capabilities exclusively to verified structural entities: FullTimeEmployee, PartTimeEmployee, and ContractEmployee. This blocks illegal system overrides and enables complete compile time validation.
2. Immutable Data ContainersThe Address structural sub entity is built using a Java Record. This ensures address fields are safely immutable and thread safe while automatically providing clean constructor mappings, toString, and equals structures out of the box.
3. Strongly Typed CategorizationDepartments are handled using a dedicated Department Enum (IT, ADMIN, SALES, HR), preventing typing typos and structural database inconsistencies commonly caused by raw string labels.

PROJECT PACKAGE STRUCTURE
The system is compartmentalized into clean flat operational layers:
src
	main-- EmployeeMgtApp.java: Operational Engine and Simulation Entry Point
	model-- Address.java: Immutable Record Value Object
		 -- Department.java: Strongly Typed Enum Fields
		 -- Employee.java: Sealed Parent Class
		 -- FullTimeEmployee.java: Fixed Base and Bonus Worker Definition
		 -- PartTimeEmployee.java: Hourly Logged Rate Definition
		 -- ContractEmployee.java: Vendor Fixed Billed Definition
	service
		 -- EmployeeService.java: Business Logic Controller and Audits
		 
SAMPLE TERMINAL OUTPUT SIMULATION
When executing EmployeeMgtApp.java, the engine simulates a live human resources operational lifecycle:
INITIAL EMPLOYEE ROSTER
Emp Id: 100 | Name: Ramesh | Dept: ADMIN
Address: Address city Erode state TN pincode 638052
Calculated Salary: 50000.00

Emp Id: 200 | Name: Suresh | Dept: HR
Address: Address city Erode state TN pincode 638052
Calculated Salary: 25000.00

Emp Id: 300 | Name: Dinesh | Dept: SALES
Address: Address city Erode state TN pincode 638052
Calculated Salary: 42000.00
Transferring Employee 100 to IT Department...
RUNNING HIGH SALARY AUDIT COMPLIANCE
AUDIT ALERT High Earner FullTime Staff: Ramesh 55000.00
AUDIT ALERT Premium External Contractor: Dinesh 42000.00

PROCESSING ANNUAL APPRAISALS 10.5 percent increase
Adjusting fixed base package for Full Time: Ramesh
Adjusting hourly contract rates for Part Time: Suresh
Skipping automated increment. Fixed vendor contract for: Dinesh

PREREQUISITES AND SETUP
Java Development Kit: Java 17 or Java 21+ required due to advanced sealed semantics and Guarded Pattern Matching.
IDE: Eclipse IDE configured with matching compiler compliance levels.

LOCAL INSTALLATION STEPS
1. Clone this newly published repository locally:git clone github.com
2. Open Eclipse IDE.
3. Select File, then Import, then General, and choose Existing Projects into Workspace.
4. Browse to the root directory where you cloned the folder and click Finish.
5. Right click on EmployeeMgtApp.java and select Run As, then Java Application.
