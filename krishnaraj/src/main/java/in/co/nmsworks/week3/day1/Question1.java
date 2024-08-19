package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

/**Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue", write a method to remove all
 * duplicate colors and preserve the original order. Print the resulting list.
 *
 */
public class Question1 {
    public void removeListDuplicate(){
        List<String> colors=new ArrayList<>();
        List<String> colorsWithoutDuplicate=colors;
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("The Original List : "+ colors);
        for (int i = 0; i < colors.size(); i++) {
            for (int j = i+1 ; j < colors.size(); j++) {
                if(colors.get(i).contains(colorsWithoutDuplicate.get(j))){
                    colorsWithoutDuplicate.remove(j);
                    break;
                }
            }
        }
        System.out.println("Without Duplicate array element :" +colorsWithoutDuplicate);
    }

    public static void main(String[] args) {
        Question1 question1=new Question1();
        question1.removeListDuplicate();
    }
}
