package in.co.nmsworks.week3.assessment.day7;
import java.util.*;

public class Question1 {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>() ;
            List<Integer> oddNumbers = new ArrayList<>();
            for (int i = 1;i<=50 ;i++) {
                numbers.add(i);
            }
            System.out.println("numbers 1-50 :: "+numbers);
            for (int j=1;j<=numbers.size()-1;j++) {
                if(j%2==1){
                    oddNumbers. add(j);
                }
            }
            System. out. println("odd numbers :: "+oddNumbers);
        }
    }

