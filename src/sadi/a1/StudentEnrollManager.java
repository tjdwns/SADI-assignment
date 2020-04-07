package sadi.a1;

import java.util.List;

public interface StudentEnrollManager {
    public void add(StudentEnrollment studentEnrollment);
    public void update(StudentEnrollment studentEnrollment);
    public void delete(StudentEnrollment studentEnrollment);
    public List getAll();
    public StudentEnrollment getOne(String id);
}
