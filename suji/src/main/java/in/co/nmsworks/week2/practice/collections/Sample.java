package in.co.nmsworks.week2.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        Map<Integer,String> idToName=new HashMap<>();
        {
            idToName.put(1,"Jenifer");
            idToName.put(2,"Prema");
            idToName.put(3,"Arthi");
            idToName.put(4,"Madhu");
            idToName.put(5,"Pavi");
            idToName.put(6,"Hari");
            idToName.put(7,"Krishna");
            idToName.put(8,"Arun");
            idToName.put(9,"Priya");
            idToName.put(10,"Suji");
            idToName.put(11,"Jenish");
            idToName.put(12,"Krhari");
            idToName.put(13,"Muthuraj");
            idToName.put(14,"ARi");
            idToName.put(15,"siva");
            System.out.println("  ");



         /*   for(Map.Entry<Integer, String> i: idToName.entrySet())
            {
                System.out.println( i.getKey()+"="+i.getValue());

            } */

            for (Integer i: idToName.keySet())
            {
                System.out.println(i+"="+idToName.get(i));
            }


            Map<String,Integer> nameToId=new HashMap<>();
            nameToId.put("Jeni",1);
            nameToId.put("Prema",2);
            nameToId.put("Arthi",3);
            nameToId.put("Madhu",4);
            nameToId.put("Pavi",5);
            nameToId.put("Hariharan",6);
            nameToId.put("Krishna",7);
            nameToId.put("Arunraj",8);
            nameToId.put("Priya",9);
            nameToId.put("Sujaritha",10);
            nameToId.put("Jenish",11);
            nameToId.put("KrHariharan",12);
            nameToId.put("Muthuraj",13);
            nameToId.put("Ari",14);
            nameToId.put("Siva",15);
            System.out.println(" Namr to Id's");
            for (Map.Entry<String,Integer> i:nameToId.entrySet())
            {
                System.out.println(i.getKey()+ ":"+i.getValue());
            }



        }
    }
}
