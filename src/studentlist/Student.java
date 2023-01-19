package studentlist;

/**
 * SYST17796 Fundamentals of Software Design and Development
 *
 * @author Alex Kalicharan
 */
public class Student {
    
    private int studentID;
    private String studentName;
    
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
}
