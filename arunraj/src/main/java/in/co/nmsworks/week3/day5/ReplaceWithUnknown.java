package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;

/***Question-8:** Write a method that processes a `Map<String, String>` and returns

a new map where all null values are replaced with the string "Unknown".
 **Challenge:** Ensure that the original map is not modified during processing.*/

public class ReplaceWithUnknown {
    public static void main(String[] args) {
        ReplaceWithUnknown re = new ReplaceWithUnknown();
        re.replaceUnknown();
    }
    public void replaceUnknown(){
        Map<String,String> names = new HashMap<>();
        names.put("Messi",null);
        names.put("Ronaldo","AlNassar");
        names.put("Neymar","AlHilal");
        names.put("Kane",null);
        Map<String,String> newNames = new HashMap<>();

        for (String name : names.keySet()){
            if(name == null){
                newNames.put("","unknown");
            }
        }

    }
}
