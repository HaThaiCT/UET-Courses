public class Person {
    private String name;
    private String address;

    /**
     * contructor.
     * @param name name
     * @param address address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    /**
     * getter.
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * setter.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter.
     * @return
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * setter.
     * @param address add
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * toString.
     */
    public String toString() {
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }

}