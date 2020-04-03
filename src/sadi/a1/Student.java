package sadi.a1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private String birthDate;

    public Student(String id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", Name = " + name +
                ", BirthDate = " + birthDate
                ;
    }
}
