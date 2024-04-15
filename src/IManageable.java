public interface IManageable {
    void add(Course course);
    void add(Faculty faculty);
    void add(Student student);
    void add(Department departments);

    void remove(Course course);
    void remove(Faculty faculty);
    void remove(Student student);
    void remove(Department departments);

    void update(Course course);
    void update(Student student);
    void update(Faculty faculty);
    void update(Department departments);

}
