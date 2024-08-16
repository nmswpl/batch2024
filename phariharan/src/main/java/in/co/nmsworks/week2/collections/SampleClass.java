package in.co.nmsworks.week2.collections;

import java.util.HashMap;
import java.util.Map;

public class SampleClass {
    public static void main(String[] args) {
        SampleClass.setIdToName(idToName,1,"Jeniffer" );
        SampleClass.setIdToName(idToName,2,"Premalatha" );
        SampleClass.setIdToName(idToName,3,"Aarthi" );
        SampleClass.setIdToName(idToName,4,"Madhumitha" );
        SampleClass.setIdToName(idToName,5,"Pavitra" );
        SampleClass.setIdToName(idToName,6,"Hariharan P" );
        SampleClass.setIdToName(idToName,7,"Krishna" );
        SampleClass.setIdToName(idToName,8,"Arun" );
        SampleClass.setIdToName(idToName,9,"Priyadharshini" );
        SampleClass.setIdToName(idToName,10,"Sujaritha" );
        SampleClass.setIdToName(idToName,11,"Jenish" );
        SampleClass.setIdToName(idToName,12,"Hariharan" );
        SampleClass.setIdToName(idToName,13,"Muthuraj" );
        SampleClass.setIdToName(idToName,14,"Ariharan" );
        SampleClass.setIdToName(idToName,15,"Siva" );

        SampleClass.getIdToName();
    }
    private static Map<Integer,String> idToName = new HashMap<>();

    private static void getIdToName() {
        for (Integer val : idToName.keySet()) {
            System.out.println("Key : " + val + " -----> value : " + idToName.get(val));
        };

        System.out.println("\n");
        for (Map.Entry<Integer, String> integerStringEntry : idToName.entrySet()) {
            System.out.println(integerStringEntry.getKey()+" : "+integerStringEntry.getValue());
        }
    }

    private static void setIdToName(Map<Integer, String> idToName,Integer id , String Name) {
        idToName.put(id,Name);
    }
}
