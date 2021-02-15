package Homework2;

import java.util.List;

public class Courses {
    private String departments;
    private String name;
    private int number;
    private int numCred;
    private List<Courses> courseInfo;


    public Courses(){}

    public String getSubject() {
        return departments;
    }

    public void setSubject(String subject) {
        this.departments = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumCred() { return numCred; }

    public void setNumCred(int numCred) {
        this.numCred = numCred;
    }

    public String toString(){
        return String.format("%s %d %s", departments, number, name);
    }
}

