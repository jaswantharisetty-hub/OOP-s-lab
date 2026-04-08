abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    void calculateSalary() {
        System.out.println("Salary: " + (hoursWorked * hourlyRate));
    }
}

public class Employee_System {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Jaswanth", 1, 50000);
        e1.displayDetails();
        e1.calculateSalary();

        System.out.println("-------------------");

        Employee e2 = new PartTimeEmployee("Rahul", 2, 5, 500);
        e2.displayDetails();
        e2.calculateSalary();
    }
}