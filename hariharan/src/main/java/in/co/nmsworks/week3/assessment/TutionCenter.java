package in.co.nmsworks.week3.assessment;

import java.util.*;

//Create a class TuitonCenter for the following data. TutionCenter must have a Map

public class TutionCenter {

    String branchName;
    String branchCode;


    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    String[] subject;
    Integer numberOfStudents;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }


    @Override
    public String toString() {
        return "TutionCenter{" +
                "branchName='" + branchName + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", subject=" + Arrays.toString(subject) +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public TutionCenter(){

        List<String> chennaiSubject = new ArrayList<>();
        chennaiSubject.addAll(Arrays.asList("Physics","Chemistry","Biology","Maths","Hindhi"));

        List<String> salemSubject = new ArrayList<>();
        salemSubject.addAll(Arrays.asList("Physics","Chemistry","Biology","Maths"));

        List<String> maduraiSubjects = new ArrayList<>();
        maduraiSubjects.addAll(Arrays.asList("Physics","Chemistry","Biology","Maths"));


        Map<String, List> mapOfTutuion = new HashMap<>();
        mapOfTutuion.put("CH01",chennaiSubject);
        mapOfTutuion.put("SA01",salemSubject);
        mapOfTutuion.put("MD01",maduraiSubjects);

        System.out.println(mapOfTutuion);

    }


}
