import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<String> courses;
    private List<String> facultyMembers;
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void facultyMembers(String facultyName) {
        facultyMembers.add(facultyName);
    }
    public List<String> getFacultyMembers() {
        return facultyMembers;
    }
    public void courses(String courseName) {
        courses.add(courseName);
    }
    public List<String> getCourses() {
        return courses;
    }

    public void getDepartmentDetails(){
        //Method to display course details
        System.out.println("Details of the above Department are as follows : "+"\nName: "+departmentName+ ""+"\nCourse Name: "+courses+ " \n Faculty Members: "+facultyMembers);
    }
}
