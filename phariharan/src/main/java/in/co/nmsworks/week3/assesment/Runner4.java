package in.co.nmsworks.week3.assesment;


import java.util.*;

/**
 * /**
 *  * Create a class TuitonCenter for the following data. TutionCenter must have a Map
 *  *
 *  * +----------------------------------------------------------------+
 *  | Branch Name	|  Branch Code	| Subject	| No Of Students |
 *  |Chennai	    | CH01		| Physics	|	    30	 |
 *  |Salem		    | SA01		| Physics	|	    25	 |
 *  |Madurai	    | MD01		| Physics	|	    20	 |
 *  |Chennai	    | CH01		| Chemistry	|	    40	 |
 *  |Salem	    	| SA01		| Chemistry	|	    35	 |
 *  |Madurai 	    | MD01		| Chemistry	|	    30	 |
 *  |Chennai	    | CH01		| Biology	|	    50	 |
 *  |Salem		    | SA01		| Biology	|	    30	 |
 *  |Madurai	    | MD01		| Biology	|	    40	 |
 *  |Chennai	    | CH01		| Maths		|	    40	 |
 *  |Salem	    	| SA01		| Maths		|   	40	 |
 *  |Madurai 	    | MD01		| Maths		|	    30	 |
 *  |Chennai     	| CH01		| Hindi		|	    20	 |
 *  */


public class Runner4 {
    public static void main(String[] args) {
        Map<String,Set<TutionCenter>> tutionCenterMap = new HashMap<>();
        TutionCenter cho1_01 = new TutionCenter("Chennai","CH01");
        TutionCenter sa01_01 = new TutionCenter("Salem","SA01");
        TutionCenter md01_01 = new TutionCenter("Madurai","MD01");

        sa01_01.setNoOfStudentPerSubjects("Physics",25);
        sa01_01.setNoOfStudentPerSubjects("Chemistry",35);
        sa01_01.setNoOfStudentPerSubjects("Biology",30);
        sa01_01.setNoOfStudentPerSubjects("Maths",40);
        md01_01.setNoOfStudentPerSubjects("Physics",20);
        md01_01.setNoOfStudentPerSubjects("Chemistry",30);
        md01_01.setNoOfStudentPerSubjects("Biology",40);
        md01_01.setNoOfStudentPerSubjects("Maths",30);
        cho1_01.setNoOfStudentPerSubjects("Physics",30);
        cho1_01.setNoOfStudentPerSubjects("Chemistry",40);
        cho1_01.setNoOfStudentPerSubjects("Biology",50);
        cho1_01.setNoOfStudentPerSubjects("Maths",40);
        cho1_01.setNoOfStudentPerSubjects("Hindi",20);

        TutionCenter[] tuitionCenters = {cho1_01,sa01_01,md01_01};
        Runner4 runner4 = new Runner4();
        runner4.addTuitionCenterMap(tutionCenterMap,tuitionCenters);
        runner4.displayDetails(tutionCenterMap);
    }
    public void addTuitionCenterMap(Map<String, Set<TutionCenter>> tutionCenterMap, TutionCenter[] tutionCenters){
        for(TutionCenter value : tutionCenters){
            if (tutionCenterMap.containsKey(value.getBranchCode())){
                tutionCenterMap.get(value.getBranchCode()).add(value);
            }
            else {
                Set<TutionCenter> tutionCenterSet = new HashSet<>();
                tutionCenterSet.add(value);
                tutionCenterMap.put(value.getBranchCode(),tutionCenterSet);
            }
        }
    }
    public void displayDetails(Map<String, Set<TutionCenter>> tutionCenterMap){
        for(String value : tutionCenterMap.keySet()){
            System.out.println();
            System.out.println(value+" ::\n------------------");
            for (TutionCenter values : tutionCenterMap.get(value)){
                System.out.println("BranchName : "+values.getBranchName()+ "\nBranchCode : "+values.getBranchCode());
                values.getNoOfStudentPerSubjects();
            }
        }
    }
}
