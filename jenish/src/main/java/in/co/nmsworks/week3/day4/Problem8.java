package in.co.nmsworks.week3.day4;

public class Problem8 {
    public void findMean(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        float average = (float) sum / numbers.length;
        System.out.println("The mean value of array is "+average);
    }
}