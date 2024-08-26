package in.co.nmsworks.week3.day5.homework;

/**
 * Create a POJO class for Student with attributes `name`, `age`, and `grade`.
 * Write a program that creates an object of the `Student` class and prints its details.
 */

public class PojoClassExample {
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

    public PojoClassExample(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "PojoClassExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
