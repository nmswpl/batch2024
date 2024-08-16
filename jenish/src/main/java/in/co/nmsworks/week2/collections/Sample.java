package in.co.nmsworks.week2.collections;

import java.util.HashMap;
import java.util.Map;

public class Sample {
    public void displayMap(){
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1,"Jenifer");
        idToName.put(2,"Premalatha");
        idToName.put(3,"Aarthi");
        idToName.put(4,"Madhumitha");
        idToName.put(5, "Pavithra");
        idToName.put(6,"Hariharan p");
        idToName.put(7,"Krishna");
        idToName.put(8,"Arunraj");
        idToName.put(9,"Priyadharshini");
        idToName.put(10,"Sujaritha");
        idToName.put(11,"Jenish");
        idToName.put(12,"Hariharan kr");
        idToName.put(13,"Muthuraj");
        idToName.put(14,"Ariharan");
        idToName.put(15, "Siva");

        for (int key : idToName.keySet()){
            System.out.println(key +" = "+idToName.get(key));
        }

        //System.out.println(idToName.entrySet());
        for(Map.Entry entry: idToName.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

        Map<String, Integer> nameToId = new HashMap<>();
        nameToId.put("Jenifer",1);
        nameToId.put("Premalatha",2);
        nameToId.put("Aarthi", 3);
        nameToId.put("Madhumitha", 4);
        nameToId.put("Pavithra", 5);
        nameToId.put("Harihran p",6);
        nameToId.put("Krishna",7);
        nameToId.put("Arunraj", 8);
        nameToId.put("Priyadharshini", 9);
        nameToId.put("Sujaritha", 10);
        nameToId.put("Jenish", 11);
        nameToId.put("Hariharan kr", 12);
        nameToId.put("Muthuraj", 13);
        nameToId.put("Ariharan", 14);
        nameToId.put("Siva", 15);

        for (String key : nameToId.keySet()){
            System.out.println(key +" = "+nameToId.get(key));
        }

        //System.out.println(idToName.entrySet());
        for(Map.Entry entry: nameToId.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.displayMap();
    }
}