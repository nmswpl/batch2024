package in.co.nmsworks.week3.Day1;

import java.util.Arrays;
import java.util.List;

public class Q4 {
    public void printLongestColor(){
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow");
        String longestColor="";
        for (int i = 0; i <colors.size() ; i++) {
            longestColor= colors.get(0);
            if(colors.get(i).length()>longestColor.length()){
                longestColor=colors.get(i);
            }

        }
        System.out.println(longestColor);

    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.printLongestColor();
    }
}
