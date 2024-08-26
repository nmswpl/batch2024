package in.co.nmsworks.week4.day1;

public class Student {
    private Integer id;
    private String name;
    private Integer maths;
    private Integer english;
    private Integer science;
    private Integer history;

    public Student(Integer id, String name, Integer maths, Integer english, Integer science, Integer history) {
        this.id = id;
        this.name = name;
        this.maths = maths;
        this.english = english;
        this.science = science;
        this.history = history;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }
}
