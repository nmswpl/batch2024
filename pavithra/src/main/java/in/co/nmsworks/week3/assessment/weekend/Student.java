package in.co.nmsworks.week3.assessment.weekend;

/**
 * 5.Create a POJO class for Student with attributes `name`, `age`, and `grade`.
 *  Write a program that creates an object of the `Student` class and prints its details.
 */

public class Student {

    String name;
    int age;
    String grade;

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
    public Student(){
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
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
        Student student1 = new Student("Pavi", 21,"A");
        Student student2 = new Student("Gokul",23,"O");
        Student student3 = new Student("Prabha",21,"B");
        Student student4 = new Student("Vignesh",21,"O");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);


    }
}
