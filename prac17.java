
class Member {

    String name;
    int age;
    String phone;
    String address;
    double salary;

    public Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {

    String specialization;

    public Employee(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {

    String department;

    public Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
}

public class prac17 {

    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, "1234567890", "123 Elm St", 50000, "Software Engineering");
        Manager mgr = new Manager("Sarah", 45, "0987654321", "456 Oak St", 75000, "HR");

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone: " + emp.phone);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone: " + mgr.phone);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}
