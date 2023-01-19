package studentlist;
import java.util.Scanner;

/**
 * SYST17796 Fundamentals of Software Design and Development
 *
 * @author Alex Kalicharan
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] s = new Student[5];
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter Student ID: ");
            int id = input.nextInt();
            
            System.out.println("Enter Student Name: ");
            String name = input.next();
            Student x = new Student(id, name);
            s[i] = x;
        }
	
	for (int i = 0; i < s.length; i++) {
	    System.out.println("Student " + (i + 1) + ":");
	    System.out.println("Name: " + s[i].getStudentName());
	    System.out.println("Student ID: " +s[i].getStudentID());
	    System.out.println();
	    
	}
        
    }

}
