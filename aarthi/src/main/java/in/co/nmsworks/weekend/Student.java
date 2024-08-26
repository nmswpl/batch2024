package in.co.nmsworks.weekend;
/* Create a POJO class for Student with attributes `name`, `age`, and `grade`.
Write a program that creates an object of the `Student` class and prints its details.
 */

public class Student {
    private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        this.age = age;
        return age;
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
    public void studentDetails(){
        System.out.println("********************************************");
        System.out.println("Name : " +getName());
        System.out.println("Age : " +getAge());
        System.out.println("Grade : " +getGrade());
        System.out.println("********************************************");
    }
}
}
