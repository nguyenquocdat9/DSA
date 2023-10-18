public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /** constructor. */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /** get program. */
    public String getProgram() {
        return program;
    }

    /** set program. */
    public void setProgram(String program) {
        this.program = program;
    }

    /** get year. */
    public int getYear() {
        return year;
    }

    /** set year. */
    public void setYear(int year) {
        this.year = year;
    }

    /** get fee. */
    public double getFee() {
        return fee;
    }

    /** set fee. */
    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "Student[" + super.toString() + ",program=" + program 
        + ",year=" + year + ",fee=" + fee + "]"; 
    }
}
