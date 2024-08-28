package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private int math;
    private int english;
    private int science;
    private int history;

    public Student() {
    }

    public Student(int id, String name, int math, int english, int science, int history) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
        this.science = science;
        this.history = history;
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

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void getStudentDetail(){
        System.out.println("Student Id : " +getId());
        System.out.println("Student Name : " +getName());
        System.out.println("Student Math : " +getMath());
        System.out.println("Student English : " +getEnglish());
        System.out.println("Student History : " +getHistory());
        System.out.println("Student Science : " +getScience());
    }
}
