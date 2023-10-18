public class Staff extends Person {
    private String school;
    private double pay;

    /** constructor. */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /** get school. */
    public String getSchool() {
        return school;
    }

    /** set school. */
    public void setSchool(String school) {
        this.school = school;
    }

    /** get pay. */
    public double getPay() {
        return pay;
    }

    /** set pay. */
    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
