package in.co.nmsworks.week2.collections;

import java.util.*;

public class SampleCollection {
    public static void main(String[] args) {
        new SampleCollection().IdToName();
        new SampleCollection().NameToId();
    }
    public void IdToName(){

        Map<Integer,String> idToName=new HashMap<>();
        idToName.put(14,"Ariharan");
        idToName.put(1,"jenifer");
        idToName.put(5,"pavithra");
        idToName.put(8,"Arunraj");
        idToName.put(6,"Hariharan");
        idToName.put(2,"premalatha");
        idToName.put(13,"muthuraj");
        idToName.put(15,"siva");
        idToName.put(4,"madhumitha");
        idToName.put(3,"Aarthi");
        idToName.put(12,"krHariharan");
        idToName.put(11,"jenish");
        idToName.put(10,"sujaritha");
        idToName.put(7 ,"krishnaraj");
        idToName.put(9,"Priyadharshini");
        for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
            String str=String.valueOf(entry.getValue().charAt(0)).toUpperCase()+entry.getValue().substring(1);
            System.out.println(entry.getKey()+"="+ entry.getValue());
            idToName.put(entry.getKey(),str);

        }
        System.out.println();

        for (Integer key : idToName.keySet()) {
            System.out.println(key+"="+idToName.get(key));

        }
    }
    public void NameToId(){
        Map<String,Integer> nameToId=new HashMap<>();
       nameToId.put("Ariharan",14);
       nameToId.put("jenifer",1);
       nameToId.put("pavithra",5);
       nameToId.put("Arunraj",8);
       nameToId.put("Hariharan",6);
       nameToId.put("premalatha",2);
       nameToId.put("muthuraj",13);
       nameToId.put("siva",15);
       nameToId.put("madhumitha",4);
       nameToId.put("Aarthi",3);
       nameToId.put("krHariharan",12);
       nameToId.put("jenish",11);
       nameToId.put("sujaritha",10);
       nameToId.put("krishnaraj",7);
       nameToId.put("Priyadharshini",9);
        System.out.println();

        for (String key : nameToId.keySet()) {
            System.out.println(key+"="+nameToId.get(key));

        }

    }


}



