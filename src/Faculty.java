public class Faculty extends Person{
    private String department,coursesTaught;

    public Faculty(String name, int age, int id, String department, String coursesTaught) {
        super(name, age, id);
        this.department = department;
        this.coursesTaught = coursesTaught;
    }
}
