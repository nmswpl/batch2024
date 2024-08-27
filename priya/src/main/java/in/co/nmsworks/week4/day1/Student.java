package in.co.nmsworks.week4.day1;

public class Student {
    private  String name;
    private  int id;
    private int mathMark;
    private int scienceMark;
    private int englishMark;
    private int historyMark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public int getScienceMark() {
        return scienceMark;
    }

    public void setScienceMark(int scienceMark) {
        this.scienceMark = scienceMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public void setHistoryMark(int historyMark) {
        this.historyMark = historyMark;
    }

    public Student( int id,String name, int mathMark, int scienceMark, int englishMark, int historyMark) {
        this.name = name;
        this.id = id;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.englishMark = englishMark;
        this.historyMark = historyMark;
    }


    public Student() {
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mathMark=" + mathMark +
                ", scienceMark=" + scienceMark +
                ", englishMark=" + englishMark +
                ", historyMark=" + historyMark +
                '}';
    }


}
