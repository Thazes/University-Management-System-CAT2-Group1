import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course {
    private String courseName,courseCode;


    private List<String> enrolledStudents;
    private List<String> assignedFaculty;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.assignedFaculty = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void assignedFaculty(String facultyName) {
        assignedFaculty.add(facultyName);
    }
    public List<String> getAssignedFaculty() {
        return assignedFaculty;
    }

    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
    }
    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void getCourseDetails(){
        //Method to display course details
        System.out.println("Details of the above course are as follows :\n "+"Name: "+courseName+ " "+"Course Code: "+courseCode+ " \n AssignedFaculty: "+assignedFaculty+ "\n Enrolled students: "+enrolledStudents);
    }

    public void removeStudent(String name){
        Iterator<String> iterator = enrolledStudents.iterator();
        while (iterator.hasNext()) {
            if (enrolledStudents.equals(name)) {
                iterator.remove(); // Remove the student from the list
                System.out.println(name + " has been removed from the course.");
                return;
            }
        }
    }
}
