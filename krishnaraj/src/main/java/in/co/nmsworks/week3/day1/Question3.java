package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

/***
 * Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
 * write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
 */
public class Question3 {
public void printSubList(){
    List<String> colors=new ArrayList<>();
    List<String> subColorsList=new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Yellow");
    colors.add("Orange");
    for (int i = 1; i <= 3; i++) {
        subColorsList.add(colors.get(i));
    }
    System.out.println("the main list :" +colors);
    System.out.println("the sub list index 1 to 3 :" +subColorsList);
}

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        question3.printSubList();
    }
}
