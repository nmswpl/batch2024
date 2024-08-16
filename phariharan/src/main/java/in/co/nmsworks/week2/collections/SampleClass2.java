package in.co.nmsworks.week2.collections;

import java.util.HashMap;
import java.util.Map;

public class SampleClass2 {
    public static void main(String[] args) {
        SampleClass2.setnameToId(nameToId,1,"Jeniffer" );
        SampleClass2.setnameToId(nameToId,2,"Premalatha" );
        SampleClass2.setnameToId(nameToId,3,"Aarthi" );
        SampleClass2.setnameToId(nameToId,4,"Madhumitha" );
        SampleClass2.setnameToId(nameToId,5,"Pavitra" );
        SampleClass2.setnameToId(nameToId,6,"Hariharan P" );
        SampleClass2.setnameToId(nameToId,7,"Krishna" );
        SampleClass2.setnameToId(nameToId,8,"Arun" );
        SampleClass2.setnameToId(nameToId,9,"Priyadharshini" );
        SampleClass2.setnameToId(nameToId,10,"Sujaritha" );
        SampleClass2.setnameToId(nameToId,11,"Jenish" );
        SampleClass2.setnameToId(nameToId,12,"Hariharan" );
        SampleClass2.setnameToId(nameToId,13,"Muthuraj" );
        SampleClass2.setnameToId(nameToId,14,"Ariharan" );
        SampleClass2.setnameToId(nameToId,15,"Siva" );

        getIdToName();
    }
     private static Map<String, Integer> nameToId = new HashMap<>();

     private static void getIdToName() {
        for (String val : nameToId.keySet()) {
            System.out.println("Key : " + val + "  -----> value : " + nameToId.get(val));
        };

        System.out.println("\n");
        for (Map.Entry<String,Integer> integerStringEntry : nameToId.entrySet()) {
            System.out.println(integerStringEntry.getKey()+" : "+integerStringEntry.getValue());
        }
    }

    private static void setnameToId(Map<String,Integer> idToName,Integer id , String name) {
        idToName.put(name,id);
    }
}