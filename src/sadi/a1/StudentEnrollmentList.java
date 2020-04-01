package sadi.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentEnrollmentList implements StudentEnrollManager {
    private List<StudentEnrollment> studentEnrollments = new CopyOnWriteArrayList<>();

    public List<StudentEnrollment> getStudentEnrollments() {
        return studentEnrollments;
    }

    @Override
    public void add(StudentEnrollment studentEnrollment) {
        studentEnrollments.add(studentEnrollment);
    }

    @Override
    public void update(StudentEnrollment studentEnrollment) {
        studentEnrollments.add(studentEnrollment);
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
