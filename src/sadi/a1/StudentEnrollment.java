package sadi.a1;
import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment{
    private Student student;
    private Course course;
    private String semester;

    public StudentEnrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return "Student: " + student + '\n' +
                "Course: " + course + '\n' +
                "Semester: " + semester;
    }
}


