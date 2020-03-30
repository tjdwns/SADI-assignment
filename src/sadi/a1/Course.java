package sadi.a1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private int credit;
    private List<Student> students = new ArrayList<>();

    public Course(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ID = " + id  +
                ", Name = " + name +
                ", Credit = " + credit;
    }
}
