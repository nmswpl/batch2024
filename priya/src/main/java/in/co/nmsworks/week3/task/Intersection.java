package in.co.nmsworks.week3.task;

import java.util.HashSet;
import java.util.Set;

public  class Intersection {
    Set<String> commonString = new HashSet<>();

    public Set<String> getCommonStrings(Set<String> set1, Set<String> set2) {
        int s1Size = set1.size();
        int s2Size = set2.size();
        if (s1Size == 0 || s2Size == 0) {
            if (s1Size > s2Size) {
                commonString.addAll(set1);
            }
            else{
                commonString.addAll(set2);
            }
        }

        for (String string : set1) {
            for (String s : set2) {
                if (string.equalsIgnoreCase(s)) {
                    commonString.add(string);
                }
            }
        }
        return commonString;
    }


    public static void main(String[] args) {
        Intersection obj = new Intersection();
        Set<String> a = new HashSet<>();
        a.add("Priya");
        a.add("mani");
        a.add("pooja");
        a.add("sowmiya");
        a.add("meiya");
        Set<String> b = new HashSet<>();
        b.add("Kesini");
        b.add("Priya");
        b.add("pooja");
        a.add("pooja");
        System.out.println(b);
        System.out.println(obj.getCommonStrings(a, b));
    }
}
