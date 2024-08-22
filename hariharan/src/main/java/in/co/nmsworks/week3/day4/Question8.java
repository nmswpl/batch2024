package in.co.nmsworks.week3.day4;

public class Question8 {
    public Question8(int[] integerArray) {

        int sum =0;
        for (int number : integerArray) {
            sum += number;
        }

        System.out.println("MEAN:" +(float)sum / integerArray.length);
    }
}
