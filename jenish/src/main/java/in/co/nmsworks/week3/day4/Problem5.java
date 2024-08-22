package in.co.nmsworks.week3.day4;

public class Problem5 {
    public void findSecondLargestElement(int[] numbers){
        int temp;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        int secondLargestNumber = numbers[numbers.length - 2];
        System.out.println("Second largest number is "+secondLargestNumber);
    }
}