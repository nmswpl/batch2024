package in.co.nmsworks.week3.assesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public static void main(String[] args) {
        Map<String, List<String[]>> tutioncenters = new HashMap<>();

        String[][] data = new String[][]{
                {"Chennai", "CH01", "Physics", "30"},
                {"Salem", "SA01", "Physics", "30"},
                {"Madurai", "MD01", "Physics", "20"},
                {"Chennai", "CH01", "Chemistry", "40"},
                {"Salem", "SA01", "Chemistry", "35"},
                {"Madurai", "MD01", "Chemistry", "30"},
                {"Chennai", "CH01", "Biology", "50"},
                {"Salem", "SA01", "Biology", "30"},
                {"Madurai", "MD01", "Biology", "40"},
                {"Chennai", "CH01", "Maths", "40"},
                {"Salem", "SA01", "Maths", "40"},
                {"Madurai", "MD01", "Maths", "30"},
                {"Chennai", "CH01", "Hindi", "20"}
        };

        List<String[]> details = new ArrayList<>();

        for (String[] s : data) {
            String key = s[1];
            if (tutioncenters.containsKey(key)) {
                details = tutioncenters.get(key);
                details.add(s);
            }

            else {
                details = new ArrayList<>();
                details.add(s);
            }
            tutioncenters.put(key, details);

        }

        System.out.println(details);
        System.out.println(tutioncenters.get("CH01"));
    }

}
