package sadi.a1;

import java.util.ArrayList;
import java.util.List;

public class StudentEnrollmentList implements StudentEnrollManager{
    private List<StudentEnrollment> studentEnrollments = new ArrayList<>();

    public List<StudentEnrollment> getStudentEnrollments() {
        return studentEnrollments;
    }

    @Override
    public void add(StudentEnrollment studentEnrollment) {
        studentEnrollments.add(studentEnrollment);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(StudentEnrollment studentEnrollment) {
        studentEnrollments.remove(studentEnrollment);
    }

    @Override
    public List<StudentEnrollment> getAll() {
        return studentEnrollments;
    }

    @Override
    public String getOne() {
        return null;
    }
}
