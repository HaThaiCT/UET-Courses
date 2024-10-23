public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * contructor.
     * @param name name
     * @param address address
     * @param program program
     * @param year year
     * @param fee fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * getter.
     * @return
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * setter.
     * @param program pro
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * getter.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * setter.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * getter.
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * setter.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "Student[" + super.toString() + ",program=" 
        + this.program + ",year=" + this.year + ",fee=" + this.fee + "]";
    }
}
