package org.example.Java8Problems;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Student  {

    private int id;
    private String name;

    private String departmentName;
    private List<Integer> marks;


    public Student(int id, String name, String departmentName, List<Integer> marks) {
        this.id = id;
        this.name = name;
        this.departmentName = departmentName;
        this.marks = marks;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
