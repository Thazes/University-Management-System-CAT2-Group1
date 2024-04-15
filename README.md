# CAT2 OOP2 project guidelines


## Project was done by the following group members
 1. 94568 Humphrey Nyakundi Matagaro

## Achieving of OOP principles 

 1. Inheritance was achieved through extending class student with person
   public class Student extends Person{
    private double GPA;
    private String coursesEnrolled;

    public Student(String name, int age, int id, double GPA, String coursesEnrolled) {
        super(name, age, id);
        this.GPA = GPA;
        this.coursesEnrolled = coursesEnrolled;
      }
   }

2. Polymorphism was achieved through
    A) Runtime polymorphism-inheritance
      public class UniversityManagement implements IManageable {
       @Override
       public void add(Department departments) {
       }
      }
    
    B) Compile time polymorphism
       @Override
      public void remove(Faculty faculty) {

      }

      @Override
      public void remove(Student student) {

      }
