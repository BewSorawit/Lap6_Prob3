public class FixedSalary extends Employee {
    private double salary;

    public FixedSalary(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        this.salary = salary;
    }

    @Override
    public double earnings() {
        return salary;
    }

    @Override
    public String toString() {
        return "FixedSalary salary " + super.toString() + "\n" + "monthly salary: $" + salary;
    }

}