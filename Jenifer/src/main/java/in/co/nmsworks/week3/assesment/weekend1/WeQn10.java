package in.co.nmsworks.week3.assesment.weekend1;
import java.util.*;

/* Write a program that reads a list of names, converts it to a `Set` to remove duplicates, and then
stores the unique names in a `Map` where the key is the name and the value is the length of the name.
 */
public class WeQn10 {
    public void nameToLength(){
        List<String> nameList = new ArrayList<>();
        Set<String> nameSet = new HashSet<>();
        Map<String, Integer> namesAndLength = new HashMap<>();

        nameList.add("Jenifer");
        nameList.add("Premalatha");
        nameList.add("Aarthi");
        nameList.add("Pavithra");
        nameList.add("Madhumitha");
        nameList.add("Hariharan");
        nameList.add("Krishna");
        nameList.add("Arunraj");
        nameList.add("Priyadharshini");
        nameList.add("Sujaritha");
        nameList.add("Jenish");
        nameList.add("Muthuraj");
        nameList.add("Jenifer");
        nameList.add("Premalatha");

        //System.out.println("Names in List : ");
        for (String namesInList : nameList) {
            System.out.println(namesInList);
            nameSet.add(namesInList);
        }
        //System.out.println("Size of list : " +nameList.size());
        //System.out.println("Names in Set : ");
        for (String namesInSet : nameSet) {
            System.out.println(namesInSet);
            namesAndLength.put(namesInSet, namesInSet.length());
        }
        //System.out.println("Size of set : " +nameSet.size());
        System.out.println("Names and length of names : ");
        for (Map.Entry entry : namesAndLength.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //System.out.println("Size of map : " + namesAndLength.size());
    }
}
