package in.co.nmsworks.week4.day1;

public class Student {
    private Integer id;
    private String name;
    private Integer mathMark;
    private Integer englishMark;
    private Integer scienceMark;
    private Integer historyMark;

    public Student(Integer id, String name, Integer mathMark, Integer englishMark, Integer scienceMark, Integer historyMark) {
        this.id = id;
        this.name = name;
        this.mathMark = mathMark;
        this.englishMark = englishMark;
        this.scienceMark = scienceMark;
        this.historyMark = historyMark;
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

    public Integer getMathMark() {
        return mathMark;
    }

    public void setMathMark(Integer mathMark) {
        this.mathMark = mathMark;
    }

    public Integer getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(Integer englishMark) {
        this.englishMark = englishMark;
    }

    public Integer getScienceMark() {
        return scienceMark;
    }

    public void setScienceMark(Integer scienceMark) {
        this.scienceMark = scienceMark;
    }

    public Integer getHistoryMark() {
        return historyMark;
    }

    public void setHistoryMark(Integer historyMark) {
        this.historyMark = historyMark;
    }
}
