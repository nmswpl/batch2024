package in.co.nmsworks.week3.day4;

public class Question3 {
    public Question3(Integer n) {

        String number = String.valueOf(n);
        int sum =0;
        for(int i =0;i<number.length();i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        System.out.println("Sum of digits:"+sum);
    }
}
