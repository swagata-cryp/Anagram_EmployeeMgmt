import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    // Attributes
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println(); 
    }

    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(1, "John", 55000.50);
        Employee emp2 = new Employee(2, "Julee", 60000.75);
        Employee emp3 = new Employee(3, "Mark", 48000.30);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}