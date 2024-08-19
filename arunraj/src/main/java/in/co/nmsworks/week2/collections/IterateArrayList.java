package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateArrayList {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Date");

        map.put("Fruits", fruits);
        map.put("Vegetables", vegetables);

        for (Entry<String, ArrayList<String>> entry : map.entrySet()) {

            String key = entry.getKey();
            ArrayList<String> list = entry.getValue();

            System.out.println(key + ":");

            for (String item : list) {
                System.out.println("  " + item);
            }
        }
    }
}

