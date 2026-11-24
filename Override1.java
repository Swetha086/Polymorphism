class Employee {
    double baseSalary;
    double calculateSalary() {
        return baseSalary;
    }
}
class SalesEmployee extends Employee {
    double bonus;
    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
public class Override1 {
    public static void main(String[] args) {
        SalesEmployee se = new SalesEmployee();
        se.baseSalary = 25000;
        se.bonus = 5000;
        System.out.println("Total Salary: " + se.calculateSalary());
    }
}