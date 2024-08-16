package in.co.nmsworks.week2.collections;

import java.util.*;

public class Sample {
    public void map() {
        Map<Integer, String> idToName = new HashMap<>();

        idToName.put(1, "Jenifer");
        idToName.put(2, "Premalatha");
        idToName.put(3, "Aarthi");
        idToName.put(4, "Madhumitha");
        idToName.put(5, "Pavithra");
        idToName.put(6, "Hariharan");
        idToName.put(7, "Krishnaraj");
        idToName.put(8, "Arunraj");
        idToName.put(9, "Priyadharshini");
        idToName.put(10, "Sujaritha");
        idToName.put(11, "Jenish");
        idToName.put(12, "KRHariharan");
        idToName.put(13, "Muthuraj");
        idToName.put(14, "Ariharan");
        idToName.put(15, "Siva");

        System.out.println(idToName.keySet());
        System.out.println(idToName.values());

        for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        for (Integer i : idToName.keySet()) {
            System.out.println(i);
        }

        for (String i : idToName.values()) {
            System.out.println(i);
        }

        for(Integer i: idToName.keySet()){
            System.out.println(i+","+idToName.get(i));
        }
    }

   /* public void nameToId(){
        Map<String,Integer> nametoId=new HashMap<>();

        nametoId.put("Jenifer",1);
        nametoId.put("Premalatha",2);
        nametoId.put("Aarthi",3);
        nametoId.put("Madhumitha",4);
        nametoId.put("Pavithra",5);
        nametoId.put("Hariharan",6);
        nametoId.put("Krishnaraj",7);
        nametoId.put("Arunraj",8);
        nametoId.put("Priyadharshini",9);
        nametoId.put("Sujaritha",10);
        nametoId.put("Jenish",11);
        nametoId.put("Krhariharan",12);
        nametoId.put("Muthuraj",13);
        nametoId.put("Ariharan",14);
        nametoId.put("Siva",15);

        for(String i: nametoId.keySet()){
            System.out.println(i+","+nametoId.get(i));
        }

        for( Integer i:nametoId.values()){
            System.out.println(i+","+nametoId.get(i));
        }*/
    }


