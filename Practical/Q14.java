class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Payroll extends Employee {
    double bonus;

    Payroll(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total: " + (salary + bonus));
    }
}

class Department {
    Payroll employee;

    Department(Payroll employee) {
        this.employee = employee;
    }

    void show() {
        employee.display();
    }
}

class Q14 {
    public static void main(String[] args) {
        Payroll p = new Payroll("Dipankar", 50000, 5000);
        Department d = new Department(p);
        d.show();
    }
}