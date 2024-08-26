package in.co.nmsworks.week4.day1;


public class Student {
    private int id;
    private String name;
    private int mathsMark;
    private int englishMark;
    private int scienceMark;
    private int history;

    public Student(int id, String name, int mathsMark, int englishMark, int scienceMark, int history) {
        this.id = id;
        this.name = name;
        this.mathsMark = mathsMark;
        this.englishMark = englishMark;
        this.scienceMark = scienceMark;
        this.history = history;
    }

    public  int getId() {
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

    public int getMathsMark() {
        return mathsMark;
    }

    public void setMathsMark(int mathsMark) {
        this.mathsMark = mathsMark;
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

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mathsMark=" + mathsMark +
                ", englishMark=" + englishMark +
                ", scienceMark=" + scienceMark +
                ", history=" + history +
                '}';
    }
}
