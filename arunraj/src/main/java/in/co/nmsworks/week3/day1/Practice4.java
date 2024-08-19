package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

/***Q4:** Write a method to find the longest color name
 *in a list of colors and return it. */

public class Practice4 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        String[] color = {"Red","Green","Blue","Black","White","Yellow"};
        for(String i : color){
            colors.add(i);
        }
        int max=0;
        for(int i=0 ; i<colors.size();i++){
            for(int j=0 ; j<colors.size();j++){
                if(max<colors.get(j).length()){
                    max=colors.get(j).length();
                }
            }
        }
        for(String i : colors){
            if(i.length() == max){
                System.out.println(i);
            }
        }
    }
}
