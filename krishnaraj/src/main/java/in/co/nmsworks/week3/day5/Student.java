package in.co.nmsworks.week3.day5;
/***Create a POJO class for Student with attributes `name`, `age`, and `grade`.
 * Write a program that creates an object of the `Student` class and prints its details. ***/
public class Student {
    private String name;
    private int age;
    private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student =new Student("anbu",12,"A");
        System.out.println(student);
    }
}
