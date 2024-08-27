package in.co.nmsworks.week4;

public class Student{
    private Integer id;
    private String name;
    private Integer english;
    private Integer maths;
    private Integer history;
    private Integer science;

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

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", english=" + english +
                ", maths=" + maths +
                ", history=" + history +
                ", science=" + science +
                '}';
    }

    public Student(Integer id, String name, Integer english, Integer maths, Integer science, Integer history){
        this.id = id;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.history = history;
    }








































    /*public void highestScoreEnglish(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getEnglish() > max){
                max = student.getEnglish();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getEnglish()){
                System.out.println(student);
            }
        }
    }

    public void highestScoreMath(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getMaths() > max){
                max = student.getMaths();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getMaths()){
                System.out.println(student);
            }
        }
    }

    public void highestScoreScience(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getScience() > max){
                max = student.getScience();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getScience()){
                System.out.println(student);
            }
        }
    }

    public void highestScoreHistory(){
        int max = 0;
        for(Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getHistory() > max){
                max = student.getHistory();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getHistory() == max){
                System.out.println(student);
            }
        }
    }*/
}
