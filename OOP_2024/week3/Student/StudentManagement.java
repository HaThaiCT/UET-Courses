
public class StudentManagement {

    Student[] students = new Student[100];
    int numberStudents = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }

    public void addStudent(Student newStudent) {
        students[numberStudents] = newStudent;
        numberStudents++;
    }

    public void removeStudent(String id) {
        for(int i = 0; i < numberStudents; i++) {
            if(students[i].getId().equals(id)) {
                
            }
        }
    } 

    public static void main(String[] args) {
        
    }    
}
