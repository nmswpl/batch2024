package in.co.nmsworks.week4;

public class Student {
    private int id;
    private String name;
    private int maths;
    private int english;
    private int science;
    private int history;

    public Student(int id, String name, int maths, int english, int science, int history) {
        this.id = id;
        this.name = name;
        this.maths = maths;
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

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
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
}

