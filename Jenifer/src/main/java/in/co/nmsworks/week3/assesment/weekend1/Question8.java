package in.co.nmsworks.week3.assesment.weekend1;
/* Write a method that processes a `Map<String, String>` and
returns a new map where all null values are replaced with the string "Unknown".
 */

import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public void replaceNullValuesInMap(){
        Map<String,String> nameAndDepartment = new HashMap<>();
        nameAndDepartment.put("Raji","CSE");
        nameAndDepartment.put("Prema",null);
        nameAndDepartment.put("Nasi","IT");
        nameAndDepartment.put("Dharani","IT");
        nameAndDepartment.put("Jeni",null);

        Map<String,String> namesAndItsValue = new HashMap<>();
        for (Map.Entry<String,String> entry : nameAndDepartment.entrySet())
        {
            entry.getKey();
            String value = entry.getValue();
            if(value == null)
                value = "Unknown";
            namesAndItsValue.put(entry.getKey(),value);
        }
        System.out.println(namesAndItsValue);
    }
}
