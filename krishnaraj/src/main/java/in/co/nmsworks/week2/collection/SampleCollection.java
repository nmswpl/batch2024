package in.co.nmsworks.week2.collection;
import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
public class SampleCollection {
    public void collectionExample(){
        Map<Integer,String> idToName=new HashMap<>();
        Map<String,Integer> NameToId=new HashMap<>();
        idToName.put(7,"krishnaraj");
        idToName.put(6,"hariharan");
        idToName.put(2,"premalatha");
        idToName.put(4,"madhumitha");
        idToName.put(3,"aarthi");
        idToName.put(11,"jenish");
        idToName.put(13,"muthu raj");
        idToName.put(12,"hariharen k r");
        idToName.put(9,"priyadharshini");
        idToName.put(15,"siva");
        idToName.put(10,"sujaritha");
        idToName.put(1,"jenifer");
        idToName.put(5,"pavithra");
        idToName.put(14,"ariHaren");
        idToName.put(8,"arunraj");

        NameToId.put("krishnaraj",7);
        NameToId.put("hariharan",6);
        NameToId.put("premalatha",2);
        NameToId.put("madhumitha",4);
        NameToId.put("aarthi",3);
        NameToId.put("jenish",11);
        NameToId.put("muthu raj",13);
        NameToId.put("hariharen k r",12);
        NameToId.put("priyadharshini",9);
        NameToId.put("siva",15);
        NameToId.put("sujaritha",10);
        NameToId.put("jenifer",1);
        NameToId.put("pavithra",5);
        NameToId.put("ariHaren",14);
        NameToId.put("arunraj",8);

        //System.out.println("The name List : "+idToName);
        for(Integer key: idToName.keySet()) {
            System.out.println(idToName.get(key) + " = " + key);
        }
        for (Map.Entry<Integer, String> name: idToName.entrySet()){
            System.out.println(name);
        }
        for(String key: NameToId.keySet()) {
            System.out.println(NameToId.get(key) + " = " + key);
        }
        for (Map.Entry<String,Integer> name: NameToId.entrySet()){
            System.out.println(name.getKey()+ "="+name.getValue());
        }
    }
    public static void main(String[] args) {
        SampleCollection sc= new SampleCollection();
        sc.collectionExample();
    }
}
