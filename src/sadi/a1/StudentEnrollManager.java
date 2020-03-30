package sadi.a1;

public interface StudentEnrollManager {
    public void add(StudentEnrollment studentEnrollment);
    public void update();
    public void delete(StudentEnrollment studentEnrollment);
    public String getAll();
    public String getOne();
}
