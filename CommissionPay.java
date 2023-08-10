public class CommissionPay extends Employee {

    private double sale;
    private double rate;

    public CommissionPay(String first, String last, String ssn, double sale, double rate) {
        super(first, last, ssn);
        this.sale = sale;
        this.rate = rate;
    }

    @Override
    public double earnings() {
        return sale * rate;
    }

    @Override
    public String toString() {
        return "CommissionPay " + super.toString() + "\ngross sales: $" + sale + "; commission rate: " + rate;
    }

}
