public class UniversityManagement implements IManageable {
    @Override
    public void add(Department departments) {

    }

    @Override
    public void remove(Course course) {

    }

    @Override
    public void remove(Faculty faculty) {

    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public void remove(Department departments) {

    }

    @Override
    public void add(Course course) {
        try {
            if (course.getCourseCode().length()<5) {
                throw new InvalidDataEntryException("You have entered "+course.getCourseCode()+" as a course code. The course code is not allowed as it is less than minimum length of 5");
            }
        }catch (InvalidDataEntryException e){
            System.out.println("Data entered is incorrect. "+e);
        }
    }

    @Override
    public void add(Student student) {
        try {
            if (student.getGPA()<0) {
                throw new InvalidDataEntryException("You have entered a GPA of ."+student.getGPA()+" A negative GPA is not allowed");
            }
        }catch (InvalidDataEntryException e){
            System.out.println("Data entered is incorrect "+e);
        }
    }

    @Override
    public void add(Faculty faculty) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void update(Faculty faculty) {

    }

    @Override
    public void update(Department departments) {

    }
}
