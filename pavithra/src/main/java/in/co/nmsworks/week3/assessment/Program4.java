package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a class TuitonCenter for the following data. TutionCenter must have a Map
 *
 * +----------------------------------------------------------------+
 * | Branch Name	|  Branch Code	| Subject	| No Of Students |
 * +----------------------------------------------------------------+
 * |Chennai	| CH01		| Physics	|	30	 |
 * |Salem		| SA01		| Physics	|	25	 |
 * |Madurai	| MD01		| Physics	|	20	 |
 * |Chennai	| CH01		| Chemistry	|	40	 |
 * |Salem		| SA01		| Chemistry	|	35	 |
 * |Madurai	| MD01		| Chemistry	|	30	 |
 * |Chennai	| CH01		| Biology	|	50	 |
 * |Salem		| SA01		| Biology	|	30	 |
 * |Madurai	| MD01		| Biology	|	40	 |
 * |Chennai	| CH01		| Maths		|	40	 |
 * |Salem		| SA01		| Maths		|	40	 |
 * |Madurai	| MD01		| Maths		|	30	 |
 * |Chennai	| CH01		| Hindi		|	20	 |
 * +----------------------------------------------------------------+
 */

public class Program4 {

    String branchName;
    String branchCode;
    String subject;
    int noOfStudent;


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

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public Program4(String branchName, String branchCode, String subject, int noOfStudent) {
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.subject = subject;
        this.noOfStudent = noOfStudent;
    }
}
