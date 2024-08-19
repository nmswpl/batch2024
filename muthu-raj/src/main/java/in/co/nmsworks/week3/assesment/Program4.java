package in.co.nmsworks.week3.assesment;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
    public static void main(String[] args) {
        TutionCenter chnTutionCenter = new TutionCenter("Chennai", "CH01");
        TutionCenter salTutionCenter =  new TutionCenter("Salem","SA01");
        TutionCenter madTutionCenter = new TutionCenter("Madurai","MD01");

        Map<String,Integer> chnSubjectsAndStudents = new HashMap<>();
        chnSubjectsAndStudents.put("Physics",30);
        chnSubjectsAndStudents.put("Chemistry",40);
        chnSubjectsAndStudents.put("Maths",40);
        chnSubjectsAndStudents.put("Biology",50);
        chnSubjectsAndStudents.put("Hindi",20);

        chnTutionCenter.setSubjectsToStudentCount(chnSubjectsAndStudents);

        Map<String,Integer> salSubjectsAndStudents = new HashMap<>();
        salSubjectsAndStudents.put("Physics",30);
        salSubjectsAndStudents.put("Chemistry",40);
        salSubjectsAndStudents.put("Maths",40);
        salSubjectsAndStudents.put("Biology",50);

        salTutionCenter.setSubjectsToStudentCount(salSubjectsAndStudents);

        Map<String,Integer> madSubjectsAndStudents = new HashMap<>();
        madSubjectsAndStudents.put("Physics",30);
        madSubjectsAndStudents.put("Chemistry",40);
        madSubjectsAndStudents.put("Maths",40);
        madSubjectsAndStudents.put("Biology",50);

        madTutionCenter.setSubjectsToStudentCount(madSubjectsAndStudents);


        System.out.println(chnTutionCenter);
        System.out.println(madTutionCenter);
        System.out.println(salTutionCenter);

        getSubjects(salTutionCenter);
        getTotalStudents(chnTutionCenter);
    }

    static void getSubjects(TutionCenter branch){
        System.out.println(branch.getSubjectsToStudentCount().keySet());
    }

    static void getTotalStudents(TutionCenter branch){

        int total = 0;

        for (Integer eachSubjectStrength : branch.getSubjectsToStudentCount().values()){
            total += eachSubjectStrength;
        }
        System.out.println(total);
    }

}
