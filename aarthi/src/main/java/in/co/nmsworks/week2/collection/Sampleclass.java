package in.co.nmsworks.week2.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sampleclass
{
    public void Idname()
    {
        Map<Integer,String> idToName=new HashMap<>();
        idToName.put(3,"Aarthi");
        idToName.put(1,"jenifer");
        idToName.put(5,"Pavithra");
        idToName.put(8,"Arunraj");
        idToName.put(14,"Ariharan");
        idToName.put(6,"Hariharan");
        idToName.put(2,"Premalatha");
        idToName.put(4,"Madhumitha");
        idToName.put(11,"Jenish");
        idToName.put(7,"krishnaraj");
        idToName.put(13,"Muthu Raj");
        idToName.put(12,"Hariharan K R");
        idToName.put(9,"Priyadharshini");
        idToName.put(15,"Siva");
        idToName.put(10,"Sujaritha");

       for (Integer id : idToName.keySet())
        {
            System.out.println("Id = "+id + " : Name = "+ idToName.get(id));

        }

        for (Map.Entry<Integer,String> entry : idToName.entrySet())
        {
            System.out.println("Id = "+entry.getKey() + " : Name = "+ entry.getValue());

        }
    }
    public void nameId() {
        Map<String, Integer> nameToId = new HashMap<>();
        nameToId.put("Aarthi", 3);
        nameToId.put("jenifer", 1);
        nameToId.put("Pavithra", 5);
        nameToId.put("Arunraj", 8);
        nameToId.put("Ariharan", 14);
        nameToId.put("Hariharan", 6);
        nameToId.put("Premalatha", 2);
        nameToId.put("Madhumitha", 4);
        nameToId.put("Jenish", 11);
        nameToId.put("krishnaraj", 7);
        nameToId.put("Muthu Raj", 13);
        nameToId.put("Hariharan K R", 12);
        nameToId.put("Priyadharshini", 9);
        nameToId.put("Siva", 15);
        nameToId.put("Sujaritha", 10);

        /*for (String name : nameToId.keySet())
        {
            System.out.println("Id = " + name + " : Name = " + nameToId.get(name));

        }*/
        for (Map.Entry<String, Integer> entry : nameToId.entrySet())
        {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}


