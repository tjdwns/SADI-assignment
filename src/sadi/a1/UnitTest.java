package sadi.a1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class UnitTest {
    @Test
    public void unitTest() throws FileNotFoundException {
        String[] args = null;
        StudentEnrollManager studentEnrollManager = new StudentEnrollmentList();
        Student s1 = new Student("s123456", "Tom", "1999-11-11");
        Student s2 = new Student("s123457", "Tim", "1998-12-11");
        Course c1 = new Course("COSC2440", "SADI", 12);
        Course c2 = new Course("COSC2430", "SEF", 12);
        Assert.assertEquals("SADI", c1.getName());
        Assert.assertEquals("COSC2440", c1.getId());
        Assert.assertEquals(12, c1.getCredit());
        Assert.assertSame("Tom", s1.getName());
        Assert.assertEquals("s123456", s1.getId());
        Assert.assertEquals("1999-11-11", s1.getBirthDate());
        Assert.assertEquals("ID = s123456, Name = Tom, BirthDate = 1999-11-11", s1.toString());
        Assert.assertEquals("ID = COSC2440, Name = SADI, Credit = 12", c1.toString());
        StudentEnrollment studentEnrollment = new StudentEnrollment(s1, c1, "2019A");
        Assert.assertEquals("Student: " + s1.toString() + '\n' +
                "Course: " + c1.toString() + '\n' +
                "Semester: 2019A", studentEnrollment.toString());
        studentEnrollManager.add(studentEnrollment);
        studentEnrollment = new StudentEnrollment(s2, c2, "2020A");
        Assert.assertEquals("2020A", studentEnrollment.getSemester());
        Assert.assertSame(studentEnrollment.getCourse(), c2);
        Assert.assertSame(studentEnrollment.getStudent(), s2);
        studentEnrollManager.update(studentEnrollment);
        Assert.assertSame(studentEnrollManager.getOne("s123457"), studentEnrollment);
        Assert.assertSame(studentEnrollManager.getAll(), ((StudentEnrollmentList) studentEnrollManager).getStudentEnrollments());
        studentEnrollManager.delete(studentEnrollment);
    }
}
