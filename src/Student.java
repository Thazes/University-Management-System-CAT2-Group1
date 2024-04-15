public class Student extends Person{
   private double GPA;
   private String coursesEnrolled;

    public Student(String name, int age, int id, double GPA, String coursesEnrolled) {
        super(name, age, id);
        this.GPA = GPA;
        this.coursesEnrolled = coursesEnrolled;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(String coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }
}
