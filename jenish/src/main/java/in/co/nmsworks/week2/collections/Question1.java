package in.co.nmsworks.week2.collections;
import java.util.List;
import java.util.ArrayList;

//QP1
public class Question1 {
    public void displayColors() {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("White");
        colorsList.add("BLack");
        colorsList.add("Blue");
        colorsList.add("Green");
        System.out.println("Question 1");
        System.out.println("ArrayList colors ::");
        for (String s : colorsList) {
            System.out.println(s);
        }
    }
}