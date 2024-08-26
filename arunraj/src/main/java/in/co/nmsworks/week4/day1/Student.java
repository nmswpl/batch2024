package in.co.nmsworks.week4.day1;

public class Student {
    private int id;
    private String name;
    private int mathMark;
    private int englishMark;
    private int scienceMark;
    private int historyMark;

    public Student(int id, String name, int mathMark,
                   int englishMark, int scienceMark, int historyMark) {
        this.id = id;
        this.name = name;
        this.mathMark = mathMark;
        this.englishMark = englishMark;
        this.scienceMark = scienceMark;
        this.historyMark = historyMark;
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

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    public int getScienceMark() {
        return scienceMark;
    }

    public void setScienceMark(int scienceMark) {
        this.scienceMark = scienceMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public void setHistoryMark(int historyMark) {
        this.historyMark = historyMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mathMark=" + mathMark +
                ", englishMark=" + englishMark +
                ", scienceMark=" + scienceMark +
                ", historyMark=" + historyMark +
                '}';
    }
}
