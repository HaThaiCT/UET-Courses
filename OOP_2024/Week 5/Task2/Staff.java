public class Staff extends Person {
    private String school;
    private double pay;
    
    /**
     * contructor.
     * @param name name
     * @param address address
     * @param school school
     * @param pay pay
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * getter.
     * @return
     */
    public String getSchool() {
        return this.school;
    }
    
    /**
     * setter.
     * @param school school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * getter.
     * @return
     */
    public double getPay() {
        return this.pay;
    }

    /**
     * setter.
     * @param pay pay
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * toString.
     */
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + this.school + ",pay=" + this.pay +  "]";
    }

}
