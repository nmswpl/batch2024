package in.co.nmsworks.week3.assesment;

import java.util.*;

/*
4) Create a class TuitonCenter for the following data. TutionCenter must have a Map

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
has context menu
 */
public class TutionCenter {
    private String branchName;
    private String branchCode;
    private Map<String, Integer> subjectsToStudentCount = new HashMap<>();

    public TutionCenter(String branchName, String branchCode) {
        this.branchName = branchName;
        this.branchCode = branchCode;
    }

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

    public Map<String, Integer> getSubjectsToStudentCount() {
        return subjectsToStudentCount;
    }

    public void setSubjectsToStudentCount(Map<String, Integer> subjectsToStudentCount) {
        this.subjectsToStudentCount = subjectsToStudentCount;
    }

    @Override
    public String toString() {
        return "TutionCenter{" +
                "branchName='" + branchName + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", subjectsToStudentCount=" + subjectsToStudentCount +
                '}';
    }
}
