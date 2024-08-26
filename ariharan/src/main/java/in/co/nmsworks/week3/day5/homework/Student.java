package in.co.nmsworks.week3.day5.homework;

public class Student {
    //    Create a POJO class for Student with attributes `name`, `age`, and `grade`.
    private String name;
    private int age;
    private String Grade;

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
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Grade='" + Grade + '\'' +
                '}';
    }
}
