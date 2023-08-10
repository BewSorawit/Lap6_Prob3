public class HourlySalary extends Employee {

    private double pay;
    private double work;

    public HourlySalary(String first, String last, String ssn, double pay, double work) {
        super(first, last, ssn);
        this.pay = pay;
        this.work = work;
    }

    @Override
    public double earnings() {
        return pay * work;
    }

    @Override
    public String toString() {
        return "HourlySalary " + super.toString() + "\nhourly pay: $" + pay + "; hours worked: " + work;
    }

}
