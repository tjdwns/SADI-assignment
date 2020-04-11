package sadi.a1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentEnrollmentList implements StudentEnrollManager {
    private List<StudentEnrollment> studentEnrollments = new CopyOnWriteArrayList<>();
    private List<StudentEnrollment> studentEnrollments1 = new CopyOnWriteArrayList<>();

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
    public List<StudentEnrollment> getOne(String id) {
        for(StudentEnrollment studentEnrollment1: studentEnrollments){
            if(studentEnrollment1.getStudent().getId().equals(id)){
                studentEnrollments1.add(studentEnrollment1);
            }
        }
        return studentEnrollments1;
    }
}
