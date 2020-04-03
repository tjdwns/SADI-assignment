package sadi.a1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private int credit;

    public Course(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "ID = " + id  +
                ", Name = " + name +
                ", Credit = " + credit;
    }
}
