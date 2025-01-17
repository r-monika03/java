class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class empl_info_mgmt {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("monika");
        System.out.println("Employee Name: " + employee.getName());

        employee.setSalary(100000.0);
        System.out.println("Employee Salary: " + employee.getSalary());

        employee.setSalary(-5000.0);
        System.out.println("Salary after Invalid Negative Value: " + employee.getSalary());
    }
}
