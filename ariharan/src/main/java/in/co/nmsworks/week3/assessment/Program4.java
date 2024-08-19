package in.co.nmsworks.week3.assessment;


import java.util.HashMap;
import java.util.Map;

//Create a class TuitonCenter for the following data. TutionCenter must have a Map
//
//+----------------------------------------------------------------+
//        | Branch Name	|  Branch Code	| Subject	| No Of Students |
//        +----------------------------------------------------------------+
//        |Chennai	| CH01		| Physics	|	30	 |
//        |Salem		| SA01		| Physics	|	25	 |
//        |Madurai	| MD01		| Physics	|	20	 |
//        |Chennai	| CH01		| Chemistry	|	40	 |
//        |Salem		| SA01		| Chemistry	|	35	 |
//        |Madurai	| MD01		| Chemistry	|	30	 |
//        |Chennai	| CH01		| Biology	|	50	 |
//        |Salem		| SA01		| Biology	|	30	 |
//        |Madurai	| MD01		| Biology	|	40	 |
//        |Chennai	| CH01		| Maths		|	40	 |
//        |Salem		| SA01		| Maths		|	40	 |
//        |Madurai	| MD01		| Maths		|	30	 |
//        |Chennai	| CH01		| Hindi		|	20	 |
public class Program4 {

    public void tutionCenter(){
        TutionCenter t1=new TutionCenter();
        t1.setBranchName("chennai");
        Map<String,Integer> subjectWithStudents=new HashMap<>();
        subjectWithStudents.put("physics",30);
        subjectWithStudents.put("chemistry",40);
        subjectWithStudents.put("biology",50);
        subjectWithStudents.put("maths",40);
        subjectWithStudents.put("hindi",20);
        t1.setBranchcode("CH01");
        t1.setSubjectwithStudents(subjectWithStudents);


        TutionCenter t2=new TutionCenter();
        t2.setBranchName("madurai");
        Map<String,Integer> subjectWithStudentsMadurai=new HashMap<>();
        subjectWithStudentsMadurai.put("physics",20);
        subjectWithStudentsMadurai.put("chemistry",30);
        subjectWithStudentsMadurai.put("biology",40);
        subjectWithStudentsMadurai.put("maths",30);
        t2.setBranchcode("MD01");
        t2.setSubjectwithStudents(subjectWithStudentsMadurai);

        TutionCenter t3=new TutionCenter();
        t3.setBranchName("Salem");
        Map<String,Integer> subjectWithStudentsSalem=new HashMap<>();
        subjectWithStudentsSalem.put("physics",25);
        subjectWithStudentsSalem.put("chemistry",35);
        subjectWithStudentsSalem.put("biology",30);
        subjectWithStudentsSalem.put("maths",40);
        t3.setBranchcode("SA0101");
        t3.setSubjectwithStudents(subjectWithStudentsSalem);

        System.out.println("branch Name = "+t1.getBranchName()+"\nBrand Code = "+t1.getBranchcode()+"\nSubjects With Students = "+t1.getSubjectwithStudents());
        System.out.println("branch Name = "+t2.getBranchName()+"\nBrand Code = "+t2.getBranchcode()+"\nSubjects With Students = "+t2.getSubjectwithStudents());
        System.out.println("branch Name = "+t3.getBranchName()+"\nBrand Code = "+t3.getBranchcode()+"\nSubjects With Students = "+t3.getSubjectwithStudents());


    }

}
