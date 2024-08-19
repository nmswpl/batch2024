package in.co.nmsworks.week3.assesment;


import java.util.*;

/**
 * /**
 *  * Create a class TuitonCenter for the following data. TutionCenter must have a Map
 *  *
 *  * +----------------------------------------------------------------+
 *  * | Branch Name	|  Branch Code	| Subject	| No Of Students |
 *  |Chennai	| CH01		| Physics	|	30	 |
 * |Salem		| SA01		| Physics	|	25	 |
 * |Madurai	| MD01		| Physics	|	    20	 |
 * |Chennai	| CH01		| Chemistry	|	    40	 |
 * |Salem		| SA01		| Chemistry	|	35	 |
 * |Madurai	| MD01		| Chemistry	|	    30	 |
 * |Chennai	| CH01		| Biology	|	    50	 |
 * |Salem		| SA01		| Biology	|	30	 |
 * |Madurai	| MD01		| Biology	|	    40	 |
 * |Chennai	| CH01		| Maths		|	    40	 |
 * |Salem		| SA01		| Maths		|	40	 |
 * |Madurai	| MD01		| Maths		|	    30	 |
 * |Chennai	| CH01		| Hindi		|	    20	 |
 *  */


public class Runner4 {
    public static void main(String[] args) {
        Map<String,Set<TutionCenter>> tutionCenterMap = new HashMap<>();
        TutionCenter cho1_01 = new TutionCenter("Chennai","CH01","Physics",30);
        TutionCenter sa01_01 = new TutionCenter("Salem","SA01","Physics",25);
        TutionCenter md01_01 = new TutionCenter("Madurai","MD01","Physics",20);
        TutionCenter ch01_02= new TutionCenter("Chennai","CH01","Chemistry",40);
        TutionCenter sa01_02 = new TutionCenter("Salem","SA01","Chemistry",35);
        TutionCenter md01_02 = new TutionCenter("Madurai","MD01","Chemistry",30);
        TutionCenter ch01_03 = new TutionCenter("Chennai","CH01","Biology",50);
        TutionCenter sa01_03 = new TutionCenter("Salem","SA01","Biology",30);
        TutionCenter md01_03 = new TutionCenter("Madurai","MD01","Biology",40);
        TutionCenter ch01_04 = new TutionCenter("Chennai","CH01","Maths",40);
        TutionCenter sa01_04 = new TutionCenter("Salem","SA01","Maths",40);
        TutionCenter md01_04 = new TutionCenter("Madurai","MD01","Maths",30);
        TutionCenter ch01_05 = new TutionCenter("Chennai","CH01","Hindi",20);

        TutionCenter[] tutionCenters = {cho1_01,ch01_02,ch01_03,ch01_04,ch01_05,sa01_01,sa01_02,sa01_03,sa01_04,md01_01,md01_02,md01_03,md01_04};
        Runner4 runner4 = new Runner4();
        runner4.addTutionCenterMap(tutionCenterMap,tutionCenters);
        runner4.displayDetails(tutionCenterMap);
    }
    public void addTutionCenterMap(Map<String, Set<TutionCenter>> tutionCenterMap, TutionCenter[] tutionCenters){
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
            System.out.println(value+" ::");
            for (TutionCenter values : tutionCenterMap.get(value)){
                System.out.println("BranchName : "+values.getBranchName()+ "\nBranchCode : "+values.getBranchCode()+"\nSubject : "+values.getSubject()+"\nNo of Students : "+values.getNoOfStudent()+"\n");
            }
        }
    }

}
