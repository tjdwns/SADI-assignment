package sadi.a1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private String birthDate;
    private List<Course> courses = new ArrayList<>();

    public Student(String id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", Name = " + name +
                ", BirthDate = " + birthDate
                ;
    }
}
