package in.co.nmsworks.week4.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class StudentAdministrator
{
    List<Student> studentList = new ArrayList<Student>();
    Map<Integer,Student> studentDataMap = new HashMap<Integer,Student>();


    public StudentAdministrator() {
      getStudentFromDB();
        for (Student student : studentList) {
            studentDataMap.put(student.getId(), student);
        }
    }

    public static void main(String[] args) {
       StudentAdministrator student = new StudentAdministrator();
       student.addStudent("Hariharan",90,96,95,94);
       student.updateMark("Kumar","Maths",88);
       System.out.println("\n");
       student.removeStudent("English", 75);
       System.out.println("\n");
       Student studentwithMaximumScore = student.findMaximumScore("Science");
       System.out.println("ID:"+studentwithMaximumScore.getId()+"\n" + "Name:"+ studentwithMaximumScore.getName() + "\n");
       System.out.println("Students with more then or equal to threshold:");
       System.out.println(student.getStudentData("History", 80));
       System.out.println("\n");
       System.out.println("Students Name:");
       System.out.println(student.getStudentnames());
       System.out.println("\n");
       student.checkExistence("Alice Brown", "Maths", 95);
       System.out.println("\n");
       student.mergeMap();
       System.out.println("\n");
        System.out.println("Each Score Count:");

        System.out.println(student.countScore("Maths"));

    }

    public List<Student> getStudentFromDB(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Students ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                studentList.add(new Student(resultSet.getInt(1), resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4),resultSet.getInt(5),resultSet.getInt(6)));
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return studentList;
    }

    public void addStudent(String name,int mathMark, int englishMark, int scienceMark, int historyMark){
        Student student = new Student(studentList.size()+1, name,mathMark,englishMark,scienceMark,historyMark);
        System.out.println("After adding student");
        studentDataMap.put(studentDataMap.size()+1, student);


    }

    public void updateMark(String name, String subject, int mark){
        boolean flag = false;
        for(Integer studentId: studentDataMap.keySet()){
            if(studentDataMap.get(studentId).getName().equals(name)){
               if(subject.equalsIgnoreCase("maths")){
                   Student student =studentDataMap.get(studentId);
                   student.setMathMark(mark);
                   studentDataMap.put(studentId,student);
                   flag = true;
               } else if(subject.equalsIgnoreCase("english")){
                   Student student =studentDataMap.get(studentId);
                   student.setEnglishMark(mark);
                   studentDataMap.put(studentId,student);
                   flag = true;
               } else if(subject.equalsIgnoreCase("history")){
                   Student student =studentDataMap.get(studentId);
                   student.setHistoryMark(mark);
                   studentDataMap.put(studentId,student);
                   flag = true;
               }else if(subject.equalsIgnoreCase("science")){
                   Student student =studentDataMap.get(studentId);
                   student.setScienceMark(mark);
                   studentDataMap.put(studentId,student);
                   flag = true;
               }else{
                   System.out.println("Enter the correct subject");
               }
            }
        }
        if (!flag) {
            Student student = new Student(studentDataMap.size()+1, name,mark,mark,mark,mark);
            studentDataMap.put(studentDataMap.size()+1, student);
        }
        System.out.println("After Updating student");
        System.out.println(studentDataMap);
    }

    public void removeStudent(String subject, Integer mark){

        Iterator<Map.Entry<Integer, Student>> iterator = studentDataMap.entrySet().iterator();
        if(subject.equalsIgnoreCase("maths")){
           while (iterator.hasNext()){
               Map.Entry<Integer, Student> entry = iterator.next();
               if(entry.getValue().getMathMark() < mark){
                   iterator.remove();
               }
           }
        } else if (subject.equalsIgnoreCase("english")) {
            while (iterator.hasNext()){
                Map.Entry<Integer, Student> entry = iterator.next();
                if(entry.getValue().getEnglishMark() < mark){
                    iterator.remove();
                }
            }
        } else if (subject.equalsIgnoreCase("science")) {
            while (iterator.hasNext()){
                Map.Entry<Integer, Student> entry = iterator.next();
                if(entry.getValue().getScienceMark() < mark){
                    iterator.remove();
                }
            }
        } else if (subject.equalsIgnoreCase("history")) {
            while (iterator.hasNext()){
                Map.Entry<Integer, Student> entry = iterator.next();
                if(entry.getValue().getHistoryMark() < mark){
                    iterator.remove();
                }
            }
        }else{
            System.out.println("Invalid Subject");
        }
        System.out.println("After Removing Student:");
        System.out.println(studentDataMap);
    }

    public  Student findMaximumScore(String subject){
        Student maximumMarkStudent = null;
        int maximumScore = Integer.MIN_VALUE;
        if(subject.equalsIgnoreCase("maths")){
            for(Integer studentID : studentDataMap.keySet()){
               if(studentDataMap.get(studentID).getMathMark() > maximumScore){
                   maximumScore = studentDataMap.get(studentID).getMathMark();
                   maximumMarkStudent = studentDataMap.get(studentID);
               }
            }
        } else if (subject.equalsIgnoreCase("english")) {
            for(Integer studentID : studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getEnglishMark() > maximumScore){
                    maximumScore = studentDataMap.get(studentID).getEnglishMark();
                    maximumMarkStudent = studentDataMap.get(studentID);
                }
            }
        } else if (subject.equalsIgnoreCase("science")) {
            for(Integer studentID : studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getScienceMark() > maximumScore){
                    maximumScore = studentDataMap.get(studentID).getScienceMark();
                    maximumMarkStudent = studentDataMap.get(studentID);
                }
            }
        } else if (subject.equalsIgnoreCase("history")) {
            for(Integer studentID : studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getHistoryMark() > maximumScore){
                    maximumScore = studentDataMap.get(studentID).getHistoryMark();
                    maximumMarkStudent = studentDataMap.get(studentID);
                }
            }
        }

    return  maximumMarkStudent;
    }

    public Map<String, Integer> getStudentData(String subject, Integer mark){
        Map<String, Integer> studentThresholdMap = new HashMap<String, Integer>();
        if(subject.equalsIgnoreCase("maths")){
            for(Integer studentID : studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getMathMark() >= mark){
                    studentThresholdMap.put(studentDataMap.get(studentID).getName(), studentDataMap.get(studentID).getMathMark());
                }
            }
        } else if (subject.equalsIgnoreCase("english")) {
            for(Integer studentID : studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getEnglishMark() >= mark){
                    studentThresholdMap.put(studentDataMap.get(studentID).getName(), studentDataMap.get(studentID).getEnglishMark());
                }
            }
        } else if (subject.equalsIgnoreCase("science")) {
            for(Integer studentID : studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getScienceMark() >= mark){
                    studentThresholdMap.put(studentDataMap.get(studentID).getName(), studentDataMap.get(studentID).getScienceMark());
                }
            }
        } else if (subject.equalsIgnoreCase("history")) {
            for(Integer studentID : studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getHistoryMark() >= mark){
                    studentThresholdMap.put(studentDataMap.get(studentID).getName(), studentDataMap.get(studentID).getHistoryMark());
                }
            }
        }

        return  studentThresholdMap;
    }

    public Set<String> getStudentnames(){
        Set<String> studentnames = new HashSet<String>();
        for(Integer studentID : studentDataMap.keySet()){
            studentnames.add(studentDataMap.get(studentID).getName());
        }

        return  studentnames;
    }

    public void checkExistence(String name, String subject, Integer mark){
        if(subject.equalsIgnoreCase("maths")){
            for(Integer studentID: studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getMathMark() == mark && studentDataMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("english")) {
            for(Integer studentID: studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getEnglishMark() == mark && studentDataMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("science")) {
            for(Integer studentID: studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getScienceMark() == mark && studentDataMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("history")) {
            for(Integer studentID: studentDataMap.keySet()){
                if(studentDataMap.get(studentID).getHistoryMark() == mark && studentDataMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        }
    }

    public void mergeMap(){
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(54, new Student(54, "ravi", 90,88,87,98));
        studentMap.put(55, new Student(55, "jenish", 80,89,88,94));
        studentMap.put(56, new Student(56, "Muthu", 91,89,92,93));
        studentMap.put(5, new Student(5, "krishna", 95,84,88,91));

        studentDataMap.putAll(studentMap);
        System.out.println(studentDataMap);
    }

    public Map<Integer, Integer> countScore(String subject){
        Map<Integer,Integer> scoreCount = new HashMap<Integer,Integer>();
        if(subject.equalsIgnoreCase("maths")){
            for(Integer studentId : studentDataMap.keySet()){
                if(scoreCount.containsKey(studentDataMap.get(studentId).getMathMark())){
                    scoreCount.put(studentDataMap.get(studentId).getMathMark(), scoreCount.get(studentDataMap.get(studentId).getMathMark())+1);
                }else{
                    scoreCount.put(studentDataMap.get(studentId).getMathMark(), 1);
                }
            }
        }else if(subject.equalsIgnoreCase("english")){
            for(Integer studentId : studentDataMap.keySet()){
                if(scoreCount.containsKey(studentDataMap.get(studentId).getEnglishMark())){
                    scoreCount.put(studentDataMap.get(studentId).getEnglishMark(), scoreCount.get(studentDataMap.get(studentId).getEnglishMark())+1);
                }else{
                    scoreCount.put(studentDataMap.get(studentId).getEnglishMark(), 1);
                }
            }
        }else if(subject.equalsIgnoreCase("science")){
            for(Integer studentId : studentDataMap.keySet()){
                if(scoreCount.containsKey(studentDataMap.get(studentId).getScienceMark())){
                    scoreCount.put(studentDataMap.get(studentId).getScienceMark(), scoreCount.get(studentDataMap.get(studentId).getScienceMark())+1);
                }else{
                    scoreCount.put(studentDataMap.get(studentId).getScienceMark(), 1);
                }
            }
        }else if(subject.equalsIgnoreCase("history")){
            for(Integer studentId : studentDataMap.keySet()){
                if(scoreCount.containsKey(studentDataMap.get(studentId).getHistoryMark())){
                    scoreCount.put(studentDataMap.get(studentId).getHistoryMark(), scoreCount.get(studentDataMap.get(studentId).getHistoryMark())+1);
                }else{
                    scoreCount.put(studentDataMap.get(studentId).getHistoryMark(), 1);
                }
            }
        }

        return scoreCount;
    }
}
