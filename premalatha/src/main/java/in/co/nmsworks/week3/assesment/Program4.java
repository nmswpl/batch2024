package in.co.nmsworks.week3.assesment;
/*
Create a class TutionCenter for the following data. TutionCenter must have a Map

+----------------------------------------------------------------+
| Branch Name	|  Branch Code	| Subject	| No Of Students |
+----------------------------------------------------------------+
|Chennai	| CH01		| Physics	|	30	 |
|Salem		| SA01		| Physics	|	25	 |
|Madurai	| MD01		| Physics	|	20	 |
|Chennai	| CH01		| Chemistry	|	40	 |
|Salem		| SA01		| Chemistry	|	35	 |
|Madurai	| MD01		| Chemistry	|	30	 |
|Chennai	| CH01		| Biology	|	50	 |
|Salem		| SA01		| Biology	|	30	 |
|Madurai	| MD01		| Biology	|	40	 |
|Chennai	| CH01		| Maths		|	40	 |
|Salem		| SA01		| Maths		|	40	 |
|Madurai	| MD01		| Maths		|	30	 |
|Chennai	| CH01		| Hindi		|	20	 |
+----------------------------------------------------------------+
 */

import java.util.*;

public class Program4 {
    public void tutionCenter(){
        List<String> branchName = new ArrayList<>();
        branchName.add("Chennai");
        branchName.add("Salem");
        branchName.add("Madurai");


        List<String> subjects = new ArrayList<>();
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("Maths");
        subjects.add("Hindi");

        List<String> noOfStudents = new ArrayList<>();
        noOfStudents.add("30");
        noOfStudents.add("25");
        noOfStudents.add("20");
        noOfStudents.add("40");
        noOfStudents.add("35");
        noOfStudents.add("30");
        noOfStudents.add("50");
        noOfStudents.add("30");
        noOfStudents.add("40");
        noOfStudents.add("40");
        noOfStudents.add("40");
        noOfStudents.add("30");
        noOfStudents.add("20");


        Map<String,List<String>> tutionCenter= new HashMap<>();
        tutionCenter.put("CH01", Collections.singletonList(branchName.get(0)));
        tutionCenter.put("SA01", Collections.singletonList(branchName.get(1)));
        tutionCenter.put("MA01", Collections.singletonList(branchName.get(2)));
        tutionCenter.put("CH01", Collections.singletonList(subjects.get(0)));
        tutionCenter.put("SA01", Collections.singletonList(subjects.get(1)));
        tutionCenter.put("MA01", Collections.singletonList(subjects.get(2)));

        System.out.println(tutionCenter);


    }

}
