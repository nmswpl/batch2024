package in.co.nmsworks.week3.assessment;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        //Question 1
        TestExercise1 testExersice1 = new TestExercise1();

        //Question  2
        TestExersice2 testExersice2 = new TestExersice2();

        //Question 3
        TestExersice3 testExersice3 = new TestExersice3();


        //Question 4
     Map<String,Integer> chennaisubjecToStudents = new HashMap<>();
     chennaisubjecToStudents.put("Physics",30);
     chennaisubjecToStudents.put("Chemistry",40);
     chennaisubjecToStudents.put("Biology",50);
     chennaisubjecToStudents.put("Maths",40);
     chennaisubjecToStudents.put("Hindi",20);

     Map<String,Integer> maduraisubjecToStudents = new HashMap<>();
     maduraisubjecToStudents.put("Physics",20);
     maduraisubjecToStudents.put("Chemistry",30);
     maduraisubjecToStudents.put("Biology",40);
     maduraisubjecToStudents.put("Maths",30);

     Map<String,Integer> salemsubjecToStudents = new HashMap<>();
     salemsubjecToStudents.put("Physics",25);
     salemsubjecToStudents.put("Chemistry",35);
     salemsubjecToStudents.put("Biology",30);
     salemsubjecToStudents.put("Maths",40);


     TutionCenter chennaiTutionCenter = new TutionCenter("Chennai","CH01");
     chennaiTutionCenter.setSubjectToStudents(chennaisubjecToStudents);

     TutionCenter salemTutionCenter = new TutionCenter("Salem","SA01");
     salemTutionCenter.setSubjectToStudents(salemsubjecToStudents);

     TutionCenter maduraiTutionCenter = new TutionCenter("Madurai","MD01");
     maduraiTutionCenter.setSubjectToStudents(maduraisubjecToStudents);

     System.out.println(chennaiTutionCenter.getSubjectToStudents().get("Chemistry"));



    }
}
