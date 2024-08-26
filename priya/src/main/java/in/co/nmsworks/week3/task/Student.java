package in.co.nmsworks.week3.task;

import java.util.Scanner;

public class Student {
    private  String name;
   private int age;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public void createObject(String name, int age, char grade){
        Student student = new Student(name,age,grade);
        System.out.println(student);
    }

    public static void main(String[] args) {
        Student student = new Student();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of student:");
       String name = s.nextLine();
        System.out.println("Enter  age:");
       int age = s.nextInt();
        System.out.println("Enter  grade:");
       char grade = s.next().charAt(0);
        student.createObject(name,age,grade);
    }
}
