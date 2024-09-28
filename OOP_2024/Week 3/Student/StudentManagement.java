public class StudentManagement {

    public static Student[] students = new Student[100];
    public static int numberStudents = 0;
    static String[] groups = new String[100];
    static int numberGroups = 0;

    /**
     * Checks if two students are in the same group.
     *
     * @param s1 the first student
     * @param s2 the second student
     * @return true if both students are in the same group, false otherwise
     */
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the student has already appeared in the system.
     *
     * @param s the student to check
     * @return true if the student has appeared, false otherwise
     */
    public static boolean appeared(Student s) {
        for (int i = 0; i < numberStudents; i++) {
            if (s.getId().equals(students[i].getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a new student to the system if they haven't appeared yet.
     *
     * @param newStudent the student to add
     */
    public static void addStudent(Student newStudent) {
        if (appeared(newStudent) == true) {
            return;
        }
        students[numberStudents] = newStudent;
        numberStudents++;
        for (int i = 0; i < numberGroups; i++) {
            if (newStudent.getGroup().equals(groups[i])) {
                return;
            }
        }
        groups[numberGroups] = newStudent.getGroup();
        numberGroups++;
    }

    /**
     * Removes a student from the system by their ID.
     *
     * @param id the ID of the student to remove
     */
    public static void removeStudent(String id) {
        for (int i = 0; i < numberStudents; i++) {
            if (students[i].getId().equals(id)) {
                if (numberStudents - i - 1 >= 0) {
                    System.arraycopy(students, i + 1, students, i, numberStudents - i - 1);
                }
                numberStudents--;
            }
        }
    }

    /**
     * Returns a string of all students grouped by their group.
     *
     * @return a formatted string with students grouped by group
     */
    public static String studentsByGroup() {
        String answer = "";
        for (int i = 0; i < numberGroups; i++) {
            answer += groups[i] + "\n";
            for (int j = 0; j < numberStudents; j++) {
                if (students[j].getGroup().equals(groups[i])) {
                    answer += students[j].getInfo() + "\n";
                }
            }
        }
        return answer;
    }

    /**
     * The main method to test the StudentManagement class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        s1.setGroup("K62CC");
        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        s2.setGroup("K62CC");
        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        s3.setGroup("K62CB");
        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s4.setGroup("K62CB");

        addStudent(s1);
        addStudent(s2);
        addStudent(s3);
        addStudent(s4);

        System.out.println(studentsByGroup());
    }
}
