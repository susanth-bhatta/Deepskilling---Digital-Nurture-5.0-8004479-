public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "Sush", "Manager", 75000));
        management.addEmployee(new Employee(102, "Srividhya", "Developer", 60000));
        management.addEmployee(new Employee(103, "hashmi", "Tester", 50000));

        System.out.println("\nEmployee Records:");

        management.displayEmployees();

        System.out.println("\nSearching Employee ID 102:");

        Employee employee = management.searchEmployee(102);

        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Employee Not Found.");

        management.deleteEmployee(101);

        System.out.println("\nAfter Deletion:");

        management.displayEmployees();
    }
}