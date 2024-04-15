public class MainClass {
    public static void main(String[] args) {

        //Creation of students from using student object
        Student student1=new Student("Humphrey Matagaro",22,94568,-80,"BICS");
        Student student2=new Student("Stansley Oduor",22,94567,70,"BBIT");


        //Creation of faculty members from using faculty object
        Faculty faculty1=new Faculty("Sam Githogori",40,80002,"FIT","Advanced Object Oriented Programming");
        Faculty faculty2=new Faculty("John  Doe",45,80003,"FIT","Introduction to programming");

        //Creation of faculty members from using faculty object
        Course course1=new Course("BICS","BICS2103");
        Course course2=new Course("BBIT","BBIT");

        //adding students as a list to a course
        course1.enrollStudent(student1.getName());
        course1.enrollStudent(student2.getName());

        //adding faculty members as a list to a course
        course1.assignedFaculty(faculty1.getName());
        course1.assignedFaculty(faculty2.getName());

//        course1.removeStudent("Humphrey Matagaro");


        course1.getCourseDetails();

        System.out.println("*********************************");
        System.out.println("*********************************");

        Department department1=new Department("FIT");

        department1.courses(course1.getCourseName());
        department1.courses(course2.getCourseName());

        department1.facultyMembers(faculty1.getName());
        department1.facultyMembers(faculty2.getName());

        department1.getDepartmentDetails();

        System.out.println("*********************************");
        System.out.println("*********************************");

        UniversityManagement universityManagement=new UniversityManagement();

        universityManagement.add(student1);
        universityManagement.add(student2);

        universityManagement.add(course1);
        universityManagement.add(course2);


    }
}
