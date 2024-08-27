package in.co.nmsworks.week4.day1;

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
        this.english = english;
        this.history = history;
        this.id = id;
        this.math = math;
        this.name = name;
        this.science = science;
    }


    public int getEnglish() {

        return english;
    }

    public void setEnglish(int english) {

        this.english = english;
    }

    public int getHistory() {

        return history;
    }

    public void setHistory(int history) {

        this.history = history;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getMath() {

        return math;
    }

    public void setMath(int math) {

        this.math = math;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getScience() {

        return science;
    }

    public void setScience(int science) {

        this.science = science;
    }

    @Override
    public String toString() {
        return "Student{" +
                "english=" + english +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", math=" + math +
                ", science=" + science +
                ", history=" + history +
                '}';
    }
}
