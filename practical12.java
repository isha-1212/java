
class Employee {

    private String fname;
    private String lname;
    private double monWageOfEmp;

    public Employee(String fname, String lname, double monWageOfEmp) {
        this.fname = fname;
        this.lname = lname;
        setMonWageOfEmp(monWageOfEmp);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getMonWageOfEmp() {
        return monWageOfEmp;
    }

    public void setMonWageOfEmp(double monWageOfEmp) {
        if (monWageOfEmp < 0) {
            this.monWageOfEmp = 0.0;
        } else {
            this.monWageOfEmp = monWageOfEmp;
        }
    }

    public double getAnnualSalary() {
        return monWageOfEmp * 12;
    }

    public void increaseSalary() {
        monWageOfEmp *= 1.10;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Isha", "patel", 2100.00);
        Employee emp2 = new Employee("Hely", "patel", 4000.00);
        Employee emp3 = new Employee("Dhani", "patel", 4500.00);

        System.out.println("\n::::::::::ANNUAL SALARY DETAILS::::::::::");
        System.out.println(emp1.getFname() + " " + emp1.getLname() + "'s annual salary: " + emp1.getAnnualSalary());
        System.out.println(emp2.getFname() + " " + emp2.getLname() + "'s annual salary: " + emp2.getAnnualSalary());
        System.out.println(emp2.getFname() + " " + emp3.getLname() + "'s annual salary: " + emp3.getAnnualSalary());

        emp1.increaseSalary();
        emp2.increaseSalary();
        emp3.increaseSalary();

        System.out.println("\n::::::::::ANNUAL SALARY AFTER 10% INCREASE DETAILS::::::::::");
        System.out.println(emp1.getFname() + " " + emp1.getLname() + "'s annual salary after 10% increase: " + emp1.getAnnualSalary());
        System.out.println(emp2.getFname() + " " + emp2.getLname() + "'s annual salary after 10% increase: " + emp2.getAnnualSalary());
        System.out.println(emp3.getFname() + " " + emp3.getLname() + "'s annual salary after 10% increase: " + emp3.getAnnualSalary());
        System.out.println("\n BY ISHA PATEL_23DIT045");
    }
}
