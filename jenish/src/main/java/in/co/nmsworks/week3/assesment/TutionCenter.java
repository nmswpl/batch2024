package in.co.nmsworks.week3.assesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TutionCenter {
    private String branchName;
    private String branchCode;
    private String subject;
    private int noOfStudents;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public void tutionCenterMap() {

        List<String> chennaiSubList = new ArrayList<>();
        chennaiSubList.add("Physics");
        chennaiSubList.add("Maths");
        chennaiSubList.add("Chemistry");
        chennaiSubList.add("Biology");
        chennaiSubList.add("Hindi");

        List<String> salemSubList = new ArrayList<>();
        salemSubList.add("Physics");
        salemSubList.add("Chemistry");
        salemSubList.add("Maths");
        salemSubList.add("Biology");

        List<String> maduraiSubList = new ArrayList<>();
        maduraiSubList.add("Physics");
        maduraiSubList.add("Chemistry");
        maduraiSubList.add("Biology");
        maduraiSubList.add("Maths");

        Map<String, List<String>> tutionCenter = new HashMap<>();
        tutionCenter.put("Chennai", chennaiSubList);
        tutionCenter.put("Salem", salemSubList);
        tutionCenter.put("Madurai", maduraiSubList);
        System.out.println(tutionCenter);

        Map<String, Integer> tutionCenter1 = new HashMap<>();
        tutionCenter1.put("CH01",180);
        tutionCenter1.put("SA01",130);
        tutionCenter1.put("MA01",120);
        System.out.println(tutionCenter1);
    }
}