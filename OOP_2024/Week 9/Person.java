public class Person implements Comparable<Person> {

    protected String name;
    protected int age;
    protected String address;

    /**
     * ht.
     */
    public Person(){}

    /**
     * ht.
     * @param name 1
     * @param age 1
     * @param address 1
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * ht.
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * ht.
     * @param name 1
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ht.
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     * ht.
     * @param age 1
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * ht.
     * @return
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * ht.
     * @param address 1
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ht.
     * @param other the object to be compared.
     * @return
     */
    public int compareTo(Person other) {
        int nameComparison = this.name.compareTo(other.name);

        if (nameComparison == 0) {
            return Integer.compare(this.age, other.age);
        }

        return nameComparison;
    }
}
