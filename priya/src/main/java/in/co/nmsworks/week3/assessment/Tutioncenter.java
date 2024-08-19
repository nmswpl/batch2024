package in.co.nmsworks.week3.assessment;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tutioncenter {
    public  Tutioncenter(){

    }

    public Tutioncenter(String branchname, String branchCode) {
        this.branchname = branchname;
        this.branchCode = branchCode;
    }

    private String branchname;
    private String branchCode;
    private   Map<String,Integer> subToStudentCount = new HashMap<>();

    public Map<String, Integer> getSubToStudentCount() {
        return subToStudentCount;
    }

    public void setSubToStudentCount(Map<String, Integer> subToStudentCount) {
        this.subToStudentCount = subToStudentCount;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
    public Set<String> getSubjects(){
        return subToStudentCount.keySet();
    }
    public  int getTotalStudents(){
        int totalStudents =0;
        for(Integer value : subToStudentCount.values()){
            totalStudents+=value;
        }
        return totalStudents;
    }

    @Override
    public String toString() {
        return "Tutioncenter{" +
                "branchname='" + branchname + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", subToStudentCount=" + subToStudentCount +
                '}';
    }

    public static void main(String[] args) {
        Tutioncenter chennaicenter = new Tutioncenter("Chennai","CH01");
        Tutioncenter salemcenter = new Tutioncenter("Salem","SA01");
        Tutioncenter maduraicenter = new Tutioncenter("Madurai","MD01");
        chennaicenter.subToStudentCount.put("Physics",30);
        chennaicenter.subToStudentCount.put("Chemistry",40);
        chennaicenter.subToStudentCount.put("Biology",50);
        chennaicenter.subToStudentCount.put("Maths",40);
        chennaicenter.subToStudentCount.put("Hindi",20);
        salemcenter.subToStudentCount.put("Physics",25);
        salemcenter.subToStudentCount.put("Chemistry",35);
        salemcenter.subToStudentCount.put("Biology",30);
        salemcenter.subToStudentCount.put("Maths",40);
        maduraicenter.subToStudentCount.put("Physics",20);
        maduraicenter.subToStudentCount.put("Chemistry",30);
        maduraicenter.subToStudentCount.put("Biology",40);
        maduraicenter.subToStudentCount.put("Maths",30);
        System.out.println(chennaicenter);
        System.out.println(salemcenter);
        System.out.println(maduraicenter);
        System.out.println(chennaicenter.getSubjects());
        System.out.println(maduraicenter.getSubjects());
        System.out.println(salemcenter.getSubjects());
        System.out.println( chennaicenter.getTotalStudents());
        System.out.println( salemcenter.getTotalStudents());
        System.out.println( maduraicenter.getTotalStudents());



    }
}

