public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Gets the student's name.
     * 
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     * 
     * @param name the new name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the student's ID.
     * 
     * @return the ID of the student.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the student's ID.
     * 
     * @param id the new ID of the student.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the student's group.
     * 
     * @return the group of the student.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the student's group.
     * 
     * @param group the new group of the student.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Gets the student's email.
     * 
     * @return the email of the student.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's email.
     * 
     * @param email the new email of the student.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Default constructor. Initializes a student with default values.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructs a student with the specified name, ID, and email.
     * The group is set to the default value "K62CB".
     * 
     * @param name  the name of the student.
     * @param id    the ID of the student.
     * @param email the email of the student.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructs a student by copying another student's information.
     * 
     * @param s the student to copy.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Returns the student's information in a formatted string.
     * 
     * @return the student's details as a string.
     */
    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
