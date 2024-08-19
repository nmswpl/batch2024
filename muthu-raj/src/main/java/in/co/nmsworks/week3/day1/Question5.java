package in.co.nmsworks.week3.day1;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

 **Q5:** Write a method that takes a list of lists and
 returns a single list containing all elements of the nested lists.
 */
public class Question5 {
    public static void main(String[] args) {

        List<List<String>> colorList = new ArrayList<>(
                Arrays.asList(Arrays.asList("Red","Blue","Green"),
                        Arrays.asList("Yellow","SkyBlue","Grey"),
                        Arrays.asList("White","Black","Beige"))
        );

        System.out.println(getAsSingleList(colorList));

    }

    static  List<String> getAsSingleList(List<List<String>> colorList){

        List<String> result = new ArrayList<>();
        for (List<String> colors : colorList) {
            result.addAll(colors);
        }
        return result;
    }
}
